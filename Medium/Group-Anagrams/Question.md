# 49. Group Anagrams

**Difficulty:** Medium

## Problem Statement

Given an array of strings `strs`, group the anagrams together.

You can return the answer in **any order**.

An **anagram** is a word or phrase formed by rearranging the letters of another word, using all the original letters exactly once.

---

## Examples

### Example 1

**Input:**
```text
strs = ["eat","tea","tan","ate","nat","bat"]
```

**Output:**
```text
[["bat"],["nat","tan"],["ate","eat","tea"]]
```

**Explanation:**

- `"bat"` has no other anagrams.
- `"nat"` and `"tan"` are anagrams of each other.
- `"ate"`, `"eat"`, and `"tea"` are all anagrams.

---

### Example 2

**Input:**
```text
strs = [""]
```

**Output:**
```text
[[""]]
```

---

### Example 3

**Input:**
```text
strs = ["a"]
```

**Output:**
```text
[["a"]]
```

---

## Constraints

- `1 <= strs.length <= 10^4`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of lowercase English letters.

