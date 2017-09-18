package PrimeGenerator;

public class PRimeMain {
	public static void main(String[] args) {
		Thread t = new PrimeGenerator();
		t.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.interrupt();

	}
}
