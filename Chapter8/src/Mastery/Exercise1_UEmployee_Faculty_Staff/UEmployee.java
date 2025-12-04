/*
Program: UEmployee.java          Last Date of this Revision: Dec. 1, 2025

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

public class UEmployee
{
	private String empName;
	private double salary;

	/** 
	 * Create a UEmployee with the given name and salary.
	 * @param n the employee name
	 * @param s the employee salary
	 */
	public UEmployee(String n, double s)
	{
		empName = n;
		salary = s;
	}

	/**
	 * Retrieve the employee name.
	 * @return the name of the employee
	 */
	public String getName()
	{
		return(empName);
	}


	/**
	 * Retrieve the employee salary.
	 * @return the salary of the employee
	 */
	public double getSalary()
	{
		return(salary);
	}

	/**
	 * Return a string representation of the employee.
	 * @return formatted employee details
	 */
	public String toString()
	{
		return("Employee name: " + empName + ", Salary: " + salary + "\n");
	}
}