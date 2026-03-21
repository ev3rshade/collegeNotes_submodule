Opened 03-14-2026 12:03

Status:

Tags:

# + searching algorithms

---
## Characteristics

**Completeness**
--the algorithm is guaranteed to find a solution if one exists

**Optimality**
--the algorithm is guaranteed to find the lowest cost solution

---
## Types of search

**Tree search**
- better for acyclic problems or when state space is large (revisits unlikely)
- less memory than graph search

**Graph search**
- tracks visited nodes w/ explored set
- better for when cycles are possible

key difference: tree search can revisit states, graph search cannot
# Active Recall

What is the key difference between tree search and graph search? When would you prefer one over the other?
|| Tree search can revisit states (no explored/closed set), potentially looping infinitely in cyclic graphs but using less memory. Graph search tracks visited nodes (explored set), preventing re-expansion and ensuring completeness in finite graphs. Prefer graph search when cycles are possible and memory is available; tree search works fine for acyclic problems or when state space is large and revisits are unlikely. ||

Which search algorithm is guaranteed to find the shortest path (fewest edges) in an unweighted graph?
||Breadth First Search||

Explain the difference between completeness and optimality in search algorithms. Give one algorithm that is complete but not optimal, and one that is both.
|| Completeness means the algorithm is guaranteed to find a solution if one exists. Optimality means it finds the lowest-cost solution.||
||Complete but not optimal: BFS — finds the shallowest goal (fewest edges), but not necessarily the cheapest path when edge costs vary. Also DFS is complete on finite graphs but definitely not optimal.||
||Both complete and optimal: UCS (Uniform Cost Search) — expands lowest-cost node first; optimal when all costs ≥ 0. Also A* with admissible heuristic is both.||


# References