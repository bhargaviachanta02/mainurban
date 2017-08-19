package com.ts.us.dto;

public class Branch {
	private int Id;
	private String location;
	private String city;
	private String zipCode;
	private String imagePath;
	private String state;
	private String country;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Branch [Id=" + Id + ", location=" + location + ", city=" + city + ", zipCode=" + zipCode
				+ ", imagePath=" + imagePath + ", state=" + state + ", country=" + country + "]";
	}
}