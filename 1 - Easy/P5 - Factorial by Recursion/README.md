# 🔁 Factorial Using Recursion – Java Program

This Java program calculates the **factorial** of a number using a **recursive function**.

---

## 🧾 What is Factorial?

The **factorial** of a non-negative integer `n` is the product of all positive integers less than or equal to `n`.

### Formula:

`n! = n × (n−1) × (n−2) × ... × 1`

Also,
- `0! = 1` (by definition)
- Factorial is **not defined for negative numbers**

---

## 🧠 Approach: Recursive Method

### Logic:
- If `num < 0`: print error
- If `num == 0 || num == 1`: return 1 (base case)
- Else: `return num * factorial(num - 1)`

---

## 📥 Examples

### ✅ Example 1:
**Input:**
Enter the No. : 5

**Output:**
Factorial is 120

### ✅ Example 2:
**Input:**
Enter the No. : 0

**Output:**
Factorial is 1

### ❌ Example 3:
**Input:**
Enter the No. : -3

**Output:**
Factorial not possible.
Factorial is 0

---