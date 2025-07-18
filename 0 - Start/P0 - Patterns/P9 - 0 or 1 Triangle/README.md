# 🔢 0 or 1 Triangle Pattern

## 📝 Problem Statement

Print a triangle pattern of `0`s and `1`s where the value alternates such that the sum of the row and column indices determines the output:  
- Print `1` if `(row + col)` is even  
- Print `0` if `(row + col)` is odd

---

## 📥 Input
- Integer `n` → number of rows

---

## 📤 Output
- Triangle pattern of `0`s and `1`s alternating based on position

---

## 🔍 Example

### 🔸 Input:

- rows = 5

### 🔸 Output:

- In Code

---

## ✅ Approach

1. Loop through rows from `1` to `n`.
2. For each row, loop through columns from `1` to `row`.
3. Calculate `(row + col) % 2`:  
   - If `0`, print `1`  
   - Else, print `0`
4. Move to next line after each row.

---