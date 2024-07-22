package learnJava;


// Package use for handling input operations
import java.io.*;


//This package imports all the classes present in it.
import java.util.*;



/* The class determines that the program is about taking the multiple input from the user 
   and storing it into csv files*/
public class Taking_input_from_user
{
	
	
	
	/*
	 * /*
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
		
		
		// Used to read the input from the user.
		Scanner scannerobject = new Scanner(System.in);
		
		
		
		
		// A variable named file_path which stores the path of the file.
		String file_path = "E:\\csv\\user_data_input.txt";

		
		
		
		/*
		 * try and catch block is used for exception handle. Which handles the exceptions
		 * that occure during the run time. 
		 */
		try {
			
			
			
			// The object for FileWriter is used to write the data into a file.
			FileWriter FileWriterobject = new FileWriter(file_path, true);
			
			
			
			
			// PrintWriter class used to print the formatted representation of text output form.
			PrintWriter PrintWriterobject = new PrintWriter(FileWriterobject);

			
			
			
			// here boolean value is initailized true.
			boolean continue_adding = true;
			
			
			
			
			// starting of while loop where it will execute till condition satisfies.
			while (continue_adding)
			{
				
				
				
				
				// A print starement where user undertands to enter the values.
				System.out.println("Enter the data as shown : Name, Age, Location");
				
				
				
				
				
				// This line read the data entered by the user and stores into user_data varaible.
				String user_Data = scannerobject.nextLine();
				
				
				
				
				//Displays the outout from the varaible user_data.
				PrintWriterobject.println(user_Data);

				
				
				
				// The message prints if the user wants to enter the more data into the file.
				System.out.println("Do you want to add more data? (yes/no)");
				
				
				
				
				// The line reads the input from user weather to add more data or no.
				String response = scannerobject.nextLine().toLowerCase();
				
				
				
				
				// if condition that checks weather the input from user is yes/ or if the condition fails the loop ends.
				if (!response.equals("yes"))
				{
					continue_adding = false;
				}
			}
			
			
			
			
			// The line closes the PrintWriterobject.
			PrintWriterobject.close();
			
			
			
			// if the entered data is stored properly this message appears.
			System.out.println("Data is stored");
		} 
		
		
		
		// Catch block catches the exceptions that occures during the run time.
		catch (IOException e) 
		{
			System.out.println("Data did not save: " + e.getMessage());
		}
	}

}
