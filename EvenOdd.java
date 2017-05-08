package arrays;

import java.util.Arrays;

/*
 *  Reorder array so that even elements are displayed first
 */
public class EvenOdd {
    public static void main(String[] args) {
    	int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};    	
    	System.out.println(Arrays.toString(input));
    	
    	rearrangeEvenFirst(input);
    	System.out.println(Arrays.toString(input));
    }
    
    public static void rearrangeEvenFirst(int[] input) {
    	int evenIndex = 0;
    	int oddIndex = input.length - 1;    	
    	
    	while (evenIndex < oddIndex) {
    		if (input[evenIndex] % 2 == 0) {
    			evenIndex++;
    		} else {
    			int temp = input[evenIndex];
    			input[evenIndex] = input[oddIndex];
    			input[oddIndex--] = temp;
    		}
    	}
    }
}
