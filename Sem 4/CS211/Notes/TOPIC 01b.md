Opened 01-20-2026 17:36

Status:

Tags:

# TOPIC 01b

## Complete Search
Set of all solutions

### Techniques

#### Iterative

**Nested Loops**

**Loops + Pruning**
cutting program short when the set of branches does not fit the solution criteria

example: next permutation
`next_permutation` - function ($O(n!)$)
- find non-ascending entry from right
- swap with smallest larger entry on right
- sort in ascending left to right
==implement in Leetcode==

**Permutations**

#### Recursive

example - N Queens
- play the game
- j keep track of columns
- diagonals in deltas betw x and y
- flip and rotate the board
==implement in Leetcode==

example: 8 queens



**Simple backtracking**
example - Rat Attack
- center attacks on rats (SIGNIFICANTLY LESS RATS)



**Tips**
- prune early
- utilize symmetry
- filtering vs generating
- precompute/precalculate
- 13 tips from cp book
- optimize source code
- use better dsa
- data compression

# References