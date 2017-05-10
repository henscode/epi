package stacksandqueues;

import linkedlist.ListNode;
import java.util.Deque;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode<Character> list = new ListNode<Character>('A');
        ListNode.addLast(list, 'B');
        ListNode.addLast(list, 'C');
        ListNode.addLast(list, 'D');
        ListNode.addLast(list, 'E');
        
        System.out.print("Initial: ");
        ListNode.print(list);
        System.out.print("Reversed: ");
        printReversed(list);
    }
    
    public static void printReversed(ListNode<T> head) {
        Deque<Character> deque = new LinkedList<Character>();
        while (head != null) {
            deque.addFirst(head.data);
            head = head.next;
        }
        
        while (!deque.isEmpty()) {
            System.out.print(deque.poll() + " ");
        }
    }
}
