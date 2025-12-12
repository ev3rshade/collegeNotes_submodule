11-05-2025 16:30

Status: #baby

Tags: [[Graphs]]

# Graphs


#### Minimum Spanning Tree (MST)
> A spanning subgraph of $G$ (contains all vertices from $G$) that is a tree (no cycles) that is minimal weight-wise

==Question: is the MST always unique?==
--> if the edge weights are distinct
##### Properties of an MST
###### Cycle property
- An MST does not contain any cycles
- Let $C$ be any cycle, and let $f$ be the max cost edge belonging to $C$. Then the MST does not contain $f$
- Proof by contradiction
###### Cut property
- We can replace edges in a MST with other edges of equal weight to make other MST's
- Direct proof




## Algorithms

#### Prim's Algorithm 
Time Complexity: $O(|E| + |V|\log(|V|)$ or $O(|E|\log(|V|))$ 
Space Complexity: $|V|$
> a greedy algorithm used to build a MST
1. Start with vertex $v$
2. Add $|V| - 1$ edges to the tree $T$ by repeatedly adding the minimum weight edge that connects a new vertex to the tree
	1. Only add edges that are in the optimal MST
3. When we add a new edge to the tree, add a new vertex too
Better for dense graphs

#### Kruskal's Algorithm
Time Complexity: $O(|E| \log(|E|))$,   amortized $O(|E| \alpha(|V|))$
Space Complexity: $|E|$
> an algorithm used to build a MST using Union-Find starting with $|V|$ independent components


#### Dijkstra's Algorithm




# References
