/*
Program: Garage.java          Last Date of this Revision: Dec. 1, 2025

Purpose: Create a Vehicle class that is an abstract class defining the general details and actions associated with
		a vehicle. Create Car, Truck, and Minivan classes that inherit the Vehicle class. The Car, Truck, and
		Minivan classes should include additional members specific to the type of vehicle being represented.
		Create client code to test the classes.

Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

package Mastery.Exercise3_Vehicle_Car_Truck_Minivan;

public class Garage
{
	/**
     * Creates several Vehicle objects and prints their information.
     *
     * @param args command line arguments (unused)
     */
	public static void main(String[] args)
	{
		Car c = new Car(5.6, 6.2, 4, 100, "Honda");
		Truck t = new Truck(9.2, 10.4, 5, 2000, 18);
		Minivan m = new Minivan(11.2, 12.2, 7, 750, 6);


		System.out.println(c);
		System.out.println();

		System.out.println(t);
		System.out.println();

		System.out.println(m);
	}
}