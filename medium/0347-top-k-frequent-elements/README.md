# Top K Frequent Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return *the* `k` *most frequent elements*. You may return the answer in **any order**.

 

Original
Java
**Example 1:**

**Input:** nums = [1,1,1,2,2,3], k = 2

**Output:** [1,2]

**Example 2:**

**Input:** nums = [1], k = 1

**Output:** [1]

**Example 3:**

**Input:** nums = [1,2,1,2,1,2,3,1,3,2], k = 2

**Output:** [1,2]

 

**Constraints:**

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- k is in the range [1, the number of unique elements in the array].
- It is guaranteed that the answer is unique.

 

**Follow up:** Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.

## Solution

**Language:** Java  
**Runtime:** 17 ms (beats 24.72%)  
**Memory:** 46.8 MB (beats 97.11%)  
**Submitted:** 2026-11-18T10:28:46.047Z  

```java
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i);
        }
        return res;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/top-k-frequent-elements/)