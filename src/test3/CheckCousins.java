package test3;
/*
 * Given the binary Tree and two nodes say ‘p’ and ‘q’. Determine whether the
 * two nodes are cousins of each other or not. Two nodes are said to be cousins
 * of each other if they are at same level of the Binary Tree and have different parents.
 * Do it in O(n).
 */
public class CheckCousins {

	public static boolean isSibling(BinaryTreeNode<Integer> node, int a, int b)
    {
        // Base case
        if (node == null)
            return false;
        if(node.left==null || node.right==null)
            return false;
 
        return ((node.left.data == a && node.right.data == b) ||
                (node.left.data == b && node.right.data == a) ||
                isSibling(node.left, a, b) ||
                isSibling(node.right, a, b));
    }

    public static int getLevelUtil(BinaryTreeNode<Integer> node, int data, int level) 
    {
        if (node == null)
            return 0;
  
        if (node.data == data)
            return level;
  
        int downlevel = getLevelUtil(node.left, data, level + 1);
        if (downlevel != 0)
            return downlevel;
  
        downlevel = getLevelUtil(node.right, data, level + 1);
        return downlevel;
    }
  
    /* Returns level of given data value */
    public static int getLevel(BinaryTreeNode<Integer> node, int data) 
    {
        return getLevelUtil(node, data, 1);
    }
    
	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		// Write your code here

        return (getLevel(root,p) == getLevel(root,q) && (!isSibling(root, p, q)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
