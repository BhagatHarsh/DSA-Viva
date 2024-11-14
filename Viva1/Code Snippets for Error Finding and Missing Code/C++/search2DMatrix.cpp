#include <bits/stdc++.h>
using namespace std;
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

class Search2DMatrix
{
public:
    bool searchMatrix(vector<vector<int>> &matrix, int target)
    {
        int m = matrix.size();
        int n = matrix[0].size();

        for (int i = 0; i < m; i++)
        {
            if (matrix[i][n - 1] == target)
            {
                return true;
            }

            // add the necessary if statement here

            for (int j = 0; j < n; j++)
            {
                if (matrix[i][j] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
};

int main()
{
    vector<vector<int>> matrix = {
        {1, 3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60}};
    int target;
    cout << "Enter the target value: ";
    cin >> target;

    Search2DMatrix searchObj;
    bool result = searchObj.searchMatrix(matrix, target);

    if (result)
    {
        cout << "Target found in the matrix." << endl;
    }
    else
    {
        cout << "Target not found in the matrix." << endl;
    }

    return 0;
}