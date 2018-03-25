package trees;

import java.util.Scanner;

import stacks_queues.QueueUsingLL;
/*
 * Check if a generic Tree contain integer x
 */
public class SearchX {

	public static TreeNode<Integer> takeInputLevel() throws Exception
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter root");
		int rootData = s.nextInt();

		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		QueueUsingLL<TreeNode<Integer>>pendingNodes = new QueueUsingLL<>();

		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty())

		{
			TreeNode<Integer>currentNode = pendingNodes.dequeue();
			System.out.println("Enter the number of childnodes of"+currentNode.data);
			int numChild=s.nextInt();

			for(int i=0;i<numChild;i++)
			{
				System.out.println("Enter"+i+"th child of"+currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				pendingNodes.enqueue(child);
				currentNode.children.add(child);
			}
		}
		s.close();
		return root;
	}

	public static void print(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		String toBePrinted = root.data+"";
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer>currentChild = root.children.get(i);
			toBePrinted+=currentChild.data+"";
		}
		System.out.println(toBePrinted);
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer>currentChild = root.children.get(i);
			print(currentChild);
		}
	}
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x)
	{
		if(root==null)          
		{                       
			return false;
		}

		boolean flag = false;

		if(root.data.equals(x))
		{
			return true;
		}

		for(int i=0;i<root.children.size();i++)
		{    
			flag = checkIfContainsX(root.children.get(i),x);
			if(flag)
			{
				return true;
			}

		}
		return flag;
	} 
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInputLevel();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element to be searched: ");
		int x = s.nextInt();
		s.close();
		System.out.println(checkIfContainsX(root, x));
	}

}
