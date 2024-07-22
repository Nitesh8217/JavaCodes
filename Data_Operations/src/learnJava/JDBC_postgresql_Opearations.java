package learnJava;

/*
 * Packages form fundamental java applications that interact with java database operations 
 * such as connecting the database creating table, inersting, upadating, deleting the data.
 */

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

// A class demonstrating the connection of to database and performing other opeations
public class JDBC_postgresql_Opearations {

	/*
	 * It declares the methode named connect_to_db and returns connection object.
	 * 
	 * It has three object dbname , user and password.
	 */
	public Connection connect_to_db(String dbname, String user, String password) {

		// This variable will hold the database connectio object once a connection is
		// extablished.
		Connection connectionobject = null;

		try {

			// leads to postgresql JDBC driver class org.postgresql.Driver
			Class.forName("org.postgresql.Driver");

			// Extablishing a connection to the postgresql database specified by dbname ,
			// user , password.
			connectionobject = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user,
					password);

			// Check the connection object is not null, indicating that the connection was
			// succesfully established
			if (connectionobject != null) {
				System.out.print("Connection extablished \n");
			} else {
				System.out.print("Connection failed\n ");
			}

		} catch (Exception e) {
			System.out.print(e);
		}

		/*
		 * returns the connection object.
		 * 
		 * This methode returns null if the connection could not be extablished.
		 */
		return connectionobject;
	}

	// ********************************************* Creating a table
	// ***************************************************************

	// used to connect the database by Connection object and specifies the name of
	// the table you want to make.
	public void createTable(Connection connectionobject, String table_name) {
		Statement statementobject;

		try {

			/*
			 * A Query to create a simple employee table.
			 * 
			 * SERIAL : Auto increment which starts from one.
			 */
			String query = "create table " + table_name
					+ "(empid SERIAL,name varchar(200), address varchar(200), primary key(empid));";

			statementobject = connectionobject.createStatement();

			// Executing the query
			statementobject.executeUpdate(query);

			// Print the message saying table created.
			System.out.print("Table Created\n");
		} catch (Exception e) {
			System.out.print(e);
		}
	}

	// ***************************************************** Inserting data into
	// table ***********************************************************************

	// A function to create a row
	public void insert_row(Connection connectionobject, String table_name, String name, String address) {

		/*
		 * Statement seamless interacts between application and database.
		 * 
		 * enabling data retrival, manipulation and trasaction management in a efficient
		 * manner.
		 */

		Statement statementobject;

		// try and catch block is used to handle the runtime errors
		try {

			// Query to insert the record i.e name and address
			String query = String.format("insert into %s(name,address) values('%s','%s');", table_name, name, address);

			statementobject = connectionobject.createStatement();

			// Executing the query.
			statementobject.executeUpdate(query);

			System.out.println("Row Inserted");

		} catch (Exception e) {
			System.out.println(e);
			e.getStackTrace();
		}
	}

	// *************************************************** Reading the data from the
	// table ***************************************

	// Method to read the data from database.
	public void read_data(Connection connectionobjects, String table_name) {

		/*
		 * Statement seamless interacts between application and database.
		 * 
		 * enabling data retrival, manipulation and trasaction management in a efficient
		 * manner.
		 */
		Statement statementobjects;
		ResultSet resultsetobject = null;

		// try and catch block is used to handle the runtime errors
		try {
			/*
			 * Fetching the data from the table.
			 */
			String query = String.format("select * from %s", table_name);

			/*
			 * Statement seamless interacts between application and database.
			 * 
			 * enabling data retrival, manipulation and trasaction management in a efficient
			 * manner.
			 */
			statementobjects = connectionobjects.createStatement();

			// We used execute query bcoz it returns the result set.
//			statementobjects.executeQuery(query);

			// The output of the query stores into resultset.
			resultsetobject = statementobjects.executeQuery(query);

			// Loop will print the data for every row it will print empid , name , address
			while (resultsetobject.next()) {
				System.out.print(resultsetobject.getString("empid") + "");
				System.out.print(resultsetobject.getString("name") + "");
				System.out.println(resultsetobject.getString("address"));

			}

		} catch (Exception e) {
			System.out.println(e);
			e.getStackTrace();

		}
	}

