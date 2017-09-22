# java-concurrency


#Lock Description
	
	One It's based on the Lock interface and classes that implement it (as ReentrantLock). This mechanism presents
	some advantages, which are as follows:
	
	* It allows the structuring of synchronized blocks in a more flexible way. With the synchronized keyword, you have to 		get and free the control over a synchronized block of code in a structured way. The Lock interfaces allow you to 		get more complex structures to implement your critical section.
	
	* The Lock interfaces provide additional functionalities over the synchronized keyword. One of the new functionalities 		is implemented by the tryLock() method. This method tries to get the control of the lock and if it can't, because 		it's used by other thread, it returns the lock. With the synchronized keyword, when a thread (A) tries to execute a 		synchronized block of code, if there is another thread (B) executing it, the thread (A) is suspended until the 			thread (B) finishes the execution of the synchronized block. With locks, you can execute the tryLock() method. This 		method returns a Boolean value indicating if there is another thread running the code protected by this lock.

	* The Lock interfaces allow a separation of read and write operations having multiple readers and only one modifier.

	* The Lock interfaces offer better performance than the synchronized keyword.
	
#There's more…

	The Lock interface (and the ReentrantLock class) includes another method to get the control of the lock. It's the 		tryLock() method. The biggest difference with the lock() method is that this method, if the thread that uses it can't 	get the control of the Lock interface, returns immediately and doesn't put the thread to sleep. This method returns a	boolean value, true if the thread gets the control of the lock, and false if not.