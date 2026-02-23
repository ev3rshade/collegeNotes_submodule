11-11-2025 13:30

Status:

Tags: [[Textbook - Numerical-Method-Design-Analysis-and-Computer-Implementation-of-Algorithms.pdf]] 7.6

# Solving Linear Least Squares Problems (Data Fitting)


Opening example
$$
\begin{pmatrix}
	1 & 1 \\
	1 & -1 \\
	2 & 0 
\end{pmatrix}

\begin{pmatrix}
	x_{1} \\
	x_{2} \\
\end{pmatrix}
=
\begin{pmatrix}
	2 \\
	1 \\
	4 \\
\end{pmatrix}
$$
There is no solution if we consider this as a system of linear equations

However: General Problem
$Ax = b$
where
	$A$ is a $m \times n$ matrix
	$x$ is a $n \times 1$ vector
	$b$ is a $m \times 1$ vector
## Least Squares Problem
> Choosing a vector $x$ such that the  such that the squared residual norm is minimized
### Residual vector
$v = b - Ax$
$v{i} = b_{i} - \sum_{j = 1}^{n} a_{ij}x_{j}$

Squared: $\lvert\lvert v \rvert\rvert$


# References