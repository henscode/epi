public class ReverseSubList {
    public static void main(String[] args) {
        ListNode<Integer> list = new ListNode(1);
        ListNode.add(list, 2);
        ListNode.add(list, 3);
        ListNode.add(list, 4);
        ListNode.add(list, 5);
        ListNode.add(list, 6);
        ListNode.add(list, 7);
        
        ListNode.print(list);
        ListNode.print(reverse(list, 3, 6);
    }
    
    public static reverse(ListNode<Integer> list, int start, int end) {
        ListNode<Integer> dummyHead = new ListNode(list, 0);
        ListNode<Integer> subHead = dummyHead;
        int count = 1;
        
        while (count < start)
            subHead = subHead.next;
        }
        
        ListNode<Integer> subList = subHead.next;
        
        while (start < end) {
            ListNode<Integer> temp = subList.next;
            subList.next = temp.next;
            temp.next = subHead.next;
            subHead.next = temp;
            start++;
        }
        
        
        return dummyHead.next;
    }
}
