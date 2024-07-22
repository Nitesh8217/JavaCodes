// Worlbook--->Sheet---->Rows--->cell

package learnJava;

//Package use for handling input operations
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


// Class demonstrate that the program is used to write the data into excel file. 
public class Write_Data_In_Excel 
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
		
		// Creating a blank workbook by using XSSFworkbook class.
		XSSFWorkbook workbookobject = new  XSSFWorkbook();
		
		// Creating a sheet on workbook with the reference of workbookobject.
		XSSFSheet sheet = workbookobject.createSheet("Employee information");
		
		/*
		 * Used array to store the data in rows and colunms.
		 * 
		 * object : which hold all kind of data and array becomes hitrogenious.
		 */
		
		Object employee_data[][] = {		{"EMP_ID","EMP_NAME","EMP_JOB"},
											{101,"Trivi","Engineer"},
											{102,"Smith","Catering"},
											{103,"David","Manager"},
											{104,"David","Data_analyst"}
									};
		
		//USing for loop to read rows and colunm
		
		// Used to find the number of rows and get store into  rows_of_excel.
		int rows_of_excel =  employee_data.length;
		
		
		// Used to find the number of rows and get store into  rows_of_excel.
		int colunms_of_excel =  employee_data[0].length;
		
		// print statement to print the number of rows and colunms
		System.out.println( rows_of_excel);
		System.out.println(colunms_of_excel);
		
		
		// nested for loop where outer loop is for rows and inner loop for colunms
		
		
		
		// outer for loop is used for rows.
		for(int rows = 0; rows<rows_of_excel; rows++)
		{
			//Creating a row in sheet by method createRow
			XSSFRow row = sheet.createRow(rows);
			
			
			//inner for loop is used for columns
			for(int colunms = 0; colunms<colunms_of_excel; colunms++)
			{
				
				//creating a new cell by cell object by reference of rows object.
				XSSFCell colunm = row.createCell(colunms);
				
				//redaing and inserting the data in rows and columns.
				Object employe_data = employee_data[rows][colunms];
				
				
				// statement that checks which type of data it consists.
				if(employe_data instanceof String)
				{
					colunm.setCellValue((String)employe_data );
				}
				
				if(employe_data instanceof Integer)
				{
					colunm.setCellValue((Integer)employe_data );
				}
				
				if(employe_data instanceof Boolean)
				{
					colunm.setCellValue((Boolean)employe_data );
				}
				
				
			}
		}
		// creating a file to in the loaction where we can store the data i:e employee.xlsx
		String filePath =".\\data_files\\employee.xlsx";
		
		//opening stream to write the data into excel sheet.
		FileOutputStream  FileOutputStreamobject = new FileOutputStream(filePath);
		workbookobject.write(FileOutputStreamobject);
		
		 FileOutputStreamobject.close();
	
		System.out.print("Employee.xls file written successfully...");
		}
		catch(Exception e)
		{
			e.getMessage();
			System.out.println("Catch block executed");
		}
	}

}
