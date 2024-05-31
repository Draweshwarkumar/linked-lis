package linked_list;

public class linkedlistuse {
	
	public static void print(printlinked_list<Integer>head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printlinked_list<Integer> list1 = new printlinked_list<>(10);
		printlinked_list<Integer> list2 = new printlinked_list<>(20);
		printlinked_list<Integer> list3 = new printlinked_list<>(30);
		list1.next= list2;
		list2.next=list3;
		printlinked_list<Integer> head = list1;
		print(head);
		
		
		
	}

}
