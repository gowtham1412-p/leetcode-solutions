# Maximum Product of Two Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a positive integer n.

Return the maximum product of any two digits in n.

Note: You may use the same digit twice if it appears more than once in n.

 
Example 1:


Input: n = 31

Output: 3

Explanation:


	The digits of n are [3, 1].
	The possible products of any two digits are: 3 * 1 = 3.
	The maximum product is 3.



Example 2:


Input: n = 22

Output: 4

Explanation:


	The digits of n are [2, 2].
	The possible products of any two digits are: 2 * 2 = 4.
	The maximum product is 4.



Example 3:


Input: n = 124

Output: 8

Explanation:


	The digits of n are [1, 2, 4].
	The possible products of any two digits are: 1 * 2 = 2, 1 * 4 = 4, 2 * 4 = 8.
	The maximum product is 8.



 
Constraints:


	10 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 42.8 MB (beats 19.03%)  
**Submitted:** 2026-08-19T11:19:40.013Z  

```java
class Solution {
    public int maxProduct(int n) {
        int sum1=-1,sum2=-1;
        while(n!=0){
            int digit=n%10;
            if(sum1<digit){
                sum2=sum1;
                sum1=digit;
            }else if(sum2<digit){
                sum2=digit;
            }
            n/=10;
        }
        return sum1*sum2;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-of-two-digits/)