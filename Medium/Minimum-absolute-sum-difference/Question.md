## 1818. Minimum Absolute Sum Difference

**Difficulty:** Medium
**Tags:** Arrays, Binary Search, Greedy

---

### Problem Statement

You are given two **positive integer arrays** `nums1` and `nums2`, both of length `n`.

The **absolute sum difference** of arrays `nums1` and `nums2` is defined as:

$\sum_{i=0}^{n-1} |nums1[i] - nums2[i]|$

You can **replace at most one element** of `nums1` with any other element in `nums1` to **minimize** the absolute sum difference.

Return the **minimum absolute sum difference** after at most one replacement. Since the answer may be large, return it **modulo 10⁹ + 7**.

---

### Note

`|x|` is defined as:

* `x` if `x >= 0`
* `-x` if `x < 0`

---

### Examples

#### Example 1:

**Input:**

```
nums1 = [1,7,5]
nums2 = [2,3,5]
```

**Output:**

```
3
```

**Explanation:**
There are two possible optimal replacements:

* Replace 7 with 1 ➝ \[1,1,5] ⟶ |1-2| + |1-3| + |5-5| = 1 + 2 + 0 = 3
* Replace 7 with 5 ➝ \[1,5,5] ⟶ |1-2| + |5-3| + |5-5| = 1 + 2 + 0 = 3

---

#### Example 2:

**Input:**

```
nums1 = [2,4,6,8,10]
nums2 = [2,4,6,8,10]
```

**Output:**

```
0
```

**Explanation:**
Arrays are already equal; no need for replacement.

---

#### Example 3:

**Input:**

```
nums1 = [1,10,4,4,2,7]
nums2 = [9,3,5,1,7,4]
```

**Output:**

```
20
```

**Explanation:**
Replacing 1 with 10 gives the best result.

---

### Constraints

* `n == nums1.length`
* `n == nums2.length`
* `1 <= n <= 10⁵`
* `1 <= nums1[i], nums2[i] <= 10⁵`
