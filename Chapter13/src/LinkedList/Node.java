package LinkedList;

public class Node
{
	private String data;
	private Node nextNode;
	
	public Node(String d)
	{
		data = d;
		nextNode = null;
	}
	
	public Node getNext()
	{
		return nextNode;
	}
	
	public void setNextNode(Node newNode)
	{
		nextNode = newNode;
	}
	
	public String getData()
	{
		return (data);
	}
}