# Binary Search

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T11:19:57.764Z  

```unknown
1class Solution {
2    public int search(int[] nums, int target) {
3      int left=0,right=nums.length-1;
4      while(left<=right){
5        int mid=(right-left)+left/2;
6        if(nums[mid]==target){
7            return mid;
8        }else if(nums[mid]<target){
9            left=mid+1;
10        }else if(nums[mid]>target){
11            right=mid-1;
12
13        }
14      }
15        return -1;
16    }
17}
```

---

[View on LeetCode](https://leetcode.com/problems/binary-search/)