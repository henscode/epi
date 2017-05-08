import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections
import java.util.List;

public class Multiplication {
    public static void main(String[] args) {
        List<Integer> num1 = new ArrayList<Integer>();
        // number is -123
        num1.add(-1);
        num1.add(2);
        num1.add(3);
        
        List<Integer> num2 = new ArrayList<Integer>();
        num2.add(9);
        num2.add(8);
        num2.add(7);
        
        System.out.println("num1: " + Arrays.toString(num1.toArray()));
        System.out.println("num2: " + Arrays.toString(num2.toArray()));
        
        List<Integer> result = multiply(num1, num2);
        System.out.println("result: " + Arrays.toString(result.toArray()));
    }
    
    public static List<Integer> multiply(List<Integer> num1, List<Integer> num2) {
        // Determine if the product should be negative
        final int sign = num1.get(0) < 0 ^ num2.get(0) < 0 ? -1: 1;
        
        // Set both numbers to absolute value
        num1.set(0, Math.abs(num1.get(0)));
        num2.set(0, Math.abs(num2.get(0)));
        
        List<Integer> result = new ArrayList<Integer>(Collections.nCopies(num1.size() + num2.size(), 0));
        
        for (int i = num1.size - 1; i >= 0; i--) {
            for (int j = num2.size -1; j >= 0; j--) {
                result.set(i + j + 1, result.get(i + j + 1) + num1.get(i) * num2.get(j));
                result.set(i + j, result.get(i+ j) + result.get(i + j + 1)/10);
                result.set(i + j + 1, result.get(i + j + 1) % 10);
            }
        }
        
        // remove leading zeroes
        int firstNonZero = 0;
        
        while (firstNonZero < result.size()) {
            if (result.get(firstNonZero) == 0) {
                firstNonZero++;
            else {
                break;
            }
        }
        
        result = result.subList(firstNonZero, result.size());
        if (result.isEmpty()) {
            return Arrays.asList(0);
        }
        
        // Add back negative sign if needed
        result.set(0, result.get(0) * sign);
        
        return result;
    }
}
