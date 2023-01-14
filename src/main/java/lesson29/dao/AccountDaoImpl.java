package lesson29.dao;

import lesson29.entity.Account;
import lesson29.util.HibernateConfig;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AccountDaoImpl implements AccountDao {
    private final Logger logger = Logger.getLogger(AccountDaoImpl.class);

    @Override
    public void create(Account account) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("create: %s", account));
        session.save(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Account account) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("update: %s", account));
        session.update(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Account account) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("delete: %s", account));
        session.delete(account);

        transaction.commit();
        session.close();
    }

    @Override
    public Account getById(int id) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("getById: %d", id));
        Account account = session.get(Account.class, id);

        transaction.commit();
        session.close();

        return account;
    }
}
