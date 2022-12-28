package lesson25Practice.dao;

import lesson25Practice.entity.Owner;
import lesson25Practice.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OwnerDao {

    public void save(Owner owner){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(owner);

        transaction.commit();
        session.close();
    }

}
