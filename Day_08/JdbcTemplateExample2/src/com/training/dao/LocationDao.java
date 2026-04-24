package com.training.dao;

import java.util.List;

import javax.sql.DataSource;

import com.training.entity.State;

public interface LocationDao 
{
	public void setDataSource(DataSource ds);
	
	void insertState(String name);
	
	void insertCity(String name, int stateId);
	
	List<State> getStateWithCities();
}
