# 🔺 Pascal's Triangle

## 📝 Problem Statement

Print the **Pascal's Triangle** pattern, where each number is the sum of the two numbers directly above it in the previous row.

---

## 📥 Input
- Integer `n` → number of rows to print

---

## 📤 Output
- Pascal’s Triangle pattern with `n` rows

---

## 🔍 Example

### 🔸 Input:

- rows = 5

### 🔸 Output:

- In Code

---

## ✅ Approach

1. Loop through rows from `1` to `n`.
2. For each row:
   - Print spaces `(n - row)` for alignment.
   - Use a variable `num` initialized to `1`.
   - Print `row` numbers in the row:
     - Print current `num`.
     - Update `num = num * (row - col) / col` to get next binomial coefficient.
3. Move to next line after each row.

---