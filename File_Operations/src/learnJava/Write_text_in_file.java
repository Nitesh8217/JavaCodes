package learnJava;


//Package use for handling input operations
import java.io.*;



//A class demonstrate that the program is use to write the data into file
public class Write_text_in_file
{
	
	/* 1.	public : It is access modifier where the JVM will understand the execution of execution
	 *  	 if we use private , published or default modifier, it will not to JVM.
	 * 2.	static : static is used to call the main method without creating the object.
	 * 3.	void : It signifies that the main method does not have any return type.
	 * 4.	main() : It is called by the JVM to execute the code line by line and the code after execution of code is done.
	 * 5.	string[] args : It can also accept some string type fo data from user. And hold the command line argument in the 
	 * 		form of string value.
	 */

public static void main(String[] args) 
	{
		try
		{
			
			// A class used to create a file in  particular location.
			FileWriter FileWriterobject = new FileWriter("E:\\Nitesh_Pawar\\Write_info.txt");
			
			// try and catch block is used to handle the runtime exceptions.
			try
			{
				// write method is used to write the data into the file by filewriter object.
				FileWriterobject.write(" Hello java programmer welcome to world  :)  ");
			}
			
			
			// Finally block always executes
			finally
			{
				// always closes the file even if there is no data.
				FileWriterobject.close();
			}
			System.out.println("Data writen uccessfully ");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}

}
