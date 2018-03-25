package trees;

import java.util.ArrayList;

public class TreeNode<T> 
{
	// TreeNode contains data(primitive) and children (array list<generic>)

	T data;  
	ArrayList<TreeNode<T>> children;

	public TreeNode(T data) 
	{	
		children = new ArrayList<>();
		this.data= data;
	}
}