package com.Composition;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public char getGender() {
		return this.gender;
	}
	
	public String toString() {
		return ("Name is "+ this.getName()+"("+this.getGender()+")"+" has an email id '"+this.getEmail()+"'");
	}
	
}
