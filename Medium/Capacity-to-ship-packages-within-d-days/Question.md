# LeetCode 1011: Capacity To Ship Packages Within D Days

## Problem Description

A conveyor belt has packages that must be shipped from one port to another within a specified number of days.

The **i-th package** has a weight of `weights[i]`. Each day, you load the ship with packages in the order given by `weights`. You may not load packages out of order. The ship has a maximum weight capacity which you need to determine.

Return the *least weight capacity of the ship* that will result in all the packages being shipped within `days` days.

---

### Example 1

**Input:**

```text
weights = [1,2,3,4,5,6,7,8,9,10], days = 5
```

**Output:**

```text
15
```

**Explanation:**
A ship capacity of 15 is the minimum to ship all packages in 5 days:

* Day 1: 1, 2, 3, 4, 5 (total = 15)
* Day 2: 6, 7 (total = 13)
* Day 3: 8 (total = 8)
* Day 4: 9 (total = 9)
* Day 5: 10 (total = 10)

---

### Example 2

**Input:**

```text
weights = [3,2,2,4,1,4], days = 3
```

**Output:**

```text
6
```

**Explanation:**
A ship capacity of 6 is the minimum to ship all packages in 3 days:

* Day 1: 3, 2 (total = 5)
* Day 2: 2, 4 (total = 6)
* Day 3: 1, 4 (total = 5)

---

### Example 3

**Input:**

```text
weights = [1,2,3,1,1], days = 4
```

**Output:**

```text
3
```

**Explanation:**
A ship capacity of 3 is the minimum to ship all packages in 4 days:

* Day 1: 1, 2 (total = 3)
* Day 2: 3 (total = 3)
* Day 3: 1 (total = 1)
* Day 4: 1 (total = 1)

---

### Constraints

* `1 <= days <= weights.length <= 5 * 10^4`
* `1 <= weights[i] <= 500`
