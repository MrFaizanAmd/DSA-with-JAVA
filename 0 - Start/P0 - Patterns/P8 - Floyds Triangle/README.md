# 🔢 Floyd’s Triangle

## 📝 Problem Statement

Print **Floyd’s Triangle**, a right-angled triangular array of natural numbers, where numbers continue incrementing row-wise.

---

## 📥 Input
- Integer `n` → number of rows

---

## 📤 Output
- Floyd’s triangle with `n` rows, where numbers increase sequentially

---

## 🔍 Example

### 🔸 Input:

- rows = 5

### 🔸 Output:

- In Code

---

## ✅ Approach

1. Initialize a number counter starting at `1`.
2. Use nested loops:
   - Outer loop runs from `1` to `n` for rows.
   - Inner loop runs `row` times to print numbers.
3. Increment the number after printing each value.
4. Print newline after each row.

---