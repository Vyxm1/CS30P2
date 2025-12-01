package Mastery.Exercise1_UEmployee_Faculty_Staff;

public class Faculty extends UEmployee
{
	private String departmentName;
	
	public Faculty(String n, double s, String dn)
	{
		super(n, s);
		departmentName = dn;
	}

	public String getDepartmentName()
	{
		return(departmentName);
	}
}
