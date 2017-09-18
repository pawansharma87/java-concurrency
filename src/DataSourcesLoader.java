import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DataSourcesLoader implements Runnable {
	public void run() {
		System.out.printf("Beginning data sources loading: %s\n", new Date());
		try {
			int i=0;
			while(i++<200){
			TimeUnit.SECONDS.sleep(0);
			System.out.printf("Data sources  loading has finished:%s\n",
					new Date());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}