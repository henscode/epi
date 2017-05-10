package linkedlist;

public class AddTwoNumbersReversed {
	public static void main(String[] args) {
		ListNode<Integer> listA = new ListNode<Integer>(3);
		ListNode.addLast(listA, 1);
		ListNode.addLast(listA, 4);	
		System.out.print("1st number: ");
		ListNode.print(listA);
		
		ListNode<Integer> listB = new ListNode<Integer>(7);
		ListNode.addLast(listB, 0);
		ListNode.addLast(listB, 9);	
		System.out.print("2nd number: ");
		ListNode.print(listB);
		System.out.print("Sum: ");
		ListNode.print(add(listA, listB));
	}
	
	public static ListNode<Integer> add(ListNode<Integer> listA, ListNode<Integer> listB) {
		// 413 + 907
		ListNode<Integer> dummyHead = new ListNode<Integer>();
		ListNode<Integer> current = dummyHead;
		int carry = 0;
		
		while (listA != null || listB != null) {
			int sum = carry;
			if (listA != null) {
				sum += listA.data;
				listA = listA.next;
			}
			
			if (listB != null) {
				sum += listB.data;
				listB = listB.next;
			}
			
			current.next = new ListNode<Integer>(sum % 10);
			carry = sum / 10;
			current = current.next;
		}
		
		if (carry > 0) {
			current.next = new ListNode<Integer>(carry);
		}
		
		return dummyHead.next;
	}
}
