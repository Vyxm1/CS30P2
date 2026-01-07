package LinkedList;

public class LinkedList
{
	private Node head;

	public LinkedList()
	{
		head = null;
	}

	public void addAtFront(String Str)
	{
		Node newNode = new Node(Str);
		newNode.setNextNode(head);
		head = newNode;

	}

	public void addAtEnd(String Str)
	{
		Node newNode = new Node(Str);
		Node current = head;

		if (head == null)
		{
			newNode.setNextNode(head);
			head = newNode;
		}
		else
		{
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			current.setNextNode(newNode);
		}
	}

	public void remove(String str)
	{
		Node current = head;
		Node previous = head;

		if (current.getData().equals(str))
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				if(current.getData().equals(str))
				{
					previous.setNextNode(current.getNext());
				}
			}
		}
	}
	
	public String toString()
	{
		Node current = head;
		String listString = null;
		
		if (current != null)
		{
			listString  = current.getData() + "\n";
			
			while (current.getNext() != null)
			{
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return (listString);
		}
		else
		{
			return("There are no items in the list.");
		}
	}
	
	public int size()
	{
		Node current = head;
		int count = 0;
		
		if(current != null)
		{
			count += 1;
			
			while(current.getNext() != null)
			{
				current = current.getNext();
				count += 1;
			}
			return count;
		}
		
		else
		{
			return 0;
		}
	}
	
	public void makeEmpty()
	{
		head = null;
	}
}
