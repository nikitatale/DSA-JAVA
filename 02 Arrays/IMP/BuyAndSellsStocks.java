// Keep track of minimum buying price so far
// At every day, check if selling today gives profit
// I iterate once through the array while maintaining the minimum price seen so far. At each step, 
// I calculate the profit if I sell today and update the maximum profit accordingly.
// If today's price less than buying price then simply update buyPrice value with today's price (instead of selling we can buy today)
// Time Complexity → O(n)
// Space Complexity → O(1) (only two variables used)


public class BuyAndSellsStocks{

    public static int findMaxProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit = " + findMaxProfit(prices));
    }
}