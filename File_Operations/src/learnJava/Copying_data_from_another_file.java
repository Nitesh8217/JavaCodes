package learnJava;

// Package used for input output operations.
import java.io.*;


// This demonstarate the program is used to copy the data from one file to another.
public class Copying_data_from_another_file
{

	/* 1.	public : It is access modifier where the JVM will understand the execution of execution
	 *  	 if we use private , published or default modifier, it will not to JVM.
	 * 2.	static : static is used to call the main method without creating the object.
	 * 3.	void : It signifies that the main method does not have any return type.
	 * 4.	main() : It is called by the JVM to execute the code line by line and the code after execution of code is done.
	 * 5.	string[] args : It can also accept some string type fo data from user. And hold the command line argument in the 
	 * 		form of string value.
	 */
	public static void main(String[] args)throws IOException
	{
		try
		{
		// A class with FileObject object use to read the path of a file.
		FileInputStream FileInputStreamObject = new FileInputStream("C:\\Users\\DELL\\Desktop\\Indian general election.txt");
		
		
		
		// Class helps to create a new file as well helps to perform write operation.
		FileOutputStream FileOutputStreamObject = new FileOutputStream("C:\\Users\\DELL\\Desktop\\copied_file.txt");
		
		
		int itaration;
		
		// if read method return the value -1 it means the data has been read.
		while((itaration = FileInputStreamObject.read())!=-1 )
		{
			FileOutputStreamObject.write((char)itaration);
		}
		
			// Print statement prints when the data is copied successfully.
			System.out.println("Data copied successfully");
		}
		
		catch(FileNotFoundException e)
		{
			// Exception that appears when the file is missing or not found.
			System.out.println("File Not found"+e.getMessage());
			
		}
		catch(IOException e)
		{
			// Exception that checks the line where exception is occured.
			System.out.println("Error while copying"+ e.getStackTrace());
		}
	}

}
