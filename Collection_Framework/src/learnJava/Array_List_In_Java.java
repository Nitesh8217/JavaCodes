// Java program to add elements using Array list.

package learnJava;
import java.util.ArrayList;
public class Array_List_In_Java
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> element_list = new ArrayList<>();
		
		/*to declare a array list first we need to write Arraylist than we 
		 * need what type of value we are going to store than the name of the
		 * list than new keyword and end it with curly bracis this the format of 
		 * making the array list*/
		
		
//	ADDING OF ELEMENTS
		
		element_list.add(0);
		element_list.add(1);
		element_list.add(2);
		element_list.add(3);
		element_list.add(4);
		
		/*Here we have named a arraylist by ELEMENT_LIST which stores the integer element  in array list those 
		 * are 0 1 2 3 4 */
		
		System.out.println(element_list);
		/*After entering the array list we have printed it*/
		
		
		
		
//		TO GET ELEMENTS
		
		 int stored_element = element_list.get(0);
		 System.out.println(stored_element);
		 
		 /*Arraylist cantains some build function one of them is .get() this method helps to get the element present on
		  * zeroth position*/
		 
		 
		 
//		 ADDING ANOTHER ELEMENT INTO EXIXTING ARRAYLIST
		 
		 element_list.add(1,10);
		 System.out.println(element_list);
		 
		 /*.add() method is used to add any element into the arraylist here 1 means the position of the array list 
		  * and 10 is the element where where we have added.*/
		 
		 
		 
//		 SET ELEMENT
		 
		 element_list.set(0,5);
		 System.out.println(element_list);
		 
		 /* .set() method is used to chnage the element in this the case we have used set method where element 0 is changed
		  * to 5*/
		 
		 
		 
		 
//		 DELETING ELEMENTS
		 
		 element_list.remove(3);
		 System.out.println(element_list);
		 /*.remove() is used to remove or delete any element from the array list */
		 
//			UDERSTANDING THE SIZE OF THE ARRAY
		 
		 int size_of_elements = element_list.size();
		 System.out.println(size_of_elements);
		 
//		
		 
		 
	}

}
