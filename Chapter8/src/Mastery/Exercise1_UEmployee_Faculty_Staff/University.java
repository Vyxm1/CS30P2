/*
Program: University.java          Last Date of this Revision: Dec. 1, 2025

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

public class University
{

	/**
	 * Main driver method for demonstrating UEmployee, Faculty, and Staff.
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args)
	{
		Faculty f1 = new Faculty("Joe", 50000, "Math");
		Staff s1 = new Staff("Bob", 60000, "Office Admin");

		System.out.println("Faculty:"
				+ "\nName: " + f1.getName()
				+ "\nSalary: $" + f1.getSalary()
				+ "\nDepartment Name: " + f1.getDepartmentName());
		System.out.println();

		System.out.println("Staff:"
				+ "\nName: " + s1.getName()
				+ "\nSalary: $" + s1.getSalary()
				+ "\nJob Title: " + s1.getJobTitle());
	}
}