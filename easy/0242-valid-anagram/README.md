# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 
Example 1:


Input: s = "anagram", t = "nagaram"

Output: true


Example 2:


Input: s = "rat", t = "car"

Output: false


 
Constraints:


	1 <= s.length, t.length <= 5 * 104
	s and t consist of lowercase English letters.


 
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 43 MB  
**Submitted:** 2026-09-01T04:59:10.395Z  

```java
        Arrays.sort(ch);
        char chi[]=t.toCharArray();
        Arrays.sort(chi);
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=chi[i]){
        }
                return false;
            }

        return true;
        char ch[]=s.toCharArray();
            return false;
        if(s.length()!=t.length())
    public boolean isAnagram(String s, String t) {
class Solution {

```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)