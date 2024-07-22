package learnJava;

// This package helps to perform input output operations.
import java.io.*;

import javax.swing.*;

/*
 * This class demonstrate how to write the data into csv file. */
public class Writing_data_in_csv_file {

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

		// A string type variable where we stored the student_id.
		String student_Id = "1234";

		// A string type variable where we stored the student name.
		String student_Name = "Ajay";

		// A string type variable where we stored the age of a student.
		String student_Age = "21";

//		string type variable where we stored the student location
//		String student_Location = "Belgaum";

		// This variable is used to store the path of a specific file.
		String file_Path = "E:\\csv\\student_info.txt";

		Record(student_Id, student_Name, student_Age, file_Path);
	}

//****************************** Creating a method ******************************************************

	// Method implementation goes here for the String variables
	public static void Record(String student_Id, String student_Name,String student_Age, String file_Path) 
	{
		
		
		/*
		 * Try and catch block is used to handle the unexpected event that occurs during the execution. 
		 */
		try {
			/*
			 * Creating a FileWriter object named FileWriterobject that takes the data to the file specified by file_path.
			 */
			FileWriter FileWriterobject = new FileWriter(file_Path, true);

			/*Creating a bufferedWriter object to efficiently to write the data into the
			file with the references of FileWriterobject object.*/
			BufferedWriter BufferedWriterobject = new BufferedWriter(FileWriterobject);

			//Used for writing formated text data into the output stream.
			PrintWriter PrintWriterobject = new PrintWriter(BufferedWriterobject);

//			String student_Name = null;
			PrintWriterobject.println(student_Id + "," + student_Name+"," +student_Age+ ","				 + file_Path);

			// It makes sure that all the data is return to the file.
			PrintWriterobject.flush();

			
			// Helps to close the file stream.
			PrintWriterobject.close();
			
			
			//Using java swing to display a simple dailog box by the message record saved.
			JOptionPane.showMessageDialog(null, "record saved");
			
		}
		
		
		// catch block is used to through the xception in case if the record does not save.
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "record not saved");
		}

	}

}
