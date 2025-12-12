### 9.1 Relations and Their Properties

##### Definition 1
> Let A and B be sets. A *binary relation from A to B* is a subset of A x B
###### Set *R*
- A set of ordered pairs where the first element is from A and the second from B.
- When (a, b) belongs to R, ==a is related to b by R==
- Functions are also relations

##### Definition 2
> A *relation on a set A* is a relation from A to A

##### Definition 3 - ==REFLECTIVE==
> A relation *R* on a set A is called reflective if (a, a) ∈ *R* for every element a ∈ A

##### Definition 4 - ==SYMMETRIC==
> A relation *R* on a set A is called *symmetric* if (b, a) ∈ *R* whenever (a, b) ∈ R, for all a, b ∈ A.

> A relation *R* on a set A such that for all a, b ∈ A, if (a, b) ∈ *R* and (b, a) ∈ R, then a = b, (a has to equal b for the relation to be true when the ordered pair is reversed) is called *antisymmetric*

##### Definition 5 - ==TRANSITIVE==
>A relation *R* on a set A is called *transitive* if whenever (a, b) ∈ R and (b, c) ∈ R, then (a, c) ∈ R, for all a, b, c ∈ A

Theorem 1
>The relation *R* on a set A is transitive if and only if $R^n ⊆ R$ for n = 1, 2, 3, ...

##### Definition 6 - ==COMPOSITE==
> Let *R* be a relation from a set A to a set B and *S* a relation from set B to a set C. The *composite* of *R* and *S* is the relation containing ordered pairs (a, c), where a ∈ A, c ∈ C, and b ∈ B such that (a, b) ∈ *R* and (b, c) ∈ *S*. Composite of R and S is denoted by S ◦ R (but R ◦ S for CS 182)

> Let *R* be a relation on the set A. The powers R$^n$, n = 1, 2, 3, ... , are defined recursively by R$^1$ = R and $R^{n + 1} = R^n ◦ R$



### 9.2 *n*-ary Relations and Their Applications
##### Definition 1 - ==*n-ary relations*==
> Let $A_1, A_2, ... , A_n$ be sets. and *n-ary relation* is a subset of $A_1 \times A_2 \times ... \times A_n$. The sets $A_1, A_2, ... , A_n$ called *domains* of the relation, and *n* is called its *degree*.


### 9.5 Equivalence Relations
##### Definition 1 - ==EQUIVALENCE RELATION==
>A relation on a set A is called an *equivalence relation* if it is reflexive, symmetric, and transitive

>Two elements a and b that are related by an equivalence relation are called ==*equivalent*==. The notation ==*a ~ b*== is often used to denote taht a and b are equivalent elements with respect to a particular equivalence relation

##### Definition 3 - ==EQUIVALENCE CLASS==
>Let *R* be an equivalence relation on a set A. The set of all elements that are related to an element a of A is called the ==*equivalence class*== of a. The equivalence class of A with respect to R is denoted by $[a]_R$. When only one relation is under consideration we can delete the subscript *R* and write $[a]$ for this equivalence class.

>If $b \in [a]_R$ then b is called a ==representative== of this equivalence class

>These statements for elements a and b of A are equivalent
>(i) $aRb$                 (ii) $[a] = [b]$                (iii) $[a] \cap [b] \neq \emptyset$

> $\bigcup\limits_{i=1} [a]_R = A$

##### Partition of a Set
- A partition of a set S is a collection of disjoint nonempty subsets of S that have S as their union. 
- The collection of subsets $A_i$ $i \in I$ (where *I* is an index set) forms a partition of S if and only if
	- $A_i \neq \emptyset$ for $i \in I$
	- $A_i \cap A_j = \emptyset$ when $i \neq j$
	- $\bigcup\limits_{i=1} A_i = S$ 

> Let R be an equivalence relation on a set S. Then the equivalence classes of *R* form a partition of *S*. Conversely, given a partition $\{A_i | i \in I\}$ of the set *S*, there is an equivalence relation *R* that has the sets $A_i$ , $i \in I$, as its equivalence classes.

