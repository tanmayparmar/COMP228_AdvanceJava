package ex5;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		name = JOptionPane.showInputDialog("What is your name?");
		String message = String.format("Welcome,%s", name);
		JOptionPane.showMessageDialog(null, message);
	}

}
