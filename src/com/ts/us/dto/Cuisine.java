package com.ts.us.dto;

public class Cuisine {
	private int Id;
	private String name;
	private String country;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Cuisine [Id=" + Id + ", name=" + name + ", country=" + country + "]";
	}
	
}
