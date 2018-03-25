package trees;

import java.util.Scanner; 
import stacks_queues.QueueUsingLL;
/*
 * Find the node for which sum of the data of all children and the node itself is maximum.
 */
public class MaxNodeSumChild {

	public static TreeNode<Integer> takeInputLevel() throws Exception
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter root");
		int rootData = s.nextInt();

		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		QueueUsingLL<TreeNode<Integer>>pendingNodes = new QueueUsingLL<>();

		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty())

		{
			TreeNode<Integer>currentNode = pendingNodes.dequeue();
			System.out.println("Enter the number of childnodes of"+currentNode.data);
			int numChild=s.nextInt();

			for(int i=0;i<numChild;i++)
			{
				System.out.println("Enter"+i+"th child of"+currentNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				pendingNodes.enqueue(child);
				currentNode.children.add(child);
			}
		}
		s.close();
		return root;
	}

	public static void print(TreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		String toBePrinted = root.data+"";
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer>currentChild = root.children.get(i);
			toBePrinted+=currentChild.data+"";
		}
		System.out.println(toBePrinted);
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer>currentChild = root.children.get(i);
			print(currentChild);
		}
	}

	public static returnMaxSumNode maxSumNodeHelper(TreeNode<Integer> root){
		if(root==null)
		{
			return null;
		}

		returnMaxSumNode ans = new returnMaxSumNode();
		ans.tree = root;
		ans.sum=root.data;

		for(TreeNode<Integer> child : root.children)
		{
			ans.sum+=child.data;

		}

		for(TreeNode<Integer> i : root.children)
		{
			returnMaxSumNode temp = maxSumNodeHelper(i);
			if(temp.sum > ans.sum)
			{
				ans.sum = temp.sum;
				ans.tree = temp.tree;
			}
		}
		return ans;


	}

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){

		returnMaxSumNode answer = maxSumNodeHelper(root);
		TreeNode<Integer> a = answer.tree;
		return a;
		// Write your code here
	}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInputLevel();
	}

}

class returnMaxSumNode
{
	public int sum;
	public TreeNode<Integer> tree;
}