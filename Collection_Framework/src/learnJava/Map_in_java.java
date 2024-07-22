package learnJava;


/*
 * This line imports the HashMap class from the java.util package, allowing us to use it in our code.
 */
import java.util.HashMap;



/*
 *This declares a class named Map_o1 . The main logic of the program will be inside this class. 
 */
public class Map_in_java
{
	
	
	/*
	 * This is the main method, where the execution of the program begins. Inside this method, we'll create a 
	 * HashMap and perform some operations on it.
	 */
	public static void main(String[] args) 
	{
		
		
		
		/*
		 * Here, a new HashMap object is created. It's a map that associates keys of type String with values of type Integer. 
		 */
		HashMap<String, Integer> retrieve_values = new HashMap<String, Integer>();
		
		
		
		/*
		 * These lines add key-value pairs to the HashMap. Each key-value pair is added using the put method. 
		 * For example, "ONE" is associated with the value 1, "TWO" with 2, and so on.
		 */
		retrieve_values.put("ONE", 1);
		retrieve_values.put("TWO",2);
		retrieve_values.put("THREE",3);
		retrieve_values.put("Four",4);
		retrieve_values.put("Five",5);

		
		
		
		/*
		 * This line retrieves the value associated with the key "THREE" from the HashMap.
		 *  It uses the get method, which returns the value associated with the specified key.
		 */
		int retrive_the_key_value = retrieve_values.get("THREE");
		
		
		
		
		/*
		 * Finally, this line prints the retrieved value to the console. In this case, it will print 2, as 
		 * "THREE" is associated with the value 3 in the HashMap.
		 */
		System.out.println(retrieve_values);
		
	}

}
