# 🔢 Palindromic Number Pyramid

## 📝 Problem Statement

Print a **palindromic number pyramid** where each row contains numbers descending from the row number down to `1`, then ascending back up to the row number, forming a palindrome pattern.

---

## 📥 Input
- Integer `n` → number of rows

---

## 📤 Output
- A palindromic number pyramid pattern with `n` rows

---

## 🔍 Example

### 🔸 Input:

- rows = 5

### 🔸 Output:

- In Code

---

## ✅ Approach

1. For each row `i` from 1 to `n`:
   - Print spaces for alignment: `(n - i)` times (2 spaces each).
   - Print descending numbers from `i` down to `1`.
   - Print ascending numbers from `2` up to `i`.
2. Move to the next line after each row.

---