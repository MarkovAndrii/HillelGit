package lesson25.dao;

import lesson25.model.Status;
import lesson25.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDaoImpl implements StatusDao {
    @Override
    public void create(Status status) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Status status) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(status);

        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(int id) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Status status = session.get(Status.class, id);

        transaction.commit();
        session.close();

        return status;
    }
}
