package com.Composition;

public class MainClass {

	public static void main(String[] args) {
		Author Auth = new Author("max", "max@jd.com", 'm');
		System.out.println(Auth);
		Auth.setEmail("maxForgot@jd.com");
		System.out.println(Auth);
	}

}
