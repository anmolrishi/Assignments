package binsearchtrees;

public class LargestBST {
/*
 * Given a Binary tree, find the largest BST subtree. That is, you need to 
 * find the BST with maximum height in the given binary tree.
 * Return the height of largest BST.
 */
	public static int height(BinaryTreeNode<Integer> root) {
		return (root==null) ? 0: 1+Math.max(height(root.left), height(root.right));
	}

	public static boolean checkIfBST(BinaryTreeNode<Integer> root) {
		if(root==null){
			return true;
		}

		//Time Complexity = n*height


		int largestLeft = Largest(root.left);
		int smallestRight = Smallest(root.right);

		if(largestLeft > root.data || smallestRight < root.data)
		{
			return false;
		}

		return checkIfBST(root.left) && checkIfBST(root.right);

	}	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		if(root==null){
			return 0;
		}

		int mHeight = Integer.MIN_VALUE;

		if(checkIfBST(root))
		{
			int temp = height(root);
			if(temp>mHeight)
			{
				mHeight = temp;
			}
			return mHeight;
		}
		else
		{int temp1 = largestBSTSubtree(root.left);
		int temp2 = largestBSTSubtree(root.right);

		if(temp1>temp2){
			return temp1;
		}
		else{
			return temp2;
		}

		}

	}

	public static int Largest(BinaryTreeNode<Integer> root) {
		if(root==null){
			return Integer.MIN_VALUE;
		}

		return Math.max(root.data,Math.max(Largest(root.left),Largest(root.right)));
	}

	public static int Smallest(BinaryTreeNode<Integer> root) {
		if(root==null){
			return Integer.MAX_VALUE;
		}

		return Math.min(root.data,Math.min(Smallest(root.left),Smallest(root.right)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
