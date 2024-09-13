'''
Problem: Find the maximum element in an array.
You are given an array of integers. Complete the function that returns the maximum element in the array.

Constraints:
1 <= n <= 10^5
-10^9 <= arr[i] <= 10^9

Expected Time Complexity: O(n)
'''

class Solution:
    def findMaxElement(self, arr):
        # Initialize with the first element
        maxElement = arr[0]
        for i in range(1, len(arr)):
            if arr[i] > maxElement:
                maxElement = arr[i]
        return maxElement

if __name__ == "__main__":
    arr = [1, -10, 45, 23, -50, 99]
    sol = Solution()
    print("Maximum element:", sol.findMaxElement(arr))