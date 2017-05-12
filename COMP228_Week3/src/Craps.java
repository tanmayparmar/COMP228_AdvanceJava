import java.security.SecureRandom;

public class Craps {

private static final SecureRandom randomNumbers = new SecureRandom();

private enum Status {
	CONTINUE,WON,LOST
};
	


private static final int SNAKE_EYES = 2;
private static final int TREY = 3;
private static final int SEVEN = 7;
private static final int ELEVEN = 11;
private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice)
		{
		case SEVEN: //win with a roll of 7 on the first roll
		case ELEVEN: //Win with a roll of 11 on the first roll
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("Point is %d%n",myPoint);
				break;
		}
		
		while(gameStatus == Status.CONTINUE){
			sumOfDice = rollDice();
			
			//determine game status
			if(sumOfDice == myPoint)
			{
				gameStatus = Status.WON;
			}
			
			else if(sumOfDice == myPoint)
			{
				gameStatus = Status.LOST;
			}
		}
		
		if(gameStatus == Status.WON)
		{System.out.println("Player Wins!!!!");}
		
		else
		{
			System.out.println("PLayer Loses!!!!!!!!!");
		}
	}
	
	public static int rollDice() {
		
		//pick random die values
		int die1 = 1+ randomNumbers.nextInt(6);
		int die2 = 1+ randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d%n",die1,die2,sum);
		return sum;
	}

}
