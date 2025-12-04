/*
Program: PersonalAcct.java          Last Date of this Revision: Dec. 4, 2025

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 7.
		A personal account requires a minimum balance of $100. If the balance falls below this amount, then
		$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
		otherwise the account is charged $10. Create client code to test the classes. 


Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

package Mastery.Exercise2_Account_PersonalAcct_BusinessAcct;

public class PersonalAcct extends Account
{
	final private double MIN_BAL = 100;
	final private double CHARGE = 2;
	
	/**
     * Constructs a PersonalAcct with full customer data.
     */
	public PersonalAcct(double bal, String fName, String lName, String st, String c, String p, String pCode)
	{
		super(bal, fName, lName, st, c, p, pCode);
	}
	
	/**
     * Constructs a PersonalAcct using only an account ID.
     */
	public PersonalAcct(String ID)
	{
		super(ID);
	}
	
	/**
     * Performs a withdrawal and applies a $2 charge if
     * the resulting balance falls below the minimum.
     *
     * @param amt amount to withdraw
     */
	@Override
	public void withdrawal(double amt)
	{
		super.withdrawal(amt);
		
		
		if (getBalance() < MIN_BAL)
		{
			System.out.println("Your balance is below $100, charging $2.\n");
			super.withdrawal(CHARGE);
		}

	}
}
