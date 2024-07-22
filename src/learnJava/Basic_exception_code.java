package learnJava;

import java.util.Scanner;

public class Basic_exception_code 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			int number_01 , number_02;
			System.out.println("Enter first number");
			number_01 = sc.nextInt();
			System.out.println("Enter second number");
			number_02 = sc.nextInt();
		
			int number_03 = number_01 / number_02;
			System.out.println(number_03);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				
				

	}

}
