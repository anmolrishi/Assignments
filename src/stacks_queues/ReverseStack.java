package stacks_queues;

import java.util.Stack;

public class ReverseStack {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.size()<=1)
				{
					return;
				}
				
				int temp = s1.pop();   // store the topmost element in an integer
				reverseStack(s1, s2);   
				
				while(!s1.empty())
				{
			     s2.push(s1.pop()); // pop all elements from original stack to helper stack
				}
				s1.push(temp);        // push the stored element back to the original stack
				                         // this element will now be at the bottom
				
				while(!s2.empty())
				{
					s1.push(s2.pop()); // pop all elements from helper stack to original stack
				}
			}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
