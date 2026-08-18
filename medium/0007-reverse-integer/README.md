# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 
Example 1:

Input: x = 123
Output: 321


Example 2:

Input: x = -123
Output: -321


Example 3:

Input: x = 120
Output: 21


 
Constraints:


	-231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.1 MB  
**Submitted:** 2026-08-18T10:48:44.995Z  

```java
class Solution {
    public int reverse(int x) {
        int digit;
        int rev=0;
        while(x!=0){
            digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        return rev;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)