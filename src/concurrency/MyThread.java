package concurrency;

public class MyThread extends Thread {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (i++ < 10) {
					System.out.println("Hello Thred" + i);
				}
				
			}
		}).start();
	}
}
