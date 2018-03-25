package linkedlist;

public class PalindromeLL {

	 public static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> head) 
     {
        LinkedListNode<Integer> pre=null;
        LinkedListNode<Integer> next=null;
        while(head!=null)
        {
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
    
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) 
	{
	    if(head==null||head.next==null)
            return true;
            
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow.next=reverseList(slow.next);
        slow=slow.next;
        
        while(slow!=null)
        {
            if(head.data!=slow.data)
                return false;
                
            head=head.next;
            slow=slow.next;
        }
        return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
