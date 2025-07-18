# 🔢 Factorial of a Number

## 📝 Problem Statement

Given a non-negative integer `n`, return the **factorial** of `n`, denoted as `n!`.

> **Definition:**  
> `n! = n × (n-1) × (n-2) × ... × 1`  
> By definition, `0! = 1`

---

## 📥 Input
- An integer `n` such that `0 <= n <= 20`

## 📤 Output
- An integer representing `n!`

---

## 🔍 Examples

| Input | Output |
|-------|--------|
| `0`   | `1`    |
| `5`   | `120`  |
| `7`   | `5040` |

---

## ✅ Logic / Approach

### 🔸 Iterative Method (Recommended)
- Start from `1`, multiply up to `n`

### 🔹 Recursive Method (Simple, but stack usage)
- `factorial(n) = n * factorial(n - 1)`

---