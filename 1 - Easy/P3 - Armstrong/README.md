# 🚀 1134. Armstrong Number – LeetCode  
**Status:** ✅ Solved  
**Difficulty:** Easy  
**Link:** [LeetCode Problem 1134](https://leetcode.com/problems/armstrong-number/)  
**Tags:** Math

---

## 📝 Problem Statement

An **Armstrong number** of `n` digits is an integer such that the sum of its digits raised to the power `n` is equal to the number itself.

Given an integer `x`, return `true` if it is an Armstrong number, otherwise return `false`.

---

## 🧠 Formula

If a number has `d` digits:
`n = (d1^d) + (d2^d) + ... + (dn^d)`

Where `d1, d2, ..., dn` are the digits of the number.

---

## 📥 Examples

### ✅ Example 1

**Input:**
153

**Output:**
isArmstrong : true


**Explanation:**  
153 = 1³ + 5³ + 3³ = 153 ✅

---

### ❌ Example 2
**Input:**

**Output:**
text : false

**Explanation:**  
123 ≠ 1³ + 2³ + 3³ = 36 ❌

---