package stacks_queues;

public class Node<T> 
{
	private T data;
	private Node<T> next;  // doing this ensures that the next node also is of type T

	public Node<T> getNext() 
	{
		return next;
	}
	public void setNext(Node<T> next) 
	{
		this.next = next;
	}
	public void setData(T data) 
	{
		// TODO Auto-generated method stub
		this.data = data;

	}
	public T getData() {
		// TODO Auto-generated method stub
		return data;
	}

}

// taking linked list as inout from the user 

