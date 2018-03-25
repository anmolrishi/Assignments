package binsearchtrees;
import java.util.ArrayList;
import java.util.Arrays;
import stacks_queues.QueueUsingLL;
/*
 * Given a binary tree and an integer S, print all the pair of 
 * nodes whose sum equals S.Assume binary tree contains all unique elements.
 * Note : In a pair, print the smaller element first.
 */
public class PairSumBinTree {

	public static void pairSum(ArrayList<Integer> arr1, int num){
		//write your code here
		int[] arr = new int[arr1.size()];
		for (int i=0;i<arr1.size();i++){
			arr[i] = arr1.get(i);
		}
		
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++){
		    
		    for (int j=i+1;j<arr.length;j++){
		        if((arr[i]+arr[j])==num)
		            {
		                System.out.println(arr[i] + " " + arr[j]);
		            }
		            
		    }
		}
		
	}
	
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

	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		// Write your code here
		ArrayList<Integer> a = array(root);
		pairSum(a,sum);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
