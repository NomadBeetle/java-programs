# Find Pivot Index (LeetCode 724)

- **Problem Link:** https://leetcode.com/problems/find-pivot-index/
- **Difficulty:** Easy
- **Topics:** Array, Prefix Sum
- **Status:** ✅ Solved

---

## Problem Statement

Given an integer array `nums`, return the **leftmost pivot index**.

A **pivot index** is an index where the sum of all the numbers strictly to its left is equal to the sum of all the numbers strictly to its right.

If no such index exists, return `-1`.

---

## Examples

### Example 1

**Input**
```text
nums = [1,7,3,6,5,6]
```

**Output**
```text
3
```

**Explanation**

- Left Sum = `1 + 7 + 3 = 11`
- Right Sum = `5 + 6 = 11`

Since both sums are equal, index `3` is the pivot index.

---

### Example 2

**Input**
```text
nums = [1,2,3]
```

**Output**
```text
-1
```

---

### Example 3

**Input**
```text
nums = [2,1,-1]
```

**Output**
```text
0
```

---

## Constraints

- `1 <= nums.length <= 10⁴`
- `-1000 <= nums[i] <= 1000`
