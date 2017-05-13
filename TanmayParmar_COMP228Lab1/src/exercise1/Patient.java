<<<<<<< HEAD
package exercise1;

import javax.swing.JOptionPane;

public class Patient {

	static String patient_id;
	static String first_name, last_name, address, city, province, postal_code;

	
	//Construsctor to initialize variables
	
	public Patient(String patient_id, String first_name, String last_name, String address, String city, String province,
			String postal_code) {
		super();
		this.patient_id = patient_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postal_code = postal_code;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String string) {
		this.patient_id = string;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	//Default Constructor
	
	public Patient() {

	}

	//getPatientInfo Method to Display user input in Formated String
	public void getPatientInfo() {
		String message = String.format("Welcome,%s",
				getFirst_name() + " " + getLast_name() + ". " + "Your Patient ID is: " + getPatient_id() + ". "
						+ "Your Address is " + getAddress() + ". " + "You are from " + getCity() + "," + getProvince()
						+ "," + getPostal_code() + ".");
		JOptionPane.showMessageDialog(null, message);
	}
}
=======
package exercise1;

import javax.swing.JOptionPane;

public class Patient {

	static String patient_id;
	static String first_name, last_name, address, city, province, postal_code;

	
	//Construsctor to initialize variables
	
	public Patient(String patient_id, String first_name, String last_name, String address, String city, String province,
			String postal_code) {
		super();
		this.patient_id = patient_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postal_code = postal_code;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String string) {
		this.patient_id = string;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	//Default Constructor
	
	public Patient() {

	}

	//getPatientInfo Method to Display user input in Formated String
	public void getPatientInfo() {
		String message = String.format("Welcome,%s",
				getFirst_name() + " " + getLast_name() + ". " + "Your Patient ID is: " + getPatient_id() + ". "
						+ "Your Address is " + getAddress() + ". " + "You are from " + getCity() + "," + getProvince()
						+ "," + getPostal_code() + ".");
		JOptionPane.showMessageDialog(null, message);
	}
}
>>>>>>> origin/master
