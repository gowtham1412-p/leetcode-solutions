# Find First and Last Position of Element in Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

 
Constraints:


	0 <= nums.length <= 105
	-109 <= nums[i] <= 109
	nums is a non-decreasing array.
	-109 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 43.1 MB  
**Submitted:** 2026-08-26T18:05:53.013Z  

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }else if(nums[i]>target)
                break;
            }
        return new int[]{first,last};

```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)