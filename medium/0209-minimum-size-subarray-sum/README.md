# Minimum Size Subarray Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.


Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1


Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0


 
Constraints:


	1 <= target <= 109
	1 <= nums.length <= 105
	1 <= nums[i] <= 104


 
Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.3 MB  
**Submitted:** 2026-08-24T17:16:00.669Z  

```java
        }
            while(sum>=target){
              res=Math.min(res,j-i+1);
            }
           
              sum-=nums[i];
              i++;
            sum+=nums[j];
        for(int j=0;j<n;j++){
        int res=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int n=nums.length;
    public int minSubArrayLen(int target, int[] nums) {
class Solution {

```

---

[View on LeetCode](https://leetcode.com/problems/minimum-size-subarray-sum/)