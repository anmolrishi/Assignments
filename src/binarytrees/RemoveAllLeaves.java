package binarytrees;

import java.util.Scanner; 
import stacks_queues.QueueUsingLL;

/*
 * Remove all leaf nodes from a given Binary Tree. 
 * Leaf nodes are those nodes, which don't have any children.
Note : Root will also be a leaf node if it doesn't have left 
and right child. You don't need to print the tree, just remove 
all leaf nodes and return the updated root.
 */
/* Sample Input 
 * 8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
 */
/* Sample Output 
 * 8
   3 10
   6 14  
 */
public class RemoveAllLeaves {

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root)
	{

		// Write your code here
		if (root == null)
			return null;

		else 
		{
			if (root.left == null && root.right == null) 
			{     //if both left and right child are null
				root = null;                                    //delete it (by assigning null)
			} 
			else 
			{
				root.left  = removeAllLeaves(root.left);            //set new left node 
				root.right = removeAllLeaves(root.right);          //set new right node   
			}
		}
		return root;
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
