package linked_list;
import java.util.*;
public class insert_recursively {
	
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
				tail.next  = newnode;
				tail = newnode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static node<Integer> insert(node<Integer>head,int pos,int data){
		if(pos == 0) {
			node<Integer> newnode = new node<Integer>(data);
			newnode.next = head;
			return newnode;
		}
		
		if(head == null) {
			return head;
		}
		head.next = insert(head.next,pos-1,data);
		return head;
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
		head = insert(head,2,5);
		print(head);

	}

}
