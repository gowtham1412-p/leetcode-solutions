# Subarray Product Less Than K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

 
Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.


Example 2:

Input: nums = [1,2,3], k = 0
Output: 0


 
Constraints:


	1 <= nums.length <= 3 * 104
	1 <= nums[i] <= 1000
	0 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-08-23T15:31:20.418Z  

```java
        int n=nums.length;
       for(int j=0;j<n;j++){
        product*=nums[j];
       }
        while(product>=k){
            product/=nums[i];
        }
            i++;
        count+=j-i+1;
       return count;
    }
        int i=0;
        int count=0;
        long product=1;
    public int numSubarrayProductLessThanK(int[] nums, int k) {
class Solution {
}

```

---

[View on LeetCode](https://leetcode.com/problems/subarray-product-less-than-k/)