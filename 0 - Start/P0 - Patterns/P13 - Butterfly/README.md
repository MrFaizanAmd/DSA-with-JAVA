# 🦋 Butterfly Pattern

## 📝 Problem Statement

Print a **butterfly pattern** of stars (`*`) with a symmetric shape formed by two mirrored triangles separated by spaces.

---

## 📥 Input
- Integer `n` → size of the butterfly (number of rows for half the pattern)

---

## 📤 Output
- A butterfly-shaped star pattern with `2*n` rows

---

## 🔍 Example

### 🔸 Input:

- size = 4

### 🔸 Output:

- In Code

---

## ✅ Approach

1. Print the **top half** (rows 1 to n):
   - Print `row` stars
   - Print `(size - row) * 2` spaces (each space is double `"  "` for alignment)
   - Print `row` stars again
2. Print the **bottom half** (rows 1 to n):
   - Print `(size - row + 1)` stars
   - Print `(row - 1) * 2` spaces
   - Print `(size - row + 1)` stars again
3. Move to the next line after each row

---