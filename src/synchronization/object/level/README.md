# java-concurrency


#Description
	
One of the most common situations in concurrent programming occurs when more than one execution thread shares a resource. In a concurrent application, it is normal that multiple threads read or write the same data or have access to the same file or database connection. These shared resources can provoke error situations or data inconsistency and we have to implement mechanisms to avoid these errors. 

The solution for these problems comes with the concept of critical section. A critical section is a block of code that accesses a shared resource and can't be executed by more than one thread at the same time.


#Some advantages:

	When you use the synchronized keyword to protect a block of code, you use an object as a parameter. JVM guarantees that only one thread can have access to all the blocks of code protected with that object (note that we always talk about objects, not about classes).

	In this example, we have an object that controls access to the vacanciesCinema1 attribute, so only one thread can modify this attribute each time, and another object controls access to the vacanciesCinema2 attribute, so only one thread can modify this attribute each time. But there may be two threads running simultaneously, one modifying the vacancesCinema1 attribute and the other one modifying the vacanciesCinema2 attribute

	

		
#Points to be remember
	
	1. Java provides an interface, the ThreadFactory interface to implement a Thread object factory. 
	2. The ThreadFactory interface has only one method called **newThread**. 
	3. It receives a	Runnable object as a parameter and returns a Thread object. 
	4. When you implement a ThreadFactory interface, you have to implement that interface and override this method.
	5. Most basic ThreadFactory, has only one line.