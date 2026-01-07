package LinkedList;

public class LinkedListTester
{

	public static void main(String[] args)
	{
		
		LinkedList list = new LinkedList();
		
		list.addAtFront("314");
		list.addAtFront("Apple");
		list.addAtFront("Front");
		
		list.addAtEnd("Back");
		
		System.out.println(list);
		
		System.out.println("List size: " + list.size() + " items.");
		
		System.out.println("\nRemoving Apple");
		list.remove("Apple");
		System.out.println("\n" + list);
		
		System.out.println("\nMaking List Empty...");
		list.makeEmpty();
		
		System.out.println("List size: "+ list.size() + " items.");
	}

}
