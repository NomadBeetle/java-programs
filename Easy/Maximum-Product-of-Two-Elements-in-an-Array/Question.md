# 1464. Maximum Product of Two Elements in an Array

## Problem Statement

Given an integer array `nums`, choose **two different indices** `i` and `j`.

Return the maximum value of:

```text
(nums[i] - 1) * (nums[j] - 1)
```

---

## Examples

### Example 1

**Input**

```text
nums = [3,4,5,2]
```

**Output**

```text
12
```

**Explanation**

Choose `4` and `5`.

```text
(4 - 1) × (5 - 1)
= 3 × 4
= 12
```

---

### Example 2

**Input**

```text
nums = [1,5,4,5]
```

**Output**

```text
16
```

**Explanation**

Choose both `5`s.

```text
(5 - 1) × (5 - 1)
= 4 × 4
= 16
```

---

### Example 3

**Input**

```text
nums = [3,7]
```

**Output**

```text
12
```

**Explanation**

```text
(3 - 1) × (7 - 1)
= 2 × 6
= 12
```

---

## Constraints

- `2 <= nums.length <= 500`
- `1 <= nums[i] <= 1000`

