package Stack;

public class StackTester
{

	public static void main(String[] args)
	{
		Stack s2 = new Stack(3);
		
		s2.push("Red");
		s2.push("Green");
		s2.push("Blue");
		
		System.out.println("Top of Stack s2: " + s2.top());
		System.out.println("Size of Stack: " + s2.size());
		
		System.out.println("\nPopping...\n");
		// Test case 1
		s2.pop();
		
		System.out.println("Top of Stack s2: " + s2.top());
		System.out.println("Size of Stack: " + s2.size());
		
		System.out.println("\nMaking Stack2 Empty...\n");
	
		// Test case 2
		s2.makeEmpty();
		System.out.println("\nChecking if Stack is Empty\n");
		
		System.out.println("If the stack is empty: " + s2.isEmpty());
		
	}

}
