Opened 01-16-2026 15:34

Status:

Tags:

# Different Numbers of Outcomes


area vs cardinality
- visualize the probability of an event occurring as an area

disjoint events --> just add up areas


infinitely many outcomes

ex1
```
Peter and Mary take turns dice rolling.
	1) Peter wins if he rolls 1 or 2
	2) Mary wins if she rolls 6
Peter rolls first.

a) What is the prob that Peter wins and rolls at most 4 times?
b) What is the probability that Mary wins?
```

Solution:
$A_k$ - event where Peter wins on $k$th roll
$B_k$ - event where Mary wins on her $k$th roll

a) Calculate $\sum_{i = 1}^{4} P(A_k)$
$P(A_i) = \dfrac{4^{k - 1}  * 3^{k - 1} * 2}{36^{2k - 1}}$
==check book==

b) Calculate $\sum_{i = 1}^{\infty} P(B_i)$
$P(B_k) = \dfrac{4^k * 2^{k-1} * 4}{36^k}$

Answer: 4/7


sometimes it is easier to calculate the complement of an outcome and subtract from 1 to calculate a probability

$A^c = \Omega \backslash A$
$P(A^c) + P(A) = 1$

ex2
```
Roll a fair dice one by one 4 times. What is the prob that some no appears more than once?
```

Solution: 1 - $P(\text{all rolls are unique}) = \dfrac{6 * 5 * 4 * 3}{6^4}$

Ans: 13 / 18


intersection of multiple events
$A, B$ - events
$A \cap B = AB$
It holds that $B = (A \cap B) \cup (A^c \cap B)$ so $P(A \cap B) + P(A^c \cap B)$

# References