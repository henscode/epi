import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
*   Given an array of distinct elements and a subset size k
*   return a subset of size k.
*/

public class RandomSampling {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            input.add(i);
        }
        System.out.println("Initial: " + Arrays.toString(input.toArray()));        
        random(3, input);        
        System.out.println("After: " + Arrays.toString(input.toArray()));
    }
    
    public static void random(int k, List<Integer> input) {
        Random randomGenerator = new Random();
        for (int i = 0; i < k; i++) {
            int randomInt = randomGenerator.nextInt(input.size() - i);
            Collections.swap(input, i, i + randomInt);
        }
    }
}
