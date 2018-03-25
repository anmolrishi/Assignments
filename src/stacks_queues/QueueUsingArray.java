package stacks_queues;

public class QueueUsingArray {

	int data[];
	int front,rear,size;

	public QueueUsingArray() {
		data = new int[10];
		front = -1;
		rear = -1;
		size = 0;  // size is anyways initialized as 0

	}

	public int size()
	{
		return size;
	}       // function should be non static because every queue is unique

	public boolean isEmpty()
	{
		return size==0;
	}

	public int front() 
	{
		if(isEmpty())
		{
			return Integer.MIN_VALUE;
		}
		return data[front];
	}

	public void enqueue(int element)
	{    
		if(size==data.length)  // checks overflow
		{
			return;
		}
		if(size==0)
		{
			front=0;
		}
		
		rear= (rear=+1) % data.length;
		data[++rear] = element;
		size++;
	}

	public int dequeue()
	{ 
		if(isEmpty())
		{
			return Integer.MIN_VALUE;
		}
		int temp = data[front];
		front = (front+1) % data.length;
		size--;

		if(size==0)
		{
			front = -1;
			rear = -1;
		}
		return temp;
	}
}
