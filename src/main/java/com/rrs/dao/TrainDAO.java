package com.rrs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rrs.bean.TrainDetails;



public interface TrainDAO  {


	public List<Integer> getIdList();

	List<TrainDetails> getTrain();
	

	
}
