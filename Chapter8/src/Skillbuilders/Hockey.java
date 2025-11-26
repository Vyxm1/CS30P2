package Skillbuilders;

public class Hockey
{

	public static void main(String[] args)
	{
		Puck p1 = new Puck(1.0);
		Puck p2 = new Puck(5.2);
		Puck p3 = new Puck(4.4);
		Puck p4 = new Puck(5.2);
		
		System.out.println("Puck 1:\n" + p1 + "\n");
		System.out.println("Puck 2:\n" + p2 + "\n");
		System.out.println("Puck 3:\n" + p3 + "\n");
		
		//	Test equality
		if (p2.equals(p4))
		{
			System.out.println("Puck 2 is equal to Puck 4");
		}
		else
		{
			System.out.println("Puck 2 is not equal to Puck 4");
		}
		
		// Puck Part 2
		
		
	}

}
