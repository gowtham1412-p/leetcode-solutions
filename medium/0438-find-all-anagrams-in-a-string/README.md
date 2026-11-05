# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in **any order**.

 

**Example 1:**

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

**Example 2:**

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

**Constraints:**

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 65.60%)  
**Memory:** 46.3 MB (beats 92.05%)  
**Submitted:** 2026-11-05T05:39:43.906Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int n=s.length();
        int m=p.length();

        int a[]=new int[26];
        int b[]=new int[26];
        if(m>n)
           return ans;
        for(int i=0;i<m;i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }   
        for(int i=0;i<=n-m;i++){
            if(Arrays.equals(a,b)){
                ans.add(i);
            }
            if(i+m<n){
                b[s.charAt(i)-'a']--;
                b[s.charAt(i+m)-'a']++;
            }
        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)