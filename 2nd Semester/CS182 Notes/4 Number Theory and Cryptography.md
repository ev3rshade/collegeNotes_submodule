# Division
## Divides
> "a divides b" - $a \mid b$
> "a does not divide b" - $a \nmid b$

##### Theorem 1
> Let a, b, and c be integers where $a \neq 0$. Then
> a) if $a \mid b$ and $a \mid c$, then $a \mid (b + c)$ 
> b) if $a \mid b$, then $a \mid bc$ for all integers c
> c) if $a \mid b$  and $b \mid c$, then $a \mid c$

##### The Division Algorithm
###### $a = dq + r$
- q = a div d
- r = a mod d

## Modular Arithmetic
#### Congruency
##### $a \equiv b \mod  M$  if $M \mid (a - b)$

properties
if  $a \equiv b \mod  M$ and  $c \equiv d \mod  M$ 
1.  $a + c \equiv (b + d)\mod  M$ 
2.  $ac \equiv bd \mod  M$ 

collary
1. $(a+b) \mod M = ((a \mod M) + (b \mod M)) \mod M$
2. $(ab) \mod M = ((a \mod M) \times (b \mod M)) \mod M$
==PROVE THESE PROPERTIES==
#### Modular Exponentiation
- By 2. (above) we can separate an exponent to smaller units that we can calculate the modulo. These smaller units are sizes that are increasing in size by a factor of 2


## Primes
> an integer > 1 that is divisible by 1 and itself

- **Composite** - opposite of prime

##### Theorem 2 \[Fundamental Theorem of Arithimetics]
>Every positive integer can be written uniquely as the product of primes where the prime factors are written in order of increased size

##### Theorem 1
> There are infinitely many primes
- proof by contradiction ==TRY BY SELF==

##### Lemma 2
> If n is a composite integer, then n has a prime divisor $\leq \sqrt{n}$

There is no easy, fast algorithm to compute prime numbers

##### The Sieve of Eratosthenes
https://leetcode.com/problems/count-primes/description/

#### Greatest Common Divider (GCD) - Euclidean Algorithm
> Let $a = bq + r$ where a, b, q, r are integers. Then, $gcd(a,b) = gcd(b,r)$

==Implement EUCLID==
#### Bezout's Theorem
> If a and b are positive integers, then there exist integers s and t such that $gcd(a, b) = sa + tb$

# Applications and Cryptography
## Hashing
> a key-value method of identifying values by using a "hashing" function to map keys into available memory locations

Used when there is a need for a fast method of locating a huge set of records (dicts)

##### Most Common Hashing Function
##### $h(k) = k \mod M$