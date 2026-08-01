# 3517. Smallest Palindromic Rearrangement I

**Difficulty:** Medium

## Problem Statement

You are given a **palindromic** string `s`.

Return the **lexicographically smallest** palindromic permutation of `s`.

---

## Examples

### Example 1

**Input:**
```text
s = "z"
```

**Output:**
```text
"z"
```

**Explanation:**

A string of only one character is already the lexicographically smallest palindrome.

---

### Example 2

**Input:**
```text
s = "babab"
```

**Output:**
```text
"abbba"
```

**Explanation:**

Rearranging `"babab"` → `"abbba"` gives the smallest lexicographic palindrome.

---

### Example 3

**Input:**
```text
s = "daccad"
```

**Output:**
```text
"acddca"
```

**Explanation:**

Rearranging `"daccad"` → `"acddca"` gives the smallest lexicographic palindrome.

---

## Constraints

- `1 <= s.length <= 10^5`
- `s` consists of lowercase English letters.
- `s` is guaranteed to be palindromic.
