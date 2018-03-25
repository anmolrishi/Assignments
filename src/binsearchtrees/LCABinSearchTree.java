package binsearchtrees;

import java.util.ArrayList;
/*
 * Given a binary search tree and two nodes, find LCA(Lowest Common Ancestor) of 
 * the given two nodes in the BST. Read about LCA if you are having doubts about the definition.
 * If out of 2 nodes only one node is present, return that node.
 * If both are not present, return -1.
 */
public class LCABinSearchTree {

	public static ArrayList<Integer> findPathRootToNode(BinaryTreeNode<Integer> root,int num) 
	{
		if(root==null)
		{
			return null;
		}

		ArrayList<Integer> ans = new ArrayList<>();

		if(root.data==num)
		{
			ans.add(root.data);
			return ans;
		}

		ArrayList<Integer> left = findPathRootToNode(root.left, num);
		ArrayList<Integer> right = findPathRootToNode(root.right, num);

		if(left!=null && left.size()!=0)
		{
			left.add(root.data);
			return left;
		}

		if(right!=null && right.size()!=0)
		{
			right.add(root.data);
			return right;
		}

		return new ArrayList<>();

	}

	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		// Write your code here
		ArrayList<Integer> path1 = findPathRootToNode(root, a);
		ArrayList<Integer> path2 = findPathRootToNode(root, b);

		for (int i=0;i<path1.size();i++)
		{
			for (int j=0;j<path2.size();j++)
			{
				if(path1.get(i)==path2.get(j))
				{
					return (path1.get(i));
					
				}
			}

		}
		return -1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
