package lesson31.util;

import lesson31.entity.Client;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateConfig {
    private static SessionFactory sessionFactory;

    private static final Logger logger = Logger.getLogger(HibernateConfig.class);

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Properties properties = new Properties();
                Configuration configuration = new Configuration().addProperties(properties);

                configuration.addAnnotatedClass(Client.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                logger.error("getSessionFactory", e);
            }
        }
        return sessionFactory;
    }

}
