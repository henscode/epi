package stacksandqueues;

public class StackWithMax {
    private static class ElementWithMax {
        public Integer data;
        public Integer max;
        
        public ElementWithMax(Integer data, Integer max) {
            this.data = data;
            this.max = max;
        }
    }
    
    public Deque<ElementWithMax> elementsDeque = new LinkedList<ElementWithMax>();
    
    public boolean empty() {
        return elementsDeque.isEmpty();
    }
    
    public Integer max() {
        if (empty()) {
            throw new IllegalStateException("max(): empty stack");
        }
        return elementsDeque.peek().max;
    }
    
    public void push(Integer anInt) {
        int max = Math.max(anInt, empty() ? anInt : max());
        elementsDeque.addFirst(anInt, max));
    }
    
    public Integer pop() {
        if (empty()) {
            throw new IllegalStateException("pop(): empty stack");
        }
        return elements.Deque.removeFirst().data;
    }
    
    public static void main(String[] args) {
        StackWithMax stack = new StackWithMax();
        stack.push(1);
        stack.push(20);
        stack.push(3);
        stack.push(20);
        stack.push(40);
        System.out.println("Max: " + stack.max());
        stack.pop();
        System.out.println("Max: " + stack.max());
        stack.pop();
        System.out.println("Max: " + stack.max());
        stack.pop();
        System.out.println("Max: " + stack.max());
        stack.pop();
        System.out.println("Max: " + stack.max());
    }
}
