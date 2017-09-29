# java-concurrency

#Thread Executors

	Usually, when you develop a simple, concurrent-programming application in Java, you create some Runnable objects and then 		create the corresponding Thread objects to execute them. If you have to develop a program that runs a lot of concurrent 		tasks, this approach has the following disadvantages:
		1. You have to implement all the code-related information to the management of the Thread objects (creation, ending, 			   obtaining results).
		2. You create a Thread object per task. If you have to execute a big number of tasks, this can affect the throughput of 		   the application
		3. You have to control and manage efficiently the resources of the computer. If you create too many threads, you can 			   saturate the system.
	
	This mechanism is called the Executor framework and is around the Executor interface, its subinterface ExecutorService, and 	the ThreadPoolExecutor class that implements both interfaces.
	
	With an executor, you only have to implement the Runnable objects and send them to the executor. It is responsible for their 	execution, instantiation, and running with necessary threads. But it goes beyond that and improves performance using a pool 	of threads. When you send a task to the executor, it tries to use a pooled thread for the execution of this task, to avoid 		continuous spawning of threads.
	
	Another important advantage of the Executor framework is the Callable interface. It's similar to the Runnable interface, but 	offers two improvements, which are as follows:
		
		1.The main method of this interface, named call(), may return a result.
		2.When you send a Callable object to an executor, you get an object that implements the Future interface. You can use 			  this object to control the status and the result of the Callable object.
		
#How it works...

	The first important point is the creation of ThreadPoolExecutor in the constructor of the Server class. The 					ThreadPoolExecutor class has four different constructors but, due to their complexity, the Java concurrency API provides the 	Executors class to construct executors and other related objects. Although we can create ThreadPoolExecutor directly using 		one of its constructors, it's recommended to use the Executors class
	
	Use the executor created by the newCachedThreadPool() method only when you have a reasonable number of threads or when they 	have a short duration.