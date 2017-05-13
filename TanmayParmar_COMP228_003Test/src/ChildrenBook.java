import javax.swing.JOptionPane;

public class ChildrenBook extends Book{
	
	String genre = "Children Book";
	
	
	
	public ChildrenBook(String title, String iSBN, String pubisher, double price, int year) {
		super(title, iSBN, pubisher, price, year);
		// TODO Auto-generated constructor stub
	}


	
	
	
	
	@Override
	public double setPrice(double price) {
		// TODO Auto-generated method stub
		
		
		return price;
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}

	
	@Override
	public void displayInfo() {
		JOptionPane.showMessageDialog(null,String.format("ChildrenBook:%s; %s: $%.2f ",
				super.toString(), "Price", price));
	}

		
				
				
	}

	
	
	

