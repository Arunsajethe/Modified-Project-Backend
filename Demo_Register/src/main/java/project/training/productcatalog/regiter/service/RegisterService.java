package project.training.productcatalog.regiter.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import project.training.productcatalog.regiter.entity.Register;
import project.training.productcatalog.regiter.repo.Register_Repository;

@Service
@RequiredArgsConstructor
public class RegisterService {
	
	private final Register_Repository register_Repository;
	
	public Register insertData(Register register)
	{
		register_Repository.save(register);
		return null;
	}
	
	public Boolean emailValidation(String email)
	{
		Register register = register_Repository.findByEmail(email);
		if (register == null)
			return false;
		else
			return true;
	}
	
	public Boolean loginValidity(String email, String password)
	{
		Register register = register_Repository.findByEmail(email);
		if (register.getPassword().equals(password))
			return true;
		else
			return false;
		
	}

}
