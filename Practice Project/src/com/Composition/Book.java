package com.Composition;

//import java.util.Iterator;

public class Book {
	private String bName;
	private int Qty;
	private double Price;
	private Author author[];
	
	public Book(String bName, Author author[], double price) {
		this.setbName(bName);
		this.setAuthor(author);
		this.setPrice(price);		
	}
	public Book(String bName, Author author[], double price, int Qty) {
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
	public Author[] getAuthors() {		
		return this.author;
	}
	public void setAuthor(Author author[]) {
		this.author = author;
	}
	public String getAuthorNames(Author author[]) {
		//Author["+this.author.toString()+"]
		String ret= "Authors [";
		for (Author aut : author) {
			ret +=  aut.toString()+" ";
		}		
		return ret+" ]";
	}
	public String toString() {		
		return ("Book [name="+this.getbName()+"],"+this.getAuthorNames(this.getAuthors())+",price="+this.getPrice()+",qty="+this.getQty());
	}
}
