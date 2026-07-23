# 28. Find the Index of the First Occurrence in a String

## Problem Statement

Given two strings, `haystack` and `needle`, return the **index of the first occurrence** of `needle` in `haystack`.

If `needle` is **not** present in `haystack`, return `-1`.

---

## Examples

### Example 1

**Input**

```text
haystack = "sadbutsad"
needle = "sad"
```

**Output**

```text
0
```

**Explanation**

The substring `"sad"` appears at indices `0` and `6` in `"sadbutsad"`.

Since the first occurrence starts at index `0`, the answer is `0`.

---

### Example 2

**Input**

```text
haystack = "leetcode"
needle = "leeto"
```

**Output**

```text
-1
```

**Explanation**

The substring `"leeto"` does not occur anywhere in `"leetcode"`, so the answer is `-1`.

---

## Constraints

* `1 <= haystack.length, needle.length <= 10^4`
* `haystack` and `needle` consist only of lowercase English letters.
