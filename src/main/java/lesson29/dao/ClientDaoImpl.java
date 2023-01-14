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
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("create: %s", client));
        session.save(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Client client) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("update: %s", client));
        session.update(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Client client) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("delete: %s", client));
        session.delete(client);

        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(int id) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("getById: %d", id));
        Client client = session.get(Client.class, id);

        transaction.commit();
        session.close();

        return client;
    }

    @Override
    public List<Client> getAll() {  // No use(for example)
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug("getAll");
        List<Client> clients = session.createQuery("from Client").list();

        transaction.commit();
        session.close();

        return clients;
    }

    @Override
    public Client getByPhone(Long phone) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        logger.debug(String.format("getByPhone: %d", phone));
        Client client = (Client) session.createQuery("from Client where phone=:p")
                .setParameter("p", phone)
                .getSingleResult();

        transaction.commit();
        session.close();

        return client;
    }
}
