public class Stock_Purchase_Sell_Val {
    // returns maximum profit with purchase and sell day
    public static void purchaseSellDayProfit(int stockPriceOnDay[]) {
        int n = stockPriceOnDay.length;

        int minPriceOnLeft[] = new int[n];
        minPriceOnLeft[0] = stockPriceOnDay[0];
        int purchaseDay = minPriceOnLeft[0];
        int minPos = 0;
        for (int i = 1; i < n; i++) {
            minPriceOnLeft[i] = Math.min(minPriceOnLeft[i - 1], stockPriceOnDay[i]);
            if (purchaseDay > minPriceOnLeft[i]) {
                purchaseDay = minPriceOnLeft[i];
                minPos = i;
            }
        }

        int maxPrice = stockPriceOnDay[n - 1];
        int maxPos = n - 1;
        for (int i = n - 1; i >= purchaseDay; i--) {
            if (stockPriceOnDay[i] > maxPrice && i > minPos) {
                maxPrice = stockPriceOnDay[i];
                maxPos = i;
            }
        }
        System.out.println("\nPurchase Day : " + purchaseDay);
        System.out.println("I made " + (maxPrice - purchaseDay) + "% profit as I purchased stock on Day " + ++minPos
                + " and sold on Day " + ++maxPos);

    }

    // Function returns maximum profit
    public static int maxProfit(int arr[]) {
        int buyDay = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (buyDay < arr[i]) {
                profit = Math.max(arr[i] - buyDay, profit);
            } else {
                buyDay = arr[i];
            }
        }
        return profit;
    }
    
    // Another way
     public int maxProfit1(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++){
            minPrice= Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        
        return maxProfit;
    }
    
    
    public static void main(String[] args) {
        int stockPriceOnDay[] = { 7, 1, 5, 3, 6, 4 };
        purchaseSellDayProfit(stockPriceOnDay);
    }
}
