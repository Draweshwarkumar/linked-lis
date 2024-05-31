package linked_list;
import java.util.*;
public class mergesort {
	
	public static node<Integer> takeInput(){
		node<Integer> head = null,tail = null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while(data != -1) {
			node<Integer> newnode = new node<Integer>(data);
			if(head == null) {
				head = newnode;
				tail = newnode;
			}
			else {
				tail.next = newnode;
				tail = newnode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static node<Integer> findmid(node<Integer>head) {
		if(head == null) {
			return head;
		}
		node<Integer> slow = head , fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static node<Integer> meregetwolist(node<Integer>head1,node<Integer>head2){
		node<Integer> T1 = head1;
		node<Integer> T2 = head2;
		node<Integer> dnode = new node<Integer>(-1);
		node<Integer> temp = dnode;
		
		while(T1 != null && T2 != null) {
			if(T1.data < T2.data) {
				temp.next = T1;
				temp = T1;
				T1 = T1.next;
			}
			else {
				temp.next = T2;
				temp = T2;
				T2 = T2.next;
			}
			if(T1 != null) {
				temp.next = T1;
			}
			else{
				temp.next = T2;
			}
		}
		return dnode.next;
	}
	
	public static node<Integer> mergesort(node<Integer>head){
		if(head == null || head.next == null) {
			return head;
		}
		node<Integer>  middle = findmid(head);
		node<Integer> lefthead = head;
		node<Integer> righthead = middle.next;
		middle.next = null;
		
		node<Integer> left = mergesort(lefthead);
		node<Integer> right = mergesort(righthead);
		
		return meregetwolist(left,right);
	}
	
	public static void print(node<Integer>head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head= head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head1 = takeInput();
		node<Integer> ans = mergesort(head1);
		print(ans);
	}

}
