# Cinema Seat Allocation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T11:19:16.911Z  

```unknown
1class Solution {
2    public int maxProduct(int n) {
3        int sum1=-1,sum2=-1;
4        while(n!=0){
5            int digit=n%10;
6            if(sum1<digit){
7                sum2=sum1;
8                sum1=digit;
9            }else if(sum2<digit){
10                sum2=digit;
11            }
12            n/=10;
13        }
14        return sum1*sum2;
15    }
16}
```

---

[View on LeetCode](https://leetcode.com/problems/cinema-seat-allocation/)