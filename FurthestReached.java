/*
*    Determine if you can reach the end of an array by taking at most array[i] steps at each i
*/

public class FurthestReached {
    public static void main(String[] args) {
        int[] input = {3, 3, 1, 0, 2, 0, 1};
        System.out.println("Can reach end: " + canReachEnd(input));
    }
    
    public static boolean canReachEnd(int[] input) {
        int lastIndex = input.length -1;
        int furthestReached = 0;
        
        // i < furthestReached ensures that we took at most array[i] steps
        // furthest < lastIndex means we have not reached the end yet
        for (int i = 0; i < furthestReached && furthestReached < lastIndex; i++) {
            furthestReached = Math.max(furthestReached, i + input[i);
        }
        
        return furthestReached >= lastIndex;
    }

}
