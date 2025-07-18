# 🔢 Inverted Half Pyramid with Numbers

## 📝 Problem Statement

Print an **inverted half pyramid** where each row contains numbers starting from `1` up to a decreasing count based on the row number.

---

## 📥 Input
- Integer `n` → number of rows

---

## 📤 Output
- An inverted half pyramid with numbers starting at 1 for each row

---

## 🔍 Example

### 🔸 Input:

- rows = 5

### 🔸 Output:

- In Code

---

## ✅ Approach

1. Loop from `1` to `n` (rows).
2. For each row `i`, print numbers from `1` to `(n - i + 1)`.
3. Print newline after each row.

---