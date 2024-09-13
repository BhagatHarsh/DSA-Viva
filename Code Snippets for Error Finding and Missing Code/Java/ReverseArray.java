
public class ReverseArray {

    /*
     * Problem: Reverse an Array
     * You are given an array of integers. Complete the function to reverse the
     * array in place.
     * 
     * Constraints:
     * 1 <= n <= 10^5
     * -10^9 <= arr[i] <= 10^9
     * 
     * Expected Time Complexity: O(n/2)
     */

    public static class Solution {
        public void reverseArray(int[] arr) {
            int left = 0, right = arr.length - 1;
            while (left < right) {
                // Swap elements at left and right indices
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Solution sol = new Solution();

        System.out.print("Original array: ");
        printArray(arr);

        sol.reverseArray(arr);

        System.out.print("Reversed array: ");
        printArray(arr);
    }
}