# Longest Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s` which consists of lowercase or uppercase letters, return the length of the **longest palindrome** that can be built with those letters.

Letters are **case sensitive**, for example, `"Aa"` is not considered a palindrome.

 

**Example 1:**

```
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

```

**Example 2:**

```
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

```

 

**Constraints:**

- 1 <= s.length <= 2000
- s consists of lowercase and/or uppercase English letters only.

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 7.92%)  
**Memory:** 43.2 MB (beats 53.23%)  
**Submitted:** 2026-10-13T14:00:13.012Z  

```java
class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)%2==1){
                count++;
            }else{
                count--;
            }
        }
            if(count>1){
                return n-count+1;
            }
            return n;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindrome/)