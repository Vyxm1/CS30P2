package Skillbuilders;

public class Stack2Tester
{

	public static void main(String[] args)
	{
		Stack2 s2 = new Stack2(3);
		
		s2.push("Red");
		s2.push("Green");
		s2.push("Blue");
		
		System.out.println("Top of Stack s2: " + s2.top());
		System.out.println("Size of Stack: " + s2.size());
		
		System.out.println("\nPopping...\n");
		
		s2.pop();
		
		System.out.println("Top of Stack s2: " + s2.top());
		System.out.println("Size of Stack: " + s2.size());
		
		System.out.println("\nMaking Stack2 Empty...\n");
		
		s2.makeEmpty();
		
		System.out.println("\nChecking if Stack is Empty\n");
		
		System.out.println("If the stack is empty: " + s2.isEmpty());
		
	}

}
