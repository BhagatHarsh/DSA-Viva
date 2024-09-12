#include <iostream>
#include <vector>
using namespace std;

/*
You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n^2].
Each integer appears exactly once except a which appears twice and b which is missing.
The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
*/

class Solution
{
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>> &grid)
    {
        int n = grid.size();
        vector<int> visited(n * n, 0);
        int repeated = 0;
        int missing = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (visited[grid[i][j] - 1] == 1)
                {
                    repeated = grid[i][j];
                }
                else
                {
                    visited[grid[i][j] - 1] = 1;
                }
            }
        }

        for (int i = 0; i < visited.size(); i++)
        {
            if (visited[i] == 0)
            {
                missing = i + 1;
            }
        }

        return {repeated, missing};
    }
};

int main()
{
    int n;
    cout << "Enter the size of the grid (n): ";
    cin >> n;
    vector<vector<int>> grid(n, vector<int>(n));

    cout << "Enter the elements of the grid: " << endl;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> grid[i][j];
        }
    }

    Solution solution;
    vector<int> result = solution.findMissingAndRepeatedValues(grid);

    cout << "The repeated number is: " << result[0] << endl;
    cout << "The missing number is: " << result[1] << endl;

    return 0;
}