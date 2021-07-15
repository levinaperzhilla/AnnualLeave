 package repository;


import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.Application;

@Repository
@Transactional
public class ApplicationRepository implements AppRepository {
	private final EntityManager em;
	
	public ApplicationRepository(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public Application createApplication(Application newApplication) {
		em.getTransaction().begin();
		em.persist(newApplication);
		em.getTransaction().commit();
		return newApplication;
	}
	
	@Transactional
	public void deleteApplication(Application app) {
		if(app!=null) {
				em.getTransaction().begin();
				em.remove(app);
				em.getTransaction().commit();
		}
	}
	
	@Transactional
	public Application updateApplication(Application newApplication) {
		Application app=findApplicationById(newApplication.getNumber());
		em.getTransaction().begin();
		app=newApplication;
		em.getTransaction().commit();
		return app;
	}
	
	@Transactional
	public List<Application> findAllApplications(){
		TypedQuery<Application> query=em.createQuery("select a from Application a",Application.class);
		return query.getResultList();
	}
	
	@Transactional
	public Application findApplicationById(int number) {
		return em.find(Application.class, number);
	}

}
