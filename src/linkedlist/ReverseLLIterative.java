package linkedlist;


public class ReverseLLIterative {

	
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head)
	{
		LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
