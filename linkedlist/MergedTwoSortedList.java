public class MergeTwoSortedList {
	ListNode<Integer> list1 = new ListNode<Integer>(1);
	ListNode.addLast(list1, 3);
	ListNode.addLast(list1, 5);
	ListNode.print(list1);
    
    ListNode<Integer< list2 = new ListNode<Integer>(0);
	ListNode.addLast(list2, 2);
	ListNode.addLast(list2, 4);
	ListNode.addLast(list2, 6);
	ListNode.addLast(list2, 8);	
    ListNode.print(list2);
    ListNode.print(merge(list1, list2));
}

public static ListNode<Integer> merge(ListNode<Integer> list1, ListNode<Integer> list2) {
    ListNode<Integer> dummyHead = new ListNode<Integer>();
    ListNode<Integer> current = dummyHead;
    
    while (list1 != null && list2 != null) {
        if (list1.data > list2.data) {
            current.next = list1;
            list1 = list1.next;
        else {
            current.next = list2;
            list2 = liste2.next;
        }
        current = current.next;
    }
    
    current.next = list1 != null ? list1 : list2;
    return dummyHead.next;
}
