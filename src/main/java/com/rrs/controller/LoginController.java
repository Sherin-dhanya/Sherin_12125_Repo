package com.rrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rrs.bean.Login;
import com.rrs.dao.LoginDAO;




@RestController
@CrossOrigin("*")
public class LoginController {

	@Autowired
	private LoginDAO loginDAO;
	
	@GetMapping("/login")
	public List<Login> getLoginMail()
	{
		return loginDAO.getLogin();
	}
	@PostMapping("/addLogin")
	public boolean addLogin(@RequestBody Login login)
	{
		return loginDAO.addLogin(login);
	}
	
	
	@GetMapping("/login/{email}") 
	public List findLogin(@PathVariable("email") String email)
	{
			return loginDAO.getLogin();
	}
	
}
