import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NetworkConnectionsLoader implements Runnable {
	public void run() {
		System.out.printf("Beginning NetworkConnectionsLoader loading: %s\n",
				new Date());
		try {
			int i=0;
			while(i++<10){
			TimeUnit.SECONDS.sleep(0);
			System.out.printf("NetworkConnectionsLoader loading has finished:%s\n",
					new Date());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
