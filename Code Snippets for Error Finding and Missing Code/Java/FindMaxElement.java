public class FindMaxElement {

    /*
     * Problem: Find the maximum element in an array.
     * You are given an array of integers. Complete the function that returns the
     * maximum element in the array.
     * 
     * Constraints:
     * 1 <= n <= 10^5
     * -10^9 <= arr[i] <= 10^9
     * 
     * Expected Time Complexity: O(n)
     */

    public static class Solution {
        public int findMaxElement(int[] arr) {
            // Initialize with the first element
            int maxElement = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxElement) {
                    maxElement = arr[i];
                }
            }
            return maxElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, -10, 45, 23, -50, 99 };
        Solution sol = new Solution();
        System.out.println("Maximum element: " + sol.findMaxElement(arr));
    }
}