package learnJava;


// A class that demonstrate the vehicle properties 
public class Vehicle 
{
	private String name;
	private int currentSpeed;
	private int currentDirection;
	
	
	
	
	public Vehicle(String name) 
	{
		this.name = name;
		this.currentSpeed = 0;
		this.currentDirection = 0;
	}




	// A method used to control the vehicle directions
	public void steer(int direction)
	{
		this.currentSpeed += direction;
		
		System.out.println("Steer method called: steering current direction at"+currentDirection+"degree");
	}
	
	
	
	
	public void move(int speed, int direction)
	{
		//  declaring current speed 
		 currentSpeed = speed;
		 currentDirection = direction;
		 
		 System.out.println("Move method called: Moving at" + currentSpeed+" current direction = "+ currentDirection);

	}
	
	
	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public int getCurrentspeed()
	{
		return currentSpeed;
	}


	public void setCurrentspeed(int currentSpeed) 
	{
		this.currentSpeed = currentSpeed;
	}


	public int getCurrentdirection()
	{
		return currentDirection;
	}


	public void setCurrentdirection(int currentdirection)
	{
		this.currentDirection = currentdirection;
	}
	
	
	
	public void stop()
	{
		this.currentSpeed = 0;
		System.out.println("Vehicle is stopped");
	}

}
