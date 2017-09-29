# java-concurrency

#Running multiple tasks and processing the

	first result A common problem in concurrent programming is when you have various concurrent tasks that solve a problem, and you are only interested in the first result of those tasks. 
	
	For example, you want to sort an array. You have various sort algorithms. You can launch all of them and get the result of the first one that sorts these, that is, the fastest sorting algorithm for a given array. 
	
#How it works...

	The key of the example is in the Main class. The invokeAny() method of the ThreadPoolExecutor class receives a list of tasks, launches them, and returns the result of the first task that finishes without throwing an exception. This method returns the same data type that the call() method of the tasks you launch returns. In this case, it returns a String value.
	
	The example has two UserValidator objects that return a random boolean value. Each UserValidator object is used by a Callable object, implemented by the TaskValidator class. If the validate() method of the UserValidator class returns a false value, the TaskValidator class throws Exception. Otherwise, it returns the true value. So, we have two tasks that can return the true value or throw an Exception exception.

	You can have the following four possibilities:
		1.Both tasks return the true value. The result of the invokeAny() method is the name of the task that finishes in the 			first place.
		2.The first task returns the true value and the second one throws Exception. The result of the invokeAny() method is the 		name of the first task.
		3.The first task throws Exception and the second one returns the true value. The result of the invokeAny() method is the 		name of the second task.
		4.Both tasks throw Exception. In that class, the invokeAny() method throws an ExecutionException exception.
		
#There's more…

	The ThreadPoolExecutor class provides another version of the invokeAny() method:
		1.invokeAny(Collection<? extends Callable<T>> tasks, long timeout,TimeUnit unit): This method executes all the tasks and 		returns the result of the first one that finishes without throwing an exception, if it finishes before the given timeout 		passes. The TimeUnit class is an enumeration with the following constants: DAYS, HOURS, MICROSECONDS, MILLISECONDS, 			MINUTES, NANOSECONDS,and SECONDS.