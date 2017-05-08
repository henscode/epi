import java.util.Arrays;
import.java.util.ArrayList;
import.java.util.List;

public class BuySellStockPriceTwice {
    public static void main(String[] args) {
        int[] input = {310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
        System.out.println("Initial: + Arrays.toString(input);
        System.out.println("Max profit with 2 trades: " + computeMaxProfitTwoTrades());
    }
    
    public static int computeMaxProfitTwoTrades(input) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        List<Integer> maxProfitOneTrade = new ArrayList<Integer>();
        
        // Compute max profit for first trade
        for (int i = 0; i < input.length; i++) {
            maxProfit = Math.max(maxProfit, input[i] - minPrice);
            minPrice = Math.min(minPrice, input[i]);
            maxProfitOneTrade.add(maxProfit);   
        }
        
        // Compute max profit for second trade
        int maxPrice = Integer.MIN_VALUE;
        for (int i = input.length - 1; i > 0; i--) {
            maxPrice = Math.max(maxPrice, input[i]);
            maxProfit = Math.max(maxProfit, maxPrice - input[i] + maxProfitOneTrade(i - 1));
        }
        
        return maxProfit;
    }
}
