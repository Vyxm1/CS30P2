/*
Program: TestAccounts.java          Last Date of this Revision: Dec. 4, 2025

Purpose: Create PersonalAcct and BusinessAcct classes that inherit the Account class presented in Chapter 7.
		A personal account requires a minimum balance of $100. If the balance falls below this amount, then
		$2.00 is charged (withdrawn) to the account. A business account requires a minimum balance of $500,
		otherwise the account is charged $10. Create client code to test the classes. 


Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */

package Mastery.Exercise2_Account_PersonalAcct_BusinessAcct;

import java.text.NumberFormat;

/**
 * The TestAccounts class tests the behavior of PersonalAcct and BusinessAcct.
 * It creates sample accounts, performs withdrawals, and prints results.
 * 
 */

public class TestAccounts
{


	public static void main(String[] args)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		final double PERSONAL_WITHDRAWAL = 950;
		final double BUSINESS_WITHDRAWAL = 600;
		PersonalAcct persAcc = new PersonalAcct(1000, "Joe", "Bob", "14 St.", "Toronto", "Ontario", "A1A1A1");
		BusinessAcct BusAcc = new BusinessAcct(1000, "Sam", "Rob", "11 St.", "Toronto", "Ontario", "A2A2A2");

		System.out.println("----- TEST PERSONAL ACCOUNT -----\n");
		System.out.println(persAcc);
		System.out.println("\nWithdrawing " + money.format(PERSONAL_WITHDRAWAL) + " from personal Account.");
		persAcc.withdrawal(PERSONAL_WITHDRAWAL);
		System.out.println(persAcc);

		System.out.println("\n----- TEST BUSINESS ACCOUNT -----\n");
		System.out.println(BusAcc);
		System.out.println("\nWithdrawing " + money.format(BUSINESS_WITHDRAWAL) + " from business Account.");
		BusAcc.withdrawal(BUSINESS_WITHDRAWAL);
		System.out.println(BusAcc);
	}

}
