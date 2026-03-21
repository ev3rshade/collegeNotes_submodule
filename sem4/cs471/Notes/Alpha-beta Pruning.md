Opened 03-14-2026 12:03

Status:

Tags: [[Minimax]] [[Expectimax]]

# Alpha-beta Pruning



# Active Recall

Explain why alpha-beta pruning does not change the value returned by minimax, yet can dramatically reduce the number of nodes evaluated.

|| Alpha-beta prunes branches that cannot affect the final minimax value. If a MAX node already has a value ≥ the MIN ancestor's current beta, the MIN node will never choose this path — so remaining children are irrelevant. Because the pruned subtrees cannot change the root's value, the result is identical to full minimax. In the best case (optimal move ordering), alpha-beta reduces the branching factor from b to √b, effectively doubling the search depth for the same computation. ||

# References