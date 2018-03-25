package linkedlist;

public class ReverseLLRecursive {


	public static void printReverseRecursive(LinkedListNode<Integer> root) 
	{
		if (root == null) 
		{
			return;
		}
		printReverseRecursive(root.next);
		System.out.print(root.data + " ");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
