# Find the Middle Index in Array (LeetCode 1991)

- **Problem Link:** https://leetcode.com/problems/find-the-middle-index-in-array/
- **Difficulty:** Easy
- **Topics:** Array, Prefix Sum
- **Status:** ✅ Solved

---

## Problem Statement

Given a **0-indexed** integer array `nums`, return the **leftmost middle index**.

A **middle index** is an index where the sum of all elements strictly to its left is equal to the sum of all elements strictly to its right.

If no such index exists, return `-1`.

> **Note:** The left and right sums do **not** include the element at the middle index.

---

## Examples

### Example 1

**Input**
```text
nums = [2,3,-1,8,4]
```

**Output**
```text
3
```

**Explanation**

- Left Sum = `2 + 3 + (-1) = 4`
- Right Sum = `4`

Since both sums are equal, index `3` is the middle index.

---

### Example 2

**Input**
```text
nums = [1,-1,4]
```

**Output**
```text
2
```

---

### Example 3

**Input**
```text
nums = [2,5]
```

**Output**
```text
-1
```

---

## Constraints

- `1 <= nums.length <= 100`
- `-1000 <= nums[i] <= 1000`

