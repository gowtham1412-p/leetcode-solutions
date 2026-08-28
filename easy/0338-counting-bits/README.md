# Counting Bits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
Do not solve it with built-in functions (i.e., like __builtin_popcount in C++).
 
Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10


Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101


 
Constraints:


	0 <= n <= 105


 
Follow up:


	It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in linear time O(n) and possibly in a single pass?

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 22.17%)  
**Memory:** 48.7 MB (beats 50.82%)  
**Submitted:** 2026-08-28T18:12:04.272Z  

```java
class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
        int count=0;
        int num=i;
        while(num>0){
           if((num&1)==1){
            count++;
           }
           num=num>>1;
        }
        arr[i]=count;
    }
    return arr;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/counting-bits/)