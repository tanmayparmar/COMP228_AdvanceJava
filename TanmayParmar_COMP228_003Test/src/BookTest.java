
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BookTest {

	public static void main(String[] args) {

		ArrayList<Book> book = new ArrayList<Book>();
		int userchoice;

		do {

			String title = JOptionPane.showInputDialog("Please Enter the Title of the Book");

			String ISBN = JOptionPane.showInputDialog("Please Enter the ISBN of the Book");

			String publisher = JOptionPane.showInputDialog("PLease Enter the Publisher of the Book");

			double price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the book:"));

			int year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year of the book:"));

			String Genre = JOptionPane.showInputDialog("Enter the Genre of the book. Children or Science");

			//String genre = Genre.toLowerCase();
			
			String genre = "children";
			
			if (Genre.equalsIgnoreCase(genre)) {
				ChildrenBook childBookObj = new ChildrenBook(title, ISBN, publisher, price, year);

				childBookObj.toString();
				book.add(childBookObj);
			}

			else {
				ScienceBook scienceBookObj = new ScienceBook(title, ISBN, publisher, price, year);

				scienceBookObj.toString();
				book.add(scienceBookObj);
			}
		userchoice = Integer.parseInt(JOptionPane.showInputDialog("Enter 0 for continue or 9 for close:"));

		} while (userchoice == 0);

		// polymorphic screen manager

		for (int i = 0; i < book.size(); i++) {
			book.get(i).setPrice(book.get(i).price);
			book.get(i).displayInfo();


		}


		
	}
}
