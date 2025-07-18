# ♦️ Solid Rhombus Pattern

## 📝 Problem Statement

Print a **solid rhombus** pattern of stars (`*`) aligned diagonally, with each row indented by spaces to form a rhombus shape.

---

## 📥 Input
- Integer `n` → number of rows (and columns of stars)

---

## 📤 Output
- A solid rhombus made of `*` characters

---

## 🔍 Example

### 🔸 Input:

- rows = 4

### 🔸 Output:

- In Code

---

## ✅ Approach

1. Loop through rows from `1` to `n`.
2. For each row:
   - Print `(n - row + 1)` double spaces `"  "` for indentation.
   - Print `n` stars with spaces.
3. Print newline after each row.

---