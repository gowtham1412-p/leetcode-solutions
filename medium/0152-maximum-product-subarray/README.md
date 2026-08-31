# Maximum Product Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.

 
Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.


Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


 
Constraints:


	1 <= nums.length <= 2 * 104
	-10 <= nums[i] <= 10
	The product of any subarray of nums is guaranteed to fit in a 32-bit integer.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-31T16:56:20.075Z  

```java
        long n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        int pro=1;
            for(int j=i;j<n;j++){
              pro*=nums[j];
            max=Math.max(max,pro);
            
            }  
        }
        return max;
    }
}
    public int maxProduct(int[] nums) {
class Solution {

```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-subarray/)