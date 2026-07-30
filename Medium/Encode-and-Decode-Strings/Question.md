# Encode and Decode Strings

**Difficulty:** Medium\
**Accuracy:** 67.32%\
**Submissions:** 8K+\
**Points:** 4\
**Average Time:** 30m

## Problem Statement

Given an array of strings `arr[]`, implement an algorithm in the
`encode()` function that converts the given strings into a single
encoded string, which can be transmitted over a network and later
decoded back into the original array of strings using the `decode()`
function.

### Encoding Rule

Each string is encoded using the following format:

`length/:string`

where:

-   `length` is the number of characters in the string.
-   `/:` is the delimiter.
-   `string` is the original string.

The encoded representations of all strings are concatenated together.

### Decoding Rule

While decoding:

1.  Read the integer before the `/:` delimiter.
2.  Extract exactly that many characters after the delimiter.
3.  Repeat until the encoded string is completely processed.

Since the length of each string is stored explicitly, this method
correctly handles all possible ASCII characters.

> **Note:** You are **not allowed** to use any built-in serialization
> method.

------------------------------------------------------------------------

## Examples

### Example 1

**Input**

``` text
arr = ["Hello", "World"]
```

**Encoding**

``` text
5/:Hello5/:World
```

**Output**

``` text
["Hello", "World"]
```

**Explanation**

-   `"Hello"` → `5/:Hello`
-   `"World"` → `5/:World`

During decoding:

-   Read `5`, extract `"Hello"`
-   Read `5`, extract `"World"`

The original array is reconstructed.

------------------------------------------------------------------------

### Example 2

**Input**

``` text
arr = ["abc", "!@"]
```

**Encoding**

``` text
3/:abc2/:!@
```

**Output**

``` text
["abc", "!@"]
```

**Explanation**

-   `"abc"` → `3/:abc`
-   `"!@"` → `2/:!@`

The decoder reads the stored lengths and extracts the exact substrings,
recreating the original array.

------------------------------------------------------------------------

## Constraints

-   `1 ≤ arr.size() ≤ 100`
-   `1 ≤ arr[i].size() ≤ 100`
-   Each string may contain **any of the 256 ASCII characters**.
