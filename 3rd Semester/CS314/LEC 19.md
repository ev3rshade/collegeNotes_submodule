11-04-2025 13:30

Status: #teen

Tags: #cs314


# Insert title

## Gaussian Elimination and Matrix Factorizations
#### LU Factorization with Partial Pivoting
$$
P A = L U
$$
- $\mathbf{P}$ is a **Permutation matrix** , which records the row swaps (pivots).
- $\mathbf{A}$ is the original matrix.
- $\mathbf{L}$ is a **Lower triangular** matrix with ones on the diagonal.
- $\mathbf{U}$ is an **Upper triangular** matrix.

#### Cholesky Factorization
The Cholesky factorization applies only to **Symmetric Positive Definite (SPD)** matrices.
$$
A = LL^{T}
$$
- $\mathbf{L}$ is a **Lower triangular** matrix.
- or $A = L D L^{T}$ (LDL factorization)


## Condition number for solution of linear equations 
> A measures for the sensitivity of the solution to changes in the data

**Question:** Given $A x = b$, we solve $A \hat{x} = \hat{b}$, where $\hat{b}$ is a small perturbation of $b$ due to floating-point storage. How close is the computed solution $\hat{x}$ to the exact solution $x$?
    
**Answer:** The **Condition Number** $\kappa(A) = \left\lVert A \right\rVert \left\lVert A^{-1} \right\rVert$ relates the relative error in $x$ to the relative error in $b$:
    

$$\frac{\left\lVert \hat{x} - x \right\rVert}{\left\lVert x \right\rVert} \leq \kappa(A) \frac{\left\lVert \hat{b} - b \right\rVert}{\left\lVert b \right\rVert}$$

- This analysis requires a way to measure the "distance" or size of vectors and matrices, which is done using **norms**

### Vector Norms
> vector norms $\left\lVert x \right\rVert$ measure the "length" or "size" of a vector $x = (x_1, x_2, ..., x_n)^T$

Types of norms

| **Norm Name**                    | **Notation**                          | **Formula**                                                                                                                   |     |
| -------------------------------- | ------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | --- |
| **$p$-Norm** (General)           | $\left\lVert x \right\rVert_p$        | $$\left(\sum_{i = 1}^{n} \|x_i\|^{p}\right)^{1/p}$$                                                                           |     |
| **1-Norm** (Taxicab Norm)        | $\left\lVert x \right\rVert_1$        | $$ \left\lVert A \right\rVert_1 = \max_{1 \leq j \leq n} \sum_{i = 1}^{m} \|a_{ij}\|$$                                        |     |
| **2-Norm** (Euclidean Norm)      | $\left\lVert x \right\rVert_2$        | $$\left\lVert x \right\rVert_2 = \left(\sum_{i = 1}^{n} \|x_i\|^{2}\right)^{1/2}$$ or $$\sqrt{\sum_{i = 1}^{n} \|x_i\|^{2}}$$ |     |
| **Infinity Norm** (Maximum Norm) | $\left\lVert x \right\rVert_{\infty}$ | $$ \left\lVert A \right\rVert_{\infty} = \max_{1 \leq i \leq m} \sum_{j = 1}^{n} \|a_{ij}\|$$                                 |     |
**Proof Note:** It is correct that $\lim_{p \rightarrow \infty} \left\lVert x \right\rVert_{p} = \left\lVert x \right\rVert_{\infty}$.

Different norms:
$\left\lVert x \right\rVert_1 = \sum_{i = 1}^{n} |x_i|$
$\left\lVert x \right\rVert_p = (\sum_{i = 1}^{n} |x_i|^{p})^{1/P}$                         for $p \geq 1, p \in \mathbb{R}$

Infinity norm
$\left\lVert x \right\rVert_{\infty} = \max |x_i|$    $1 \leq i \leq n$
---> proof is proving: $\lim_{p \rightarrow \infty} \left\lVert x \right\rVert_{p} = \left\lVert x \right\rVert_{\infty} = \max |x_i|$     $1 \leq i \leq n$

##### Properties of Norms
1) $\left\lVert x \right\rVert \geq 0$,       $\left\lVert x \right\rVert = 0$  iff   $x = 0$
2) If $c$ is a areal number, then $||cx|| = |c|\cdot \left\lVert x \right\rVert$
3) Triangle inequality: $\left\lVert x + y \right\rVert \leq \left\lVert x \right\rVert + \left\lVert y \right\rVert$

#### Matrix norms
$\left\lVert A \right\rVert$ - measure of size of $A$

