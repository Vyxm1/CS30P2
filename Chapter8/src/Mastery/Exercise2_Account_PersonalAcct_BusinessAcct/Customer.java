/*
Program: Customer.java          Last Date of this Revision: Dec. 4, 2025

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 7.
		A personal account requires a minimum balance of $100. If the balance falls below this amount, then
		$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
		otherwise the account is charged $10. Create client code to test the classes. 


Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

package Mastery.Exercise2_Account_PersonalAcct_BusinessAcct;

import java.util.*;

/**
 * Customer class.
 */
public class Customer
{
	private String firstName, lastName;
	private String street, city, province, postalCode;

	// Create a Scanner object for user input
	private Scanner input = new Scanner(System.in);

	/**
	 * Constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String st, String c, String p, String pCode)
	{
		firstName = fName;
		lastName = lName;
		street = st;
		city = c;
		province = p;
		postalCode = pCode;
	}

	/**
	 * Prompts the user to enter a new street name.
	 */
	public void changeStreet()
	{
		System.out.println("Enter new Street Name: ");
		street = input.nextLine();
	}

	/**
	 * Prompts the user to enter a new city.
	 */
	public void changeCity()
	{
		System.out.println("Enter new City: ");
		city = input.nextLine();
	}

	/**
	 * Prompts the user to enter a new province.
	 */
	public void changeProvince()
	{
		System.out.println("Enter new Province: ");
		province = input.nextLine();
	}

	/**
	 * Prompts the user to enter a new postal code.
	 */
	public void changePostalCode()
	{
		System.out.println("Enter new Postal Code: ");
		postalCode = input.nextLine();
	}


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has been returned.
	 */
	public String toString()
	{
		return("Name: " + firstName + " " + lastName 
				+ "\nStreet: " + street
				+ "\nCity: " + city 
				+ "\nProvince: " + province 
				+ "\nPostal Code: " + postalCode + "\n");
	}
}