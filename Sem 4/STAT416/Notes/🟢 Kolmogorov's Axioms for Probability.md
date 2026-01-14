Opened 01-12-2026 15:44

Status: #adult

Tags: [[+ probability fundamentals]]

# Kolmogorov's Axioms for Probability

$\Omega$ - sample space of possible outcomes
$E$ - elementary event, a single point in the sample space
$F$ - the collection of events which the set of all subsets of $\Omega$
$\phi$ - trivial (empty) set

can be finite, infinite, countable, uncountable

## Axioms

**First Axiom**
The probability of an event is a non negative number
> $P(E) \geq 0$     $\forall E \in F$

**Second Axiom**
The probability that least one of the elementary events in the entire sample space will occur is 1.
> $P(\Omega) = 1$

**Third Axiom**
$P: F \rightarrow [0, 1]$ 
Satisfying:
1) $P(\Omega) = 1$
2) $P(\phi) = 0$
3) If $A_1, A_2, A_3, ...$ pairwise disjoint

then
> $P(\bigcup^{\infty}_{i = 1} A_i) = \bigcup^{\infty}_{i = 1} P(A_i)$


## Examples

Basic examples demonstrating axiom applications
- Coin flip, dice roll, biased die, rolling two dice
- Set notation, variable definition



# Active Recall
Write out the example of biased die (where 6 is twice as more likely to get rolled)



# References
Lecture (in person)
https://en.wikipedia.org/wiki/Probability_axioms