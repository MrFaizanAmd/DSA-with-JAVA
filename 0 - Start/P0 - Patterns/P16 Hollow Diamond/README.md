# 💎 Hollow Diamond Pattern

## 📝 Problem Statement

Print a **hollow diamond pattern** made of stars (`*`), where only the border stars are printed, leaving the inside hollow.

---

## 📥 Input
- Integer `n` → size of the diamond (number of rows in the upper half)

---

## 📤 Output
- A hollow diamond star pattern with `2*n - 1` rows

---

## 🔍 Example

### 🔸 Input:

- size = 5

### 🔸 Output:

- In Code

---

## ✅ Approach

1. **Upper half** (rows 1 to n):
   - Print `(n - row + 1)` double spaces for indentation.
   - Print `*`.
   - Print `2 * (row - 1)` double spaces inside the diamond.
   - Print `*` again if `row > 1`.
2. **Lower half** (rows 1 to n-1):
   - Print increasing spaces.
   - Print `*`.
   - Print decreasing spaces inside.
   - Print `*` if `row != n - 1`.
3. Move to next line after each row.

---