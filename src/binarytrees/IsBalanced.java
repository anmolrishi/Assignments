package binarytrees;

import java.util.Scanner; 
import stacks_queues.QueueUsingLL;

/*
 * Given a binary tree check if its balanced i.e. depth of 
 * left and right subtrees of every node differ by at max 1
 */
public class IsBalanced {
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
	public static int height(BinaryTreeNode<Integer> root) 
	{
		/* base case tree is empty */
		if (root == null)
			return 0;

		/* If tree is not empty then height = 1 + max of left
         height and right heights */
		return 1 + Math.max(height(root.left), height(root.right));
	}

	public static boolean checkBalanced(BinaryTreeNode<Integer> root)
	{

		// Write your code here
		int lh; /* for height of left subtree */

		int rh; /* for height of right subtree */

		/* If tree is empty then return true */
		if (root == null)
			return true;

		/* Get the height of left and right sub trees */
		lh = height(root.left);
		rh = height(root.right);

		if (Math.abs(lh - rh) <= 1 && checkBalanced(root.left) && checkBalanced(root.right)) 
			return true;

		/* If we reach here then tree is not height-balanced */
		return false;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
