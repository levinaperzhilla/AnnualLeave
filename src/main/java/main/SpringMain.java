package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMain {

	public static void main(String[] args) {
		SpringApplication.run(SpringMain.class, args);
		
		//to make the connection with database using hibernate instead of spring
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("annualleavemanagement");
		EntityManager em=emf.createEntityManager();
		em.close();
	}
	 
}
