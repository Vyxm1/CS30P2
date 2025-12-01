package Mastery.Exercise3_Vehicle_Car_Truck_Minivan;

public class Truck extends Vehicle
{

	public Truck(double fc, double fh, int sc, double cv)
	{
		super(fc, fh, sc, cv);
	}

	@Override
	public String getType()
	{
		return("Truck");
	}
	
}
