package com.example.servletjspdemo.domain;

public class Person {
	
	private String firstName = "unknown";
	private String lastName = " ";
	private String emailName =" ";
	private String email2Name= " ";
	private String employerName= " ";
	private String occupation = " ";
	private int yob = 1900;
	
	public Person() {
		super();
	}
	
	public Person(String firstName, int yob , String lastName , String emailName, String email2Name, String employerName,String occupation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailName = emailName;
		this.email2Name = email2Name;
		this.employerName = employerName;
		this.occupation = occupation;
		this.yob = yob;
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
	public String getEmailName() {
		return emailName;
	}
	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}
	public String getEmail2Name() {
		return email2Name;
	}
	public void setEmail2Name(String email2Name) {
		this.email2Name = email2Name;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}
}
