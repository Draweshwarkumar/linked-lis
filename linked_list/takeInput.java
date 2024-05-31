package linked_list;
import java.util.Scanner;

public class takeInput {
	
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
	
	public static node<Integer> insert(node<Integer>head,int data,int pos){
		node<Integer> newnode = new node<Integer>(data);
		if(pos == 0) {
			newnode.next = head;
			return head;
		}
		int i = 0;
		node<Integer> temp = head;
		while(i<pos-1) {
			
			temp = temp.next;
			i++;
		}
		newnode.next = temp.next;
		temp.next = newnode;
		return head;
	}
	
	public static void print (node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		node<Integer> head = takeInput();
		head = insert(head,80,0);
		print(head);
		// TODO Auto-generated method stub
//		node<Integer> node1 = new node<>(10);
//		node<Integer> node2 = new node<>(25);
//		node<Integer>node3 = new node<>(20);
//		node<Integer>node4 = new node<>(30);
//		node1.next= node2;
//		node2.next=node3;
//		node3.next=node4;
//		
//		node<Integer> head = node1;
//		print(head);
		
		
	}

}
