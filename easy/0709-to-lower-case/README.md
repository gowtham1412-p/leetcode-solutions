# To Lower Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 
Example 1:

Input: s = "Hello"
Output: "hello"


Example 2:

Input: s = "here"
Output: "here"


Example 3:

Input: s = "LOVELY"
Output: "lovely"


 
Constraints:


	1 <= s.length <= 100
	s consists of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 9.95%)  
**Memory:** 43.6 MB (beats 5.21%)  
**Submitted:** 2026-09-03T16:57:30.116Z  

```java
class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        String a="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                ch=(char)(ch+32);
            }
                a+=ch;
        }
        return a;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/to-lower-case/)