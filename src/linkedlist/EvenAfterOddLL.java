package linkedlist;

public class EvenAfterOddLL {

	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> end = head;
	    LinkedListNode<Integer> prev = null;
	    LinkedListNode<Integer> curr = head;
	 
	    /* Get pointer to the last node */
	    while (end.next != null)
	        end = end.next;
	 
	    LinkedListNode<Integer> new_end = end;
	 
	    /* Consider all even nodes before the first odd node
	       and move then after end */
	    while (curr.data %2 == 0 && curr != end)
	    {
	        new_end.next = curr;
	        curr = curr.next;
	        new_end.next.next = null;
	        new_end = new_end.next;
	    }
	 
	    // 10->8->17->17->15
	    /* Do following steps only if there is any odd node */
	    if (curr.data%2 != 0)
	    {
	        /* Change the head pointer to point to first odd node */
	        head = curr;
	 
	        /* now current points to the first odd node */
	        while (curr != end)
	        {
	            if ( (curr.data)%2 != 0 )
	            {
	                prev = curr;
	                curr = curr.next;
	            }
	            else
	            {
	                /* break the link between prev and current */
	                prev.next = curr.next;
	 
	                /* Make next of curr as NULL  */
	                curr.next = null;
	 
	                /* Move curr to end */
	                new_end.next = curr;
	 
	                /* make curr as new end of list */
	                new_end = curr;
	 
	                /* Update current pointer to next of the moved node */
	                curr = prev.next;
	            }
	        }
	    }
	 
	    /* We must have prev set before executing lines following this
	       statement */
	    else prev = curr;
	 
	    /* If there are more than 1 even nodes and end of original list is
	      odd then move this node to end to maintain same order of even
	      numbers in modified list */
	    if (new_end!=end && (end.data)%2 == 0)
	    {
	        prev.next = end.next;
	        end.next = null;
	        new_end.next = end;
	    }
	    return head;

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
