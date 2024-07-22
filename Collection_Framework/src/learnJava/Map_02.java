/*
 * This line imports the HashMap class from the java.util package,
 *  allowing us to use HashMaps in our code.
 */
package learnJava;



/*
 * This line imports the Map interface from the java.util package. It's not strictly necessary in this code,
 *  but it's commonly used when dealing with maps to indicate that we're working with a map interface
 */
import java.util.HashMap;




/*
 * This line declares a public class named MapsRfun. This class contains the main method, so it serves as the entry 
 * point for the program.
 */
import java.util.Map;


/*
 * MapsRfun is a public class declaration.
 */
public class Map_02
{
	
	
	
	/*
	 * The main method is the entry point of the program. It's where the program starts execution.
	 */
	public static void main(String[] args) 
	{
		
		
		
		
		
		/*
		 * A map called cricketers is created. It's a special type of collection that stores key-value pairs. 
		 * In this case, it maps integers to strings.
		 */
		Map<Integer , String> cricketers = new HashMap<Integer , String>();
		
		
		
		
		
		
		/*
		 * Here five entries are added to Map cricketers. Each enrty consist of jersey number and name of the player.
		 */
		cricketers.put(18, "Virat kohli");
		cricketers.put(45, "Rohit Sharma");
		cricketers.put(07, "Ms Dhoni");
		cricketers.put(93, "Jasprit Bumrah");
		cricketers.put(33, "Hardik Pandya");
 
		
		
		
		
		/*
		 * The contant from the Map cricketers is displayed.
		 */
		System.out.println(cricketers);
		
		
		
		
		
		
		System.out.println();
		// used to provide next line into the console.
		
		
		
		
		
		
		/*
		 * This is the update made in Map cricketers where we used remove() to remove the data. And then updated Map is 
		 * printed.
		 */
		cricketers.remove(93);
		System.out.println(cricketers);
		System.out.println();
		
		
		
		
		
		cricketers.replace(93, "Bhuvaneshwar_kumar");
		System.out.println(cricketers);
		System.out.println();
		
		
		
		
		
		
		
		/*
		 * A loop iterates over each entry in the cricketers map. For each entry, the key jersey number and value 
		 * player's name are printed to the console.
		 */
		for(Map.Entry m: cricketers.entrySet())
		{
			System.out.println(m.getKey()  +" " +m.getValue());
		}
	}

}
