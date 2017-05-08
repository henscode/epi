import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GeneratePrimes {
    public static void main(String[] args) {
        int input = 18;
        List<Integer> primeList = generatePrimeList(input);
        System.out.println(Arrays.toString(primeList.toArray()));
    }
    
    public static List<Integer> generatePrimeList(int input) {
        List<Integer> primes = new ArrayList<Integer>();
        List<Boolean> isPrime = new ArrayList<Boolean>(Collections.ncopies(input + 1, true));
        
        isPrime.set(0, false);
        isPrime.set(1, false);
        
        for (int i = 2; i <= input; i++) {
            if (isPrime.get(i)) {
                primes.add(i);
                
                for (int j = i; j <= input; j += i) {
                  isPrime.set(j, false);
                }
            }
        }
        
        return primes;
    }
}
