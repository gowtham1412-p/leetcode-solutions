# Spiral Matrix II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a positive integer `n`, generate an `n x n` `matrix` filled with elements from `1` to `n2` in spiral order.

 

**Example 1:**

```
Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]

```

**Example 2:**

```
Input: n = 1
Output: [[1]]

```

 

**Constraints:**

- 1 <= n <= 20

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.6 MB (beats 66.79%)  
**Submitted:** 2026-11-09T17:46:31.751Z  

```java
class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][]=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int ans=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                mat[top][i]=ans++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                mat[i][right]=ans++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    mat[bottom][i]=ans++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    mat[i][left]=ans++;
                }
                left++;
            }
        }
        return mat;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix-ii/)