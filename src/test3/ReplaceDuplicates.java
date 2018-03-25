package test3;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Replace duplicate values
Given a linked list that contain some random integers from 1 to n 
with many duplicates. You need to replace each duplicate element that
 is present in the linked list with the values n+1, n+2, and so on
 (starting from left to right in given LL).
 */
/* Sample Input                Sample Output 
 * 1 3 1 4 4 2 1 -1            1 3 5 4 6 2 7
 */
public class ReplaceDuplicates {

	public static int big(int[] arr) {
		if(arr.length==0){
			return 0;
		}
		
		int big = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(big<arr[i]){
				big = arr[i];
			}
		}
		return big;
		
	}
    
    public static void changeLL(LinkedListNode<Integer> head) {
		// Write your code here
		
		if(head==null){
			return;
		}
		
	
		ArrayList<Integer> arr = new ArrayList<>();

		LinkedListNode<Integer> temp1=head;

		while(temp1!=null){
			arr.add(temp1.data);
			temp1 = temp1.next;
		}
		
		int[] ans = new int[arr.size()];
		
		for(int i=0;i<arr.size();i++){
			ans[i] = arr.get(i);
		}
		
		int n = big(ans);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		LinkedListNode<Integer> temp=head;

		while(temp!=null){
			
			if(map.containsKey(temp.data)){
				
				temp.data = ++n;
				
				
			}else if(!map.containsKey(temp.data)){
				map.put(temp.data, 1);
			}else{
				int OldValue = map.get(temp.data);
				map.put(temp.data,OldValue+1);
			}
			
			temp = temp.next;
		}


		
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
