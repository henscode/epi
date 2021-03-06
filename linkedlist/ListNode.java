package linkedlist;

public class ListNode<T> {   
    public T data;
    public ListNode<T> next;
    
    public ListNode() {
        this.data = null;
        this.next = null; 
    }
    
    public ListNode(T data) {        
        this.data = data;
        next = null;
    }
    
    /*
     *    Create a new node and insert it at the end of list of the given node
     */    
   public static <T> ListNode<T> addLast(ListNode<T> aListNode, T aData) {
       ListNode<T> previousNode = null;
       while (aListNode != null) {
           previousNode = aListNode;   
           aListNode = aListNode.next; 
       } 
       aListNode = new ListNode<T>(aData); 
       previousNode.next = aListNode; 
       return aListNode;
   }
 
   // Insert aNewNode after aListNode   
   public static <T> void insertAfter(ListNode<Integer> aListNode, ListNode<Integer> aNewNode) {
       aNewNode.next = aListNode.next;        
       aListNode.next = aNewNode;   
   }
   
   // Delete the node following the given node    
   public static <T> void removeNode(ListNode<T> aListNode) {
       aListNode.next = aListNode.next.next;
   }
       
   public static <T> void print(ListNode<T> aListNode) {
       while (aListNode != null) {
           System.out.print(aListNode.data + " ");   
           aListNode = aListNode.next;      
       }
       System.out.println();    
   }
}
