/*This java program is based on taking the intergers from the user in the form of matrix and adding two matrix and displaying 
 * the output*/


/* *************************************************************************************************************************** */


package learnJava;
/* This Scanner class enables user to input the values */
import java.util.Scanner;


/*This class is responsible to add two matrix*/
public class Addition_of_Matrix




{
	/*This is the main method of the program*/
	public static void main(String[] args) 
	
	
	
	
	{
		int innerloop , outerloop ;
		
		/* This is declaration of a first 2*2 matrix of type integer name given as first_matrix   */
		int first_matrix[][] = new int[2][2];
	
		
		// Declaration of second 2*2  matrix of type integer name given as second_matrix.
		int second_matrix[][] = new int[2][2];
		
		
		
		/*Its a declaration of third matrix so that the sum of first and second matrix can be stored */
		int sum_of_two_matrix[][] = new int[2][2];
		
		
		
		// here we make a object to the scanner class to take the input from user.
		Scanner input = new Scanner(System.in);

		
		
		/*
		 * Here we are asking user to enter the values of first matrix.
		 * 
		 * we have used nested for-loop 
		 * 
		 * In this nested loop we have outer and inner loop.
		 * outerloop - outerloop iterates as a row.
		 * once the outer loop is satisfeid it jumps into innerloop.
		 *  
		 * innerloop - The innerloop iterates for a colunm.
		 * Once the innerloop condition is satisfied then the inner block of code i.e taking the input values for the first
		 * matrix. 
		 */
		System.out.print("Enter the values of first matrix");
		for(outerloop = 0 ;outerloop<2 ; outerloop++)
		{
			for(innerloop = 0 ; innerloop<2 ; innerloop++)
			{
				first_matrix[outerloop][innerloop] = input.nextInt();
			}
			System.out.print("\n");
		}
		
		
		
		
		
		/*Here we are asking user to enter the values of second matrix.
		 * 
		 * 
		 * outerloop - outerloop iterates as a row.
		 * once the outer loop is satisfeid it jumps into innerloop.
		 *  
		 * innerloop - The innerloop iterates for a colunm.
		 * Once the innerloop condition is satisfied then the inner block of code i.e taking the input values for the second
		 * matrix. 
		 * */	
		System.out.println("Enter the values of second matrix");
		for(outerloop= 0 ; outerloop<=2 ;outerloop++)
		{
			for(innerloop = 0 ; innerloop<=2 ;innerloop++)
			{
				
				second_matrix[outerloop][innerloop] = input.nextInt();
			}
		}
		
		
	
		
		/*
		 * Here again with the help of nested loop, 
		 * we have printed the summation of both the matrix and stored into third matrix i.e sum_of_two_matrix
		 * 
		 * 
		 */
		System.out.println("Addition of two matrix as shown");
		
			for(outerloop = 0 ; outerloop<1 ;outerloop++)
			{
				for( innerloop = 0 ;innerloop<1 ; innerloop++)
				{
				 sum_of_two_matrix[outerloop][innerloop] = first_matrix[outerloop][innerloop] + second_matrix[outerloop][innerloop];
				
				}
				 System.out.print("Sum of matrix ="+sum_of_two_matrix[outerloop][innerloop]);
			}
		
		
	}

}
