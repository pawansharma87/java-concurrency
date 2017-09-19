# java-concurrency


#Thread-Local Description
	
	One of the most critical aspects of a concurrent application is shared data. This has special importance in those objects that extend the Thread class or implement the Runnable interface.

	If you create an object of a class that implements the Runnable interface and then start various Thread objects using the same Runnable object, all the threads share the same attributes. 
	
	This means that, if you change an attribute in a thread, all the threads will be affected by this change.

	Sometimes, you will be interested in having an attribute that won't be shared between all the threads that run the same object. The Java Concurrency API provides a clean mechanism called thread-local variables with a very good performance.

# Without thread local example :

	*you can see the results of this program's execution. Each Thread has a different start time but, when they finish, all have the same value in its startDate attribute.

#Points With thread local example
	
	Thread-local variables store a value of an attribute for each Thread that uses one of these variables. You can read the value using the get() method and change the value using the set() method. The first time you access the value of a thread-local variable, if it has no value for the Thread object that it is calling, the thread-local variable calls the initialValue() method to assign a value for that Thread and returns the initial value.