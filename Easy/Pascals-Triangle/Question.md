# Pascal's Triangle (LeetCode 118)

- **Problem Link:** https://leetcode.com/problems/pascals-triangle/
- **Difficulty:** Easy
- **Topics:** Array, Dynamic Programming
- **Status:** ✅ Solved

---

## Problem Statement

Given an integer `numRows`, return the first `numRows` of Pascal's Triangle.

In Pascal's Triangle:

- The first and last element of every row is `1`.
- Every other element is the sum of the two elements directly above it.

---

## Examples

### Example 1

**Input**
```text
numRows = 5
```

**Output**
```text
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

---

### Example 2

**Input**
```text
numRows = 1
```

**Output**
```text
[
 [1]
]
```

---

## Constraints

- `1 <= numRows <= 30`
