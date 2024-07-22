class human
{
	// this means this variable is only accessibile for perticular class.
	
	
//	private int age = 20;
//	private String name = "Nitesh";
	
	private int age;
	private String name;
	
	// NOW WE WILL SET THE DATA INSTEAD OF ASSIGNING IT ALREADY
	
	
	
	
	/*
	 * After the variables are private we can acces them wiht the help of mathod.
	 * 
	 * Defined in same class so we can access the data.
	 */
	
/************************************************************************************************/
	
	// getting the value with the help of get method
	public int getAge()
	{
		return age;
	}
	
	
	// Assigning the value with the help of set method
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	
/*************************************************************************************************/
	/*
	 * 1. The purpose of using encapsulation is, it helps to keep the inner working of object private
	 * and controlled.
	 * 
	 * 2. This makes the code more secure and easier to manage. 
	 * 
	 * 
	 * 
	 */
	
	
}