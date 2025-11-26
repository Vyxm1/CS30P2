package Skillbuilders;

import java.text.NumberFormat;
import java.util.*;

public class Cresmart
{

	public static void payEmployee(Employee emp, double payArg)
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();

		System.out.println(emp);

		double pay = emp.pay(payArg);
		System.out.println("Paid: " + money.format(pay));
	}

	public static void main(String[] args)
	{
		Manager emp1 = new Manager("Jerry", "Rob", 6e4);
		Associate emp2 = new Associate("Barry", "Bob", 30);

		Scanner input = new Scanner(System.in);

		String action;
		int empNum;
		double payArg;

		Employee emp;

		do
		{
			System.out.println("(E)mployee \\ (P)ay \\ (Q)uit");
			System.out.println("Enter choice: ");
			action = input.next();

			if (!action.equalsIgnoreCase("Q"))
			{
				System.out.println("Enter employee number (1 or 2): ");
				empNum = input.nextInt();
				
				
				if (empNum == 1)
				{
					emp = emp1;
				}
				else
				{
					emp = emp2;
				}
				if (action.equalsIgnoreCase("E"))
				{
					System.out.println(emp);
				}
				else if (action.equalsIgnoreCase("P"))
				{
					System.out.println("Enter pay period in weeks for Manager or hours for Associate: ");
					payArg = input.nextDouble();
					payEmployee(emp, payArg);
					System.out.println("");
				}
			}
			
		}
		while(!action.equalsIgnoreCase("Q"));

		System.out.println("Have a good day!");
	}
}
