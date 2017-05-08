package strings;

public class Palindroximity {
	public static void main(String[] args) {
		/*
		 *  Ignore non-alphanumeric determine if palindrome
		 *  ignore capitalization
		 */
	    String input = "A ma##n, a plan, a canal, Panama"; 	
	    System.out.println("Input String: " + input);
	    System.out.println("Is Palindrome: " + isPalindrome(input));
	}
	
	public static boolean isPalindrome(String input) {
	    int low = 0;
	    int high = input.length() - 1;
	    
	    while (low < high) {
	    	while (!Character.isLetterOrDigit(input.charAt(low)) && low < high) {
	    		low++;
	    	}
	    	
            while (!Character.isLetterOrDigit(input.charAt(high)) && low < high) {
	    		high--;
	    	}
            
            if (Character.toLowerCase(input.charAt(low++)) != Character.toLowerCase(input.charAt(high--))) {
            	return false;
            }
	    }
	    
	    return true;
	}
}
