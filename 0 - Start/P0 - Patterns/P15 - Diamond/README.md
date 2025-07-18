# 💎 Diamond Pattern

## 📝 Problem Statement

Print a **diamond pattern** made of stars (`*`), which consists of an upper pyramid and a lower inverted pyramid aligned symmetrically.

---

## 📥 Input
- Integer `n` → size of the diamond (number of rows in the upper half)

---

## 📤 Output
- A diamond-shaped star pattern with `2*n - 1` rows

---

## 🔍 Example

### 🔸 Input:

- size = 5

### 🔸 Output:

- In Code

---

## ✅ Approach

1. **Upper half** (rows 1 to n):
   - Print `(n - row)` double spaces `"  "` for indentation.
   - Print `(2*row - 1)` stars separated by spaces.
2. **Lower half** (rows n-1 down to 1):
   - Repeat the above with decreasing rows.
3. Move to next line after each row.

---