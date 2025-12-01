package Mastery.Exercise1_UEmployee_Faculty_Staff;

public class Staff extends UEmployee
{
	private String jobTitle;

	public Staff(String n, double s, String t)
	{
		super(n, s);
		jobTitle = t;
	}
	
	public String getJobTitle()
	{
		return(jobTitle);
	}
}
