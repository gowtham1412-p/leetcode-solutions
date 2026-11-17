# Add Binary

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two binary strings `a` and `b`, return *their sum as a binary string*.

 

Original
Java
**Example 1:**

```
Input: a = "11", b = "1"
Output: "100"

```

**Example 2:**

```
Input: a = "1010", b = "1011"
Output: "10101"

```

 

**Constraints:**

- 1 <= a.length, b.length <= 104
- a and b consist only of '0' or '1' characters.
- Each string does not contain leading zeros except for the zero itself.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 10.01%)  
**Memory:** 44.6 MB (beats 7.38%)  
**Submitted:** 2026-11-17T18:40:04.310Z  

```java
class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String ans="";
        while(i>=0||j>=0||carry>0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            ans=(sum%2)+ans;
            carry=sum/2;
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-binary/)