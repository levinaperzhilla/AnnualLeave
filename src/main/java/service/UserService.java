package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import entities.User;
import repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {
	final UserRepository user;
	
	public UserService(UserRepository user) {
		this.user = user;
	}
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	public User createUser(User newUser) {
		return user.createUser(newUser);
	}
	
	public void deleteUser(int id) {
		user.deleteUser(id);
	}
	
	public User updateUser(User newUser) {
		return user.updateUser(newUser);
	}
	
	public User findUserById(int id) {
		return user.findUserById(id);
	}

	@Override
    public void save(User newUser) {
        newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        newUser.setRole(newUser.getRole());
        user.createUser(newUser);
    }

    @Override
    public User findByEmail(String email) {
        return user.findByEmail(email);
    }
	
}
