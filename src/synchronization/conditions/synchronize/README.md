# java-concurrency


#Description
	
One of the most common situations in concurrent programming occurs when more than one execution thread shares a resource. In a concurrent application, it is normal that multiple threads read or write the same data or have access to the same file or database connection. These shared resources can provoke error situations or data inconsistency and we have to implement mechanisms to avoid these errors. 

The solution for these problems comes with the concept of critical section. A critical section is a block of code that accesses a shared resource and can't be executed by more than one thread at the same time.


#Some advantages:

	The key to this example is the set() and get() methods of the EventStorage class. First of all, the set() method checks if there is free space in the storage attribute. If it's full, it calls the wait() method to wait for free space. When the other thread calls the notifyAll() method, the thread wakes up and checks the condition again. The notifyAll() method doesn't guarantee that the thread will wake up. This process is repeated until there is free space in the storage and it can generate a new event and store it. 
	
	The behavior of the get() method is similar. First, it checks if there are events on the storage. If the EventStorage class is empty, it calls the wait() method to wait for events. Where the other thread calls the notifyAll() method, the thread wakes up and checks the condition again until there are some events in the storage. 
	
	You have to keep checking the conditions and calling the wait() method in a while loop. You can't continue until the condition is true.
	