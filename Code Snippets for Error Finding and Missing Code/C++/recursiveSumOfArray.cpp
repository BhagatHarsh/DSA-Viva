/*
Problem: Recursive Sum of an Array
You are given an array of integers. Complete the recursive function that returns the sum of all elements in the array.

Constraints:
1 <= n <= 1000
-1000 <= arr[i] <= 1000

Expected Time Complexity: O(n)
*/

#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    int recursiveSum(vector<int> &arr, int n)
    {
        // Base case
        if (n == 0)
            return 0;

        return arr[n - 1] + recursiveSum(arr, n - 1);
    }
};

int main()
{
    vector<int> arr = {5, 2, 9, 3, 7};
    Solution sol;
    cout << "Sum of array elements: " << sol.recursiveSum(arr, arr.size()) << endl;
    return 0;
}
