# java-concurrency


#ReentrantReadWriteLock Description
	
		ReadWriteLock interface and the ReentrantReadWriteLock class, the unique one that implements it. This class has two 		locks, one for read operations and one for write operations. There can be more than one thread using read 				operations simultaneously, but only one thread can be using write operations. When a thread is doing a write 			operation, there can't be any thread doing read operations.
	
#There's more…

	The Lock interface (and the ReentrantLock class) includes another method to get the control of the lock. It's the 		tryLock() method. The biggest difference with the lock() method is that this method, if the thread that uses it can't 	get the control of the Lock interface, returns immediately and doesn't put the thread to sleep. This method returns a	boolean value, true if the thread gets the control of the lock, and false if not.