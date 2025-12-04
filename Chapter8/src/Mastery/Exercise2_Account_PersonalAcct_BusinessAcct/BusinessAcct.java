/*
Program: BusinessAcct.java          Last Date of this Revision: Dec. 4, 2025

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 7.
		A personal account requires a minimum balance of $100. If the balance falls below this amount, then
		$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
		otherwise the account is charged $10. Create client code to test the classes. 


Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

package Mastery.Exercise2_Account_PersonalAcct_BusinessAcct;

public class BusinessAcct extends Account
{
	final private double MIN_BAL = 500;
	final private double CHARGE = 10;
	
	/**
     * Constructs a BusinessAcct with complete customer information.
     */
	public BusinessAcct(double bal, String fName, String lName, String st, String c, String p, String pCode)
	{
		super(bal, fName, lName, st, c, p, pCode);
	}

	/**
     * Constructs a BusinessAcct with only an account ID.
     */
	public BusinessAcct(String ID)
	{
		super(ID);
	}

	/**
     * Performs a withdrawal and applies a $10 service charge
     * if the balance falls below the required minimum.
     *
     * @param amt withdrawal amount
     */
	@Override
	public void withdrawal(double amt)
	{
		super.withdrawal(amt);
		
		
		if (getBalance() < MIN_BAL)
		{
			System.out.println("Your balance is below $500, charging $10.\n");
			super.withdrawal(CHARGE);
		}

	}
}
