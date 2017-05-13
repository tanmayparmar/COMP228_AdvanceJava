<<<<<<< HEAD
package exercise1;

import java.awt.geom.PathIterator;

import javax.swing.JOptionPane;

public class PattientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object to call Patient Class
		Patient patientObj = new Patient();

		//Saving User input inside the variables
		patientObj.setPatient_id(JOptionPane.showInputDialog("Enter your Patient Id"));

		patientObj.setFirst_name(JOptionPane.showInputDialog("Enter Your First Name"));
		patientObj.setLast_name(JOptionPane.showInputDialog("Enter Your Last Name"));
		patientObj.setAddress(JOptionPane.showInputDialog("Enter Your Address"));
		patientObj.setCity(JOptionPane.showInputDialog("Enter Your City"));
		patientObj.setProvince(JOptionPane.showInputDialog("Enter your Province"));
		patientObj.setPostal_code(JOptionPane.showInputDialog("Enter Your Postal Code"));

		//Calling getPatientInfo Method
		patientObj.getPatientInfo();

	}

}
=======
package exercise1;

import java.awt.geom.PathIterator;

import javax.swing.JOptionPane;

public class PattientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Object to call Patient Class
		Patient patientObj = new Patient();

		//Saving User input inside the variables
		patientObj.setPatient_id(JOptionPane.showInputDialog("Enter your Patient Id"));

		patientObj.setFirst_name(JOptionPane.showInputDialog("Enter Your First Name"));
		patientObj.setLast_name(JOptionPane.showInputDialog("Enter Your Last Name"));
		patientObj.setAddress(JOptionPane.showInputDialog("Enter Your Address"));
		patientObj.setCity(JOptionPane.showInputDialog("Enter Your City"));
		patientObj.setProvince(JOptionPane.showInputDialog("Enter your Province"));
		patientObj.setPostal_code(JOptionPane.showInputDialog("Enter Your Postal Code"));

		//Calling getPatientInfo Method
		patientObj.getPatientInfo();

	}

}
>>>>>>> origin/master
