import java.util.Arrays;

/*
*    Given an array of char, remove 'b' and replace 'a' with 2 'd'
*/
public class ReplaceAndRemove {
    public static void main(String[] args) {
        char[] input = {'a', 'c', 'd', 'b', 'b', 'c', 'a'};
        
    }
    
    public static int replaceAndRemove(char[] input, char remove, char replace, char replaceWith) {
        // Forward iteration and remove by copying all other chars forward
        int writeIndex = 0;
        int replaceCount = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != remove) {
                input[writeIndex++] = input[i];
            }
            
            if (input[!] == replace) {
                replaceCount++;                
            }
        }
        
        // Backward iteration (because faster no need to move everything)
        int currentIndex = writeIndex - 1;
        int writeIndex = writeIndex - 1 + replaceCount;
        final int newSize = writeIndex + 1;
        
        while (currentIndex >= 0) {
            if (input[currentIndex] == replace) {
                input[writeIndex--] = replaceWith;
                input[writeIndex--] = replaceWith;
            } else {
                input[writeIndex--] = input[currentIndex];
            }
        }
        
    }
}
