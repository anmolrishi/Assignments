package trees;

import java.util.Scanner;  
import stacks_queues.QueueUsingLL;
/*
 * In a given Generic Tree, replace each node with its depth value. 
 * You need to just update the data of each node, no need to return 
 * or print anything.
 */
public class ReplaceNodeWithDepth {

	public static void replaceWithDepthValue1(TreeNode<Integer> root,int level)
	{
		if (root == null)
			return;

		root.data = level; 

		for(int i=0;i<root.children.size();i++)
		{    
			replaceWithDepthValue1(root.children.get(i),level+1);

		}
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root)
	{

		// Write your code here
		replaceWithDepthValue1(root,0);

	}

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

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInputLevel();
		replaceWithDepthValue(root);
		print(root);
	}

}
