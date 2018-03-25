package trees;
/*
 * Given a generic tree and a number n. Find next larger element in the Tree 
 * i.e. find a node with value just greater than n.
 */
public class NextLargerElement {

	public static int nextLarger(TreeNode<Integer> root, int k) {
		if(root==null)						//THis is not the base case
		{
			return Integer.MAX_VALUE;
		}
		int min=Integer.MAX_VALUE;
		
		if(root.data>k)						//BASE CASE
		{
			min = root.data;

		}
		
		for(int i=0;i<root.children.size();i++)
		{
			int temp=nextLarger(root.children.get(i), k);
			if(temp<min)
			{
				min=temp;
			}
			//nextLarge = nextLarger(root.children.get(i), k);
		}

		return min;
	}
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		TreeNode<Integer> min = new TreeNode<Integer>(nextLarger(root, n));
		// Write your code here
        return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
