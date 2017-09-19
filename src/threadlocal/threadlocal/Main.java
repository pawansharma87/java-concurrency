package threadlocal.threadlocal;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		//Thsi Code is without thread local cocept
		WithoutThreadLocal safetask = new WithoutThreadLocal();
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(safetask);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("This output is thread local");
		//Thsi Code is with thread local cocept
		WithThreadLocal task = new WithThreadLocal();
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(task);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
	}

}
