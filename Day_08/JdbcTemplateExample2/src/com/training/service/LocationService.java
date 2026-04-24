package com.training.service;

import java.util.List;

import com.training.entity.State;

public interface LocationService 
{
	void addState(String name);
    void addCity(String name, int stateId);
    List<State> getAllStatesWithCities();
}
