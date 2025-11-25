package Skillbuilders;

public class Associate extends Employee
{
	private double hourlyPayRate;

	public Associate(String f, String l, double pay)
	{
		super(f, l);
		hourlyPayRate = pay;
	}


	public double pay(double hoursPerWeek)
	{
		double payEarned;

		if (hoursPerWeek > 40)
		{
			payEarned = (hourlyPayRate * 40) + (hourlyPayRate * 1.5 * (hoursPerWeek - 40));
		}
		else
		{
			payEarned = hoursPerWeek * hourlyPayRate;
		}

		return(payEarned);
	}

	public String toString()
	{
		return(super.toString() + ", Associate/nHourly Pay: " + hourlyPayRate);
	}

}
