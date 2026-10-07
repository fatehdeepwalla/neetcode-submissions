# General Notes on Solving the Problem
## Problem Specification
- Given two strings ```s``` and ```t```, return ```true``` if the two strings are anagrams of each other, otherwise return ```false```.
- Two strings are anagrams if they contain the same characters, with each character appearing the same number of times, regardless of order.
## Solution 1
- First i implemented a brute force solution $` O(n \log n) `$.
- It simply runs two loops i.e. for each element it checks for duplicate till end of the array. $x^2$
## Solution 2
- In second Solution, i used a hashSet.
- As they are O(1), when it comes to searching.
- **They represent the concept of generalized array.**
