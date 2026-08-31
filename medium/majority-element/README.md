# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T15:42:48.180Z  

```unknown
1class Solution {
2    public int majorityElement(int[] nums) {
3        int n=nums.length;
4        int count=0;
5        int ele=0;
6        for(int i=0;i<n;i++){
7            if(count==0){
8                count=1;
9                ele=nums[i];
10            }else if(nums[i]==ele){
11                count++;
12            }else{
13                count--;
14            }
15        }
16        int count1=0;
17        for(int i=0;i<n;i++){
18            if(nums[i]==ele)
19                count1++;
20        }
21        if(count1>n/2)
22           return ele;
23        return -1;
24    }
25}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)