package binsearchtrees;

public class PathSumRootToLeaf {
/*
 * Given a binary tree and a number k, print out all root to leaf
 * paths where the sum of all nodes value is same as the given number k.
 */
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
		 int path[] = new int[10000];
        printPathsRecur(root, path, 0, k);
	}
	public static void printPathsRecur(BinaryTreeNode<Integer> node, int path[], int pathLen,int k) 
    {
        if (node == null)
            return;
  
        path[pathLen] = node.data;
        pathLen++;
  
        if (node.left == null && node.right == null)
            printArray(path, pathLen, k);
        else
        {
            printPathsRecur(node.left, path, pathLen, k);
            printPathsRecur(node.right, path, pathLen, k);
        }
    }
     public static void printArray(int ints[], int len,int k) 
    {
        int i; int sum=0;
        for (i = 0; i < len; i++)
        {
            sum+=ints[i];
        }
        if(sum==k)
        {
        for (i = 0; i < len; i++)
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
