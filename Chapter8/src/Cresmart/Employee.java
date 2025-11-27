package Cresmart;

public abstract class Employee
{
	private String firstName, lastName;

//	Overloaded Constructor Method
	public Employee(String f, String l)
	{
		firstName = f;
		lastName = l;
	}

	public String toString()
	{
		return(firstName + " " + lastName);
	}

	
// 	Declaration of Pay
	abstract double pay(double period);
}