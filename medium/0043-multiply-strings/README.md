# Multiply Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.

**Note:** You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Original
Java
**Example 1:**

```
Input: num1 = "2", num2 = "3"
Output: "6"

```

**Example 2:**

```
Input: num1 = "123", num2 = "456"
Output: "56088"

```

 

**Constraints:**

- 1 <= num1.length, num2.length <= 200
- num1 and num2 consist of digits only.
- Both num1 and num2 do not contain any leading zero, except the number 0 itself.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 9.07%)  
**Memory:** 44.4 MB (beats 7.73%)  
**Submitted:** 2026-11-21T13:21:45.232Z  

```java
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int m=num1.length();
        int n=num2.length();
        int res[]=new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int n1=num1.charAt(i)-'0';
                int n2=num2.charAt(j)-'0';
                int pro=n1*n2;
                int sum=pro+res[i+j+1];
                res[i+j+1]=sum%10;
                res[i+j]+=sum/10;

            }
        }
        String ans="";
        for(int dig:res){
            if(ans.equals("")&&dig==0){
                continue;
            }
            ans+=dig;
        }
        return ans;


        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/multiply-strings/)