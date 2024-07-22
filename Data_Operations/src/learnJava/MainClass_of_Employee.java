package learnJava;

import java.sql.Connection;

public class MainClass_of_Employee 
{

	public static void main(String[] args) 
	{
		try
		{
			
					// creating main class object
					EmployeeDetails mainclassobject = new EmployeeDetails();
					
					// connecting java program to Database connectivity
					Connection connection = mainclassobject.connectDatabase("mydatabase","postgres","nitesh");
					
					
					
				
						// calling the function named employeTable to create the table
					
//						mainclassobject.employeeTable(connection,"employee");
						
//						mainclassobject.insert_data_into_employeeDataTable(connection,"employee",101,"Sagar","Belgaum",20000);
//						mainclassobject.insert_data_into_employeeDataTable(connection,"employee",102,"Sachin","Ramnagar",15000);
//						mainclassobject.insert_data_into_employeeDataTable(connection,"employee",103,"Amar","Banglore",18000);
//						mainclassobject.insert_data_into_employeeDataTable(connection,"employee",104,"Tarun","Maharastra",25000);
//						mainclassobject.insert_data_into_employeeDataTable(connection,"employee",105,"Ajay","Goa",30000);

					
					
//						mainclassobject.employeeDepartmentTable(connection,"DepartmentTable");

//						mainclassobject.insert_data_into_employeeDepartmentTable(connection,"DepartmentTable","HR",101,"Manager");
//						mainclassobject.insert_data_into_employeeDepartmentTable(connection,"DepartmentTable","Financial",102,"Accountant");
//						mainclassobject.insert_data_into_employeeDepartmentTable(connection,"DepartmentTable","Marketing",103,"Marketing manager");
//						mainclassobject.insert_data_into_employeeDepartmentTable(connection,"DepartmentTable","IT",104,"Manager");
//						mainclassobject.insert_data_into_employeeDepartmentTable(connection,"DepartmentTable","Opeartions",105,"Operation Manager");
						
//						mainclassobject.performing_simpleJoin_Operation_on_the_two_Tables(connection,"employee","DepartmentTable");
					
						
//						mainclassobject.truncate_Table(connection,"DepartmentTable");
					
						mainclassobject.drop_Table(connection,"DepartmentTable");
					
		}
		catch(Exception e)
		{
			e.getStackTrace();
			e.getCause();
			e.getMessage();
		}
	}
}
