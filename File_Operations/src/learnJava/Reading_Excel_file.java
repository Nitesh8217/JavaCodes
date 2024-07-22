package learnJava;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;



public class Reading_Excel_file {

	public static void main(String[] args) {
		 
		/*
		 * Here we have created one varaible to store the excel file path.
		 */
		String excelFilePath="E:\\Nitesh_Pawar\\Personal_Data.xlsx";

		
		try
		{
			/*
			 * When we want to open the file into reading mode we use a class called FileInputStream class 
			 * After creating the file path we connect it into file stream to read the data.
			 * 
			 * FileInputStream is a class used to read the file
			 */
					FileInputStream fileinputstreamobject = new FileInputStream(excelFilePath);
			
			
			
			/*
			 * To get the workbook from the file we have class Called XSSFWorkbook and create a object where we have 
			 * constructor we add the file path.
			 * 
			 * Similarly we have class SXXFWorkbook which is used to get the access of the excel workbook.
			 */
			XSSFWorkbook workbook= new XSSFWorkbook(fileinputstreamobject);
			
	
			/*
			 * Now from the workbook we get the sheet where we use the method "get.sheet".
			 * 
			 * we extracted the sheet from the workbook by refering the object
			 */
			XSSFSheet sheet = workbook.getSheet("Sheet1"); 
			
	//********************************************************************************************************************************		
			
			// we read the data Using for loop.
			
			
			
				/*
				 * this will show the total number of rows by using the method .getLastRowNum() 
				 */
				int row_variable = sheet.getLastRowNum();
				
				
				/*
				 * This method will get the row from the sheet and will get the number of cell present in the row
				 */
			
				int column_variable = sheet.getRow(1).getLastCellNum();
			
	//********************************************************************************************************************************
				
				
			/*
			 * we are using here nested for loop where one for rows and other for colunm
			 */
			for(int row_number=0;  row_number<=row_variable;  row_number++)
			{	
				
				/*
				 * before reading the colunm we have to read the first row from the sheet and from this row we read all the cells
				 * 
				 * the veraible row read the first row of the file and than read the colunms
				 * 
				 * And the class XSSF is used to read the row
				 */
				XSSFRow row =sheet.getRow( row_number);
				
				
			
				for(int column_number =0;  column_number<column_variable; column_number++)
				{
					/*
					 * From the above row we extract all the cell my using the method getCell.and stored it into varaible
					 * XSSFCell.
					 */
					XSSFCell cell = row.getCell(column_number);
					
					
					
					
				//********************************************************************************************************************************
					/*
					 * Than we use here switch statement bcoz the data can be in any formate like string , numbers or both.
					 * 
					 * So we have a method called getCellType which read the data and understand what type of data does the cell has.
					 */
					switch(cell.getCellType())
					{
					
					
					case STRING: System.out.print(cell.getStringCellValue());
									break;
					case NUMERIC: System.out.print(cell.getNumericCellValue() );
									break;
					case BOOLEAN:System.out.print(cell.getBooleanCellValue() );
									break;
					
					}
					
					System.out.print("    ");
					
				}
				
				System.out.println();
			}
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("ReadExcel Catch block");
			e.printStackTrace();
			
		}
		
		
		
	}	
	

}
