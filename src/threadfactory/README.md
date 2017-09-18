# java-concurrency


#Description
	
	*The factory pattern is one of the most used design patterns in the object-oriented programming world. It is a creational pattern.

#Some advantages:

	* It's easy to change the class of the objects created or the way we create these objects.
	* It's easy to limit the creation of objects for limited resources. For example, we can only have n objects of a type.
	* It's easy to generate statistical data about the creation of the objects.
		
#Points to be remember
	
	1. Java provides an interface, the ThreadFactory interface to implement a Thread object factory. 
	2. The ThreadFactory interface has only one method called **newThread**. 
	3. It receives a	Runnable object as a parameter and returns a Thread object. 
	4. When you implement a ThreadFactory interface, you have to implement that interface and override this method.
	5. Most basic ThreadFactory, has only one line.