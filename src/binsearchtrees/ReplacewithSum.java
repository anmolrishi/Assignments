package binsearchtrees;

import java.util.ArrayList;
import stacks_queues.QueueUsingLL;
/*
 * Given a binary search tree, replace each nodes' data with the sum of all 
 * nodes' which are greater or equal than it. You need to include the current 
 * node's data also.That is, if in given BST there is a node with data 5, you
 * need to replace it with sum of its data (i.e. 5) and all nodes whose data is
 *  greater than or equal to 5. You don't need to return or print, just change 
 *  the data of each node.
 */
public class ReplacewithSum {

	public static ArrayList<Integer> array(BinaryTreeNode<Integer> root) {
		if(root == null){
			return null;
		}

		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		ArrayList<Integer> ans = new ArrayList<>();
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){


			int countNodes = pendingNodes.size();

			while(countNodes>0){
				BinaryTreeNode<Integer> print = pendingNodes.dequeue();
				ans.add(print.data);

				if(print.left!=null){
					pendingNodes.enqueue(print.left);

				}
				if(print.right!=null){
					pendingNodes.enqueue(print.right);

				}


				countNodes--;
			}

		}
		return ans;

	}

	public static int sumNodeArrayList(ArrayList<Integer> input,int data) {
		if(input.size()==0){
			return 0;
		}

		int sum=0;

		for (int i=0;i<input.size();i++){
			if(input.get(i)>data){
				sum+=input.get(i);
			}
		}
		return sum;
	}

	public static void replace(ArrayList<Integer> input,BinaryTreeNode<Integer> root) {
		if(root==null){
			return;
		}

		root.data += sumNodeArrayList(input,root.data);

		replace(input,root.left);
		replace(input,root.right);

	}

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		ArrayList<Integer> a = array(root);
		replace(a,root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
