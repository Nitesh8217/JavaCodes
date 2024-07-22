// Java program using array where size is dynamic

package learnJava;
import java.util.Scanner;
// we use scanner class to take input from the varaible.
public class Dynamic_Array_In_Java
{
	public static void main(String[] args) 
	{
		int array_size;
		// here we have taken a varaible array_size to take the size of array
		
		
		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		array_size = sc.nextInt();
		
		int dynamic_size[] = new int[array_size];
		/* we have created a array by name dynamic size bcoz the size of the array can be 
		 * change it is not static in size  */
		
		
		for(int i = 0 ; i<array_size ; i++)
		{
			dynamic_size[i] = sc.nextInt();
		}
		/* In this loop we are allocating the element entered by the user and storing it into array index
		 * to the name given dynamic_size*/
		
		
		
		for(int i = 0 ; i<array_size;i++)
		{
			System.out.println(dynamic_size[i]);
		}
		
		/*Here there is another loop where we have printed the elements which have been entered by the user */
	}

}
