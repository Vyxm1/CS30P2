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
}