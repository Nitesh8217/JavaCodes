package learnJava;


//Package use for handling input operations
import java.io.*;


// class demonstrate that the program is used to read the data from csv file.
public class Reading_CSV_file 
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
		
		
		
		// file path is a varaible stores the location of file
		String file_path = "E:\\Nitesh_Pawar\\csv_file.csv";
		String line = "";
		
		
		
		//try and catch block is used to handle the runtime exceptions.
		try
		{
		
			//BufferedReader is a class used for reading text from a character-input stream
			BufferedReader BufferedReaderobject = new BufferedReader(new FileReader(file_path));
			
			/*
			 * This expression reads a line from the BuffredReader object and assign to the variable line.The continues as 
			 * long as the read is not null.
			 */
			while((line =  BufferedReaderobject.readLine()) !=null)
			{
				String[] values;
				System.out.println(line);
				// This line splits the string stored in the variable line into and an array of substring.
				 values = line.split("");
				System.out.println("Tittle :"+values[0] +"Author:"+ "Genre :"+"published_year"+"Price");
				System.out.println(values[1]);
			}
	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
