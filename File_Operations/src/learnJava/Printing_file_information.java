package learnJava;
//Package which handles input output operations.
import java.io.File;


// class that demonstrate the program that reads the data from the file.
public class Printing_file_information
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
		
		
		//File is class which help to create new file by initializing the path to the directory.
		File Fileobject = new File("E:\\Nitesh_Pawar\\csv\\file_info");
		
		// The condition checks weather the file exits or no
		if(Fileobject.exists())
		{
			
			// Method that displays the name of the file.
			System.out.println("File name\t "+Fileobject.getName());
			
			
			
			// Method that display the actual path of the file
			System.out.println("File Location\t"+Fileobject.getAbsolutePath());
			
			
			
			// Method that checks weather we can insert the data into file.
			System.out.println("File name\t"+Fileobject.canWrite());
			
			
			
			// Method that checks weather we can read the data from file.
			System.out.println("File name\t"+Fileobject.canRead());
			
			
			
			// Method that checks the size of the file.
			System.out.println("File name\t"+Fileobject.length());
		}
		else
		{
			System.out.println("File do not exits");
		}
	
	}

}
