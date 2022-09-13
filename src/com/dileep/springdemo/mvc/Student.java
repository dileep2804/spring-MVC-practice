package com.dileep.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String favoriteLanguage;
	private String country;
	
	private String[] operatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	
	
	public Student() {
		System.out.println("Student: default constructor");
		countryOptions= new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IND", "India");
		countryOptions.put("CHN", "China");
		countryOptions.put("USA", "America");
		countryOptions.put("GE", "Germany");
	}

	//getter methods will get called while loading form
	//setter methods will get called while form submission
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	//no need of below setter method, it won't be called
	/*
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	*/


	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
}
