package lesson26.dao;

import lesson26.entity.Client;
import lesson26.entity.House;
import lesson26.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao {

    public void save(Client client, House house) {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(client);
        house.setClient(client);
        session.save(house);

        transaction.commit();
        session.close();
    }
}
