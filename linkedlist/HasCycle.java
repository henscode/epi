package linkedlist;
public class HasCycle {    
  public static void main(String[] args) {        
    ListNode<Integer> list= new ListNode<Integer>(0);        
    ListNode.addLast(list, 1);        
    ListNode<Integer> startCycle = ListNode.addLast(list, 2);        
    ListNode.addLast(list, 3);        
    ListNode.addLast(list, 4);       
    ListNode<Integer> end= ListNode.addLast(list, 5);        
    end.next = startCycle;        
    System.out.println("Start of cycle is: " + hasCycle(list).data);   
  }
  
  public static ListNode<Integer> hasCycle(ListNode<Integer> head) {
    ListNode<Integer> slow = head;  
    ListNode<Integer> fast = head;  
    while (fast != null && fast.next != null) {
      slow = slow.next; 
      fast = fast.next.next; 
      if (slow == fast) { 
        // we have a cycle   
        // Determine cycle length  
        // iterate fast once        
        fast = fast.next;  
        int count = 1;  
        while (slow != fast) { 
          count++; 
          fast = fast.next;
        }    
        System.out.println("Cycle length: " + count);   
        // Determine start of cycle   
        fast = head;    
        while (slow != head) {    
          slow = slow.next;        
          fast = fast.next;     
        }          
      }      
    }  
    // null means no cycle
    return null;  
  }
}
