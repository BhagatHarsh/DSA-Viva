// import java.util.Scanner;

public class TransposeOf2DMatrix {

    /*
     * Problem: Transpose of a 2D Matrix
     * You are given a square matrix. Complete the function that returns the
     * transpose of the matrix.
     * 
     * Constraints:
     * 1 <= n <= 100
     * -10^4 <= matrix[i][j] <= 10^4
     * 
     * Expected Time Complexity: O(n^2)
     */

    public static class Solution {
        public int[][] transpose(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // Swap elements at (i, j) and (j, i)
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix; // Return the transposed matrix
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        Solution sol = new Solution();
        int[][] transposed = sol.transpose(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(transposed);
    }
}