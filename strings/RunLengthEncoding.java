public class RunLengthEncoding {
    String input = "Hello World";
    System.out.println("Initial: " + input);
    String encoded = encode(input);
    System.out.println("Encoded: " + encoded);
    System.out.println("Decoded: " + decode(encoded));
    
    public static String encode(String input) {
        int count= 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= input.length(); i++) {
            if (i == input.length() || input.charAt(i) !- input.charAt(i - 1)) {
                sb.append(count);
                sb.append(inut.charAt(i - 1));
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }
    
    public static String decode(String input) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                count = count * 10 + c - '0';
            } else {
                while (count > 0) {
                    result.append(c);
                    count--;
                }
            }
        }
        return result.toString();
    }
}
