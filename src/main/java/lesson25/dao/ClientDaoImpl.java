package lesson25.dao;

import lesson25.model.Client;
import lesson25.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientDaoImpl implements ClientDao {
    @Override
    public void create(Client client) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Client client) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(client);

        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Client client) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(client);

        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(int id) {
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
