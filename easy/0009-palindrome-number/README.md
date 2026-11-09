# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

 

**Example 1:**

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

**Example 2:**

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

**Example 3:**

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

**Constraints:**

- -231 <= x <= 231 - 1

 

**Follow up:** Could you solve it without converting the integer to a string?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 30.35%)  
**Memory:** 45.3 MB (beats 94.88%)  
**Submitted:** 2026-11-09T09:18:57.287Z  

```java
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int digit=0;
        int x1=x;
        while(x>0){
            digit=(digit*10)+(x%10);
            x/=10;
        }
        return digit==x1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)