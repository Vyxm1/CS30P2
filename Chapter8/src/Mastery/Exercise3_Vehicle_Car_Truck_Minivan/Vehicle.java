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

	/**
	 * Construct a Vehicle with fuel economy, seating capacity, and cargo volume.
	 * @param fc city fuel economy
	 * @param fh highway fuel economy
	 * @param sc seating capacity
	 * @param cv cargo volume
	 */
	public Vehicle(double fc, double fh, int sc, double cv)
	{
		fuelEconomyCity = fc;
		fuelEconomyHwy = fh;
		seatingCapacity = sc;
		cargoVolume = cv;
	}

	/**
	 * Get the city fuel economy.
	 * @return city fuel economy
	 */
	public double getFuelEconomyCity()
	{
		return(fuelEconomyCity);
	}

	/**
	 * Get the highway fuel economy.
	 * @return highway fuel economy
	 */
	public double getFuelEconomyHwy()
	{
		return(fuelEconomyHwy);
	}

	/**
	 * Get the seating capacity.
	 * @return number of seats
	 */
	public int getSeatingCapacity()
	{
		return(seatingCapacity);
	}

	/**
	 * Get the cargo volume.
	 * @return cargo volume
	 */
	public double getCargoVolume()
	{
		return(cargoVolume);
	}

	/**
	 * Return a string showing vehicle specifications.
	 * @return formatted string of vehicle details
	 */
	public String toString()
	{
		return("City: " + fuelEconomyCity
				+ "\nHighway: " + fuelEconomyHwy
				+ "\nSeats: " + seatingCapacity
				+ "\nCargo Volume: " + cargoVolume);
	}

	/**
	 * Get the type of vehicle (Car, Truck, Minivan).
	 * Implemented in subclasses.
	 * @return type of vehicle
	 */
	public abstract String getType();
}