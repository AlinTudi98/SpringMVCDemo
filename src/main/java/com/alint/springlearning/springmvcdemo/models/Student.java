package com.alint.springlearning.springmvcdemo.models;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String prefferedCodingLanguage;
	private String[] osOptionsSelection;
	private LinkedHashMap<String,String> codingLanguageOptions;
	private LinkedHashMap<String,String> osOptions;
	
	public LinkedHashMap<String, String> getOsOptions() {
		return osOptions;
	}


	public LinkedHashMap<String, String> getCodingLanguageOptions() {
		return codingLanguageOptions;
	}


	public Student() {
		codingLanguageOptions = new LinkedHashMap<>();
		
		codingLanguageOptions.put("Java", "Java");
		codingLanguageOptions.put("C#", "C#");
		codingLanguageOptions.put("PHP", "PHP");
		codingLanguageOptions.put("Ruby", "Ruby");
		codingLanguageOptions.put("Python", "Python");
		
		osOptions = new LinkedHashMap<>();
		
		osOptions.put("Win", "Windows");
		osOptions.put("Linux", "GNU\\Linux");
		osOptions.put("OSX", "Mac OS");
	}
	

	public String[] getOsOptionsSelection() {
		return osOptionsSelection;
	}


	public void setOsOptionsSelection(String[] osOptionsSelection) {
		this.osOptionsSelection = osOptionsSelection;
	}


	public String getPrefferedCodingLanguage() {
		return prefferedCodingLanguage;
	}

	public void setPrefferedCodingLanguage(String prefferedCodingLanguage) {
		this.prefferedCodingLanguage = prefferedCodingLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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
	
	
}
