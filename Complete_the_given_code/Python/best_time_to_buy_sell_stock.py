'''

Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price 
of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and 
choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. 
If you cannot achieve any profit, return 0.

Sample Input : prices = [7,1,5,3,6,4]

'''

def maxProfit(prices):

    buy = prices[0]

    _profit = 0

    for i in range(1, len(prices)):

        # insert code here

        _profit = max(_profit, prices[i]-buy)

    return _profit

if __name__ == "__main__":
    prices = list(map(int, input("Enter the prices separated by space: ").split()))
    max_profit = maxProfit(prices)
    print("Maximum profit:", max_profit)