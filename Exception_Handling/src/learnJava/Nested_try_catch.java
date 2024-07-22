package learnJava;


// Program demonstrating nested try block.
public class Nested_try_catch 
{

	public static void main(String[] args)
	{
		try
		{
			try
			{
				int array[] = {10,20,30,40};
				System.out.println(array[6]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				
			}
			
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Code completed");
		}

	}

}
