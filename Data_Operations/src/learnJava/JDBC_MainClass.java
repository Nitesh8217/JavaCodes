/*
 * Creating a separate main class to improve programs readable,maintainability and reusability of the program  
 */


package learnJava;

import java.sql.Connection;

public class JDBC_MainClass {

	public static void main(String[] args) 
	{
		
		// Creates a instence of class JDBC_postgresql_operations class named JDBC_PO
		JDBC_postgresql_Opearations JDBC_PO = new JDBC_postgresql_Opearations();
			
		/*
		 * Calls the connect_to_db method on JDBC_PO to establish a connection to a postgreSQL database named 
		 * mydatabase with username postgres and password nitesh.
		 * 
		 * This method returns a connection object which is stored in connection object. 
		 */
		Connection connectionobjects = JDBC_PO.connect_to_db("mydatabase","postgres","nitesh");
		
		
		if(connectionobjects!=null)
		{
			try
			{
//			JDBC_PO.createTable(connectionobjects,"employee");
			
//			JDBC_PO.insert_row(connectionobjects,"employee","Nitesh","Karnataka");
//			JDBC_PO.update_name(connectionobjects,"employee","Sanjana","Mumbai");
//			JDBC_PO.insert_row(connectionobjects,"employee","Arjun","Kerela");
//			JDBC_PO.update_name(connectionobjects,"employee","Nitin","Goa");
			
//			JDBC_PO.delete_row_by_name(connectionobjects,"employee","Nitin");
			
//			System.out.println("Reading data from employee table");
//			JDBC_PO.read_data(connectionobjects,"employee");
			
//			JDBC_PO.employee_table01(connectionobjects,"employee_table01");
			
//			JDBC_PO.inserting_data_into_employeeDataTable(connectionobjects,"employee_table01,",1,"Rajesh","USA",50000);
			
			
			
			JDBC_PO.Department_Table_of_employee(connectionobjects,"EmployeeDepartment");
			
//			JDBC_PO.insert_data_into_Department_Table(connectionobjects,"EmployeeDepartment","HR",1,"Manager");
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	}

}
