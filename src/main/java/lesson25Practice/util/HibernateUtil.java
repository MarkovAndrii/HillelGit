package lesson25Practice.util;

import lesson25.model.Account;
import lesson25.model.Client;
import lesson25.model.Status;
import lesson25Practice.entity.Car;
import lesson25Practice.entity.CarInfo;
import lesson25Practice.entity.Owner;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Properties properties = new Properties();
                Configuration configuration = new Configuration().addProperties(properties);

                configuration.addAnnotatedClass(Car.class);
                configuration.addAnnotatedClass(Owner.class);
                configuration.addAnnotatedClass(CarInfo.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }

}
