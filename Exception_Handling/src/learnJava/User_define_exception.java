package learnJava;

/*
 * Creating a class with the same name of exception name.
 * 
 * Also we create a constructor for the object of InvalidAgeException.
 * 
 * If we dont use super class Exception errors i.e Invalid exception cannot be throwable.
 */
class InvalidAgeException extends Exception
{
	
	//Creating a parameterized constructor
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
	
}
public class User_define_exception
{

	public static void main(String[] args) 
	{
		
		try
		{
			// Calling the vote method from main method.
			vote(19);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	
/*
 *  Method named with vote.
 *  
 *  To declare a exception we use throws keyword. And declare the exception here itself.
 */

	public static void vote(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			/*
			 * Creation of user defined exception.
			 * 
			 *  we use throw keyword to create a exception object and throw it 
			 */
			throw new InvalidAgeException("Not eligible for vote");
		}
		else
		{
			System.out.println("eligible for vote");
		}
	}

}
