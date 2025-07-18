# 🦋 Hollow Butterfly Pattern

## 📝 Problem Statement

Print a **hollow butterfly pattern** of stars (`*`) where the edges form a butterfly shape, and the inside is hollow (spaces).

---

## 📥 Input
- Integer `n` → size of the butterfly (half rows)

---

## 📤 Output
- A hollow butterfly-shaped star pattern with `2*n` rows

---

## 🔍 Example

### 🔸 Input:

- size = 4

### 🔸 Output:

- In Code

---

## ✅ Approach

1. **Top half (rows 1 to n):**
   - Print stars at the start and end of each row segment (positions 1 and row).
   - Print spaces inside the segments.
   - Print spaces between left and right wings `(size - row) * 2` times.
2. **Bottom half (rows 1 to n):**
   - Print stars at positions `row` and `size`.
   - Print spaces inside the wings.
   - Print spaces between wings `(row - 1) * 2` times.
3. Move to next line after each row.

---