package learnJava;


// This package performs all input output operations
import java.io.*;


//Packages that provides java utility and interface packages
import java.util.*;

import java.lang.*;



// This class demonstarte the program is used to read the data into 2d string list.
public class Reading_csv_file_in_2d_string_list 
{



	/*
	 * 1. The main method in java is the entry point of any java program it is where
	 *    execution of program begins. 
	 * 2. The keyword public indicates that the method
	 *    can be accessed from outside the class.
	 * 3. The keyword static means that the
	 *    method belongs to the class itself, rather than to any instance of class 
	 * 4. Void indicates that the main method do not have any return type. 
	 * 5. string[]args is a array type where we can pass string from command line.
	 */
	public static void main(String[] args) 
	{
		
		// path of the file is stored into "path_of_a_file" variable.
		String path_of_a_file = "E:\\csv\\read_csv_2d_list.txt";
		
		String line;
		
		String delimiter = ",";
		
		
		/*
		 * Declaration of 2d list where each list holds string. 
		 * It reprsents in tabular form in rows and columns.
		 */
		List<List<String>> student_data = new ArrayList<>();
		
		
		/*
		 * BufferedReader reads the data from the file from a specified path.
		 * 
		 * This line of code also ensures that the BufferedReader is properly closed.
		 * 
		 * 
		 * try and catch block is used to handle the runtime errors.
		 */
		try(BufferedReader BufferedReaderobject = new BufferedReader(new FileReader(path_of_a_file)))
		{
			
			// This line reads a line from the file using the readLine() method of the BufferedReader object.
			while((line = BufferedReaderobject.readLine()) !=null )
			{
				
				//this line reads the file into an array and splits the line using delimiter
				String[] values = line.split(delimiter);
				
				//this line converts the string array values into list and add into the list named student_data.
				student_data.add(Arrays.asList(values));
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		// For loop which itarates each list<string> elements into row in the student_data.
		for(List<String> row : student_data)
		{
			
			// this line prints each row into student_data.
			System.out.println(row);
		}

	}

}
