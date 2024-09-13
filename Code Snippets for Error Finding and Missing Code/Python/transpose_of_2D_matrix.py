'''
Problem: Transpose of a 2D Matrix
You are given a square matrix. Complete the function that returns the transpose of the matrix.

Constraints:
1 <= n <= 100
-10^4 <= matrix[i][j] <= 10^4

Expected Time Complexity: O(n^2)
'''

class Solution:
    def transpose(self, matrix):
        n = len(matrix)
        for i in range(n):
            for j in range(i + 1, n):
                # Swap elements at (i, j) and (j, i)
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        return matrix  # Return the transposed matrix

def printMatrix(matrix):
    for row in matrix:
        print(" ".join(map(str, row)))

if __name__ == "__main__":
    matrix = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]

    sol = Solution()
    transposed = sol.transpose(matrix)

    print("Original Matrix:")
    printMatrix(matrix)

    print("Transposed Matrix:")
    printMatrix(transposed)