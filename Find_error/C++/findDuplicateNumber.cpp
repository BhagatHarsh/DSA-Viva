#include <iostream>
#include <vector>
using namespace std;

/*
Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where
each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums
and uses only constant extra space.

Sample Input : nums = [1,3,4,2,2]
*/

class Solution
{
public:
    int findDuplicate(vector<int> &nums)
    {
        vector<int> visited(nums.size() - 1, 0);

        for (int i = 0; i < nums.size(); i++)
        {
            if (visited[nums[i]] == 1)
            {
                return nums[i];
            }
            else
            {
                visited[nums[i]] = 1;
            }
        }
        return -1; // This line should never be reached
    }
};

int main()
{
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    vector<int> nums(n);

    cout << "Enter the elements: ";
    for (int i = 0; i < n; i++)
    {
        cin >> nums[i];
    }

    Solution solution;
    int duplicate = solution.findDuplicate(nums);

    cout << "The duplicate number is: " << duplicate << endl;

    return 0;
}