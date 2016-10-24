package rzeszow.gitaliano.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by kobeb on 11.10.2016.
 */
public class Main {
        public static void main(String[] args) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gitaliano");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();
        }
    }


