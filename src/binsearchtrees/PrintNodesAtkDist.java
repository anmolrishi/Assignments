package binsearchtrees;

public class PrintNodesAtkDist {
/*
 * Given a binary tree, a node and an integer K, print nodes which are at K distance from the the given node.
 */
	public static void printkdistanceNodeDown(BinaryTreeNode<Integer> node, int k) 
    {
        if (node == null || k < 0)
            return;
  
        if (k == 0) 
        {
            System.out.print(node.data);
            System.out.println("");
            return;
        }
  
        printkdistanceNodeDown(node.left, k - 1);
        printkdistanceNodeDown(node.right, k - 1);
    }
     public static int printkdistanceNode(BinaryTreeNode<Integer> node, int target, int k) 
    {
        if (node == null)
            return -1;
  
        if (node.data == target) 
        {
            printkdistanceNodeDown(node, k);
            return 0;
        }
  
        int dl = printkdistanceNode(node.left, target, k);
  
        if (dl != -1) 
        {
              
            if (dl + 1 == k) 
            {
                System.out.print(node.data);
                System.out.println("");
            }
              
            else
                printkdistanceNodeDown(node.right, k - dl - 2);
  
            return 1 + dl;
        }
  
        
        int dr = printkdistanceNode(node.right, target, k);
        if (dr != -1) 
        {
            if (dr + 1 == k) 
            {
                System.out.print(node.data);
                System.out.println("");
            } 
            else
                printkdistanceNodeDown(node.left, k - dr - 2);
            return 1 + dr;
        }
        return -1;
    }
  
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    printkdistanceNode(root,node,k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
