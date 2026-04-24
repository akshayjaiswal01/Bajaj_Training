package com.training.dao;

import javax.sql.DataSource;

public interface StudentDao 
{
	public void setDataSource(DataSource ds);
	
	public void create(String name, int age);
}
