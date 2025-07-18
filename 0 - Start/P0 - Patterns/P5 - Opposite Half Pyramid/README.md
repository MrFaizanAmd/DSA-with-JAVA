# 📐 Opposite Half Pyramid (Right-Aligned)

## 📝 Problem Statement

Write a program to print a **right-aligned half pyramid** using `*` symbols.  
Each row should contain increasing stars, aligned to the right using spaces.

---

## 📥 Input
- Integer `n` → number of rows

---

## 📤 Output

An inverted space + increasing star pattern.

---

## 🔍 Example

### 🔸 Input:

- rows = 4

### 🔸 Output:

- In Code

---

## ✅ Approach

1. For each row:
   - Print `(n - row)` spaces
   - Then print `row` stars
2. Print newline after each row

--