package repository;

import org.springframework.stereotype.Component;

import entities.User;

@Component
public interface UserRepositoryInterface {

	User createUser(User newUser);
	void deleteUser(int id);
	User updateUser(User newUser);
	User findUserById(int id);
	User findByEmail(String email);

}