# 📏 GCD / HCF of Two Numbers

## 📝 Problem Statement

Given two integers `a` and `b`, find their **Greatest Common Divisor (GCD)**, also known as **Highest Common Factor (HCF)**.

The GCD of two numbers is the largest number that divides both of them without leaving a remainder.

---

## 📥 Input
- Two integers: `a`, `b`  
  Constraints: `1 <= a, b <= 10^9`

## 📤 Output
- An integer representing the GCD of `a` and `b`

---

## 🔍 Examples

| Input    | Output |
|----------|--------|
| `a = 12`, `b = 18` | `6` |
| `a = 100`, `b = 25` | `25` |
| `a = 17`, `b = 31` | `1` (co-prime) |

---

## ✅ Logic / Approach

### 🔸 Euclidean Algorithm (Efficient)
- Repeatedly replace the pair `(a, b)` with `(b, a % b)` until `b == 0`
- When `b` becomes `0`, `a` is the GCD

> **Why Efficient?**  
> Time complexity is `O(log(min(a, b)))`

---