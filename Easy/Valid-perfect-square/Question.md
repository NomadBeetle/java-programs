## 367. Valid Perfect Square

### Problem Statement
Given a positive integer `num`, return `true` if `num` is a perfect square, otherwise return `false`.

A **perfect square** is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must **not** use any built-in library function, such as `sqrt`.

### Examples

#### Example 1:
**Input:**
```plaintext
num = 16
```
**Output:**
```plaintext
true
```
**Explanation:**
We return `true` because `4 * 4 = 16` and `4` is an integer.

#### Example 2:
**Input:**
```plaintext
num = 14
```
**Output:**
```plaintext
false
```
**Explanation:**
We return `false` because `3.742 * 3.742 = 14` and `3.742` is not an integer.

### Constraints:
- `1 <= num <= 2^{31} - 1`
