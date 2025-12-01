package Mastery.Exercise3_Vehicle_Car_Truck_Minivan;

public class Car extends Vehicle
{
	private String brand;
	
	public Car(double fc, double fh, int sc, double cv, String b)
	{
		super(fc, fh, sc, cv);
		brand = b;
	}

	@Override
	public String getType()
	{
		return("Car");
	}
	
	public String getBrand()
	{
		return(brand);
	}
	
	public String toString()
	{
        return();
    }
	
}
