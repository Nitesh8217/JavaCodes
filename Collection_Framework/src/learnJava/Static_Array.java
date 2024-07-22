/*Basic program on array */

/* Array is a homogeneous set of elements which holds any number of values of same data type*/

package learnJava;
public class Static_Array
{
	public static void main(String[] args) 
	{
		// Syntax of array
		// data_type[] array_name  =  new keyword and size of the array.
		
		int[] student_marks  =  new int[3];
		student_marks[0] = 95;  
		student_marks[1] = 85;
		student_marks[2] = 91;
		
		/* Array stores the value vertically in memory and all the elements are stored in index and array always start with 
		 * 0th index*/
		
//		System.out.println(student_marks[0]);
//		// Here we have printed the value which is stored in zero index
//		
//		System.out.println(student_marks[1]);
//		System.out.println(student_marks[2]);
//		
		for(int i = 0 ; i< 3 ; i++)
		{
			System.out.println(student_marks[i]);
		}
		// we can print the elements with the help of loop if there are many values.
	}

}
