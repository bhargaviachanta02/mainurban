package com.ts.us.dto;

public class Restaurant {
	private String registrationName;
	private String registartionId;
	
	
	
	public String getRegistrationName() {
		return registrationName;
	}
	public void setRegistrationName(String registrationName) {
		this.registrationName = registrationName;
	}
	public String getRegistartionId() {
		return registartionId;
	}
	public void setRegistartionId(String registartionId) {
		this.registartionId = registartionId;
	}
	@Override
	public String toString() {
		return "Restaurant [registrationName=" + registrationName + ", registartionId=" + registartionId + "]";
	}

}
