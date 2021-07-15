package repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import entities.Role;

public class RoleRepositoryImpl implements RoleRepository {
	
	private final EntityManager em;
		
		public RoleRepositoryImpl(EntityManager em) {
			this.em = em;
		}

	@Override
	public List<Role> findAll() {
		TypedQuery<Role> query=em.createQuery("select r from Role r",Role.class);
		return query.getResultList();
	}

	@Override
	public List<Role> findAll(Sort sort) {
		return null;
	}

	@Override
	public List<Role> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Override
	public <S extends Role> List<S> saveAll(Iterable<S> entities) {
		em.persist(entities);
		return null;
	}

	@Override
	public void flush() {
	}

	@Override
	public <S extends Role> S saveAndFlush(S entity) {
		return null;
	}

	@Override
	public <S extends Role> List<S> saveAllAndFlush(Iterable<S> entities) {
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Role> entities) {
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Role getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Role> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Role> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Role> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Role> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Role> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Role entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Role> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Role> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Role> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Role> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Role> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
