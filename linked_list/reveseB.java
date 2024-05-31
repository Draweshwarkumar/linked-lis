package linked_list;
import java.util.*;
public class reveseB {

	public static doublenode reverselistB(node<Integer>head) {
		if(head == null || head.next == null ) {
			doublenode ans = new doublenode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		doublenode smallans = reverselistB(head.next);
		smallans.tail.next = head;
		head.next = null;
		
		doublenode ans = new doublenode();
		ans.head = smallans.head;
		ans.tail = head;
		return ans;
	}
	
	public static node<Integer> takeInput(){
		node<Integer> head = null,tail = null;
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
	
	public static void print(node<Integer>head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main (String [] args) {
		node<Integer> head = takeInput();
		doublenode ans = reverselistB(head);
		print(ans.head);
	}
}
