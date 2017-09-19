package synchronization.conditions.synchronize;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class EventStorage {

	private int maxSize;
	private List<Date> storage;

	public EventStorage() {
		maxSize = 10;
		storage = new LinkedList<Date>();
	}

	public synchronized void set() {
		while (storage.size() == maxSize) {
			try {
				System.out.println("Waiting for storage to be empty by consumer...");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		((LinkedList<Date>) storage).offer(new Date());
		System.out.printf("Set: %d", storage.size());
		System.out.println();
		notifyAll();
	}

	public synchronized void get() {
		while (storage.size() == 0) {
			try {
				System.out.println("Waiting for data to be generated  by producer...");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.printf("Get: %d: %s", storage.size(),((LinkedList<?>) storage).poll());
		System.out.println();
		notifyAll();
	}

}
