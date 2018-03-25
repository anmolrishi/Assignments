package binarytrees;

import java.util.Scanner;

import stacks_queues.QueueUsingLL;
/*
 * Given a binary tree print all nodes that don’t have a sibling
 */
public class NodesWithoutSiblings {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		
		// Base case
    if (root == null)
      return;
  
    // If this is an internal node, recur for left
    // and right subtrees
    if (root.left != null && root.right != null)
    {
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
  
    // If left child is NULL and right is not, print right child
    // and recur for right child
    else if (root.right != null)
    {
        System.out.print(root.right.data + " ");
        printNodesWithoutSibling(root.right);
    }
  
    // If right child is NULL and left is not, print left child
    // and recur for left child
    else if (root.left != null)
    {
        System.out.print( root.left.data + " ");
        printNodesWithoutSibling(root.left);
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
	// 6 9 5 8 -1 -1 10 -1 -1 -1 -1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeinputlevelwise();
		printNodesWithoutSibling(root);
	}

}
