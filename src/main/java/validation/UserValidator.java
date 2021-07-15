package validation;

import entities.User;
import service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Component
public class UserValidator {

	    @Autowired
	    private UserService userService;

	    public boolean supports(Class<?> aClass) {
	        return User.class.equals(aClass);
	    }

	    public void validate(Object o, Errors errors) {
	        User user = (User) o;

	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
	        if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
	            errors.rejectValue("email", "Size.userForm.email");
	        }
	        if (userService.findByEmail(user.getEmail()) != null) {
	            errors.rejectValue("email", "Duplicate.userForm.email");
	        }
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
	        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
	            errors.rejectValue("password", "Size.userForm.password");
	        }
	        if (!user.getPasswordConfirm().equals(user.getPassword())) {
	            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
	        }
	    }
}
