package learnJava;


/*
 * This line imports all classes from the java.util package, which includes the 
 * Set and HashSet classes that we use in this program.
 */
import java.util.*;
public class Program_on_Set 
{
	public static void main(String[] args)
	{
		
		
		/*
		 * This line creates a set named fruitSet to store strings. We use HashSet, which is a class implementing the 
		 * Set interface.It ensures that elements are unique and provides constant-time performance for basic operations such 
		 * as add.
		 */
		Set<String> fruitSet = new HashSet<>();
		
		/*
		 * This line adds the string "Apple" to the set.
		 */
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Grapes");
		fruitSet.add("Oranges");
		/*
		 *  "Apple" is added again, it won't create a duplicate in the set because sets only contain unique elements.
		 */
		fruitSet.add("Apple");

		System.out.println("Fruites in set");

		
		/*
		 * The for loop iterates over each element in the set and prints it out.
		 */
		for(String fruit : fruitSet)
		{
			System.out.println(fruit);
		}
	}

}
