/*
Program: Vehicle.java          Last Date of this Revision: Dec. 1, 2025

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
		a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
		Minivan classes should include additional members specific to the type of vehicle being represented.
		Create client code to test the classes.

Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

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