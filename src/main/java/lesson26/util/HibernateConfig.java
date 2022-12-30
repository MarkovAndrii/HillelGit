package lesson26.util;

import lesson26.entity.Client;
import lesson26.entity.House;
import lesson26.entity.Passport;
import lesson26.entity.Role;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();  // for hibernate.cfg.xml

                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(House.class);
                configuration.addAnnotatedClass(Passport.class);
                configuration.addAnnotatedClass(Role.class);

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
