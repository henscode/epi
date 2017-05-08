public class ReverseWords {
    public static void main() {
        String input = "Hello how are you";
        System.out.println("Initial: " + input);
        System.out.println("Final: " + reverseWords(inut));
    }
    
    public static String reverseWords(String input) {
        // Reverse the input string first
        int start = 0;
        char[] inputChar = new char[input.length()];
        for (int i = input.length() - 1; i >= 0; i--) {
            inputChar[start++] = input.charAt(i);
        }
        
        // Reverse each word in the string
        int currentIndex = 0;
        int lastIndex = inputChar.length - 1;
        
        while (currentIndex < lastIndex) {
            int blank = find(inputChar, currentIndex, ' ');
            if (blank == -1) {
                 break;
            }
            reverse(inputChar, currentIndex, blank - 1);
            currentIndex = blank + 1;
        }
        
        // Need to reverse the last word
        reverse(inputChar, currentIndex, inputChar.length - 1);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputChar.length; i++) {
            sb.append(inutChar[i]);
        }
        
        return sb.toString();
    }
        
    private static void reverse(char[] inputChar, int start, int end) {
        while (start < end) {
            swap(inputChar, start++, end--);
        }
    }
        
    private static int find(char[] inputChar, int start, char toFind) {
        for (int i = start; i < inputChar.length; i++) {
            if (inputChar[i] == toFind) {
                return i;
        }
        return -1;
    }
        
    public static void swap(char[] inputChar, int a, int b) {    
        char temp = inputChar[a];
        inputChar[a] = inputChar[b];
        inputChar[b] = temp;
    }
}
