package service;

import org.springframework.stereotype.Component;

import entities.User;

@Component
public interface UserServiceInterface {
	
	User createUser(User newUser);
	void deleteUser(int id);
	User updateUser(User newUser);
	User findUserById(int id);
	void save(User user);
    User findByEmail(String email);

}