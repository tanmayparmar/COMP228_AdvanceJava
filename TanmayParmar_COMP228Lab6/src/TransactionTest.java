
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransactionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// setting balance for account
		Account accountObj = new Account(1000);

		Transaction t1 = new Transaction("deposit", accountObj);
		Transaction t2 = new Transaction("withdraw", accountObj);
		Transaction t3 = new Transaction("withdraw", accountObj);

		ArrayList<Transaction> t = new ArrayList<>();

		t.add(t1);
		t.add(t2);
		t.add(t3);

		ExecutorService es = Executors.newCachedThreadPool();

		for (Transaction T : t) {
			es.execute(T);

		}

		es.shutdown();

	}

}
