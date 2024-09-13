/*
Problem: Transpose of a 2D Matrix
You are given a square matrix. Complete the function that returns the transpose of the matrix.

Constraints:
1 <= n <= 100
-10^4 <= matrix[i][j] <= 10^4

Expected Time Complexity: O(n^2)
*/

#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    vector<vector<int>> transpose(vector<vector<int>> &matrix)
    {
        int n = matrix.size();
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        return matrix; // Return the transposed matrix
    }
};

void printMatrix(const vector<vector<int>> &matrix)
{
    for (const auto &row : matrix)
    {
        for (int val : row)
        {
            cout << val << " ";
        }
        cout << endl;
    }
}

int main()
{
    vector<vector<int>> matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

    Solution sol;
    vector<vector<int>> transposed = sol.transpose(matrix);

    cout << "Original Matrix:" << endl;
    printMatrix(matrix);

    cout << "Transposed Matrix:" << endl;
    printMatrix(transposed);

    return 0;
}
