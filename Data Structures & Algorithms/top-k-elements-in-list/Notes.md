# General Notes on Solving the Problem
## Problem Specification
- Given an integer array `nums` and an integer `k`, return the `k` most frequent elements within the array.
- The test cases are generated such that the answer is always unique.
- You may return the output in any order.

## Solution 0 : Solution 1 : Solution 2 : Solution 3 : Soultion 5: Solution 6 | Time complexity $ O( n * \log n) $ | Space complexity $O(n)$
- Created a frequency map and stored that into a HashMap. 
- Sorting the entries of hashmap into arraylist of map.entries.
- Then returning first k elements.
- Many iterations of submission: entrySet, record, keySet, Comparable instead of comparator, naturalOrder-reverseOrder, reversed.
## Solution 7 - $O(n)$
- In second Solution, i used a hashMap to mainting the information about character frequency of a string.
- For two annagrams the chracter frquency map should be identicals
- **Also since characters are only 26 in number, we could have avoided the HashMap and directly used an array of length 26 to keep count of chararter frequency.**
