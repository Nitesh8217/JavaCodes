//Java program using array to find the element from the array using linear search.

package learnJava;
import java.util.Scanner;
public class linear_search_in_java
{
	public static void main(String[] args) 
	{
		int array_size, element_to_find;
		/* Here we have taken 3 vraibles array_size which store the size of array given by user array index and the we used
		 * varaible element_to_find so find the element that is been entered*/
		
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		array_size = sc.nextInt();
		/*Here the user entered the size of array and get stored into array_sie    */
		
		int[] linear = new int[array_size];
		/* we have given linear as the name of array so here array is created*/
		
		
		System.out.println("Enter the values to the array");
		for(int i = 0 ; i<array_size ; i++)
		{
			linear[i] = sc.nextInt();
		}
		// This loop is used to take the value from the user and stores in the array.
		
		System.out.println("Enter the element to find");
		element_to_find = sc.nextInt();
		// This statement ask the user to entered the element that needs to find 
		
		for(int i = 0 ; i<linear.length ; i++)
		{
			if(linear[i] == (element_to_find))
			{
				System.out.println("Element found "+i);
			}
		}					
		/* Here we can see that we have used linear search method to find the element this method checks each and every 
		 * element present on the array
		 * 
		 * and we have used here .length property which checks the size of the array and also campares the element which
		 * we need to be printed*/
		

	}

}
