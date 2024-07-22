package learnJava;

public class Exception_propogation 
{

	/*
	 * The method get compiled by java JVM to it automatic handles the error.
	 */
	public static void main(String[] args)
	{
		method_1();
	}
	
	
	/*
	 * It check wheather it can handle the method_2 exception.
	 * 
	 * In case if does not have it send to ots caller method that is main method.
	 */
	public static void method_1()
	{
			method_2();
	}
	
	
	/*
	 * This method check wheather it can handle the exception. If no than it verifies from its caller method
	 * that is method_1.
	 */
	public static void method_2()
	{
		System.out.println(10/0);
	}

}
