package learnJava;

public class Car extends Vehicle
{
	private String type;
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentgear;
	
	
	public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) 
	{
		super(name);
		this.type = type;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.wheels = wheels;
		currentgear = 1;
		
	}
	public void changeGear(int newGear)
	{
		this.currentgear = newGear;
		System.out.println("Current gear method called : changed to"+this.currentgear+"gear");
	}
	
	
	public void changeSpeed(int newSpeed, int newDirection)
	{
		move(newSpeed,newDirection);
		System.out.println("Current changed speed method called : speed ---> to"+newSpeed+"directions---->"+newDirection);
	}

}
