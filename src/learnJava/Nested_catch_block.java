package learnJava;

public class Nested_catch_block
{

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			try
			{
				String alphabet = null;
				System.out.println(alphabet.toLowerCase());
			}
			catch(NullPointerException ex)
			{
				System.out.println("Null Value cannot be converted");
			}
			
		}
		finally
		{
			System.out.println("I got execute always");
		}

	}

}
