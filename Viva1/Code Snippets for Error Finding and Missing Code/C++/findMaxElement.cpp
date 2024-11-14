/*
Problem: Find the maximum element in an array.
You are given an array of integers. Complete the function that returns the maximum element in the array.

Constraints:
1 <= n <= 10^5
-10^9 <= arr[i] <= 10^9

Expected Time Complexity: O(n)
*/

#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    int findMaxElement(vector<int> &arr)
    {
        // Complete the function
        int maxElement = arr[0]; // Initialize with the first element
        for (int i = 1; i < arr.size(); i++)
        {
            if (arr[i] > maxElement)
            {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
};

int main()
{
    vector<int> arr = {1, -10, 45, 23, -50, 99};
    Solution sol;
    cout << "Maximum element: " << sol.findMaxElement(arr) << endl;
    return 0;
}
