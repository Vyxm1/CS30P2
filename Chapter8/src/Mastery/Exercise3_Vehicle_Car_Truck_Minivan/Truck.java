/*
Program: Truck.java          Last Date of this Revision: Dec. 1, 2025

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
		a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
		Minivan classes should include additional members specific to the type of vehicle being represented.
		Create client code to test the classes.

Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

package Mastery.Exercise3_Vehicle_Car_Truck_Minivan;

public class Truck extends Vehicle
{
	private int numWheels;

	/**
	 * Construct a Truck with full vehicle details and wheel count.
	 * @param fc city fuel economy
	 * @param fh highway fuel economy
	 * @param sc seating capacity
	 * @param cv cargo volume
	 * @param nw number of wheels
	 */
	public Truck(double fc, double fh, int sc, double cv, int nw)
	{
		super(fc, fh, sc, cv);
		numWheels = nw;
	}

	/**
	 * Get the type of vehicle.
	 * @return "Truck"
	 */
	@Override
	public String getType()
	{
		return("Truck");
	}

	/**
	 * Get the number of wheels.
	 * @return wheel count
	 */
	public int getNumWheels()
	{
		return(numWheels);
	}

	/**
	 * Return a formatted string describing the truck.
	 * @return truck description
	 */
	@Override
	public String toString()
	{
		return(getType() + ":\n" + super.toString() + "\nNumber of Wheels: " + numWheels);
	}
}
