#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

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

class BestTimeToBuySellStock
{
public:
    int maxProfit(vector<int> &prices)
    {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.size(); i++)
        {
            // Update the minimum price to buy
            if (prices[i] < buy)
            {
                buy = prices[i];
            }
            // Calculate the profit and update the maximum profit
            profit = max(profit, prices[i] - buy);
        }

        return profit;
    }
};

int main()
{
    int n;
    cout << "Enter the number of days: ";
    cin >> n;
    vector<int> prices(n);

    cout << "Enter the prices: ";
    for (int i = 0; i < n; i++)
    {
        cin >> prices[i];
    }

    BestTimeToBuySellStock solution;
    int maxProfit = solution.maxProfit(prices);

    cout << "Maximum profit: " << maxProfit << endl;

    return 0;
}