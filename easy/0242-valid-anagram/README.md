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
**Memory:** 42.8 MB  
**Submitted:** 2026-09-01T05:49:56.449Z  

```java
            return false;
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        char chi[]=t.toCharArray();
        Arrays.sort(chi);
        
        if(Arrays.equals(ch,chi)){
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return true;
        }else{
            return false;
        }
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)