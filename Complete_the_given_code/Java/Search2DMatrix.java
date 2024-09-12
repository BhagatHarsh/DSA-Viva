import java.util.*;
/*
Search a 2D Matrix

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Sample Input : matrix = [
                        [1,3,5,7],
                        [10,11,16,20],
                        [23,30,34,60]
                        ]
*/

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (matrix[i][n - 1] == target) {
                return true;
            }

            // add the necessary if statement here

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        Search2DMatrix searchObj = new Search2DMatrix();
        boolean result = searchObj.searchMatrix(matrix, target);

        if (result) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Target not found in the matrix.");
        }

        scanner.close();
    }
}