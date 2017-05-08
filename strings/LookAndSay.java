public class LookAndSay {
    public static void main(String[] args) {
        System.out.println("Look and Say 9: " + lookAndSay(9));
    }
    
    public static String lookAndSay(int size) {
       // Initialize to 1
       String currentString = "1";
       // We start at 1
       for (int i = 1; i < size; i++) {
           currentString = nextNumber(currentString);
       }
       return currentString;
    }
    
    private static String nextNumber(String inString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inString.length(); i++) {
            int count = 1;
            while (i + 1 < inString.length() && inString.charAt(i) == inString.charAt(i + 1)) {
                i++;
                counter++;
            }
            result.append(count);
            result.append(inString.charAt(i));
        }
        return result.String();
    }
}
