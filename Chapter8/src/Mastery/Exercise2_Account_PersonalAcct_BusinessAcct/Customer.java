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

	public void changeStreet()
	{
		System.out.println("Enter new Street Name: ");
		street = input.nextLine();
	}

	public void changeCity()
	{
		System.out.println("Enter new City: ");
		city = input.nextLine();
	}

	public void changeProvince()
	{
		System.out.println("Enter new Province: ");
		province = input.nextLine();
	}

	public void changePostalCode()
	{
		System.out.println("Enter new Postal Code: ");
		postalCode = input.nextLine();
	}


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString()
	{
		return(firstName + " " + lastName 
				+ "\nStreet: " + street
				+ "\nCity: " + city 
				+ "\nProvince: " + province 
				+ "\nPostal Code: " + postalCode);
	}

}

