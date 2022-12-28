package lesson25.util;

import lesson25.model.Account;
import lesson25.model.Client;
import lesson25.model.Status;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Properties properties = new Properties();   // for hibernate.properties
                Configuration configuration = new Configuration().addProperties(properties);   // for hibernate.properties
//                Configuration configuration = new Configuration().configure();  // for hibernate.cfg.xml

                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Status.class);
                configuration.addAnnotatedClass(Account.class);

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
