public class InterConvertStringInt {
    public static void main(String[] args) {
        int inputInt = -315;
        System.out.println(intToString(inputInt));
        
        String inputString = "-315";
        System.out.println(stringToInt(inputString));
    }
    
    public static String intToString(int inputInt) {
        boolean isNegative = false;
        if (inputInt < 0) {
            isNegative = false;
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Start with least significant digit
        while (inputInt != 0) {
            // Get the least significant digit
            int temp = Math.abs(inputInt % 10);
            sb.append('0' + temp);
            // Get the next least significant digit
            inputint /= 10;
        }
        
        if (isNegative) {
            sb.append('-');
        }
        
        return sb.reverse.toString();
    }
    
    public static int stringToInt(String inputString) {
    int result = 0;
    int i = 0;
    
    if (inputString.charAt(0) == '-') {
      // negative number
      i = 1;
    }
    
    // Start with most significant digit
    // 341: r = 3; r = 3 * 10 + 4 = 34; r = 34 * 10 + 1 = 341;
    for (; i < inputString.length(); i++) {
        int digit = inputString.charAt(i) - '0';
        result = result * 10 + digit;
    }
    
    return inputString.charAt(0) == '-' ? -result : result;
}
