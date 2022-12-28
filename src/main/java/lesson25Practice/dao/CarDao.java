package lesson25Practice.dao;

import lesson25Practice.entity.Car;
import lesson25Practice.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CarDao {
    public void save(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(car);

        transaction.commit();
        session.close();
    }

    public Car getById(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Car car = session.get(Car.class, id);

        transaction.commit();
        session.close();

        return car;
    }

    public void update(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(car);

        transaction.commit();
        session.close();
    }

    public void delete(Car car) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(car);

        transaction.commit();
        session.close();
    }

    public Car getByVinCode(String vinCode) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNativeQuery(
                "SELECT * FROM cars WHERE vin_code = :vinCode", Car.class);
        query.setParameter("vinCode", vinCode);
        Car car = (Car) query.getSingleResult();

        transaction.commit();
        session.close();

        return car;
    }

    public List<Car> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        Query query = session.createNativeQuery("SELECT * FROM cars", Car.class);   //query option 1
        Query query = session.createNamedQuery("getAll");   //query option 2
        List<Car> cars = query.getResultList();

        transaction.commit();
        session.close();

        return cars;
    }

    public Car getByModel(String model) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("getByModel");
        query.setParameter("model", model);
        Car car = (Car) query.getSingleResult();

        transaction.commit();
        session.close();

        return car;
    }
}
