# 🔺 Hollow Right-Angled Triangle Pattern

## 📝 Problem Statement

Write a program to print a **hollow right-angled triangle** pattern using `*`.  
The triangle should have `n` rows and be **hollow inside**, with stars only at the borders.

---

## 📥 Input
- Integer `n` → number of rows in the triangle

---

## 📤 Output
- A right-angled triangle of height `n`, hollow inside.

---

## 🔍 Example

### 🔸 Input:

- rows = 4
- cols = 5


### 🔸 Output:
- In Code


---

## ✅ Approach

1. Loop from `1` to `n` (rows).
2. For each row `i`:
   - If it's the **first or last row**, print `i` stars.
   - Else:
     - Print `*`, then `(i - 2)` spaces, then another `*`.

---