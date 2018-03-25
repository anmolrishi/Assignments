package binarytrees;
/*
 * Given post order and in order create the tree.
 */
public class PostOrderInOrder {

	public static int search(int arr[], int strt, int end, int value) 
    {
        int i;
        for (i = strt; i <= end; i++) 
        {
            if (arr[i] == value)
                break;
        }
        return i;
    }
    
	public static BinaryTreeNode<Integer> buildUtil(int in[], int post[], int inStrt,
            int inEnd, Index pIndex) 
    {
        // Base case
        if (inStrt > inEnd)
            return null;
 
        /* Pick current node from Preorder traversal using
           postIndex and decrement postIndex */
        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(post[pIndex.index]);
        (pIndex.index)--;
 
        /* If this node has no children then return */
        if (inStrt == inEnd)
            return node;
 
        /* Else find the index of this node in Inorder
           traversal */
        int iIndex = search(in, inStrt, inEnd, node.data);
 
        /* Using index in Inorder traversal, construct left and
           right subtrees */
        node.right = buildUtil(in, post, iIndex + 1, inEnd, pIndex);
        node.left = buildUtil(in, post, inStrt, iIndex - 1, pIndex);
 
        return node;
    }

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,int[] in)
	{
	    // Write your code here
		Index pIndex = new Index();
		int n = in.length;
        pIndex.index = n - 1;
        return buildUtil(in, post, 0, n - 1, pIndex);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Index 
{
    int index;
}
