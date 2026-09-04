# Rotate String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.


	For example, if s = "abcde", then it will be "bcdea" after one shift.


 
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:
Input: s = "abcde", goal = "abced"
Output: false

 
Constraints:


	1 <= s.length, goal.length <= 100
	s and goal consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 64.51%)  
**Memory:** 43.7 MB (beats 15.75%)  
**Submitted:** 2026-09-04T16:33:40.668Z  

```java
class Solution {
    public boolean rotateString(String s, String goal) {
          if(s.length()!=goal.length()){
            return false;
          }
          String a=s+s;
          return a.contains(goal);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-string/)