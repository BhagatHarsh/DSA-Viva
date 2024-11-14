public class RecursiveSumOfArray {

    /*
     * Problem: Recursive Sum of an Array
     * You are given an array of integers. Complete the recursive function that
     * returns the sum of all elements in the array.
     * 
     * Constraints:
     * 1 <= n <= 1000
     * -1000 <= arr[i] <= 1000
     * 
     * Expected Time Complexity: O(n)
     */

    public static class Solution {
        public int recursiveSum(int[] arr, int n) {
            // Base case
            if (n == 0) {
                return 0;
            }
            return arr[n - 1] + recursiveSum(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 3, 7 };
        Solution sol = new Solution();
        System.out.println("Sum of array elements: " + sol.recursiveSum(arr, arr.length));
    }
}
