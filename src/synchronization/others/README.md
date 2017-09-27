# java-concurrency
	Semaphores are a generic synchronization mechanism that you can use to protect any critical section in any problem. The 	other mechanisms are thought to be 	used in applications with specific features as it was described previously. Be sure 	to select the appropriate mechanism according to the characteristics of your application.
	
	When a thread wants to access one of these shared resources, first, it must acquire the semaphore. If the internal 		counter of the semaphore is greater than 0, the semaphore decrements the counter and allows access to the shared 		resource. A counter bigger than 0 means there are free resources that can be used, so the thread can access and use one 	of them.

	Otherwise, if the counter of the semaphore is 0, the semaphore puts the thread to sleep until the counter is greater 	than 0. A value of 0 in the counter means all the shared resources are used by other threads, so the thread that wants 	to use one of them must wait until one is free.
	


#Semaphores: 
	A semaphore is a counter that controls the access to one or more shared resources. This mechanism is one of the basic tools of concurrent programming and 	is provided by most of the programming languages.

#CountDownLatch: 
	The CountDownLatch class is a mechanism provided by the Java language that allows a thread to wait for the finalization of multiple operations.

#CyclicBarrier: 
	The CyclicBarrier class is another mechanism provided by the Java language that allows the synchronization of multiple threads in a common point.

#Phaser: 
	The Phaser class is another mechanism provided by the Java language that controls the execution of concurrent tasks divided in phases. All the threads 		must finish one phase before they can continue with the next one. This is a new feature of the Java 7 API.
 
#Exchanger: 
	The Exchanger class is another mechanism provided by the Java language that provides a point of data interchange between two threads.
	
	The key to this example is in the printJob() method of the PrintQueue class. This method shows the three steps you must 	follow when you use a semaphore to implement a critical section, and protect the access to a shared resource:
		
		1. First, you acquire the semaphore, with the acquire() method.
		2. Then, you do the necessary operations with the shared resource.
		3. Finally, release the semaphore with the release() method.