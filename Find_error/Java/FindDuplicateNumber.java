import java.util.Scanner;

public class FindDuplicateNumber {

    /*
     * Find the Duplicate Number
     * 
     * Given an array of integers nums containing n + 1 integers where
     * each integer is in the range [1, n] inclusive.
     * 
     * There is only one repeated number in nums, return this repeated number.
     * 
     * You must solve the problem without modifying the array nums
     * and uses only constant extra space.
     * 
     * Sample Input : nums = [1,3,4,2,2]
     */

    public int findDuplicate(int[] nums) {
        int[] visited = new int[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {
            if (visited[nums[i]] == 1) {
                return nums[i];
            } else {
                visited[nums[i]] = 1;
            }
        }
        return -1; // This line should never be reached
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        FindDuplicateNumber solution = new FindDuplicateNumber();
        int duplicate = solution.findDuplicate(nums);

        System.out.println("The duplicate number is: " + duplicate);

        scanner.close();
    }
}