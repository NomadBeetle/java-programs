# 125. Valid Palindrome

## Problem Statement

A phrase is considered a **palindrome** if, after:

- Converting all uppercase letters to lowercase.
- Removing all non-alphanumeric characters.

it reads the same forward and backward.

Alphanumeric characters include both **letters (`a-z`, `A-Z`)** and **digits (`0-9`)**.

Given a string `s`, return:

- `true` if it is a palindrome.
- `false` otherwise.

---

## Examples

### Example 1

**Input**

```text
s = "A man, a plan, a canal: Panama"
```

**Output**

```text
true
```

**Explanation**

After removing non-alphanumeric characters and converting to lowercase:

```text
"amanaplanacanalpanama"
```

This string reads the same forwards and backwards.

---

### Example 2

**Input**

```text
s = "race a car"
```

**Output**

```text
false
```

**Explanation**

The processed string becomes:

```text
"raceacar"
```

which is **not** a palindrome.

---

### Example 3

**Input**

```text
s = " "
```

**Output**

```text
true
```

**Explanation**

After removing non-alphanumeric characters, the string becomes empty:

```text
""
```

An empty string is considered a palindrome.

---

## Constraints

- `1 <= s.length <= 2 × 10⁵`
- `s` consists only of printable ASCII characters.