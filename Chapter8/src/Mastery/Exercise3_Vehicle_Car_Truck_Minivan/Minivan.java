/*
Program: Minivan.java          Last Date of this Revision: Dec. 1, 2025

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
		a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
		Minivan classes should include additional members specific to the type of vehicle being represented.
		Create client code to test the classes.

Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

package Mastery.Exercise3_Vehicle_Car_Truck_Minivan;

public class Minivan extends Vehicle
{
	private int numSlidingDoors;

	/**
	 * Construct a Minivan with vehicle details and sliding-door count.
	 * @param fc city fuel economy
	 * @param fh highway fuel economy
	 * @param sc seating capacity
	 * @param cv cargo volume
	 * @param nd number of sliding doors
	 */
	public Minivan(double fc, double fh, int sc, double cv, int nd)
	{
		super(fc, fh, sc, cv);
		numSlidingDoors = nd;
	}

	/**
	 * Get the type of vehicle.
	 * @return "Minivan"
	 */
	@Override
	public String getType()
	{
		return("Minivan");
	}

	/**
	 * Get the number of sliding doors.
	 * @return sliding-door count
	 */
	public int getNumSlidingDoors()
	{
		return(numSlidingDoors);
	}

	/**
	 * Return a formatted string describing the minivan.
	 * @return minivan details
	 */
	@Override
	public String toString()
	{
		return(getType() + ":\n" + super.toString() + "\nNumber of Sliding Doors: " + numSlidingDoors);
	}
}
