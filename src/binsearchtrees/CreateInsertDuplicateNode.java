package binsearchtrees;

public class CreateInsertDuplicateNode {
/*
 * Given a BST, for each node create a new duplicate node, 
 * and insert that duplicate as left child of the original node.
 */
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Write your code here
		 BinaryTreeNode<Integer> oldleft;
  
        if (root == null)
            return;
  
        /* do the subtrees */
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
  
        /* duplicate this node to its left */
        oldleft = root.left;
        root.left = new BinaryTreeNode<Integer>(root.data);
        root.left.left = oldleft;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
