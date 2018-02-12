package com.Composition;

public class Book {
	private String bName;
	private int Qty;
	private double Price;
	private Author author;
	
	public Book(String bName, Author author, double price) {
		this.setbName(bName);
		this.setAuthor(author);
		this.setPrice(price);		
	}
	public Book(String bName, Author author, double price, int Qty) {
		this.setbName(bName);
		this.setAuthor(author);
		this.setPrice(price);
		this.setQty(Qty);
	}
	public String getbName() {
		return this.bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public int getQty() {
		return this.Qty;
	}
	public void setQty(int qty) {
		this.Qty = qty;
	}
	public double getPrice() {
		return this.Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	public Author getAuthor() {
		return this.author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
}
