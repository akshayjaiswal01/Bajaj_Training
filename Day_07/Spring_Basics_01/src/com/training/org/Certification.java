package com.training.org;

public class Certification 
{
	private int id;
	private String name;
	private String provider;
	private int year;
	
	public Certification() {
		super();
	}

	public Certification(int id, String name, String provider, int year) {
		super();
		this.id = id;
		this.name = name;
		this.provider = provider;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Certification [id=" + id + ", name=" + name + ", provider=" + provider + ", year=" + year + "]";
	}
	
	
	
	
}
