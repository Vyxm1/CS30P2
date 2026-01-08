package LinkedList;

public class LinkedListTester
{

	public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList();
		
		// Test Case 1
		list.addAtFront("314");
		list.addAtFront("Apple");
		list.addAtFront("Front");
		list.addAtEnd("Back");
		
		System.out.println(list);
		System.out.println("List size: " + list.size() + " items.");
		
		System.out.println("\nRemoving Apple");
		list.remove("Apple");
		
		System.out.println("\n" + list);
		
		// Test Case 2
		System.out.println("\nMaking List Empty...");
		list.makeEmpty();
		
		System.out.println("List size: "+ list.size() + " items.");
	}

}
