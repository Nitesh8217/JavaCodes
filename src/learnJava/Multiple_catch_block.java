package learnJava;

public class Multiple_catch_block
{

	public static void main(String[] args) 
	{
		String[] numbers = {"10","20","thirty","30","40"};
		
		
		try
		{
			
			// Example that will throw array index bound exception
			int num = Integer.parseInt(numbers[2]);
			System.out.println("Parsed number"+num);
			
			System.out.println("Parsed number"+numbers[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			// Error which occurs when we add more values 
			System.out.println("Error : Array Index out of Bounds ");
			e.printStackTrace();
		}
		catch(NumberFormatException e)
		{
			// Wrong number formate
			System.out.println("Error : Invalid number formate ");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Execution complete");
		}

	}

}