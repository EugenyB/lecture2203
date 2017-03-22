package main;

import tables.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExampleDBPU");
        EntityManager em = emf.createEntityManager();

        List<Person> people = em.createQuery("select p from Person p").getResultList();
        for (Person person : people) {
            System.out.println(person);
        }
//
//        Person person = new Person();
//        person.setName("Kotov");
//        person.setAge(41);
//
//        em.getTransaction().begin();
//        em.persist(person);
//        em.getTransaction().commit();
    }
}
