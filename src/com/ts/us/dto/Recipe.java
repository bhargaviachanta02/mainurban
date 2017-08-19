package com.ts.us.dto;

public class Recipe {
	
	private int Id;
	private String name;
	private String description;
	private int cuisineId;
	private boolean isVeg;
	private String imagePath;
	
	
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return "Recipe [Id=" + Id + ", name=" + name + ", description=" + description + ", cuisineId=" + cuisineId
				+ ", isVeg=" + isVeg + ", imagePath=" + imagePath + "]";
	}
	

}
