package linked_list;
import java.util.*;
public class findmid {
	
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
			data =  s.nextInt();
		}
		return head;
	}
	
	public static int findmid(node<Integer>head) {
		int count = 0;
		node<Integer> fast= head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			count++;
		}
		return count;
	}
	
	public static void print(node<Integer>head) {
		while(head!= null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head = takeInput();
		int m = findmid(head);
		System.out.println(m);
		print(head);

	}

}
