package lesson26.dao;

import lesson26.entity.Role;
import lesson26.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RoleDao {

    public void save(Role role){
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(role);

        transaction.commit();
        session.close();
    }
}
