### Operations
Done in registers with 80 bits
#### Addition
1. Align exponents
2. Add mantissas
3. Normalize and round
Normalize at end
$f\ell(x + y) = (x + y)(1 + \delta)$

#### Subtraction
1. Align exponents
2. Add mantissas
3. Normalized and round

#### Multiplication / Division
1. Sign bits XORed
2. Exponents added
3. Fractions multiplied
##### Guard bits
> an additional bit at the end of a computed answer to get the correct answer

Normalize at end
$f\ell(x + y) = (x + y)(1 + \delta)$

IEEE floating pt standard requires that the result of a floating point operation ($f\ell(x \text{ op } y))$ should be the same as what we could get by doing the operation in exact arithmetic (using an infinite number of bits), and then rounding the result to t bits

need 2 guard bits and a "sticky" bit

##### Sticky bits
>indicates whether there are any non-zero bits to the right of the round bit after a floating-point operation (like addition, subtraction, multiplication, or division) that might require rounding

-- round up if Guard bits + sticky bits > 1/2 of the ULP