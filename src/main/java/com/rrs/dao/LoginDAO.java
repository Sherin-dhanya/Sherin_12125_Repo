package com.rrs.dao;

import java.util.List;

import com.rrs.bean.Login;

public interface LoginDAO {
		

	boolean save(Login login);

	public boolean addLogin(Login login);
	List<Login> getLogin();

	
	public Login findLogin(String email);
	
	
}