//************************************************ Updating the data into table ******************************************************

	// method to update the name from database.
	public void update_name(Connection connectionobjects, String table_name, String old_name, String new_name) {

		/*
		 * Statement seamless interacts between application and database.
		 * 
		 * enabling data retrival, manipulation and transaction management in a
		 * efficient manner.
		 */
		Statement statementobjects;

		// try and catch block is used to handle the runtime errors
		try {

			// Query which help to update the previous data into new data.
			String query = String.format("Update %s set name = '%s' where name = '%s'", table_name, new_name, old_name);

			// Creating statement object from the provided connections.
			statementobjects = connectionobjects.createStatement();

			// Executing the updated query
			statementobjects.executeUpdate(query);

			System.out.println("Data Updated");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

//******************************************** Deleting the data ********************************************************* 
	// method to delete the row from the database table based on the name and
	// column.

	public void delete_row_by_name(Connection connectionobjects, String table_name, String name) {
		Statement statementobjects;
		try {
			// Constructing the sql query to delete the row where the name matches to the
			// exiting name.
			String query = String.format("delete from %s where name = '%s'", table_name, name);

			/*
			 * Statement seamless interacts between application and database.
			 * 
			 * enabling data retrival, manipulation and trasaction management in a efficient
			 * manner.
			 */
			statementobjects = connectionobjects.createStatement();

			// Executing the delete query against the database.
			statementobjects.executeUpdate(query);

			System.out.println("Data deleted");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// ***************************** Creating first table
	// ***********************************************

	public void employee_table01(Connection connectionobjects, String table_name) {

		// Statement interface is used to execute SQL statement against a database.
		Statement statementobjects;

		// Have used Exception handling block in order to handle some SQL based
		// exceptions
		try {

			// Creating SQL query to insert data into specified table.
			String query = "create table" + table_name+ "(employeeID int, name varchar(20), city varchar(30),salary DECIMAL(7,2),primary key(employeeID));";

			// Creating statement object using connection.
			statementobjects = connectionobjects.createStatement();

			// executing the query with the help of .executeQuery() method
			statementobjects.executeUpdate(query);

			System.out.println("Table is created");
		} catch (Exception e) {
			System.out.println("Catch block executed, the employeeTable() has some problem");
			e.printStackTrace();
		}
	}

	// *************************************** Inserting data in table employeeTable
	// *********************************************

	// this is a function employee data into a specific database table.
	public void inserting_data_into_employeeDataTable(Connection connectionobjects, String table_name, int ID,
			String employee_name, String city_name, int input_salary) {

		// Statement interface is used to execute SQL statement against a database.
		Statement statementobjects;

		// Exception handling block in order to handle some SQL based exceptions
		try {

			// Constructing the sql query by using formatted string
			String query = String.format("insert into %s(employeeID,name,city,salary) values('%d','%s','%s','%d');",
					table_name, ID, employee_name, city_name, input_salary);

			// Creating the statement objects to execute the query.
			statementobjects = connectionobjects.createStatement();

			// executing the query with the help of .executeQuery() method
			statementobjects.executeUpdate(query);

			System.out.println("Row inserted");

		} catch (Exception e) {

			System.out.println("Catch block executed, the insert_data_into_employeeDataTable() has some problem");
			System.out.println(e);
			e.printStackTrace();
		}
	}

	// ******************************* Creating another table
	// *****************************************

	// Function demonstrating creations of another table
	public void Department_Table_of_employee(Connection connectionobjects, String table_name) {

		// Statement interface is used to execute SQL statement a database.
		Statement statementobjects;

		// Have used Exception handling block in order to handle some SQL based
		// exceptions
		try {

			// Input query to create a table and store it in a String type
			String query = "create table " + table_name+ "(department_name varchar(20),employeeID int,role varchar(20),foreign key(employeeID)references EmployeeData(employeeID));";

			// now we intialize the statement object and create a statement with the
			// createStatement()
			statementobjects = connectionobjects.createStatement();

			// executing the query with the help of .executeQuery()
			statementobjects.executeUpdate(query);

			System.out.println("Table is created");
		} catch (Exception e) {
			System.out.println("Catch block executed, employeeDepartmentTable() has some problem");
			e.printStackTrace();
		}
	}

//*********************************** Inserting the data into department table ************************************************

	// A function to insert the data into department table.
	public void insert_data_into_Department_Table(Connection connectionobjects, String table_name,
			String input_department, int input_id, String input_role) {

		// Statement interface is used to execute SQL statements against a database.
		Statement statementobjects;

		// try and catch block is used to handle run time exceptions
		try {

			// Creating SQL query to insert the data into department table.
			String query = String.format("insert into %s(department_name,employeeID,role) values('%s','%d','%s');",
					table_name, input_department, input_id, input_role);

			// now we intialize the statement object and create a statement with the
			// help of createStatement()
			statementobjects = connectionobjects.createStatement();

			// now we have executed the query with the help of .executeQuery()
			statementobjects.executeUpdate(query);
			System.out.println("Row inserted");

		} catch (Exception e) {

			System.out.println("insert_data_into_employeeDepartmentTable() has some problem");
			System.out.println(e);
			e.printStackTrace();
		}
	}

// ******************************************  Simple join operation ****************************************************

	public void simpleJoin_Operation_on_two_Tables(Connection connectionobjects, String table_name1,
			String table_name2) {

		// Here we are creating statement object in order to take statements
		Statement statementobjects;

		ResultSet resultObject = null;

		// try catch block is used to handle runtime errors
		try {

			// Creating SQL query to insert the data into department table.
			String query = String.format(
					"select e.employeeID,e.name,d.department_name from %s e JOIN %s d ON e.employeeID=d.employeeID",
					table_name1, table_name2);

			// Creating the statement objects to execute the query.
			statementobjects = connectionobjects.createStatement();

			// now we have executed the query with the help of .executeQuery()
			resultObject = statementobjects.executeQuery(query);

			while (resultObject.next()) {

				System.out.print(resultObject.getInt("employeeID") + "  ");
				System.out.print(resultObject.getString("name") + "  ");
				System.out.println(resultObject.getString("department_name") + "  ");

			}

			System.out.println("Join operation");

		} catch (Exception e) {

			System.out.println("performing_simpleJoin_Operation_on_the_two_Tables() has some problem");
			System.out.println(e);
			e.printStackTrace();
		}
	}

	// function responsible for truncateing the table.
	public void truncate_Table(Connection connectionobjects, String table_name) {

		// Here we are creating statement object inorder to take statements
		Statement statementobjects;

		// Exception handling block in order to handle some SQL based exceptions
		try {

			// Now we will give input query to insert some data into rows and store it in a
			// String type variable named
			// 'query'
			String query = String.format("TRUNCATE table %s", table_name);

			// now we intialize the statement object and create a statement with the help of
			// createStatement()
			statementobjects = connectionobjects.createStatement();

			// now we have executed the query with the help of .executeQuery()
			statementobjects.executeQuery(query);

			System.out.println("Table has been truncated");

		} catch (Exception e) {

			System.out.println("The table has not been truncated,  truncate_Table() has some problem");
			System.out.println(e);
			e.printStackTrace();
		}
	}

	// Function to drop the table.

	public void drop_Table(Connection connectionobjects, String table_name) {

		// Here we are creating statement object inorder to take statements
		Statement statementobjects;

		// Exception handling block inorder to handle some SQL based exceptions
		try {

			// Now we will give input query to insert some data into rows and store it in a
			// String type variable named
			// 'query'
			String query = String.format("DROP table %s", table_name);

			// now we intialize the statement object and create a statement with the help of
			// createStatement()
			statementobjects = connectionobjects.createStatement();

			// now we have executed the query with the help of .executeQuery()
			statementobjects.executeQuery(query);

			System.out.println("Table has been droped");

		} catch (Exception e) {

			System.out.println("The table has not been droped,  drop_Table() has some problem");
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
