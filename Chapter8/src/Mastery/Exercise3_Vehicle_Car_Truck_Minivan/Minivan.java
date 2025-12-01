package Mastery.Exercise3_Vehicle_Car_Truck_Minivan;

public class Minivan extends Vehicle
{

	public Minivan(double fc, double fh, int sc, double cv)
	{
		super(fc, fh, sc, cv);
		
	}

	@Override
	public String getType()
	{
		return("Minivan");
	}
	
}
