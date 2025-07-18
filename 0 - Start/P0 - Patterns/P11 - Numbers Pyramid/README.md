# 🔢 Number Pyramid Pattern

## 📝 Problem Statement

Print a **number pyramid** where each row contains the same number equal to the row number, aligned centrally to form a pyramid shape.

---

## 📥 Input
- Integer `n` → number of rows

---

## 📤 Output
- A pyramid pattern of numbers, where each row prints the row number repeated

---

## 🔍 Example

### 🔸 Input:

- rows = 5

### 🔸 Output:

- In Code

---

## ✅ Approach

1. Loop from `1` to `n` for rows.
2. For each row:
   - Print spaces to align pyramid: `(n - row + 1)` spaces.
   - Print the row number `row` times separated by spaces.
3. Print newline after each row.

---