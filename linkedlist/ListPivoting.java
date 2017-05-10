package linkedlist;

public class ListPivoting {
	public static void main(String[] args) {
		ListNode<Integer> listB = new ListNode<Integer>(3);
		ListNode.addLast(listB, 2);
		ListNode.addLast(listB, 2);	
		ListNode.addLast(listB, 11);
		ListNode.addLast(listB, 7);
		ListNode.addLast(listB, 5);
		ListNode.addLast(listB, 11);
		System.out.println("Initial: ");
		ListNode.print(listB);
		System.out.println("Final: ");
		ListNode.print(pivot(listB, 7));
	}
	
	
	public static ListNode<Integer> pivot(ListNode<Integer> head, int pivot) {
		ListNode<Integer> lessHead = new ListNode<Integer>();
		ListNode<Integer> equalHead = new ListNode<Integer>();
		ListNode<Integer> greaterHead = new ListNode<Integer>();
		ListNode<Integer> lessThanRunner = lessHead;
		ListNode<Integer> equalRunner = equalHead;
		ListNode<Integer> greaterThanRunner = greaterHead;
		ListNode<Integer> current = head;
		
		
		while (current != null) {
		    if (current.data < pivot) {
		    	// Very tricky
		    	lessThanRunner.next = current;
		    	lessThanRunner = current;
		    } else if (current.data == pivot) {
		    	equalRunner.next = current;
		    	equalRunner = current;
		    } else {
		    	greaterThanRunner.next = current;
		    	greaterThanRunner = current;
		    }
			current = current.next;
		}
		
		greaterThanRunner.next = null;		
		equalRunner.next = greaterHead.next;		
		lessThanRunner.next = equalHead.next;	
		return lessHead.next;
	}	
}
