import java.util.Date;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread thread1 = new Thread(dsLoader, "DataSourceThread");

		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader, "NetworkConnectionLoader");
		thread1.start();
		thread2.start();
		thread2.join();
		thread1.join();
		
		
		System.out.printf("Main: Configuration has been loaded:%s\n",new Date());

	}
}
