package binarytrees;

import java.util.ArrayList;
import java.util.Scanner;
import stacks_queues.QueueUsingLL;

public class EachLevelLL {


	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) throws Exception{
	
	if(root==null){
		return null;
	}
	
	ArrayList<Node<BinaryTreeNode<Integer>>> ans = new ArrayList<>();

	QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
	pendingNodes.enqueue(root);

	while(!pendingNodes.isEmpty()){
		int countNodes = pendingNodes.size();
		Node<BinaryTreeNode<Integer>> head = new Node<>(null);
		Node<BinaryTreeNode<Integer>> p = new Node<>(null);
		while(countNodes>0){
			
			BinaryTreeNode<Integer> temp=null;
			temp = pendingNodes.dequeue();
			if(head.data==null){
				head.data = temp;
				p=head;
			}
			else{
				Node<BinaryTreeNode<Integer>> newNode = new Node<>(temp);
			//	newNode.setData(temp);
			//	p.setNext(newNode);
			    p.next = newNode;
				p=newNode;
			}
			
			if(temp.left!=null){
				pendingNodes.enqueue(temp.left);
			}
			
			if(temp.right!=null){
				pendingNodes.enqueue(temp.right);
			}
			countNodes--;
		}
		
		ans.add(head);
	}
	
	return ans;
	
}
	public static BinaryTreeNode<Integer> takeinputlevelwise() 
	{
		QueueUsingLL<BinaryTreeNode<Integer>>pendingNodes = new QueueUsingLL<>();

		Scanner s = new Scanner(System.in);

		System.out.println("Enter root: ");
		int rootData = s.nextInt();

		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> currentNode = pendingNodes.dequeue();

			System.out.println("Enter left child of "+ currentNode.data);
			int leftData= s.nextInt();

			if(leftData!=-1)
			{
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftData);
				pendingNodes.enqueue(leftChild);
				currentNode.left = leftChild;

			}

			System.out.println("Enter right child of"+ currentNode.data);
			int rightData= s.nextInt();

			if(rightData!=-1)
			{
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightData);
				pendingNodes.enqueue(rightChild);
				currentNode.right = rightChild;

			}
		}
		s.close();
		return root;
	}

	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}

		String toBePrinted = root.data+" : ";
		if(root.left!=null)
			toBePrinted+=root.left.data+" , ";

		if(root.right!=null)
			toBePrinted+=root.right.data+" ";

		System.out.println(toBePrinted);
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
