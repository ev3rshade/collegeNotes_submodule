[[Linear Regression]]

# The [[Machine Learning Model]] of Linear Regression
# Cost Function (squared error cost function)
>defines how well a function is doing so we can adjust it to be better

- most commonly used cost function for regression problems

How machine learning is built:
for [[Machine Learning Model]] $f_{w,b}(x) = wx + b$
- w, b are parameters
- adjust w, b so that the function fits the data best
	- so that $y^{(i)}$ is closest to $y^{(i)}$ (hat)

- applies to [[Linear Regression]]
## $J(w, b) = \frac{1}{2m}\sum_{i=1}^{m}(f_{w, b}(x^{(i)}) - y^{(i)})^{2}$
$m$ = number of training examples
- $2m$ is to make calculations a bit neater (convention)

## The goal: minimize $J(w,b)$
just w - xy graph
![[Pasted image 20250319160240.png]]

w and b - 3D surface plot
![[Pasted image 20250319160128.png]]

==Data sets you use to TRAIN data are trying different parameters like w and b to minimize the cost function==

# Gradient Descent
> An algorithm that minimizes the value of the cost function by selecting appropriate parameters

How it works:
1. Select parameters
2. Calculate cost function
3. Choose direction of cost function with the steepest descent (the gradient)
4. Change parameters
5. Repeat steps until a minimum is reached ---- see below

THESE STEPS FIND A ==LOCAL MINIMUM==

##### Versions of Gradient Descent
###### Batch Gradient Descent
- Each step of gradient descent uses all the training examples
###### Subsets - [[not yet here]]
## The Algorithm

using the example of the same function above
#### $w = w - \alpha \frac{d}{dw} J(w,b)$ - CALC 1*
#### $b = b - \alpha\frac{d}{db}J(w,b)$ - CALC 2*
- = - assignment operator
- $\alpha$ - Learning rate (something like $dw$)
- everything after - derivative

#### $\frac{d}{dw}J(w,b) = J_w = \frac{1}{m}\sum_{i=1}^{m}(f_{w, b}(x^{(i)}) - y^{(i)})x^{(i)}$
#### $\frac{d}{db}J(w,b) = J_b = \frac{1}{m}\sum_{i=1}^{m}(f_{w, b}(x^{(i)}) - y^{(i)})$

The parameters are updated **simultaneously** BECAUSE the BOTH the parameter values are used to calculate the new values
#### $temp\_w = w - \alpha \frac{d}{dw} J(w,b)$
#### $temp\_b = b - \alpha \frac{d}{db}J(w,b)$

#### $w = temp\_w$
#### $b = temp\_b$

- INTUITION BEHIND THIS IS CALC stuffs --> hopefully you already know calc

###### What if you're already at a minimum?
--> a zero derivative!!! = local minimum
--> for 2d surface a critical point
--> $w - \alpha * 0 = w$
# The Learning Rate $\alpha$
What happens when $\alpha$ is too small
- takes too long to train

What happens when $\alpha$ is too large
- the minimum is never reached - skipped over because too big of a step is taken


Putting everything together
```
repeat until convergence {
	*Calc 1
	*Calc 2
}
```
### How is the GLOBAL minimum found??
- Linear regression only has one global minimum because its cost function is a soup-bowl shape!! (see picture above)