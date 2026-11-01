# Minimum Moves to Equal Array Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of size `n`, return *the minimum number of moves required to make all array elements equal*.

In one move, you can increment `n - 1` elements of the array by `1`.

 

**Example 1:**

```
Input: nums = [1,2,3]
Output: 3
Explanation: Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]

```

**Example 2:**

```
Input: nums = [1,1,1]
Output: 0

```

 

**Constraints:**

- n == nums.length
- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109
- The answer is guaranteed to fit in a 32-bit integer.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 94.49%)  
**Memory:** 46.5 MB (beats 97.17%)  
**Submitted:** 2026-11-01T10:29:52.632Z  

```java
class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        for(int i=1;i<n;i++){
               min=Math.min(nums[i],min);
        }
        int count=0;
        for(int i=0;i<n;i++){
            count+=nums[i]-min;
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/)