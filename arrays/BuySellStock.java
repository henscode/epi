public class BuySellStock {
    public static void main(String[] args) {
        int[] input = {310, 315, 275, 295, 260, 270, 290, 255, 250};
        System.out.println("Max profit: " + maxProfit);
    }
    
    public static int computeMaxProfit(int[] input) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < input.length; i++) {
           maxProfit = Math.max(input[i] - minPrice, maxProfit);
           minPrice = Math.min(minPrice, input[i]);
        }
        
        return maxProfit;
    }
}
