# 🔁 Fibonacci Number — LeetCode Problem #509

## 📝 Problem Statement

The **Fibonacci sequence** is defined as:

- `F(0) = 0`
- `F(1) = 1`
- For `n > 1`, `F(n) = F(n - 1) + F(n - 2)`

Given an integer `n`, return the **n-th Fibonacci number**.

---

## 📥 Input
- An integer `n` such that `0 <= n <= 30`

## 📤 Output
- The `n-th` Fibonacci number

---

## 🔍 Examples

| Input | Output |
|-------|--------|
| `2`   | `1`    |
| `3`   | `2`    |
| `5`   | `5`    |
| `10`  | `55`   |

---

## ✅ Logic / Approach

### 🔸 Iterative (Efficient)
1. Initialize: `a = 0`, `b = 1`
2. Loop from `2` to `n`:
   - `temp = a + b`
   - `a = b`
   - `b = temp`
3. Return `b` (or `a` for base cases)

---