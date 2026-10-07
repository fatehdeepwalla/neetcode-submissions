# General Notes on Solving the Problem
## Problem Specification
- Given an array of strings `strs`, group all anagrams together into sublists. You may return the output in any order.
- An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
## Solution 1 -  $O(n^2 * m)$
- First i implemented a brute force solution.
- It simply uses my O(m) time isAnagram() method.
- We have to use this method inside a double while loop.
- **An important point to note is: avoid structurally modifying a collection while iterating over it. This includes both adding and removing elements.**
  - With an enhanced for loop, modifying the collection directly (for example, using add() or remove()) can cause a ConcurrentModificationException.
  - With a normal for loop using indexes, removing or adding elements can shift the positions of other elements and change the collection's size. This can cause elements to be skipped, processed multiple times, or indexes to become invalid, making the logic tricky and error-prone.. So better avoid it.
  - For removing elements, an Iterator can be used safely through its `hasNext()`, `next()`, and `remove()` methods.
  - Iterator does not provide a way to add elements while iteration over a collection, however ListIterator has such methods.
## Solution 2 -  $O(n * m* \log m)$
- Since anagrams when sorted result in identical string.
- In second Solution, i sorted each element of the string array and used it as a key in `HashMap<String, ArrayList<String>>`.

## Solution 3 -  $O(n * m)$
- I constructed character frequency map of each string and used it as a key in `HashMap<HashMap<Character, Integer>, ArrayList<String>>`.
- **One very Important learning from this problem is that these data structures like list, set and map can be used in complex ways.**  
