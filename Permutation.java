import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *     Given an array of n elements and a permutation P,
 *     apply P to given array
 */
public class Permutation {
	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(0);
		input.add(1);
		input.add(2);
		input.add(-3);
		System.out.println("Initial: " + Arrays.toString(input.toArray()));			
		
		List<Integer> permutation = new ArrayList<Integer>();
		permutation.add(3);
		permutation.add(2);
		permutation.add(1);
		permutation.add(0);
		System.out.println("Permutation: " + Arrays.toString(permutation.toArray()));	
		
		applyPermutation(input, permutation);
		
		System.out.println("After applying 3-1-2-0 permuation: " + Arrays.toString(input.toArray()));
	}
	
	public static void applyPermutation(List<Integer> input, List<Integer> permutation) {
		
		for (int i = 0; i < input.size(); i++) {
			// We set elements in permutation to negative to indicate that it has been moved
			int next = i;
			while (permutation.get(next) >= 0 ) {
				int temp = permutation.get(next);
				Collections.swap(input,  i,  temp);
				// We cannot multiply by negative 1 because input element may be negative
				permutation.set(next, permutation.get(next) - permutation.size());
				next = temp;
				System.out.println("Applying1: " + Arrays.toString(input.toArray()));
			}
			System.out.println("Applying2: " + Arrays.toString(input.toArray()));
		}
		
		// restore permutation array
		for (int i = 0; i < permutation.size(); i++) {
			permutation.set(i, permutation.get(i) + permutation.size());
		}
	}
}
