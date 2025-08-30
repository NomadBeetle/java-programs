# 4Sum

**Difficulty:** Medium

---

## Problem Statement

Given an array `nums` of `n` integers, return all the unique quadruplets `[nums[a], nums[b], nums[c], nums[d]]` such that:

* `0 <= a, b, c, d < n`
* `a`, `b`, `c`, and `d` are **distinct indices**
* `nums[a] + nums[b] + nums[c] + nums[d] == target`

You may return the answer in **any order**, but the solution must not contain duplicate quadruplets.

---

## Example 1

**Input:**

```
nums = [1, 0, -1, 0, -2, 2]
target = 0
```

**Output:**

```
[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
```

---

## Example 2

**Input:**

```
nums = [2, 2, 2, 2, 2]
target = 8
```

**Output:**

```
[[2, 2, 2, 2]]
```

---

## Constraints

* `1 <= nums.length <= 200`
* `-10^9 <= nums[i] <= 10^9`
* `-10^9 <= target <= 10^9`

---

## Notes

* Each quadruplet must be unique.
* The order of numbers inside a quadruplet does not matter, but you should not include duplicates like `[1,0,-1,0]` and `[0,-1,1,0]`.