##### Frobenius Norm
> $$ \left\lVert A \right\rVert_{F} = \sqrt{\sum_{i = 1}^{m} \sum_{j = 1}^{n} |a_{ij}|^{2}}$$

##### Matrix norms induced by vector norms
> $\left\lVert A \right\rVert = \max \left\lVert Ax \right\rVert$       $\left\lVert x \right\rVert_{1} = 1$
>     $= \max \dfrac{\left\lVert Ax \right\rVert_1}{\left\lVert x \right\rVert_1}$
> 
> $y = \dfrac{x}{\left\lVert x \right\rVert_{1}}$      $\left\lVert y \right\rVert_1 = 1$

We can show:
$\left\lVert A \right\rVert_1 = \max col \ sum \ norm$
     $= \max \sum_{i = 1}^{m} |a_{nj}|$        $1 \leq j \leq n$

###### Example
$$
A = \begin{bmatrix} 
	1 & 2 \\  
	-3 & -4  
	\end{bmatrix}
$$
$\left\lVert A \right\rVert_1 = 6$
$\left\lVert A \right\rVert_{\infty} = \max row \ sum \ norm$
      $= \max \dfrac{\left\lVert Ax \right\rVert_{\infty}}{\left\lVert x \right\rVert_{\infty}}$
        $x \neq 0$
      $= \max \left\lVert Ax \right\rVert_{\infty}$
        $\left\lVert A \right\rVert_{\infty} = 1$

Again, we can show
	$\left\lVert A \right\rVert_{\infty} = \max \left\lVert A(i, i) \right\rVert_1$
			$1 \leq i \leq m$
		  $= \max \sum_{j = 1}^{n} |a_{ij}|$
            $1 \leq i \leq m$

##### Properties of Matrix Norms
1) $\left\lVert A \right\rVert \geq 0$,     $\left\lVert A \right\rVert = 0$   iff  $A = 0$
2) $\left\lVert cA \right\rVert = |c| \cdot \left\lVert A \right\rVert$
3) $\left\lVert A + B \right\rVert \leq \left\lVert A \right\rVert + \left\lVert B \right\rVert$
4) $\left\lVert AB \right\rVert \leq \left\lVert A \right\rVert \left\lVert B \right\rVert$

#### 2-Norm
$\left\lVert A \right\rVert_2 = \max \left\lVert Ax \right\rVert_2$
        $\left\lVert x \right\rVert_2 = 1$
We can show:
$\left\lVert A \right\rVert_2 = \text{ Square root of the largest eigenvalue of } A^{T}A$
$Bx = \lambda x$   eigenvector 
eigenvalue = largest singular value of $A$

Consider $x \neq 0$,      $\left\lVert x \right\rVert_2 = 1$
Let $y = Ax$
     $= \left\lVert y \right\rVert_2 \cdot \hat{y}$
		$\left\lVert y \right\rVert_2 = 1$
$\max \left\lVert y \right\rVert_2$
    $y = Ax$
    Largest singular value

###### Example
$y = \begin{bmatrix} 1 \\  1  \end{bmatrix}$
$= \sqrt{2} \begin{bmatrix} 1/\sqrt{2} \\  1/\sqrt{2}  \end{bmatrix}$
$= \left\lVert y \right\rVert_2 \cdot \hat{y}$

$\hat{y} = \begin{bmatrix} 1/\sqrt{2} \\ 1/\sqrt{2} \end{bmatrix}$      $\left\lVert \hat{y} \right\rVert_2 = 1$

## MATLAB Code: Linear Transformation of the Unit Circle
```
% 1. Generate points for a unit circle
t = 0:0.1:2*pi;
x = [sin(t); cos(t)];

% 2. Plot the original unit circle (in blue)
plot(x(1,:), x(2,:), 'b-');

% Ensure the aspect ratio is correct (so the circle looks like a circle)
axis equal
shg

% 3. Define the transformation matrix A
A = [1 2; 3 4];

% 4. Show the transformation of the basis vector [1; 0]
a1 = A * [1; 0]; 
% Result: a1 is [1; 3]

% 5. Add the transformed basis vector to the plot (as a red line)
% Note: The erroneous ' and duplicated plot commands have been fixed here.
hold on
plot([0 a1(1)], [0 a1(2)], 'k-'); % Plot vector from (0,0) to (1,3)
hold off
shg

% 6. Apply the transformation A to all points of the circle
y = A * x;

% 7. Plot the transformed shape (the ellipse) (in red)
% Using 'hold on' from the previous step to overlay the new plot
hold on
plot(y(1,:), y(2,:), 'r-');
hold off
shg
```

# References