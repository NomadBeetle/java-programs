# 1209. Remove All Adjacent Duplicates in String II

**Difficulty:** Medium

## Problem Statement

You are given a string `s` and an integer `k`.

A **k duplicate removal** consists of choosing **k adjacent and identical characters** from the string and removing them. After removal, the remaining left and right parts of the string become adjacent.

Continue performing these removals until no more valid removals are possible.

Return the **final string** after all possible removals.

It is guaranteed that the final answer is unique.

---

## Examples

### Example 1

**Input**
```text
s = "abcd", k = 2
```

**Output**
```text
"abcd"
```

**Explanation**

No two adjacent characters are the same, so nothing can be removed.

---

### Example 2

**Input**
```text
s = "deeedbbcccbdaa", k = 3
```

**Output**
```text
"aa"
```

**Explanation**

Initial string:
```text
deeedbbcccbdaa
```

Remove `"eee"` and `"ccc"`:
```text
ddbbbdaa
```

Remove `"bbb"`:
```text
dddaa
```

Remove `"ddd"`:
```text
aa
```

No more removals are possible.

---

### Example 3

**Input**
```text
s = "pbbcggttciiippooaais", k = 2
```

**Output**
```text
"ps"
```

---

## Constraints

- `1 <= s.length <= 10^5`
- `2 <= k <= 10^4`
- `s` consists only of lowercase English letters.
