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
- I though sorting is overkill, so instead just i extracted the max element out and did that for k times.
## Solution 8 | Time complexity $O ( n* \log n)$ | Space complexity $O(n)$
- I used heap, but manually added elements one by one, so heap was not contructed in linear time.
## Solution 9 | Time complexity  $O ( n* \log n)$ | Space complexity $O(n)$
- I used allAll() method, but this is of no use as behind the scenes it also adds elements one by one.
- Actually constructor only can make heap with linear in time i.e. using bottom-up heapify process.
- But i did not find any constructor which uses both collection and comparision.
## Solution 10 | Time complexity $O(n + k* \log n)$ | Space complexity $O(n)$
- I used record class and implemented comparable interface to overcome the shortcoming of constructor arguments.
## Solution 11 : 12 | Time complexity $O(n)$ | Space complexity $O(n)$
- I built another map, for frequency as key and number appearing with that frequency as a list.
- This came by a realization that any number's frequency cannot be more than the size of the array.
- In one solution i directly used array of size of input+1 and in another case i used HashMap
