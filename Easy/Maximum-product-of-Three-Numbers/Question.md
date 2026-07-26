# 628. Maximum Product of Three Numbers

**Difficulty:** Easy  
**Topics:** Array, Sorting  
**LeetCode:** 628

---

## Problem Statement

Given an integer array `nums`, return the **maximum possible product** of any **three numbers** in the array.

You may assume that the array contains at least three integers.

---

## Examples

### Example 1

**Input**
```text
nums = [1,2,3]
```

**Output**
```text
6
```

**Explanation**

The only possible product is:

```text
1 × 2 × 3 = 6
```

---

### Example 2

**Input**
```text
nums = [1,2,3,4]
```

**Output**
```text
24
```

**Explanation**

Choosing the three largest numbers gives:

```text
2 × 3 × 4 = 24
```

---

### Example 3

**Input**
```text
nums = [-1,-2,-3]
```

**Output**
```text
-6
```

**Explanation**

Only one combination exists:

```text
-1 × -2 × -3 = -6
```

---

## Constraints

- `3 <= nums.length <= 10^4`
- `-1000 <= nums[i] <= 1000`

