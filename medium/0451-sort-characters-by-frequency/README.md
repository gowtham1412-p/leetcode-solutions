# Sort Characters By Frequency

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, sort it in **decreasing order** based on the **frequency** of the characters. The **frequency** of a character is the number of times it appears in the string.

Return *the sorted string*. If there are multiple answers, return *any of them*.

 

Original
Java
**Example 1:**

```
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

```

**Example 2:**

```
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

```

**Example 3:**

```
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.

```

 

**Constraints:**

- 1 <= s.length <= 5 * 105
- s consists of uppercase and lowercase English letters and digits.

## Solution

**Language:** Java  
**Runtime:** 47 ms (beats 10.27%)  
**Memory:** 45.8 MB (beats 94.44%)  
**Submitted:** 2026-11-15T14:35:02.728Z  

```java
class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        int count[]=new int[256];
        for(int i=0;i<n;i++){
            count[s.charAt(i)]++;
        }
        char ch[]=new char[n];
        int k=0;
        for(int f=n;f>=1;f--){
            for(int i=0;i<256;i++){
                 if(count[i]==f){
                    for(int j=0;j<f;j++){
                        ch[k++]=(char)i;
                    }
                 }
            }
        }
        return new String(ch);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-characters-by-frequency/)