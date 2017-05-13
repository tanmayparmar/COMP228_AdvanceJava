import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest extends Thread {
	Account accountObj = new Account(1000);

	public static void main(String arg[]) {
		
		//setting balance
		Account accountObj = new Account(1000);

		//creating object of transaction class
		Transaction transaction1 = new Transaction("withdraw", accountObj);
		Transaction transaction2 = new Transaction("deposit", accountObj);

		
		transaction1.run();
		transaction2.run();
		//executing thread using ExecutorService
		ExecutorService exService = Executors.newCachedThreadPool();
		exService.execute(transaction1);
		exService.execute(transaction2);

		exService.shutdown();

	}

}
