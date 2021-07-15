package repository;

import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entities.User;

@Repository
@Transactional
public class UserRepository implements UserRepositoryInterface {
	private final EntityManager em;
	
	public UserRepository(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public User createUser(User newUser) {
		em.getTransaction().begin();
		em.persist(newUser);
		em.getTransaction().commit();
		return newUser;
	}
	
	@Transactional
	public void deleteUser(int id) {
		User u=findUserById(id);
		if(u!=null) {
				em.getTransaction().begin();
				em.remove(u);
				em.getTransaction().commit();
		}
	}
	
	@Transactional
	public User updateUser(User newUser) {
		User u=findUserById(newUser.getUserID());
		em.getTransaction().begin();
		u=newUser;
		em.getTransaction().commit();
		return u;
	}
	
	@Transactional
	public User findUserById(int id) {
		return em.find(User.class, id);
	}

	@Override
	public User findByEmail(String email) {
		return em.find(User.class, email);
	}

}
