# 410. Split Array Largest Sum

## Problem Statement

Given an integer array `nums` and an integer `m`, split `nums` into `m` non-empty contiguous subarrays. Minimize the largest sum among these `m` subarrays.

### Example 1:
#### Input:
```
nums = [7,2,5,10,8], m = 2
```
#### Output:
```
18
```
#### Explanation:
There are four ways to split `nums` into two subarrays:
- `[7,2,5]` and `[10,8]` -> max sum = 18
- `[7,2]` and `[5,10,8]` -> max sum = 23
- `[7]` and `[2,5,10,8]` -> max sum = 25
- `[7,2,5,10]` and `[8]` -> max sum = 24
The minimum of these is 18.

### Example 2:
#### Input:
```
nums = [1,2,3,4,5], m = 2
```
#### Output:
```
9
```

### Constraints:
- `1 <= nums.length <= 1000`
- `0 <= nums[i] <= 10^6`
- `1 <= m <= min(50, nums.length)`