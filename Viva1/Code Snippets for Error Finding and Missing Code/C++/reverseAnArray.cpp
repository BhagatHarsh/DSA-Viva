/*
Problem: Reverse an Array
You are given an array of integers. Complete the function to reverse the array in place.

Constraints:
1 <= n <= 10^5
-10^9 <= arr[i] <= 10^9

Expected Time Complexity: O(n/2)
*/

#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    void reverseArray(vector<int> &arr)
    {
        int left = 0, right = arr.size() - 1;
        while (left < right)
        {
            swap(arr[left], arr[right]);
            left++;
            right--;
        }
    }
};

void printArray(const vector<int> &arr)
{
    for (int x : arr)
    {
        cout << x << " ";
    }
    cout << endl;
}

int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};
    Solution sol;

    cout << "Original array: ";
    printArray(arr);

    sol.reverseArray(arr);

    cout << "Reversed array: ";
    printArray(arr);

    return 0;
}
