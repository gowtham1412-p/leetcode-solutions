# Maximum Product of Three Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array nums.

Find three numbers whose product is maximum and return the maximum product.

 
Example 1:


Input: nums = [1,2,3]

Output: 6

Explanation:

The only three numbers are 1, 2, and 3, so the maximum product is 1 * 2 * 3 = 6.


Example 2:


Input: nums = [1,2,3,4]

Output: 24

Explanation:

The largest product comes from the three greatest numbers: 2 * 3 * 4 = 24.


Example 3:


Input: nums = [-1,-2,-3]

Output: -6

Explanation:

The only three numbers are -1, -2, and -3, so the maximum product is (-1) * (-2) * (-3) = -6.


 
Constraints:


	3 <= nums.length <= 104
	-1000 <= nums[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-08-29T02:01:19.988Z  

```java
class Solution {
    public int maximumProduct(int[] nums) {
        int pro=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            pro*=nums[i];
        max=Math.max(pro,nums[i]);
    }
        }
        return max;
        int max=0;
        Arrays.sort(nums);
}

```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)