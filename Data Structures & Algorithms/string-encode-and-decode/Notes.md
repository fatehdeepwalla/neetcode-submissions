# General Notes on Solving the Problem
## Problem Specification
- Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.
## Solution 1 -  $O(n)$
- I put a special demiter in the String, hoping that same delimited will not be found in strings itself.
- I was missing a edge case of empty string because String.split(), truncates any empty string at the tail.
- I used String.split("#",-1), to solve the issue. This preserves empty strings.
## Solution 2 -  $O(n)$
- Instead of a delimited i put "length_of_string | delimiter | Actual String"
- **4#this2#is6#wonder1#?**
