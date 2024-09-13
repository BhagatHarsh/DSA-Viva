'''

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

'''

def searchMatrix(matrix, target: int) -> bool:
    m = len(matrix)
    n = len(matrix[0])

    for i in range(m):
        if matrix[i][n-1] == target:
            return True
        
        if matrix[i][n-1] > target:

            for j in range(n):
                if matrix[i][j] == target:
                    return True
            return False
    return False

if __name__ == "__main__":
    matrix = [
        [1, 3, 5, 7],
        [10, 11, 16, 20],
        [23, 30, 34, 60]
    ]

    target = int(input("Enter the target value: "))

    searchObj = searchMatrix()
    result = searchObj.searchMatrix(matrix, target)

    if result:
        print("Target found in the matrix.")
    else:
        print("Target not found in the matrix.")