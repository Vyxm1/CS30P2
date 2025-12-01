/*
Program: Car.java          Last Date of this Revision: Dec. 1, 2025

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
		a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
		Minivan classes should include additional members specific to the type of vehicle being represented.
		Create client code to test the classes.

Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

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
