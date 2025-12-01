package Mastery.Exercise3_Vehicle_Car_Truck_Minivan;

public abstract class Vehicle
{
	private double fuelEconomyCity;
	private double fuelEconomyHwy;
	private int seatingCapacity;
	private double cargoVolume;
	
	public Vehicle(double fc, double fh, int sc, double cv)
	{
		fuelEconomyCity = fc;
		fuelEconomyHwy = fh;
		seatingCapacity = sc;
		cargoVolume = cv;
	}
	
	public double getFuelEconomyCity()
	{
		return(fuelEconomyCity);
	}
	
	public double getFuelEconomyHwy()
	{
		return(fuelEconomyHwy);
	}
	
	public int getSeatingCapacity()
	{
		return(seatingCapacity);
	}
	
	public double getCargoVolume()
	{
		return(cargoVolume);
	}
	
	public abstract String getType();
}