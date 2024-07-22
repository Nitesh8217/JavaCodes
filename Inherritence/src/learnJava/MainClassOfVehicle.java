package learnJava;

public class MainClassOfVehicle 
{

	public static void main(String[] args)
	{
		SUV_Car suvobject = new SUV_Car("Fortuner", false);
		suvobject.move(40, 0);
		suvobject.accelarate(20);
		suvobject.accelarate(-60);
		
		

	}

}
