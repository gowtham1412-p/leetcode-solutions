# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2

 
Constraints:


	1 <= nums.length <= 2 * 104
	-1000 <= nums[i] <= 1000
	-107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 1540 ms (beats 17.16%)  
**Memory:** 48.4 MB (beats 93.76%)  
**Submitted:** 2026-08-28T18:01:39.220Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
            
        
        if(sum==k)
           count++;
        }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)