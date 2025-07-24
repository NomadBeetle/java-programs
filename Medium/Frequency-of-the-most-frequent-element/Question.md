# 1838: Frequency of the Most Frequent Element

You are given an integer array `nums` and an integer `k`. You can increment any element in the array by 1 at most `k` times in total. Return the maximum frequency of any element after performing at most `k` increments.

### Example:

**Input:**

```
nums = [1,2,4], k = 5
```

**Output:**

```
3
```

**Explanation:** Increment 1 two times and 2 one time to make all elements equal to 4. Total cost = 3 <= 5.

### Constraints:

* `1 <= nums.length <= 10^5`
* `1 <= nums[i] <= 10^5`
* `1 <= k <= 10^9`

