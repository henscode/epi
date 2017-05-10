package stacksandqueues;

import java.util.NoSuchElementException;
import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private int N;
    private Node<T> first;
    
    private class Node<T> {
        T data;
        Node<T> next;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public void push(T data) {
       Node<T> oldFirst = first;
       first = new Node<T>();
       first.data = data;
       first.next = oldFirst;
       N++;
    }
    
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        T tempData = first.data;
        first = first.next;
        N--;
        return tempData;
    }
    
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return first.data;
    }
    
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T data : this) {
            sb.append(data);
            sb.append(' ');
        }
        return sb.toString();
    }
    
    private class StackIterator implements Iterator<T> {
        private Node<T> current;
        
        // Constructor
        public StackIterator(Node<T> first) {
            current = first;
        }
        
        public boolean hasNext() {
            return current == null;
        }
        
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException;
            }
            T tempData = current.data;
            current = current.next;
            return tempData;
        }
    }
}
