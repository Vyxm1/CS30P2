package Skillbuilders;

public class Puck extends Disk
{

	private double weight;
	private boolean standard;
	private boolean youth;

	public Puck(double w)
	{
		// Initialize radius to 1.5 and thickness to 1
		super(1.5, 1);

		weight = w;

		if (weight >= 5 && weight <= 5.5)
		{
			standard = true;
			youth = false;
		}
		else if (weight >= 4 && weight <= 4.5)
		{
			standard = false;
			youth = true;
		}
	}

	public double getWeight()
	{
		return(weight);
	}

	public String getDivision()
	{
		if (standard)
		{
			return("Standard");
		}
		else if (youth)
		{
			return("Youth");
		}
		else
		{
			return("Neither");
		}
	}


	public boolean equals(Object obj)
	{
		Puck testObj = (Puck)obj;

		if (testObj.getWeight() == weight
				&& testObj.getDivision().equals(getDivision())
				&& testObj.getRadius() == getRadius()
				&& testObj.getThickness() == getThickness())
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}

	public String toString()
	{
		return("Puck radius: " + getRadius() 
		+ "\nThickness: " + getThickness() 
		+ "\nWeight: " + getWeight() 
		+ "\nDivision: " + getDivision());
	}

}