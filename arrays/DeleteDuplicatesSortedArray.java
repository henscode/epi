import java.util.Arrays;

public class DeleteDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] input = {2, 2, 3, 4, 5, 7, 11, 11, 11, 13, 13};
        System.out.println("Initial: " + Arrays.toString(input);
        deleteDuplicates(input);
        System.out.println("Final: " + Arrays.toString(input);
    }
    
    public static int deleteDuplicates(int[] input) {
        if (input.length == 0) {
            return 0;
        }
        
        int writeIndex = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i - 1]) {   
                input[writeIndex++] = input[i];
            }
        }
        return writeIndex;
}
