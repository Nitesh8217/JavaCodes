package learnJava; 

//Package use for handling input operations
import java.io.FileInputStream;
import java.util.*;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;


// class demonstrate that the data is being read from the excel sheet.
public class ReadWrite_Itaration
{
	
	

	/* 1.	public : It is access modifier where the JVM will understand the execution of execution
	 *  	 if we use private , published or default modifier, it will not to JVM.
	 * 2.	static : static is used to call the main method without creating the object.
	 * 3.	void : It signifies that the main method does not have any return type.
	 * 4.	main() : It is called by the JVM to execute the code line by line and the code after execution of code is done.
	 * 5.	string[] args : It can also accept some string type fo data from user. And hold the command line argument in the 
	 * 		form of string value.
	 */
	public static void main(String[] args) throws IOException
	{
		
		// Varaible to store the excel file path
		String excelFilePath = ".\\\\data_files\\\\Personal_Data.xlsx";
		
		
		
		// Used to create the object and also help to read the data from excel sheet
		FileInputStream FileInputStreamobject = new FileInputStream(excelFilePath);
		
		
		
		//Used to represent the workbook from the excel sheet by reading the file from FileInputStreamobject.
		XSSFWorkbook workbookObject = new XSSFWorkbook(FileInputStreamobject);
		
		
		
		// XSSFSheet help to manupulate the data from the excel sheet like reading, writing, formatting etc.
		XSSFSheet excelsheet = workbookObject.getSheetAt(0);
		
		
		
		
//**********************************Itarator to read rows and colunms*********************************************
		
		
		
		
		/*
		 * iteration method which returns all the rows and can be iterated.
		 * 
		 *  Iterator contains all the rows.
		 */
		Iterator iterator = excelsheet.iterator();
		
		
		
		/*
		 *  loop checks weather the iteration has next object or record condition is then loop satisfied.
		 *  
		 *  Gets the row and the row with multiple cell get store in Iterator.
		 *  
		 */
		while(iterator.hasNext())
		{
			XSSFRow row_varaible = (XSSFRow) iterator.next();
			
			Iterator cellIterator = row_varaible.cellIterator();
			
			
			
			/*
			 * Checks weather the cell is present and get store into varaible.
			 */
			while(cellIterator.hasNext())
			{
				 XSSFCell cell_varaible = (XSSFCell) cellIterator.next();
				 
				 
				 
				 // .getCellType help to check what type of data is present. 
				 switch(cell_varaible.getCellType())
					{
					
					
					case STRING: System.out.print(cell_varaible.getStringCellValue());
									break;
					case NUMERIC: System.out.print(cell_varaible.getNumericCellValue() );
									break;
					case BOOLEAN:System.out.print(cell_varaible.getBooleanCellValue() );
									break;
					
					}
					
					System.out.print("    ");
			}
			System.out.println();
		}
				
	}

}
