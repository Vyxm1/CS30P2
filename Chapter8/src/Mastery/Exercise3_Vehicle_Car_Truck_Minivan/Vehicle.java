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
     * Constructs a Vehicle with fuel economy values, seating capacity,
     * and cargo volume.
     *
     * @param fc fuel economy in the city
     * @param fh fuel economy on the highway
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
     * Returns the vehicle's fuel economy in the city.
     *
     * @return city fuel economy
     */
	public double getFuelEconomyCity()
	{
		return(fuelEconomyCity);
	}

	/**
     * Returns the vehicle's fuel economy on the highway.
     *
     * @return highway fuel economy
     */
	public double getFuelEconomyHwy()
	{
		return(fuelEconomyHwy);
	}

	/**
     * Returns the seating capacity.
     *
     * @return maximum number of seats
     */
	public int getSeatingCapacity()
	{
		return(seatingCapacity);
	}

	/**
     * Returns the cargo volume.
     *
     * @return cargo volume
     */
	public double getCargoVolume()
	{
		return(cargoVolume);
	}

	/**
     * Returns a formatted string of common vehicle properties.
     *
     * @return string representation of the vehicle
     */
	public String toString()
	{
		return("City: " + fuelEconomyCity
				+ "\nHighway: " + fuelEconomyHwy
				+ "\nSeats: " + seatingCapacity
				+ "\nCargo Volume: " + cargoVolume);
	}

	/**
     * Returns the type of vehicle (Car, Truck, Minivan, etc.).
     *
     * @return the vehicle type
     */
	public abstract String getType();
}