# General Notes on Solving the Problem
## Problem Specification
- Given two strings ```s``` and ```t```, return ```true``` if the two strings are anagrams of each other, otherwise return ```false```.
- Two strings are anagrams if they contain the same characters, with each character appearing the same number of times, regardless of order.
## Solution 1 $O(n \times \log n)$
- First i implemented a brute force solution.
- It simply sorts the two array and then check for equality.
## Solution 2 $O(n)$
- In second Solution, i used a hashMap to mainting the information about character frequency of a string.
- For two annagrams the chracter frquency map should be identicals
- **Also since chracter are only 26 in number, we could have avoided the HashMap and directly used an array of length 26.**
