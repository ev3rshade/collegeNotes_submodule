11-04-2025 14:14

Status:

Tags:

# Nonlinear Equations
### Bisection
Requirements: $f(x)$ is a continuous function or $x$
			Starting values $x_1$ and $x_2$ where $f$ has different signs (Intermediate value theorem)
Guess until the root is found - like binary search

Rate of Convergence = $k$ = $log_{2}(\frac{|b - a|}{\delta}) - 1$
-- converges linearly

#### Stopping tolerance
> predefined acceptable level of error that determines when the iterative process of finding a root for a function should end

### Secant Method
#### *regular falsi* algorithm
>A combination of secant and bisection methods

![[Screenshot 2025-09-30 223944.png]]

### Taylor's Theorem
#### Taylor polynomial $P_n(x)$
-- serves as an approximation to the function

#### Maclaurin series
> series with 1 as the value being plugged in

### Newton's Method
1. Choose an initial guess $x_0$
2. $x_{k+1} = x_{k} - \frac{f(x_k)}{f'(x_k)}$
3. Repeat until the difference between terms is smaller than a chosen tolerance

Will converge if:
4. If $f$ has certain properties ($f$, $f'$, $f''$)
5. We start with initial guess $x_0$ close to a root (need good initial guess) 

Rate of convergence
-- converges quadratically

# References