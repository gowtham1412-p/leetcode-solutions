# Non-decreasing Subsequences

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, return *all the different possible non-decreasing subsequences of the given array with at least two elements*. You may return the answer in **any order**.

 

**Example 1:**

```
Input: nums = [4,6,7,7]
Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]

```

**Example 2:**

```
Input: nums = [4,4,3,2,1]
Output: [[4,4]]

```

 

**Constraints:**

- 1 <= nums.length <= 15
- -100 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 60 ms (beats 5.06%)  
**Memory:** 53.6 MB (beats 15.81%)  
**Submitted:** 2026-10-02T12:37:06.606Z  

```java
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n=nums.length;
        int range=(1<<n);
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<range;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    temp.add(nums[j]);
                }
            }
            if(temp.size()>=2&&valid(temp)){
                res.add(temp);
            }
        }
        return new ArrayList<>(res);
       
    }
    static boolean valid(List<Integer>temp){
        for(int j=1;j<temp.size();j++){
            if(temp.get(j)<temp.get(j-1)){
                return false;
            }
        }
        return true;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/non-decreasing-subsequences/)