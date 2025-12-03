package Mastery.Exercise2_Account_PersonalAcct_BusinessAcct;

public class PersonalAcct extends Account
{
	final private double MIN_BAL = 100;
	final private double CHARGE = 2;
	
	public PersonalAcct(double bal, String fName, String lName, String st, String c, String p, String pCode)
	{
		super(bal, fName, lName, st, c, p, pCode);
	}
	
	public PersonalAcct(String ID)
	{
		super(ID);
	}
	
	@Override
	public void withdrawal(double amt)
	{
		super.withdrawal(amt);
		
		
		if (getBalance() < MIN_BAL)
		{
			System.out.println("Your balance is below $100, charging $10.");
			super.withdrawal(CHARGE);
		}

	}
}
