Opened 03-14-2026 11:55

Status:

Tags: [[+ searching algorithms]]

# Heuristic
problem specific hint that estimates the coast of the cheapest path from a node $n$ to a goal state.

---
## Characteristics

**Admissible** - never overestimates the actual cost to reach the nearest goal

---
## Examples

Path finding
- **Manhattan Distance**

[[+ csp]]
- **Minimum Remaining Value**
- 

---
# Active Recall

What makes a heuristic admissible? Consistent?

Can you give an example of an amissible and consistent heuristic? What about one that isn't?
|| Admissible: h(n) ≤ h*(n) for all n (never overestimates). Consistent: h(n) ≤ cost(n,n') + h(n') for all edges (triangle inequality). Consistency implies admissibility but not vice versa. Example of admissible but not consistent: h(A)=5, true distance h*(A)=6 ✓. But if h(B)=1 and cost(A→B)=1, then h(A)=5 > 1+1=2, violating consistency — even though h(A)≤h*(A) ||

# References