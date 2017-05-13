package excercise1;

import java.awt.TextField;

import javax.swing.JLabel;

public class Student {
	
	TextField studentName;
	TextField studentAddress;
	TextField studentProvince, studentCity, studentPostelCode, studentPhoneNumber,
	studentEmail;

	
	public Student()
	{
		
	}
	public Student(TextField studentName, TextField studentAddress, TextField studentProvince, TextField studentCity,
			TextField studentPostelCode, TextField studentPhoneNumber, TextField studentEmail) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentProvince = studentProvince;
		this.studentCity = studentCity;
		this.studentPostelCode = studentPostelCode;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentEmail = studentEmail;
	}

	
	public TextField getStudentName() {
		return studentName;
	}
	public void setStudentName(TextField studentName) {
		this.studentName = studentName;
	}
	public TextField getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(TextField studentAddress) {
		this.studentAddress = studentAddress;
	}
	public TextField getStudentProvince() {
		return studentProvince;
	}
	public void setStudentProvince(TextField studentProvince) {
		this.studentProvince = studentProvince;
	}
	public TextField getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(TextField studentCity) {
		this.studentCity = studentCity;
	}
	public TextField getStudentPostelCode() {
		return studentPostelCode;
	}
	public void setStudentPostelCode(TextField studentPostelCode) {
		this.studentPostelCode = studentPostelCode;
	}
	public TextField getStudentPhoneNumber() {
		return studentPhoneNumber;
	}
	public void setStudentPhoneNumber(TextField studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}
	public TextField getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(TextField studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String toString()
	{
		return getStudentName() + " " + getStudentAddress() +" " +  getStudentCity() + " " + getStudentProvince() + " " + getStudentPostelCode() + " " + getStudentPhoneNumber() + " " + 
				getStudentEmail(); 
	}

}
