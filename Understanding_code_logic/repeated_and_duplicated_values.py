'''

You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. 
Each integer appears exactly once except a which appears twice and b which is missing. 
The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

'''

def findMissingAndRepeatedValues(self, grid):
    n = len(grid)
    visited = [0 for _ in range(n*n)]
    repeated = 0
    missing = 0

    for i in range(n):
        for j in range(n):
            print(grid[i][j])
            if visited[grid[i][j]-1] == 1:
                repeated = grid[i][j]
            else:
                visited[grid[i][j]-1] = 1
    
    for i in range(len(visited)):
        if visited[i] == 0:
            missing = i+1

    return [repeated, missing]