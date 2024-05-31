package linked_list;
import java.util.*;

public class deletenode {
	
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
	
	public static node<Integer> delete (node<Integer>head,int pos){
		if(head == null || pos < 0) {
			return head;
		}
		if(pos == 0) {
			head = head.next;
			return head;
		}
		node<Integer> temp = head;
		  for (int i = 0; i < pos - 1; i++) {
	            if (temp == null || temp.next == null) {
	                return head;
	            }
	            temp = temp.next;
	        }
	        if (temp.next != null) {
	            temp.next = temp.next.next;
	        }
	        return head;
	    }
	
	public static void print(node<Integer>head) {
		while(head!= null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head = takeInput();
		head = delete(head,2);
		print(head);

	}

}
