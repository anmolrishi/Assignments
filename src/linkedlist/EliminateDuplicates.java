package linkedlist;

public class EliminateDuplicates {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) 
	{
	    /*Another reference to head*/
        LinkedListNode<Integer> current = head;
 
        /* Pointer to store the next pointer of a node to be deleted*/
        LinkedListNode<Integer> next_next;
 
        /* do nothing if the list is empty */
        if (head == null)    
            return head;
 
        /* Traverse list till the last node */
        while (current.next != null) 
        {
 
            /*Compare current node with the next node */
            if (current.data.equals(current.next.data))
            {
                next_next = current.next.next;
                current.next = null;
                current.next = next_next;
            }
            else // advance if no deletion
               current = current.next;
        }
        return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
