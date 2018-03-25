package binarytrees;

import java.util.Scanner;

import stacks_queues.QueueUsingLL;
/*
 * Given a binary tree. Print the level order traversal, 
 * make sure each level start at a new line.
 */
public class LevelOrderTraversal 
{
	public static int height(BinaryTreeNode<Integer> root)
	{
		if (root==null) 
			return 0;

		return 1 + Math.max(height(root.left),height(root.right));
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root)
	{
		int h = height(root);

		for(int i=1;i<=h;i++)
		{
			printLevels(root,i);
			System.out.println("");
		}
	}

	public static void printLevels(BinaryTreeNode<Integer> root, int h)
	{
		if(root==null) 
			return;

		if(h==1) 
			System.out.print(root.data+" ");

		else
		{
			printLevels(root.left,h-1);
			printLevels(root.right,h-1);
		} 	
	}
	public static BinaryTreeNode<Integer> takeinputlevelwise() 
	{

		QueueUsingLL<BinaryTreeNode<Integer>>pendingNodes = new QueueUsingLL<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root: ");
		int rootData = s.nextInt();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> currentNode = pendingNodes.dequeue();
			System.out.println("Enter left child of "+ currentNode.data);
			int leftData= s.nextInt();
			if(leftData!=-1)
			{
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftData);
				pendingNodes.enqueue(leftChild);
				currentNode.left = leftChild;

			}
			System.out.println("Enter right child of"+ currentNode.data);
			int rightData= s.nextInt();
			if(rightData!=-1)
			{
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightData);
				pendingNodes.enqueue(rightChild);
				currentNode.right = rightChild;

			}
		}
		s.close();
		return root;

	}

	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}

		String toBePrinted = root.data+"";
		if(root.left!=null)
		{toBePrinted+=root.left.data+" ";}

		if(root.right!=null)
		{toBePrinted+=root.right.data+" ";}

		System.out.println(toBePrinted);
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
