# Valid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:


	Open brackets must be closed by the same type of brackets.
	Open brackets must be closed in the correct order.
	Every close bracket has a corresponding open bracket of the same type.


 
Example 1:


Input: s = "()"

Output: true


Example 2:


Input: s = "()[]{}"

Output: true


Example 3:


Input: s = "(]"

Output: false


Example 4:


Input: s = "([])"

Output: true


Example 5:


Input: s = "([)]"

Output: false


 
Constraints:


	1 <= s.length <= 104
	s consists of parentheses only '()[]{}'.

## Solution

**Language:** C  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 9.5 MB (beats 10.51%)  
**Submitted:** 2026-08-21T17:32:44.333Z  

```c
bool isValid(char* s) {
    char stack[10000];
    int top=-1;
    for(int i=0;s[i]!='\0';i++){
        char c=s[i];
        if(c=='('||c=='{'||c=='['){
            stack[++top]=c;
        }else{
            if(top==-1){
                return false;
            }
            char x=stack[top];
            top--;
            if((c==')'&&x!='(')||(c=='}'&&x!='{')||(c==']'&&x!='[')){
                return false;
            }
        }
    }
    return top==-1;
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parentheses/)