package learnJava;

public class SUV_Car extends Car
{

	public SUV_Car(String name, boolean isManual)
	{
		super(name, 4, 5, 6, isManual, "SUV");
	
	}
	
	public void accelarate(int rate)
	{
		int newSpeed = getCurrentspeed()+ rate;
		
		/*
		 * ASSUMPTION
		 * 
		 * spped is 0 than gear is 1
		 * speed 0 to 10 gear is 1
		 * speed 10 to 20 gear is 2
		 * speed 20 to 30 gear is 3
		 * speed 30 to 40 gear is 4
		 * speed 40 to 50 gear is 5
		 * speed 50 to 70 gear is 6
		 * 
		 */
		
		
		// logic for accelaration
		if(newSpeed ==0)
		{
			stop();
			changeGear(1);
		}
		else if(newSpeed >0 && newSpeed <=10)
		{
			changeGear(1);
		}
		
		else if(newSpeed >10 && newSpeed <=20)
		{
			changeGear(2);
		}
		
		else if(newSpeed >20 && newSpeed <=30)
		{
			changeGear(3);
		}
		
		else if(newSpeed >30 && newSpeed <=40)
		{
			changeGear(4);
		}
		
		else if(newSpeed >40 && newSpeed <=50)
		{
			changeGear(5);
		}
		
		else
		{
			changeGear(6);
		}
		
		
		if(newSpeed>0) 
		{
			changeSpeed(newSpeed, getCurrentdirection());
		}
	}

}
