package repository;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.Raport;

@Repository
@Transactional
public class RaportRepository implements RaportRepositoryInterface {
	private final EntityManager em;
	
	public RaportRepository(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public Raport createRaport(Raport newRaport) {
		em.getTransaction().begin();
		em.persist(newRaport);
		em.getTransaction().commit();
		return newRaport;
	}
	
	@Transactional
	public void deleteRaport(int id) {
		Raport r=findRaportById(id);
		if(r!=null) {
				em.getTransaction().begin();
				em.remove(r);
				em.getTransaction().commit();
		}
	}
	
	@Transactional
	public Raport findRaportById(int id) {
		return em.find(Raport.class, id);
	}
}
