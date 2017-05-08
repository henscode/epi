public class Sinusoidally {
    public static void main(String[] args) {
        String inut = "Hello World!";
        System.out.println(snakeString(input));
   }
   
   pubic static String snakeString(String input) {
       StringBuilder result = new StringBuilder();
       for (int i = 1; i < input.length(); i+=4) {
           result.append(input.charAt(i);
       }
       for (int i = 0; i < input.length(); i+=2) {
           result.append(input.charAt(i);
       }
       for (int i = 3; i < input.length(); i+=4) {
           result.append(input.charAt(i);
       }
       
       return result;
   }
}
