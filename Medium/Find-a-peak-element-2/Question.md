# 1901. Find a Peak Element II

**Difficulty**: Medium
**Time Complexity Requirement**: O(m log n) or O(n log m)

---

## Problem Statement

A **peak element** in a 2D grid is an element that is **strictly greater than all of its adjacent neighbors** to the **left**, **right**, **top**, and **bottom**.

You are given a `0-indexed` `m x n` matrix `mat` where **no two adjacent cells are equal**.

Find any **peak element** `mat[i][j]` and return a **2-element array** `[i, j]` representing the row and column indices of the peak.

You may assume that the entire matrix is surrounded by an outer perimeter with the value `-1` in each cell.

---

## Constraints

* `m == mat.length`
* `n == mat[i].length`
* `1 <= m, n <= 500`
* `1 <= mat[i][j] <= 10⁵`
* No two adjacent cells are equal.

---

## Examples

### Example 1

```
Input:  mat = [[1, 4],
               [3, 2]]
Output: [0, 1]  or  [1, 0]
Explanation: Both 4 and 3 are peak elements.
```

### Example 2

```
Input: mat = [[10, 20, 15],
              [21, 30, 14],
              [ 7, 16, 32]]
Output: [1, 1] or [2, 2] or any other peak
```

---

## Requirements

You must write an algorithm with:

* Time complexity **O(m log n)** or **O(n log m)**
* Space complexity **O(1)** (not counting recursion stack if applicable)

