package Multithreading;

public interface Buffer {
	// Place int value into buffer
	public void blockingPut(int value) throws InterruptedException;
	
	// Obtains an int value from buffer
	public int blockingGet() throws InterruptedException;
}
