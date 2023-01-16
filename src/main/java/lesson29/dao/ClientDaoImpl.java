package lesson29.dao;

import lesson29.entity.Client;
import lesson29.util.HibernateConfig;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientDaoImpl implements ClientDao {
    private final Logger logger = Logger.getLogger(ClientDaoImpl.class);

    @Override
    public void create(Client client) {
        logger.debug(String.format("create: %s", client));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Client client) {
        logger.debug(String.format("update: %s", client));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Client client) {
        logger.debug(String.format("delete: %s", client));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(client);

        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(int id) {
        logger.debug(String.format("getById: %d", id));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Client client = session.get(Client.class, id);

        transaction.commit();
        session.close();

        return client;
    }

    @Override
    public List<Client> getAll() {  // No use(for example)
        logger.debug("getAll");

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Client> clients = session.createQuery("from Client").list();

        transaction.commit();
        session.close();

        return clients;
    }

    @Override
    public Client getByPhone(Long phone) {
        logger.debug(String.format("getByPhone: %d", phone));

        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Client client = (Client) session.createQuery("from Client where phone=:p")
                .setParameter("p", phone)
                .getSingleResult();

        transaction.commit();
        session.close();

        return client;
    }
}
