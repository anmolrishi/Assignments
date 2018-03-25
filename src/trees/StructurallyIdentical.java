package trees;

public class StructurallyIdentical {
/*
 * Given two Generic trees, return true if they are structurally identical i.e. 
 * they are made of nodes with the same values arranged in the same way.
 */
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
		int i;
		int j;
		
        if (root1 == null && root2 == null)  // both trees are empty 
            return true;
            
             boolean ans=false;
             
        // both trees, not being null, have to be compared 
            if (root1.data == root2.data)
            {  i=0;j=0;
                while(i<root1.children.size() && j<root2.children.size())
            	{
            	    ans =  checkIdentical(root1.children.get(i),root2.children.get(j));
            	    if(!ans){
            	        return false;
            	    }
            	    i++;j++;
            	}
            	return true;
            	
             }
             
        return ans;  // one of the trees is empty 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
