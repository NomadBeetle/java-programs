# 1802. Maximum Value at a Given Index in a Bounded Array

## Problem Statement

You are given three positive integers: `n`, `index`, and `maxSum`. You want to construct an array `nums` (0-indexed) that satisfies the following conditions:

- `nums.length == n`
- `nums[i]` is a **positive integer** where `0 <= i < n`
- `abs(nums[i] - nums[i+1]) <= 1` where `0 <= i < n-1`
- The **sum** of all the elements of `nums` does not exceed `maxSum`
- `nums[index]` is **maximized**

Return the **maximum value** of `nums[index]` in such a constructed array.

**Note**: `abs(x)` equals `x` if `x >= 0`, and `-x` otherwise.

---

## Examples

### Example 1:
```
Input: n = 4, index = 2, maxSum = 6
Output: 2

Explanation: One valid array is [1, 2, 2, 1].
No array that satisfies the conditions can have nums[2] == 3.
So, 2 is the maximum possible value at index 2.
```

### Example 2:
```
Input: n = 6, index = 1, maxSum = 10
Output: 3
```

---

## Constraints

- `1 <= n <= maxSum <= 10^9`
- `0 <= index < n`
