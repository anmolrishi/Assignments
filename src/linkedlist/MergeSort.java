package linkedlist;

public class MergeSort {

	public static LinkedListNode<Integer> MergeSortedLinkedLists(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2) {
		LinkedListNode<Integer> FinalHead=null;
		LinkedListNode<Integer> temp1=head1, temp2=head2;
		if(head1.data<head2.data){
			FinalHead = head1;
			temp1 = head1.next;
		}
		else{
			FinalHead = head2;
			temp2 = head2.next;
		}

		LinkedListNode<Integer> prev = FinalHead;
		while(temp1!=null && temp2!=null){
			if(temp1.data < temp2.data){
				prev.next=temp1;
				prev=temp1;
				temp1=temp1.next;
			}
			else{
				prev.next=temp2;
				prev=temp2;
				temp2=temp2.next;
			}

		}
		if(temp1!=null){		
			prev.next=temp1;
		}
		else{
			prev.next=temp2;
		}

		return FinalHead;

	}

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if(head.next==null){
			return head;
		}

		int count =0;
		LinkedListNode<Integer> p=head;
		while(p.next!=null){
			++count;
			p=p.next;
		}
		int rev=count/2 + 1;
		LinkedListNode<Integer> prev=null;
		int i=0;
		p=head;
		while(i<rev){
			prev = p;
			i++;
			p=p.next;
		}
		prev.next=null;

		return MergeSortedLinkedLists(mergeSort(p), mergeSort(head));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
