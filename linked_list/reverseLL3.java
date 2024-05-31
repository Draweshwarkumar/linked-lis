package linked_list;
import java.util.*;
public class reverseLL3 {
	
	public static node<Integer> reverselist(node<Integer>head){
		if(head == null || head.next == null) {
			return head;
		}
		
		node<Integer> reversedtail = head.next;
		node<Integer> ans = reverselist(head.next);
		reversedtail.next = head;
		head.next = null;
		
		return ans;
	}
	
	public static node<Integer> takeInput(){
		node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
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
	
	public static void print(node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head = takeInput();
		node<Integer> ans = reverselist(head);
		print(ans);
		

	}

}
