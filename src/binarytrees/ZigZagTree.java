package binarytrees;

import java.util.Scanner; 
import stacks_queues.QueueUsingLL;
/*
 * Given a binary tree. Print the zigzag order i.e print level 1 
 * from left to right, level 2 from right to left and so on. This 
 * means odd levels should get printed from left to right and even 
 * level right to left.
 */
/*  Sample Input 
 *   5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
 */
/*  Sample Output 
 *  5
    10 6
    2 3
    9
 */
public class ZigZagTree {
	public static int height(BinaryTreeNode<Integer> root) 
	{
		if (root == null) 
			return 0;
		else
		{

			/* compute the height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight) 
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}
	public static void printGivenLevel(BinaryTreeNode<Integer> root, int level, boolean ltr) 
	{
		if (root == null) 
			return;
		if (level == 1) 
			System.out.print(root.data + " ");
		else if (level > 1) 
		{
			if (ltr != false) 
			{
				printGivenLevel(root.right, level - 1, ltr);
				printGivenLevel(root.left, level - 1, ltr);
			} 
			else
			{
				printGivenLevel(root.left, level - 1, ltr);
				printGivenLevel(root.right, level - 1, ltr);
			}
		}
	}

	public static void printZigZag(BinaryTreeNode<Integer> root) 
	{
		// Write your code here		
		int h = height(root);
		int i=0;

		/* ltr -> left to right. If this variable is set then the
           given label is transversed from left to right */
		boolean ltr = false;
		for (i = 1; i <= h; i++) 
		{
			printGivenLevel(root, i, ltr);
			/*Revert ltr to traverse next level in opposite order*/
			ltr = !ltr;
			System.out.println("");


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
