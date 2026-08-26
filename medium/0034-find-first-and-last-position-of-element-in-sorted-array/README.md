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
**Memory:** 42.7 MB  
**Submitted:** 2026-08-26T18:21:18.121Z  

```java
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
        while(left<=right){
        }

            }
                right=mid-1;
            }else{
                left=mid+1;
            }else if(nums[mid]<target){

               
                right=mid-1;
                first=mid;

```

---

[View on LeetCode](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)