import java.util.Scanner;

public class BestTimeToBuySellStock {

    /*
    Best Time to Buy and Sell Stock

    You are given an array prices where prices[i] is the price 
    of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and 
    choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction. 
    If you cannot achieve any profit, return 0.

    Sample Input : prices = [7,1,5,3,6,4]
    */

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price to buy
            if (prices[i] < buy) {
                buy = prices[i];
            }
            // Calculate the profit and update the maximum profit
            profit = Math.max(profit, prices[i] - buy);
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter the prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        BestTimeToBuySellStock solution = new BestTimeToBuySellStock();
        int maxProfit = solution.maxProfit(prices);

        System.out.println("Maximum profit: " + maxProfit);

        scanner.close();
    }
}