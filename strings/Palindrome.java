public class Palindrom {
    /*
    *  Palindrome is a string that reads the same when reversed
    */
    public static void(String[] args) {
        String[] input = new String[4];
        input[0] = "Hello World";
        input[1] = "Arra";
        input[2] = "arra";
        input[3] = "arLra";
        
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + " is Palindrome: " + isPalindrome(input[i]));
        }
    }
    
    public static boolean isPalindrome(String input) {
        int low = 0;
        int high = input.length - 1;
        while (low < high) {
            if (input.charAt(low) !- input.charAt(high) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
