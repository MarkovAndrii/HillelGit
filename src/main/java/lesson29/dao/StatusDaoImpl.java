package lesson29.dao;

import lesson29.entity.Status;
import lesson29.util.HibernateConfig;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDaoImpl implements StatusDao {

    private final Logger logger = Logger.getLogger(StatusDaoImpl.class);
    @Override
    public void create(Status status) {
        logger.debug(String.format("create: %s", status));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        logger.debug(String.format("update: %s", status));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Status status) {
        logger.debug(String.format("delete: %s", status));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(status);

        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(int id) {
        logger.debug(String.format("getById: %d", id));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Status status = session.get(Status.class, id);

        transaction.commit();
        session.close();

        return status;
    }
}
