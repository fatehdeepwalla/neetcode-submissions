# General Notes on Solving the Problem
## Problem Specification
- Given an array of integers `nums` and an integer `target`, return the indices `i` and `j` such that `nums[i] + nums[j] == target` and `i != j`.
- You may assume that every input has exactly one pair of indices ```i``` and ```j``` that satisfy the condition.
- Return the answer with the smaller index first.
## Solution 1 -  $O(n^2)$
- First i implemented a brute force solution.
- It simply runs two loops i.e. for each element it checks if sum is equal to target.
## Solution 2 -  $O(n)$
- In second Solution, i used a hashMap to build the information about the availablity of an element.
- Now availablity of a element can be checked in O(1) time.
- So we will iterate over the array and for each element we will check for the presence of its complement in HashMap.
