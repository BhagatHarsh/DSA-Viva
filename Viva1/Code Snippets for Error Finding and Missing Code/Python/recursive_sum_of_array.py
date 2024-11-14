'''
Problem: Recursive Sum of an Array
You are given an array of integers. Complete the recursive function that returns the sum of all elements in the array.

Constraints:
1 <= n <= 1000
-1000 <= arr[i] <= 1000

Expected Time Complexity: O(n)
'''

class Solution:
    def recursiveSum(self, arr, n):
        # Base case
        if n == 0:
            return 0
        return arr[n - 1] + self.recursiveSum(arr, n - 1)

if __name__ == "__main__":
    arr = [5, 2, 9, 3, 7]
    sol = Solution()
    print("Sum of array elements:", sol.recursiveSum(arr, len(arr)))