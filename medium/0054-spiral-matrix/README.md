# Spiral Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` `matrix`, return *all elements of the* `matrix` *in spiral order*.

 

**Example 1:**

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

```

**Example 2:**

```
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

```

 

**Constraints:**

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 10
- -100 <= matrix[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.5 MB (beats 85.16%)  
**Submitted:** 2026-11-02T13:07:57.662Z  

```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1;
        int left=0,right=n-1;
        List<Integer> list=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
        return list;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/spiral-matrix/)