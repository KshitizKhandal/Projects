package com.nitish.passwordValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.nitish.model.Employee;

public class PasswordValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Employee.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"required.password", "Field name is required.");
			
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword",
					"required.confirmPassword", "Field name is required.");
			
			Employee employee = (Employee)target;
			
			if(!(employee.getPassword().equals(employee.getConfirmPassword()))){
				errors.rejectValue("password", "notmatch.password");
			}
			
		}
	}


