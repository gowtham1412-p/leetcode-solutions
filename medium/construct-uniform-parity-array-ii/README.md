# Construct Uniform Parity Array Ii

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T16:57:19.297Z  

```unknown
1class Solution {
2    public String toLowerCase(String s) {
3        int n=s.length();
4        String a="";
5        for(int i=0;i<n;i++){
6            char ch=s.charAt(i);
7            if(ch>='A'&& ch<='Z'){
8                ch=(char)(ch+32);
9            }
10                a+=ch;
11        }
12        return a;
13    }
14}
```

---

[View on LeetCode](https://leetcode.com/problems/construct-uniform-parity-array-ii/)