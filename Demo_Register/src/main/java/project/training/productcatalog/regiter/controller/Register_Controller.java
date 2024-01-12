package project.training.productcatalog.regiter.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import project.training.productcatalog.regiter.entity.Register;
import project.training.productcatalog.regiter.service.RegisterService;

@RestController
@RequestMapping("/register")
@CrossOrigin("http://localhost:4200/")
@RequiredArgsConstructor
public class Register_Controller {
	
	private final RegisterService registerService;
	
	@PostMapping
	public Register create(@RequestBody Register register) 
	{
		return registerService.insertData(register);
	}
	
	@GetMapping("/loginCheck/{email}/{password}")
	public Boolean loginCheck(@PathVariable ("email") String email,@PathVariable ("password")String password)
	{
		return registerService.loginValidity(email, password);
	}
	
	@GetMapping("/emailCheck/{email}")
	public Boolean emailChecking(@PathVariable ("email")String email)
	{
		return registerService.emailValidation(email);
	}
	
}

