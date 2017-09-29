# java-concurrency

#Creating a fixed-size thread executor

	When you use basic ThreadPoolExecutor created with the newCachedThreadPool() method of the Executors class, you can have a problem with the number of threads the executor is running at a time. The executor creates a new thread for each task that receives, (if there is no pooled thread free) so, if you send a large number of tasks and they have long duration, you can overload the system and provoke a poor performance of your application.If you want to avoid this problem, the Executors class provides a method to create a fixed-size thread executor. This executor has a maximum number of threads. If you send more tasks than the number of threads, the executor won't create additional threads and the remaining tasks will be blocked until the executor has a free thread. With this behavior, you guarantee that the executor won't yield a poor performance of your application.
	
#How it works...

	In this case, you have used the newFixedThreadPool() method of the Executors class to create the executor. This method creates an executor with a maximum number of threads. If you send more tasks than the number of threads, the remaining tasks will be blocked until there is a free thread to process them This method receives the maximum number of threads as a parameter you want to have in your executor. In your case, you have created an executor with five threads.
	
	To write the output of the program, you have used some methods of the ThreadPoolExecutor class, including:
		1. getPoolSize(): This method returns the actual number of threads in the pool of the executor
		2. getActiveCount(): This method returns the number of threads that are executing tasks in the executor
		
#There's more…
	The Executors class also provides the newSingleThreadExecutor() method. This is an extreme case of a fixed-size thread executor. It creates an executor with only one thread, so it can only execute one task at a time.