# 1346. Check If N and Its Double Exist

## Problem Statement
Given an array `arr` of integers, check if there exist two indices `i` and `j` such that:

- `i != j`
- `0 <= i, j < arr.length`
- `arr[i] == 2 * arr[j]`

## Examples

### Example 1:
**Input:**
```plaintext
arr = [10,2,5,3]
```
**Output:**
```plaintext
true
```
**Explanation:**
For `i = 0` and `j = 2`, `arr[i] == 10 == 2 * 5 == 2 * arr[j]`.

### Example 2:
**Input:**
```plaintext
arr = [3,1,7,11]
```
**Output:**
```plaintext
false
```
**Explanation:**
There is no `i` and `j` that satisfy the conditions.

## Constraints
- `2 <= arr.length <= 500`
- `-10^3 <= arr[i] <= 10^3