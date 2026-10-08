# Excel Sheet Column Title

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `columnNumber`, return *its corresponding column title as it appears in an Excel sheet*.

For example:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

```

 

**Example 1:**

```
Input: columnNumber = 1
Output: "A"

```

**Example 2:**

```
Input: columnNumber = 28
Output: "AB"

```

**Example 3:**

```
Input: columnNumber = 701
Output: "ZY"

```

 

**Constraints:**

- 1 <= columnNumber <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 14.24%)  
**Memory:** 42.6 MB (beats 22.92%)  
**Submitted:** 2026-10-08T14:14:25.561Z  

```java
class Solution {
    public String convertToTitle(int columnNumber) {
        String coln="";
        while(columnNumber>0){
            int rem=(columnNumber-1)%26;
            coln=(char)(rem+'A')+coln;
            columnNumber=(columnNumber-1)/26;
        }
        return coln;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-title/)