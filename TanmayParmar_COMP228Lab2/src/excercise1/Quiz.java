package excercise1;


import java.util.Random;
import javax.swing.JOptionPane;

class Que {
	String question;
	String[] multipleOptions = new String[4];
	int answers;
	
}

public class Quiz {

	String userInput;
	char input;
	Que[] quiz = new Que[5];
	int correct=0;
	public Quiz(){
        
        for(int i=0; i<5; i++) {
           quiz[i]=new Que();
        }
		
        simulateQuestion();
	}
	
	
	public void simulateQuestion()
	{		
		
		//Defining Question
		quiz[0].question = "Which part is known as brain of the computer?" ;
		quiz[1].question = "JAVA is.... "; 
		quiz[2].question = "How do you declare an integer variable a ?";
		quiz[3].question = "How to do single line comment in JAVA? ";
		quiz[4].question = "What is the default value of String variable?? ";
		
		//Defining Options
		quiz[0].multipleOptions[0]="(A)ALU";
		quiz[0].multipleOptions[1]="(B)GPU";
		quiz[0].multipleOptions[2]="(C)CPU";
		quiz[0].multipleOptions[3]="(D)MPU";
		quiz[1].multipleOptions[0]= "(A)Machine dependent";
		quiz[1].multipleOptions[1]= "(B)Compiler Dependent";
		quiz[1].multipleOptions[2]= "(C)Compiler Indepenedent";
		quiz[1].multipleOptions[3]= "(D)Machine Indepenedent";
		quiz[2].multipleOptions[0]="(A)int a";
		quiz[2].multipleOptions[1]="(B)Integer a";
		quiz[2].multipleOptions[2]="(C)int[] a";
		quiz[2].multipleOptions[3]="(D)in a";
		quiz[3].multipleOptions[0]="(A) /";
		quiz[3].multipleOptions[1]="(B)//";
		quiz[3].multipleOptions[2]="(C)commnent";
		quiz[3].multipleOptions[3]="(D)**";
		quiz[4].multipleOptions[0]="(A)null";
		quiz[4].multipleOptions[1]="(B)not defined";
		quiz[4].multipleOptions[2]="(C)''";
		quiz[4].multipleOptions[3]="(D)string";
		
		
		//ASCII Comparison of the Result
		quiz[0].answers=67;
		quiz[1].answers=68;
		quiz[2].answers=65;
		quiz[3].answers=66;
		quiz[4].answers=65;		
	}
	
	
	//Taking user input of the user
	public void inputAnswer (){
		for(int number=0;number<5;number++)
		{
			userInput=JOptionPane.showInputDialog("Question" +(number+1)+"." + quiz[number].question+"\n\n" +quiz[number].multipleOptions[0]+"\n"+quiz[number].multipleOptions[1]+"\n"+quiz[number].multipleOptions[2]+"\n"+quiz[number].multipleOptions[3]+"\n" + "\nPlease Write your Answer here" );
			boolean ans = checkAnswer(number);
			generateMessage(ans,number);
			
		}
	}
	
	
	//Checking Answers 
	public Boolean checkAnswer(int num)
	{
		input = userInput.toUpperCase().charAt(0);	
		if (input == quiz[num].answers){
			correct++;
			return true;
			
		} else {
			return false;
		}	
	}
	
	//Generating Random Message
	
	
	public void generateMessage(boolean ans, int num)
	{
		Random random = new Random();
		if (ans == true){
			switch(random.nextInt(5))
			{
			case 0:
				JOptionPane.showMessageDialog(null, "Very Good");
				break;
			case 1:
				JOptionPane.showMessageDialog(null,"Nice Work Keep It Up!!!");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Excellent!!!");
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Well Done...");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Good Work");	
				break;
			}	
		} else {
			switch(random.nextInt(5))
			{
			case 0:
				JOptionPane.showMessageDialog(null,"No. Please try again\n Correct Ans: "+quiz[num].multipleOptions[quiz[num].answers-65]+".");
				break;
			case 1:
				JOptionPane.showMessageDialog(null,"Wrong. Try once more\n Correct Ans: "+quiz[num].multipleOptions[quiz[num].answers-65]+".");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Don't Give up!!!\n Correct Ans: "+quiz[num].multipleOptions[quiz[num].answers-65]+".");
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"No. Keep trying...\n Correct Ans: "+quiz[num].multipleOptions[quiz[num].answers-65]+".");
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Give it another chance\n Correct Ans: "+quiz[num].multipleOptions[quiz[num].answers-65]+".");	
				break;
			}
		}
	}
	
	//Displaying Total Marks
	
	public void displayMarks()
	{
		int percentage = (correct * 100) / 5;
		JOptionPane.showMessageDialog(null, "Your Total Correct Answers is: " +correct);
		JOptionPane.showMessageDialog(null, "Your Percentage is: " +percentage + "%");
	}
}
