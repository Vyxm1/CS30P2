/*
Program: Faculty.java          Last Date of this Revision: Dec. 1, 2025

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

public class Faculty extends UEmployee
{
	private String departmentName;

	/**
     * Constructs a Faculty member with a name, salary, and department name.
     *
     * @param n  the faculty member's name
     * @param s  the salary of the faculty member
     * @param dn the department name
     */
	public Faculty(String n, double s, String dn)
	{
		super(n, s);
		departmentName = dn;
	}

	/**
     * Returns the department name of the faculty member.
     *
     * @return the department name
     */
	public String getDepartmentName()
	{
		return(departmentName);
	}
}