package linkedlist;


public class Swap2NodesLL {

	public static int printkthPosition(LinkedListNode<Integer> head,int pos)
	{
		LinkedListNode<Integer>temp = head;
		int i=1;

		while(temp!=null && i<pos)
		{
			temp = temp.next;
			i++;
		}
		if(i==pos)
		{
			return temp.data;
		}
		else 
		{
			return -1;
		}
	}
	
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j)
	{
		 // Nothing to do if x and y are same
		 int x = printkthPosition(head,i+1);
		 int y = printkthPosition(head,j+1);
		 
       if (x == y) return head;

       // Search for x (keep track of prevX and CurrX)
       LinkedListNode<Integer> prevX = null, currX = head;
       while (currX != null && currX.data != x)
       {
           prevX = currX;
           currX = currX.next;
       }

       // Search for y (keep track of prevY and currY)
       LinkedListNode<Integer> prevY = null, currY = head;
       while (currY != null && currY.data != y)
       {
           prevY = currY;
           currY = currY.next;
       }

       // If either x or y is not present, nothing to do
       if (currX == null || currY == null)
           return head;

       // If x is not head of linked list
       if (prevX != null)
           prevX.next = currY;
       else //make y the new head
           head = currY;

       // If y is not head of linked list
       if (prevY != null)
           prevY.next = currX;
       else // make x the new head
           head = currX;

       // Swap next pointers
       LinkedListNode<Integer> temp = currX.next;
       currX.next = currY.next;
       currY.next = temp;
       return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
