package lesson25.dao;

import lesson25.model.Account;
import lesson25.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void create(Account account) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Account account) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Account account) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(account);

        transaction.commit();
        session.close();
    }

    @Override
    public Account getById(int id) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Account account = session.get(Account.class, id);

        transaction.commit();
        session.close();

        return account;
    }
}
