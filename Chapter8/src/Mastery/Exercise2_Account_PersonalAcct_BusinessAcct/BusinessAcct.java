package Mastery.Exercise2_Account_PersonalAcct_BusinessAcct;

public class BusinessAcct extends Account
{
	final private double MIN_BAL = 500;
	final private double CHARGE = 10;
	
	public BusinessAcct(double bal, String fName, String lName, String st, String c, String p, String pCode)
	{
		super(bal, fName, lName, st, c, p, pCode);
	}

	public BusinessAcct(String ID)
	{
		super(ID);
	}

	@Override
	public void withdrawal(double amt)
	{
		super.withdrawal(amt);
		
		
		if (getBalance() < MIN_BAL)
		{
			System.out.println("Your balance is below $500, charging $2.");
			super.withdrawal(CHARGE);
		}

	}
}
