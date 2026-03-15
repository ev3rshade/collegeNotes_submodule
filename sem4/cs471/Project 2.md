Opened 03-02-2026 11:22

Status:

Tags:

prev: next:
# Project 2

**Q1** - 
Conceptual mistakes
- Don't RETURN foodlist
- evaluation function based on action not on food

**Q2** 
Mistakes
- There is no need to return game states in the minimax function --> can handle it in the caller function

Q3
Conceptual learning
- prune starting from the LEAVES of the graph
- prune for MAX choices in MIN, and MIN choices in MAX

Mistakes
- UPDATE alpha based off of BETA and UPDATE beta based off of ALPHA
- for max take the maximum of all the branches and for min take the minimum of all of the branches
- muting depth --> passes wrong depth to the next child in the recursion
- not modifying alpha from the caller --> results in not pruning correct branches

Q4
- Expectimax AVERAGES the scores of the min actions (it's the EXPECTED score!!) (think statistics)


# References