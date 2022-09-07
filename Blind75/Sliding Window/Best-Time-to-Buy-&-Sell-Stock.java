/*
* From https://neetcode.io/
* reference:
* javac '.\Best-Time-to-Buy-&-Sell-Stock.java'
* java Solution
*/

class Solution {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int profit = 0;
        
        for (int i = 0; i < prices.length; i++){
            minimum = Math.min(minimum, prices[i]);
            System.out.println("minimum: " + minimum);
            profit = Math.max(profit, prices[i] - minimum);
            System.out.println("profit: " + profit);

        }
        return profit;
        
    }

    // Checking test cases with implementation 
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{7,1,5,3,6,4}));

        System.out.println(new Solution().maxProfit(new int[]{7,6,4,3,1}));

    }

    /*
    * Alternative solutions:
    */
    // public int maxProfit(int[] prices) {
        
    // }

}
