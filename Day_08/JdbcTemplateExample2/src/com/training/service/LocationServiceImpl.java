package com.training.service;

import java.util.List;

import com.training.dao.LocationDao;
import com.training.entity.State;

public class LocationServiceImpl implements LocationService
{

	private LocationDao locationDao;
	
	public void setLocationDao(LocationDao locationDao) {
        this.locationDao = locationDao;
    }

	@Override
	public void addState(String name) {
		locationDao.insertState(name);
		
	}

	@Override
	public void addCity(String name, int stateId) {
		locationDao.insertCity(name, stateId);
		
	}

	@Override
	public List<State> getAllStatesWithCities() {
		
		return locationDao.getStateWithCities();
	}

}
