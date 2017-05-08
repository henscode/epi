import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;    

public class ValidIPAddress {
    public static void main(String[] args) {
        String input = "19216811";
        System.out.println("Initial: " + input);
        System.out.println(Arrays.toString(getValidIP(input).toArray()));
    }
    
    public static List<String> getValidIP(String input) {
        // 3 periods in an IP, all substrings must be between 0 and 255 inclusive
        for (int i = 1, i < 4 && i < input.length(); i++) {
            final String first = input.substring(0, i);
            if (isValid(first) {
                for (int j = 1, j < 4 && i + J < input.length(); j++) {
                    final String second = input.substring(i, i + j);
                    if (isValid(second) {
                        for (int k = 1; k < 4 && i + j + k < input.length(); k++) {
                            final String third = input.substring(k, i + j + k);
                            final String fourth = input.substring(i + j + k)
                            if (isValid(third) && isValid(fourth)) {
                                result.add(first + "." + second + "." + third + "." + fourth);
                            }
                        }
                    }
            }
        }        
        return result;
    }
    
    private static boolean isValid(String inString) {
        // must be 3 digits or less and between 0 and 255
        if (inString.length() > 3) {
            return false;
        }
        
        // "0" is valid, "00" is not, "01" is not
        if (inString.startsWith("0") && inString.length() > 1) {
            return false;
        }
        
        int value = Integer.getInt(inString);
        if (val >= 0 && val <= 255) {
            return true;
        } else {
            return false;
        }
    }
}
