# Search a 2D Matrix II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`. This matrix has the following properties:

- Integers in each row are sorted in ascending from left to right.
- Integers in each column are sorted in ascending from top to bottom.

 

Original
Java
**Example 1:**

```
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true

```

**Example 2:**

```
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false

```

 

**Constraints:**

- m == matrix.length
- n == matrix[i].length
- 1 <= n, m <= 300
- -109 <= matrix[i][j] <= 109
- All the integers in each row are sorted in ascending order.
- All the integers in each column are sorted in ascending order.
- -109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 27.19%)  
**Memory:** 48.1 MB (beats 58.10%)  
**Submitted:** 2026-11-12T12:42:25.003Z  

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=m-1;
        while(low<n && high>=0){
           if(matrix[low][high]==target){
            return true;
           }else if(matrix[low][high]<target){
            low++;
           }else{
            high--;
           }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix-ii/)