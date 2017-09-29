# java-concurrency


#Executing tasks in an executor that returns a result
	
	One of the advantages of the Executor framework is that you can run concurrent tasks that return a result. The Java 			Concurrency API achieves this with the following two interfaces:
	
#There's more…

		1. Callable: This interface has the call() method. In this method, you have to implement the logic of a task. The 			       Callable interface is a parameterized interface, meaning you have to indicate the type of data the call() method will 		   return.
		2. Future: This interface has some methods to obtain the result generated by a Callable object and to manage its state.
		
	In this recipe, you have learned how to use the Callable interface to launch concurrent tasks that return a result. You have 	implemented the FactorialCalculator class that implements the Callable interface with Integer as the type of the result. 		Hence, it returns'before type of the call() method.
	
	The other critical point of this example is in the Main class. You send a Callable object to be executed in an executor 		using the submit() method. This method receives a Callable object as a parameter and returns a Future object that you can 		use with two main objectives: