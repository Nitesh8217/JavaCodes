package learnJava;
// *  Multithreading is a ability to execute multiple different path of the code at the same time
// *  
// *   In java it uses only one thread but it has ability to break off into multiple thread and do multiple things
// *   at once.
// */
public class Multithreading_program extends Thread
{
	/*
	 * assigning number to the thread to check which number is printed which thread
	 * 
	 * creating a constructor
	 */
	
	private int threadNumber;
	
	public Multithreading_program(int threadNumber)
	{
		this.threadNumber = threadNumber;
	}
	
	// We write the code to which we want to run in multithread.
	public void run()
	{
		
		// for loop to print the number from 1 to 5
		for(int itaration = 1; itaration<=5 ; itaration++)
		{
			System.out.println(itaration+ " From thread"+threadNumber);
			
			// Throwing an exception ny throw keyword.
			
			
			if(threadNumber==3)
			{
				throw new RuntimeException();
			}
			
			
			try
			{
				// prints the second number after 1000mls
				Thread.sleep(1000);
			}
			
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
