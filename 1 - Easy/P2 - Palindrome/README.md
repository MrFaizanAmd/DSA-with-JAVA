# 🚀 Palindrome Number – LeetCode Problem #9

This Java program solves [LeetCode Problem 9: Palindrome Number](https://leetcode.com/problems/palindrome-number/).

---

## 📚 Problem Description

**LeetCode #9 – Palindrome Number**

> Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

A palindrome number is a number that reads the same forward and backward. For example:
- `121` → Palindrome ✅
- `-121` → Not a palindrome ❌
- `10` → Not a palindrome ❌

---

## 🧠 Approach

- Negative numbers are automatically **not palindromes**.
- The number is reversed digit by digit.
- The reversed number is then compared with the original number.
- If they are equal, the number is a palindrome.

---

#### Example 1:

- Input: x = 121
- Output: true
- Explanation: 121 reads as 121 from left to right and from right to left.

#### Example 2:

- Input: x = -121
- Output: false
- Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

#### Example 3:

- Input: x = 10
- Output: false
- Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

#### Constraints:

- ``` -231 <= x <= 231 - 1 ```
 

**Follow up**: Could you solve it without converting the integer to a string?