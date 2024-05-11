package com.rrs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rrs.bean.Login;
import com.rrs.bean.TrainDetails;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LoginDAOImplementation implements LoginDAO {
	
	
  private EntityManager entityManager;

	public LoginDAOImplementation() {
		super();
	}
	
	@Autowired
	public LoginDAOImplementation(EntityManager entityManager) {
		super();
		this.entityManager=entityManager;
	}
	
	@Override
	public boolean addLogin(Login login) {
		entityManager.persist(login);
		return true;
	}
	@Override
	public List<Login> getLogin() {
		return entityManager.createQuery("from Login").getResultList();
	}
	@Override
	public Login findLogin(String login) {
				Login obj=entityManager.find(Login.class,login);
		return obj;
	}
	@Override
	public boolean save(Login login) {
		return false;
	}

	





	

}
