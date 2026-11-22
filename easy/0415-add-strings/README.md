# Add Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two non-negative integers, `num1` and `num2` represented as string, return *the sum of* `num1` *and* `num2` *as a string*.

You must solve the problem without using any built-in library for handling large integers (such as `BigInteger`). You must also not convert the inputs to integers directly.

 

Original
Java
**Example 1:**

```
Input: num1 = "11", num2 = "123"
Output: "134"

```

**Example 2:**

```
Input: num1 = "456", num2 = "77"
Output: "533"

```

**Example 3:**

```
Input: num1 = "0", num2 = "0"
Output: "0"

```

 

**Constraints:**

- 1 <= num1.length, num2.length <= 104
- num1 and num2 consist of only digits.
- num1 and num2 don't have any leading zeros except for the zero itself.

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 5.61%)  
**Memory:** 46.4 MB (beats 8.35%)  
**Submitted:** 2026-11-22T18:07:59.592Z  

```java
class Solution {
    public String addStrings(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();     
        int res[]=new int[m+n];
        int k=res.length-1;
        int i=m-1;
        int j=n-1;
        int carry=0;
        while(i>=0||j>=0||carry>0){
            int n1=0;
            int n2=0;
            if(i>=0){
                n1=num1.charAt(i)-'0';
            }
            if(j>=0){
                n2=num2.charAt(j)-'0';
            }
            int sum=n1+n2+carry;
            res[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        String ans="";
        for(int dig:res){
            if(ans.equals("")&&dig==0){
                continue;
            }
            ans+=dig;
        }
        return ans.equals("") ? "0" :ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-strings/)