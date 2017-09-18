# java-concurrency


#Description
	
	*The factory pattern is one of the most used design patterns in the object-oriented programming world. It is a creational pattern.

#Some advantages:

	* It's easy to change the class of the objects created or the way we create these objects.
	* It's easy to limit the creation of objects for limited resources. For example, we can only have n objects of a type.
	* It's easy to generate statistical data about the creation of the objects.
		
#Points to be remember
	
	*Java provides an interface, the ThreadFactory interface to implement a Thread object factory. 
	*The ThreadFactory interface has only one method called **newThread**. 
	*It receives a	Runnable object as a parameter and returns a Thread object. 
	*When you implement a ThreadFactory interface, you have to implement that interface and override this method.
	*Most basic ThreadFactory, has only one line.