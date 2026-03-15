Opened 03-14-2026 12:03

Status:

Tags:

# + searching algorithms



# Active Recall

What is the key difference between tree search and graph search? When would you prefer one over the other?
|| Tree search can revisit states (no explored/closed set), potentially looping infinitely in cyclic graphs but using less memory. Graph search tracks visited nodes (explored set), preventing re-expansion and ensuring completeness in finite graphs. Prefer graph search when cycles are possible and memory is available; tree search works fine for acyclic problems or when state space is large and revisits are unlikely. ||

Which search algorithm is guaranteed to find the shortest path (fewest edges) in an unweighted graph?
# References