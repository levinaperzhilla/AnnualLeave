package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import entities.User;
import security.SecurityService;
import service.UserServiceInterface;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	final UserServiceInterface userService;

	public UserController(UserServiceInterface userService) { //constructor injection
		this.userService = userService;
	}
	
	@Autowired
    private SecurityService securityService; //injection with properties

	@PostMapping("/addUser")
	public ResponseEntity<User> createUser(@RequestBody User newUser) {
		userService.createUser(newUser);
		return new ResponseEntity<User>(newUser,HttpStatus.OK);
	}
	
	@DeleteMapping("deleteUser/{id }")
	public ResponseEntity<User> deleteUser(int id) {
		User u=userService.findUserById(id);
		userService.deleteUser(id);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User newUser) {
		userService.updateUser(newUser);
		return new ResponseEntity<User>(newUser,HttpStatus.OK);
	}
	
	@GetMapping("findUserById/{id }")
	public ResponseEntity<User> findUserById(int id) {
		User u=userService.findUserById(id);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	
	@GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (securityService.isAuthenticated()) {
            return "redirect:/";
        }
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }
	
}
