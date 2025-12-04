/*
Program: Staff.java          Last Date of this Revision: Dec. 1, 2025

Purpose: Create a UEmployee class that contains member variables for the university employee name and salary.
		The UEmployee class should contain member methods for returning the employee name and salary.
		Create Faculty and Staff classes that inherit the UEmployee class. The Faculty class should include
		members for storing and returning the department name. The Staff class should include members for
		storing and returning the job title.

Author: Vyom Patel 
School: CHHS
Course: Computer Programming 30

 */
package Mastery.Exercise1_UEmployee_Faculty_Staff;

public class Staff extends UEmployee
{
	private String jobTitle;

	/**
	 * Create a Staff member with the given name, salary, and job title.
	 * @param n the staff member's name
	 * @param s the staff member's salary
	 * @param t the job title of the staff member
	 */
	public Staff(String n, double s, String t)
	{
		super(n, s);
		jobTitle = t;
	}

	/**
	 * Retrieve the job title.
	 * @return the staff member's job title
	 */
	public String getJobTitle()
	{
		return(jobTitle);
	}
}