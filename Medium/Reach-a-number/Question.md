# 754. Reach a Number

You are standing at position `0` on an infinite number line. There is a destination at position `target`.

You can make some number of moves `numMoves` so that:
- On each move, you can either go **left** or **right**.
- During the *ith* move (starting from `i == 1` to `i == numMoves`), you take `i` steps in the chosen direction.

Given the integer `target`, return the **minimum number of moves** required to reach the destination.

---

### Example 1:
**Input:** `target = 2`  
**Output:** `3`  
**Explanation:**
- Move 1: from 0 to 1 (1 step right)
- Move 2: from 1 to -1 (2 steps left)
- Move 3: from -1 to 2 (3 steps right)

---

### Example 2:
**Input:** `target = 3`  
**Output:** `2`  
**Explanation:**
- Move 1: from 0 to 1 (1 step right)
- Move 2: from 1 to 3 (2 steps right)

---

### Constraints:
- `-10^9 <= target <= 10^9`
- `target != 0`