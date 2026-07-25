# 3536. Maximum Product of Two Digits

**Difficulty:** Easy

## Problem Statement

You are given a positive integer `n`.

Return the **maximum product** of any two digits in `n`.

> **Note:** You may use the same digit twice **only if it appears more than once** in the number.

---

## Examples

### Example 1

**Input:**
```text
n = 31
```

**Output:**
```text
3
```

**Explanation:**

The digits are `[3, 1]`.

Possible products:
- `3 × 1 = 3`

Maximum product = **3**

---

### Example 2

**Input:**
```text
n = 22
```

**Output:**
```text
4
```

**Explanation:**

The digits are `[2, 2]`.

Possible products:
- `2 × 2 = 4`

Maximum product = **4**

---

### Example 3

**Input:**
```text
n = 124
```

**Output:**
```text
8
```

**Explanation:**

The digits are `[1, 2, 4]`.

Possible products:
- `1 × 2 = 2`
- `1 × 4 = 4`
- `2 × 4 = 8`

Maximum product = **8**

---

## Constraints

- `10 <= n <= 10^9`
