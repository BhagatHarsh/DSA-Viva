import java.util.Scanner;

public class FindMissingAndRepeatedValues {

    /*
     * You are given a 0-indexed 2D integer matrix grid of size n * n with values in
     * the range [1, n^2].
     * Each integer appears exactly once except a which appears twice and b which is
     * missing.
     * The task is to find the repeating and missing numbers a and b.
     * 
     * Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and
     * ans[1] equals to b.
     */

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] visited = new int[n * n];
        int repeated = 0;
        int missing = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[grid[i][j] - 1] == 1) {
                    repeated = grid[i][j];
                } else {
                    visited[grid[i][j] - 1] = 1;
                }
            }
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == 0) {
                missing = i + 1;
            }
        }

        return new int[] { repeated, missing };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the grid (n): ");
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];

        System.out.println("Enter the elements of the grid: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        FindMissingAndRepeatedValues solution = new FindMissingAndRepeatedValues();
        int[] result = solution.findMissingAndRepeatedValues(grid);

        System.out.println("The repeated number is: " + result[0]);
        System.out.println("The missing number is: " + result[1]);

        scanner.close();
    }
}
