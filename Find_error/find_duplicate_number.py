'''

Find the Duplicate Number

Given an array of integers nums containing n + 1 integers where
each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums 
and uses only constant extra space.

Sample Input : nums = [1,3,4,2,2]

'''

def findDuplicate(nums):
    
    visited = [0 for _ in range(len(nums)-1)]
    
    for i in nums:
        if visited[i] == 1:
            return i
        else:
            visited[i] = 1