import javax.swing.JOptionPane;

public class ScienceBook extends Book{

	String genre = "Science";
	double priceAfterDiscount;
	
	public ScienceBook(String title, String iSBN, String publisher, double price, int year) {
		super(title, iSBN, publisher, price, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double setPrice(double price) {
		// TODO Auto-generated method stub
		
		double discount = 0.10 * price;
		return priceAfterDiscount = price - discount;
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}

	
	@Override
	public void displayInfo() {
		JOptionPane.showMessageDialog(null,String.format("ScienceBook:%s; %s: $%.2f ",
				super.toString(), "Price", priceAfterDiscount));
	}
}
