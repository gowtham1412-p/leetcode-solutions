# Q1. Count Values With Equally Spaced Occurrences I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array nums.

An integer x is called special if:


	x appears exactly three times in nums.
	All three occurrences of x are equally spaced in nums. In other words, if all occurrences of x are at indices i1 < i2 < i3, then i2 - i1 = i3 - i2.


Return the number of distinct special integers in nums.

 
Example 1:


Input: nums = [1,8,1,5,1,5,8,5]

Output: 2

Explanation:


	1 is special because it occurs exactly three times at equally spaced indices 0, 2, and 4.
	5 is special because it occurs exactly three times at equally spaced indices 3, 5, and 7.
	8 is not special because it occurs only twice.


Therefore, the answer is 2.


Example 2:


Input: nums = [8,8,8,8]

Output: 0

Explanation:

8 is not special because it does not occur exactly three times. Therefore, the answer is 0.


Example 3:


Input: nums = [8,6,6,8,8]

Output: 0

Explanation:

8 occurs at indices 0, 3, and 4, which are not equally spaced. 6 occurs only twice. Therefore, no integer is special.


 
Constraints:


	3 <= nums.length <= 100
	1 <= nums[i] <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.9 MB  
**Submitted:** 2026-09-12T15:05:58.040Z  

```java
class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
       int count2=0;
        for(int i=0;i<n;i++){
            int count1=0;
            int a1=-1,a2=-1,a3=-1;
            
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    count1++;
                
                if(a1==-1){
                    a1=j;
                }else if(a2==-1){
                    a2=j;
                }else if(a3==-1){
                    a3=j;
                }
                
            }
        }
            if(count1==3 && a2-a1==a3-a2){
                
                    count2++;
                
            }
    }
            
        
            return count2;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-i/)