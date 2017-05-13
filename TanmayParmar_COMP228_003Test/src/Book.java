

import javax.swing.JOptionPane;

public abstract class Book {
	
	String title;
	String ISBN;
	String publisher;
	double price;
	int year;
	public Book(String title, String iSBN, String publisher, double price, int year) {
		super();
		this.title = title;
		ISBN = iSBN;
		this.publisher = publisher;
		this.price = price;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayInfo()
	{
		
		JOptionPane.showMessageDialog(null, String.format("Title:%s%n ISBN:%s%n Year:%d%n Publisher:%s%n", getTitle(),getISBN(),getYear(),getPublisher()));
		
	}
	public abstract double setPrice(double price);
	
	public abstract String getGenre();
	
	
}
