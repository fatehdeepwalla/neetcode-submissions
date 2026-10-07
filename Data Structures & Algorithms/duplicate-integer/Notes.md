# General Notes on Solving the Problem
## Problem Specification
- Given an integer array ```nums```, return ```true``` if any value appears more than once in the array, otherwise return ```false```.
## Solution 1
- First i implemented a brute force solution $O(n^2)$.
- It simply runs two loops i.e. for each element it checks for duplicate till end of the array.
## Solution 2
- In second Solution, i used a hashSet - $O(n)$
- **Hashing represent the concept of generalized array** : the basic idea was that we maintain an additional array storing the information about the presence of elements, but since the universe of keys is very large hashing reduces size of that auxilary data stucture.
