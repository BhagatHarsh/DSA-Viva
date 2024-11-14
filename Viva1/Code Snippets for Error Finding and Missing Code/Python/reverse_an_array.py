'''
Problem: Reverse an Array
You are given an array of integers. Complete the function to reverse the array in place.

Constraints:
1 <= n <= 10^5
-10^9 <= arr[i] <= 10^9

Expected Time Complexity: O(n/2)
'''

class Solution:
    def reverseArray(self, arr):
        left, right = 0, len(arr) - 1
        while left < right:
            # Swap elements at left and right indices
            arr[left], arr[right] = arr[right], arr[left]
            left += 1
            right -= 1

def printArray(arr):
    print(" ".join(map(str, arr)))

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5]
    sol = Solution()

    print("Original array: ", end="")
    printArray(arr)

    sol.reverseArray(arr)

    print("Reversed array: ", end="")
    printArray(arr)