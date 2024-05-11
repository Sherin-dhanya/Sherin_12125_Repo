package com.rrs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rrs.bean.TrainDetails;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainDAOImplementation implements TrainDAO{
	
	private EntityManager entityManager;

	public TrainDAOImplementation() {
		super();
	}
	
	@Autowired
	public TrainDAOImplementation(EntityManager entityManager) {
		super();
		this.entityManager=entityManager;
	}
	
	@Override	
	public List<Integer> getIdList() {
		
		return null;
	}
	@Override
	public List<TrainDetails> getTrain() {
		return entityManager.createQuery("from TrainDetails").getResultList();
	}
}
