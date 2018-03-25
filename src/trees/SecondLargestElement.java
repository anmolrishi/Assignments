package trees;

import java.util.Scanner;

import stacks_queues.QueueUsingLL;
/*
 * Find the second largest value in generic tree
 */
public class SecondLargestElement {
	
	public class Pair<T>  
	{   // T is generic 
		public T first;
		public T second;


		public T getFirst()
		{
			return first;
		}

		public T getSecond()
		{
			return second;
		}

	}

	public static Pair<Integer> secondLargest(TreeNode<Integer>root) 

	{    // time complexity = number of nodes
		// space complexity = height 
		if(root==null)
		{   SecondLargestElement s = new SecondLargestElement();
		Pair<Integer> ans = s.new Pair<>();
		ans.first = Integer.MIN_VALUE;
		ans.second = Integer.MIN_VALUE;
		return ans;
		}
		SecondLargestElement s = new SecondLargestElement();
		Pair<Integer> ans = s.new Pair<>();
		ans.first = root.data;
		ans.second = null;

		for(TreeNode<Integer>child: root.children)
		{
			Pair<Integer>childAns = secondLargest(child);
			if(childAns.first>ans.first)
			{
				if(childAns.second==null||childAns.second<ans.first){
					ans.second = ans.first;
					ans.first = childAns.first;
				}
				else{
					ans.first = childAns.first;
					ans.second = childAns.second;
				}
			}	
			else
			{
				if(ans.second==null||ans.second<childAns.first)
				{
					ans.second = childAns.first;
				}
			}
		}
		return ans;
	}


	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
		SecondLargestElement s = new SecondLargestElement();
		Pair<Integer> ans = s.new Pair<>();
		ans = secondLargest(root);
		TreeNode<Integer> t = new TreeNode<Integer>(ans.second);
		return t; 

	}
	
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
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInputLevel();
		TreeNode<Integer> root1 = findSecondLargest(root);
		System.out.println(root1.data);
	}

}
