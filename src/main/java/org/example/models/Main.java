package org.example.models;
import org.example.models.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");
        EntityManager em = emf.createEntityManager();

//         Create User
        Users users = new Users();
//        user.setId(1L);
        users.setName("John Doe");
        users.setEmail("john.doe@example.com");

         //Persist User
        em.getTransaction().begin();
        em.persist(users);
        em.getTransaction().commit();

        // Find User
        Users foundUser = em.find(Users.class, users.getId());
        System.out.println("User found: " + foundUser.getName());
//
         //Update User
        em.getTransaction().begin();
        foundUser.setName("John Smith");
        em.getTransaction().commit();
        System.out.println("Updated User Name: " + foundUser.getName());
//
//        // Delete User
        em.getTransaction().begin();
        em.remove(foundUser);
        em.getTransaction().commit();
        System.out.println("User deleted.");
//
        em.close();
        emf.close();
    }
}