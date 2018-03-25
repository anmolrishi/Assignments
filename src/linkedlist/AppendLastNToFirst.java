package linkedlist;

public class AppendLastNToFirst {
	
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) 
	{
		if ((root==null) || (root.next==null) || n<=0)
			return root;

		LinkedListNode<Integer> curr = root;
		LinkedListNode<Integer> curr2= root;
		LinkedListNode<Integer> prev = null;
		int i=1;
		while((curr.next)!=null)
		{
			if (i<n) i++;
			else
			{
				prev= curr2;
				curr2= curr2.next;
			}
			curr=curr.next;
		}
		if (i<n)
		{
			return root;
		}
		prev.next=null;
		curr.next=root;
		root=curr2;
		return root;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
