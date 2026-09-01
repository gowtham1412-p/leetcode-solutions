# Single Number II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 
Example 1:
Input: nums = [2,2,3,2]
Output: 3
Example 2:
Input: nums = [0,1,0,1,0,1,99]
Output: 99

 
Constraints:


	1 <= nums.length <= 3 * 104
	-231 <= nums[i] <= 231 - 1
	Each element in nums appears exactly three times except for one element which appears once.

## Solution

**Language:** Java  
**Runtime:** 91 ms (beats 6.62%)  
**Memory:** 45.4 MB (beats 41.71%)  
**Submitted:** 2026-09-01T05:28:17.117Z  

```java
class Solution {
    public int singleNumber(int[] nums) {
        int sn=0;
        int n=nums.length;
        for(int num:nums){
        int count=0;
        for(int i=0;i<n;i++){
                if(nums[i] == num){
                    count++;
                }
        }
                if(count==1)
                   return num;
        }
        return 0;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number-ii/)