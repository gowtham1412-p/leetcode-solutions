# Find All Numbers Disappeared in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of `n` integers where `nums[i]` is in the range `[1, n]`, return *an array of all the integers in the range* `[1, n]` *that do not appear in* `nums`.

 

Original
Java
**Example 1:**

```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

```

**Example 2:**

```
Input: nums = [1,1]
Output: [2]

```

 

**Constraints:**

- n == nums.length
- 1 <= n <= 105
- 1 <= nums[i] <= n

 

**Follow up:** Could you do it without extra space and in `O(n)` runtime? You may assume the returned list does not count as extra space.

## Solution

**Language:** Java  
**Runtime:** 21 ms (beats 21.96%)  
**Memory:** 73.8 MB (beats 27.22%)  
**Submitted:** 2026-11-13T19:06:16.673Z  

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
                 if(!set.contains(i)){
                    list.add(i);
                 }
        }
        return list;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)