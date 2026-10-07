# General Notes on Solving the Problem
## Problem Specification
- Given an array of strings ```strs```, group all anagrams together into sublists. You may return the output in any order.
- An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
## Solution 1 -  $O(n^2*m)$
- First i implemented a brute force solution.
- It simply uses my O(m) time isAnagram() method.
- We have to use this method inside a double while loop.
- **An important point to note is: avoid structurally modifying a collection while iterating over it. This includes both adding and removing elements.**
  - With an enhanced for loop, modifying the collection directly (for example, using add() or remove()) can cause a ConcurrentModificationException.
  - With a normal for loop using indexes, removing or adding elements can shift the positions of other elements and change the collection's size. This can cause elements to be skipped, processed multiple times, or indexes to become invalid, making the logic tricky and error-prone.. So better avoid it.
  - For removing elements, an Iterator can be used safely through its ```hasNext()```, ```next()```, and ```remove()``` methods.
  - Itertor does not provide a way to add elemnts while iteration over a collection, however ListIterator has such methods.
## Solution 2 -  $O(n*m*\log m)$
- In second Solution, i sorted each element of the string array and stored it in HashMap<String, ArrayList<String>> with key as sorted strings.
