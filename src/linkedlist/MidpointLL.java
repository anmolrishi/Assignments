package linkedlist;

public class MidpointLL {

	 public static int length(LinkedListNode<Integer> head)
		{
			LinkedListNode<Integer> temp = head;
			int count = 0;

			while(temp!=null)
			{
				temp = temp.next;
				count++;
			}
			return count;
		}
		
		public static int printMiddel(LinkedListNode<Integer> head) 
		{
		    LinkedListNode<Integer> slow_ptr = head;
	        LinkedListNode<Integer> fast_ptr = head;
	         LinkedListNode<Integer> help    = head;
	        if(length(head)%2==0)
	        {
	            if (head != null)
	        {
	            while (fast_ptr != null && fast_ptr.next != null)
	            {
	                fast_ptr = fast_ptr.next.next;
	                help     = slow_ptr;
	                slow_ptr = slow_ptr.next;
	            }
	             
	        }
	        return help.data; // return previous data
	        }
	        
	        else
	        {
	        if (head != null)
	        {
	            while (fast_ptr != null && fast_ptr.next != null)
	            {
	                fast_ptr = fast_ptr.next.next;
	                slow_ptr = slow_ptr.next;
	            }
	        }
	        return slow_ptr.data;
	        }
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
