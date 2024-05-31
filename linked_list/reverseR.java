package linked_list;
import java.util.Scanner;
public class reverseR {

	public static node<Integer> takeInput(){
		node<Integer> head=null,tail = null;
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
	
	public static node<Integer> reverseR(node<Integer>head){
		if(head == null || head.next == null) {
			return head;
		}
		node<Integer> finalhead = reverseR(head.next);
		node<Integer> temp = finalhead;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		head.next = null;
		return finalhead;
	}
	
	public static void print(node<Integer>head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		node<Integer> head = takeInput();
		node<Integer> ans = reverseR(head);
		print(ans);
	}

}
