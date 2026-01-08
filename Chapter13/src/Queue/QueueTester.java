package Queue;

public class QueueTester
{
	public static void main(String[] args) 
	{
		Queue q = new Queue(3);
		
		// Test Case 1
		System.out.println("Adding \"Red\", \"Yellow\", and \"Blue\" to queue.");

		q.enqueue("Red");
		q.enqueue("Yellow");
		q.enqueue("Blue");

		System.out.println("Front of queue: "+ q.front());
		System.out.println("Size of queue: "+ q.size());
		System.out.println("Remove an element from queue: "+ q.dequeue());
		System.out.println("Size of queue: "+ q.size());
		
		// Test Case 2
		System.out.println("\nAdding \"Green\"...");
		
		q.enqueue("Green");
		System.out.println("Front of queue: " + q.front());
		System.out.println("Size of queue: " + q.size());
		System.out.println("Remove an element from queue: " + q.dequeue());
		System.out.println("Remove another element: " + q.dequeue());
		System.out.println("Is queue empty? " + q.isEmpty());

	}
}
