package excercise2;

import java.util.ArrayList;
import java.util.Scanner;

import excercise1.Insurance;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice, credit_hour;
		String name;
		ArrayList <Student> student = new ArrayList<Student>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		name = input.nextLine();
		
		System.out.println("Enter 1 for Full Time Student"); 
		System.out.println("Enter 2 for Part Time Student");
		userChoice = input.nextInt();
		
		if (userChoice==1){
			Student s_Obj = new FullTimeStudent(name);
			student.add(s_Obj);
		} else if (userChoice==2){
			System.out.println("please enter your credit hours\t");
			credit_hour = input.nextInt();
			Student s_obj = new PartTimeStudent(name, credit_hour);
			student.add(s_obj);
		} else{
			System.out.println("Wrong input");
		}
		
		input.close();
		
		for(Student stu : student){
			System.out.printf("Student Name:%s %nTotal tution Fee:%s",stu.studentName, stu.getTotalTutionFee());
		}
	}

}
