# 205. Isomorphic Strings

## Problem Statement

Given two strings `s` and `t`, determine whether they are **isomorphic**.

Two strings are considered **isomorphic** if the characters in `s` can be replaced to obtain `t`.

While replacing characters:

* Every occurrence of the same character must be replaced with the **same** character.
* The order of characters must remain unchanged.
* No two different characters in `s` can map to the same character in `t`.
* A character is allowed to map to itself.

Return `true` if the two strings are isomorphic; otherwise, return `false`.

---

## Examples

### Example 1

**Input**

```text
s = "egg"
t = "add"
```

**Output**

```text
true
```

**Explanation**

A valid mapping is:

* `e → a`
* `g → d`

Replacing every character using this mapping transforms `"egg"` into `"add"`.

---

### Example 2

**Input**

```text
s = "f11"
t = "b23"
```

**Output**

```text
false
```

**Explanation**

The character `'1'` would need to map to both `'2'` and `'3'`, which violates the rule that one character must always map to the same character.

---

### Example 3

**Input**

```text
s = "paper"
t = "title"
```

**Output**

```text
true
```

**Explanation**

One possible mapping is:

* `p → t`
* `a → i`
* `e → l`
* `r → e`

Applying this mapping converts `"paper"` into `"title"`.

---

## Constraints

* `1 <= s.length <= 5 × 10^4`
* `t.length == s.length`
* `s` and `t` consist of any valid ASCII character.