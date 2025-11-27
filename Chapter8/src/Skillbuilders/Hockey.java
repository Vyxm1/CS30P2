package Skillbuilders;

public class Hockey
{

	public static void main(String[] args)
	{
		Puck p1 = new Puck(1.0);
		Puck p2 = new Puck(5.2);
		Puck p3 = new Puck(4.4);
		Puck p4 = new Puck(5.2);
		
		// Test toString()
		System.out.println("Puck 1:\n" + p1 + "\n");
		System.out.println("Puck 2:\n" + p2 + "\n");
		System.out.println("Puck 3:\n" + p3 + "\n");
		
		//	Test equality
		if (p2.equals(p4))
		{
			System.out.println("Puck 2 is equal to Puck 4\n");
		}
		else
		{
			System.out.println("Puck 2 is not equal to Puck 4\n");
		}
		
		// Puck Part 2
		System.out.println("Puck 1 compared to Puck 2: " + p1.compareTo(p2));
		System.out.println("Puck 2 compared to Puck 1: " + p2.compareTo(p1));
		System.out.println("Puck 2 compared to Puck 4: " + p2.compareTo(p4));
		System.out.println("Puck 2 compared to Puck 2: " + p2.compareTo(p2));
	}

}
