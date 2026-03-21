Opened 03-14-2026 12:32

Status:

Tags:

# Constraint Satisfaction Problem
a problem consisting of a set of variables and constraints -- logic inference can be formulated as a CSP problem

---
## Solving the problem

**Constraint search ending in failure**
--backtrack up the branch and undo the move that resulted in failure and go down the tree again. If all moves are used up for the current node, go back up the tree.


---
## Optimizations (Heuristics)

**Degree Heuristic**
--picks the variable involved in the most constraints with unassigned values

**Minimum Remaining Value (MRV)**

# References