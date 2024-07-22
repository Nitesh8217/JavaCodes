class Employee
{

	/*
	 * class name is private so no other class can access it.
	 * 
	 * To get and add the data into the variable we use getter and setter.
	 */
	private String name;

	// A function to set the value into variable.
	public void setName(String name)
	{
		this.name = name;
	}

	// A function to return name.
	public String getName() 
	{
		return name;
	}

}

public class EmployeeName
{
	public static void main(String[] args)
	{
		Employee employeeclass = new Employee();
		employeeclass.setName("Nitesh_Pawar");
		System.out.println("Name entered is   " +employeeclass.getName());
	}
	
}
