# java-concurrency


#Description
	
One of the most common situations in concurrent programming occurs when more than one execution thread shares a resource. In a concurrent application, it is normal that multiple threads read or write the same data or have access to the same file or database connection. These shared resources can provoke error situations or data inconsistency and we have to implement mechanisms to avoid these errors. 

The solution for these problems comes with the concept of critical section. A critical section is a block of code that accesses a shared resource and can't be executed by more than one thread at the same time.


#Some advantages:

	every method declared with the synchronized keyword is a critical section and Java only allows the execution of one of the critical sections of an object.

	