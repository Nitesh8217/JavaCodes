// This the main class of code multithreading.
package learnJava;

public class MainClass_of_multithreading {

	/*
	 * public:  Access modifier main method is accessible from outside the class. It allows the Java runtime system to
	 * execute this method.
	 * 
	 * static: This keyword allows the main method to be called without creating an
	 * instance (object) of the class.
	 * 
	 * void: This keyword specifies that the main method does not return any value.It simply performs a task.
	 * 
	 * main: This is the name of the method.(JVM) looks for this specific method signature
	 *  (public static void main(String[] args)when starting a Java program.
	 * 
	 * String[] args: This parameter is an array of strings that allows the program
	 * to accept arguments from the command line.
	 */
	public static void main(String[] args) 
	{
		
		// making a main class object
		
		
		for(int i = 0;i<5;i++)
		{
			Multithreading_program classobject = new Multithreading_program(i);
			classobject.start();
//			Multithreading_program classobject2 = new Multithreading_program();
		}
		
		/*
		 * By main class object we call start()
		 * 
		 * In case if we use run() it would have not simultaneously 
		 */
//		classobject.start();
		
		
		/*
		 *  Multiple cancurrent thread.
		 *  
		 *  if we use run() method the thread don't run symanteniously
		 */
//		classobject2.start();

	}

}
