package linked_list;
import java.util.*;

public class mergetwosorted {
	
	public static node<Integer> takeInput(){
		node<Integer> head1 = null,tail1 = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
		node<Integer> newnode = new node<Integer>(data);
		if(head1 == null) {
			head1 = newnode;
			tail1 = newnode;
		}
		else {
			tail1.next = newnode;
			tail1 = newnode;
		}
		data = s.nextInt();
	}
		return head1;
	}
	
	public static node<Integer> takeInput2(){
		node<Integer> head2 = null,tail2 = null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while(data != -1) {
			node<Integer> newnode = new node<Integer>(data);
			if(head2 == null) {
				head2 = newnode;
				tail2 = newnode;
			}
			else {
				tail2.next = newnode;
				tail2 = newnode;
			}
			data = s.nextInt();
		}
		return head2;
	}
	
	public static node<Integer> merge(node<Integer>head1,node<Integer>head2){
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
		}
		if(T1 != null) {
			temp.next = T1;
		}
		else {
			temp.next = T2;
		}
		return dnode.next;
	}

	public static void print(node<Integer> head1) {
		while(head1 != null) {
			System.out.print(head1.data+" ");
			head1 = head1.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head = takeInput();
		node<Integer> head1 = takeInput2();
		node<Integer> result = merge(head,head1);
		print(result);
//		print(head);
//		print(head1);

	}

}
