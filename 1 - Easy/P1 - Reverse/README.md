# 🧮 Reverse Integer — LeetCode Problem #7

## 📝 Problem Statement

Given a signed 32-bit integer `x`, return `x` with its digits reversed.  
If reversing `x` causes the value to go outside the 32-bit signed integer range `[-2^31, 2^31 - 1]`, return `0`.

> **Note:** You must not store 64-bit integers (like `long` in Java) to handle overflow.

---

## 📥 Input
- A 32-bit signed integer `x`  
  Example: `x = 123` or `x = -456`

## 📤 Output
- An integer with the digits of `x` reversed  
  - If result overflows 32-bit range, return `0`

---

## 🔍 Examples

| Input | Output |
|-------|--------|
| `123` | `321`  |
| `-456`| `-654` |
| `120` | `21`   |
| `1534236469` | `0` (overflow) |

---

## 💡 Constraints
- `-2^31 <= x <= 2^31 - 1`

---

## ✅ Logic / Approach

1. Extract the last digit using `% 10`.
2. Push the digit into `rev = rev * 10 + digit`.
3. Remove the last digit from `x` using `x /= 10`.
4. Before updating `rev`, **check for overflow**:
   - If `rev > Integer.MAX_VALUE / 10` or `rev < Integer.MIN_VALUE / 10`, return `0`.

---