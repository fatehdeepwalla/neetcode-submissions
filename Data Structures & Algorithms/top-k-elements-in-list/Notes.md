# General Notes on Solving the Problem
## Problem Specification
- Given an integer array `nums` and an integer `k`, return the `k` most frequent elements within the array.
- The test cases are generated such that the answer is always unique.
- You may return the output in any order.

## Solution 0 : 1 : 2 : 3 : 5 : 6 | Time complexity $O (n* \log n)$ | Space complexity $O(n)$
- Created a frequency map and stored that into a HashMap. 
- Sorting the entries of hashmap into arraylist of map.entries.
- Then returning first k elements.
- Many iterations of submission: entrySet, record, keySet, Comparable instead of comparator, naturalOrder-reverseOrder, reversed.
## Solution 7 | Time complexity $O (n* k)$ | Space complexity $O(n)$
- I though sortiing is overkill, so instead just i extracted the max element out and did that for k times.
