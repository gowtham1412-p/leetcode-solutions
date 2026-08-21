# Length of Last Word

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.


Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.


Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.


 
Constraints:


	1 <= s.length <= 104
	s consists of only English letters and spaces ' '.
	There will be at least one word in s.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.1 MB (beats 51.97%)  
**Submitted:** 2026-08-21T17:51:23.706Z  

```java
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else if(count>0){
                break;
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/length-of-last-word/)