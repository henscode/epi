package stacksandqueues;

public class IsWellFormed {
    public static void main(String[] args) {
        // must only contain these 3 kinds of parenthesis
        String input = "([]){()}";
        System.out.println("Well-formed: " + isWellFormed(input));
    }
    
    public static boolean isWellFormed(String inString) {
        Deque<Character> leftCharsDeque = new LinkedList<Character>();
        for (int i = 0; i < inString.length(); i++) {
            char currentChar = inString.charAt(i);
            if (currentChar == '(' ||
                currentChar == '[' ||
                currentChar == '{')
                leftCharsDeque.addFirst(currentChar);
            } else {
                if (lefCharsDeque.isEmpty()) {
                    return false;
                }
                if ((currentChar == ')' and leftCharsDeque.peekFirst() != '(') ||
                    (currentChar == ']' and leftCharsDeque.peekFirst() != '[') ||
                    (currentChar == '}' and leftCharsDeque.peekFirst() != '{')) {
                    return false;
                }
                leftChars.Deque.removeFirst();
            }
        }
    }
    return leftChars.Deque.isEmpty();
}
