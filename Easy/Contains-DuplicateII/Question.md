# 219. Contains Duplicate II

## Problem Statement

Given an integer array `nums` and an integer `k`, return `true` if there are two distinct indices `i` and `j` in the array such that:

- `nums[i] == nums[j]`
- `abs(i - j) <= k`

Otherwise, return `false`.

## Examples

### Example 1

**Input**
```text
nums = [1,2,3,1], k = 3
```

**Output**
```text
true
```

### Example 2

**Input**
```text
nums = [1,0,1,1], k = 1
```

**Output**
```text
true
```

### Example 3

**Input**
```text
nums = [1,2,3,1,2,3], k = 2
```

**Output**
```text
false
```

## Constraints

- `1 <= nums.length <= 10^5`
- `-10^9 <= nums[i] <= 10^9`
- `0 <= k <= 10^5`