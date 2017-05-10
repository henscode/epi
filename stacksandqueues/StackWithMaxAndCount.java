package stacksandqueues;

public class StackWithMaxAndCount {
    private class MaxAndCount {
        public Integer max;
        public Integer count;
        
        public MaxAndCount(Integer max, Integer count) {
            this.max = max;
            this.count = count;
        }
   }     
   private Deque<Integer> elementsDeque = new LinkedListt<MaxAndCount>();
   private Deque<MaxAndCount> maxAndCountDeque = new LinkedList<MaxAndCount>();
        
   public boolean empty() {
       return elementsDeque.isEmpty();
   }
        
   public Integer max() {
       if (empty()) {
           throw new IllegalStateException("max(): empty stack");
       }
           
       return maxAndCountDequeu.peekFirst().max;
   }
        
   public void push(Integer anInt) {
       elementsDeque.addFirst(anInt);
            
       if (maxAndCountDeque.isEmpty()) {
           maxAndCountDeque.addFirst(new MaxAndCount(anInt, 1);
           return;
       )
            
       // At this point, we are sure maxAndCountDeque is not empty
       int currentMax = maxAndCountDeque.peekFirst().max;
       int compare = Integer.compare(anInt, currentMax);
            
       if (compare == 0) {
           maxAndCountDequeu.peekFirst().count += 1;
       } else if (compare > 0) {
           maxAndCountDeque.addFirst(new maxAndCount(anInt, 1));
       }
   }
        
   public Integer pop() {
       if (empty()) {
           throw new IllegalStateException("pop(): empty stack");
       }
            
       Integer popElement = elementsDeque.removeFirst();
       if (popElement.equals(maxAndCountDeque.peekFirst().max)) {
           maxAndCountDeque.peekFirst().count -= 1;
           if (maxAndCountDeque.peekFirst.count.equals(0)) {
               maxAndCountDeque.removeFirst();
           }                
      }
           
      return popElement;
   }
   
   public static void main(String[] args) {
   }
}
