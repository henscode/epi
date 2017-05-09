package linkedlist;

public class OverLappingNoCycleLists {
	public static void main(String[] args) {
		ListNode<Integer> listA = new ListNode<Integer>(1);
		ListNode.addLast(listA, 2);
		ListNode<Integer> common = ListNode.addLast(listA, 3);
		
		ListNode<Integer> listB = new ListNode<Integer>(5);
		ListNode.addLast(listB, 6);
		ListNode<Integer> whatever =ListNode.addLast(listB, 7);
		ListNode.insertAfter(whatever, common);		
		ListNode.addLast(listB, 8);
		ListNode.addLast(listB, 9);
		
		ListNode.print(listA);
		System.out.println();
		ListNode.print(listB);
		System.out.print("Overlap: " + findOverlap(listA, listB).data);
	}
	
	public static ListNode<Integer> findOverlap(ListNode<Integer> listA, ListNode<Integer> listB) {
		int lengthA = length(listA);
		int lengthB = length(listB);
		
		if (lengthA > lengthB) {
			listA = advanceList(listA, lengthA - lengthB);
		} else {
			listB = advanceList(listB, lengthB- lengthA);
		}
		
		while (listA != null && listB != null && listA != listB) {
			listA = listA.next;
			listB = listB.next;
		}
		
		return listA;
	}
	
	private static ListNode<Integer> advanceList(ListNode<Integer> list, int k) {
		while (k > 0) {
			list = list.next;
			k--;
		}
		return list;
	}
	
	private static int length(ListNode<Integer> list) {
		int count = 0;
		while (list != null) {
			count++;
			list = list.next;
		}
		return count;
	}
}
