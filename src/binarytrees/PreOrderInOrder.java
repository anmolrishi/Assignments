package binarytrees;

import java.util.Scanner;

import stacks_queues.QueueUsingLL;
/*
 * Given pre-order and In order create the unique tree associated with that
 * Note: Both pre-order And In order will not contains any repeated elements *.
 */
public class PreOrderInOrder 
{
	 public static BinaryTreeNode<Integer> buildTreeFromInPre(int[] in,int[]pre,int inS, int inE,int preS, int preE)
		{
			if(preS>preE)  // base case: tree has been traversed 
			{
				return null;
			}

			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[preS]);
			// root = start of pre-order  

			int i = inS;
			while(i<=inE)
			{
				if(in[i]==pre[preS])
				{
					break;
				}

				i++;	
			}

			int leftInS  = inS ;
			int leftInE = i-1;
			int leftPreS = preS+1;
			int leftLength = leftInE - leftInS +1;
			int leftPreE = leftPreS + leftLength -1;

			int rightInS = i+1;
			int rightInE = inE;
			int rightPreS = leftPreE + 1;
			int rightPreE = preE;

			root.left  = buildTreeFromInPre(in, pre, leftInS, leftInE, leftPreS, leftPreE);
			root.right = buildTreeFromInPre(in, pre, rightInS, rightInE, rightPreS, rightPreE);

			return root;
		}


		public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,int[] in)
		{
				BinaryTreeNode<Integer> root1 = buildTreeFromInPre(in, pre, 0, in.length-1, 0, pre.length-1);
				return root1;
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

			String toBePrinted = root.data+"";
			if(root.left!=null)
			{toBePrinted+=root.left.data+" ";}

			if(root.right!=null)
			{toBePrinted+=root.right.data+" ";}

			System.out.println(toBePrinted);
			print(root.left);
			print(root.right);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = {2,9,4,5,6,7,3};
		int pre[] = {6,9,2,4,5,3,7};
		BinaryTreeNode<Integer> root1 = buildTreeFromInPre(in, pre, 0, in.length-1, 0, pre.length-1);
		print(root1);
	}

}
