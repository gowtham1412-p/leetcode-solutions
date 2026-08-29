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
**Memory:** 42.7 MB  
**Submitted:** 2026-08-29T02:34:20.679Z  

```java
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int left1=nums[0];
        int left2=nums[1];
        int right1=nums[n-1];
        int right2=nums[n-2];
        int right3=nums[n-3];
    }
        int pos=right1*right2*right3;
        int neg=left1*left2*right1;
        return Math.max(pos,neg);
        int n=nums.length;
        
}

```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)