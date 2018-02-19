package com.Composition;

public class MainClass {

	public static void main(String[] args) {
		/*Author ahTeck = new Author("max", "max@jd.com", 'm');
		System.out.println(ahTeck);
		
		Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
		System.out.println(dummyBook);
		
		dummyBook.setPrice(29.95);
		dummyBook.setQty(28);
		System.out.println("name is: " + dummyBook.getbName());
		System.out.println("price is: " + dummyBook.getPrice());
		System.out.println("qty is: " + dummyBook.getQty());
		System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
		System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
		System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
		System.out.println(dummyBook);
		
		Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
		System.out.println(anotherBook);*/
		
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

		// Declare and allocate a Book instance
		Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);  // toString()
		
		authors[0] = new Author("Tan Ah Teck23453", "234AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tandfghgg", "442rergPaul@nowhere.com", 'm');

		// Declare and allocate a Book instance
		Book javaDummy1 = new Book("Java for Dummy's", authors, 29.99, 909);
		System.out.println(javaDummy1);  // toString()
	}

}
