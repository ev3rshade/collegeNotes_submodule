09-04-2025 15:24

Status: #teen

Tags: [[Sets]] [[3 Tags/Sequences]]

# 2 Sets, Functions, Sequences and Sums





# References (CS 182 Textbook)
### 2.4 Sequences and Summations

#### Sequences
##### Definition 1 - ==SEQUENCE==
>A sequence is a function form a subset of the set of integers (usually either the set {0, 1, 2, ...} or the set {1, 2, 3 ...}) to a set S. We use the notation $a_n$ to denote the image of the integer n.

>$a_n$ is a ==term== of the sequence

>A ==geometric progression== is a sequence
>$a, ar, ar^2, ... , ar^n$
>where the *initial term a* and the common ratio *r* are real numbers

>An ==arithmetic progression== is a sequence
>$a, a + d, a + 2d, ... , a + nd$
>where the *initial term a* and the *common difference d* are real numbers

##### Definition 4 - ==RECURRENCE RELATIONS==
TLDR a recursive definition of a sequence

>A *recurrence relation* for the sequence $[a_n]$ is an equation that expresses $a_n$ in terms of one or more previous terms ($a_0, a_1, ... , a_{n-1}$) for all integers $n$ with $n \ge n_0$ where $n_0$ is a nonnegative integer.

>A sequence is called a *solution* of a recurrence relation if its terms satisfy the recurrence relation

###### ==Initial conditions==
- the term that precedes the first term before the recurrence relation takes effect ($a_o$)

###### Example 1 The Fibonacci Sequence
- initial conditions are $a_0 = 0$ and $a_1 = 1$

##### Closed formula
- an explicit definition of the terms in a sequence (no recursion)

Use One of Two Iteration Methods
###### Forward substitution
- finding successive terms beginning with the initial condition and ending with $a_n$
###### Backward substitution
- finding falling terms of the sequence from $a_n$ to the initial condition


#### Summations
##### Summation Notation
- $\sum_{j = m}^{n} a_j$
- to represent $a_m + a_{m + 1} + ... + a_n$
- j is called the index of summation
- lower limit - m
- upper limit - n

##### ==Theorem 1 - the sum of a geometric series==
$$\sum_{j=0}^{n} ar^i = 
\begin{cases} 
	a \frac{r^{n + 1} - 1}{r - 1} & \textit{if } r \neq 1 \\ 
	(n + 1) a  & \textit{if } r = 1 
\end{cases}$$


==INSERT PROOF LATER==

##### Double Summations
$$
\sum_{i = 1}^{4} \sum_{j = 1}^{3} ij
$$
- to compute, expand inner first
- then compute outer summation
- If multiple variables are involved, use substitution to solve

##### ==Useful Summation Formulae==

| Sum                                                   | Closed Form                                 |
| ----------------------------------------------------- | ------------------------------------------- |
| $\sum_{k = 0}^{n} ar^k$   $(r \neq 0)$                | $a \frac{r^{n + 1} - 1}{r - 1}$, $r \neq 1$ |
| $\sum_{k = 1}^{n} k$                                  | $\frac{n(n + 1)}{2}$                        |
| $\sum_{k = 1}^{n} k^2$                                | $\frac{n(n + 1)(2n + 1)}{6}$                |
| $\sum_{k = 1}^{n} k^3$                                | $\frac{n^2(n + 1)^2}{4}$                    |
| $\sum_{k = 0}^{\infty} x^k$  ,  $\mid{x}\mid < 1$     | $\frac{1}{1 - x}$                           |
| $\sum_{k = 1}^{\infty} kx^{k-1}$ ,  $\mid{x}\mid < 1$ | $\frac{1}{(1 - x)^2}$                       |

write note about summation with smaller val on top compared to bottom --> SUMMATION ONLY VALID WITH CORRECT BOUNDS