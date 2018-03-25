package stacks_queues;

import stacks_queues.QueueUsingArray;

public class ReverseQueue {

	public static void reverseQueue(QueueUsingLL<Integer> q) {
		// Write your code here
   if(q.size()<=1)
		{
			return;
		}

		int temp = q.dequeue();   // store the bottom most element in an integer
		reverseQueue(q);   


		q.enqueue(temp);  
	}
	public static void reverse(QueueUsingArray queue)

	{
		if(queue.size()<=1)
		{
			return;
		}

		int temp = queue.dequeue();   // store the bottom most element in an integer
		reverse(queue);   


		queue.enqueue(temp);        // push the stored element back to the original stack
		                            // this element will now be at the top

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
