09-02-2025 13:32

Status: Adult

Tags: [[CS314 Class Outline]]

###### Real numbers
> Any value that can be found on the number line
> -- continuous 1 dim quality

###### Fixed Point Numbers
> Numbers with a decimal point fixed in a location in the binary representation
> -- | 1 bit  | 1 bit  | . |  1 bit   |  1 bit  |
> -- | integer part | . | fractional part |
> 					^^ fixed number of digits after .

### Floating Point Numbers (and their system)
> Numbers represented with a sign, an implied integer called a *mantissa* of 1, and a fractional portion, and an exponent to scale the fractional portion.
##### Normalized Representation
> Conversion of numbers to scientific notation (in binary in this class)
> Any representation of a floating point number where the exponent field is neither all 0's or all 1's

- Purpose: To represent numbers with a consistent level of precision and accuracy, ensuring that each number has a single, unique bit pattern
- Allows the system to not store the mantissa
###### Mantissa
> An implied 1 in the fractional portion of a floating point number
> -- The bit to the left of the binary point is always 1 for a non-zero number, hence we do not need to store it

###### Biased exponent
> An signed integer representing the unsigned int in the exponent field with a shift. The exponents are shifted by a value $b = 2^{e - 1} - 1$, where $e$ is the number of bits in the exponent field. The unbiased exponent values range from $1 - b$ to $(2^{e} - 2) - b$

###### realmin (MATLAB)
> The smallest positive normalized number in MATLAB
###### realmax (MATLAB)
> the largest positive normalized number in MATLAB


##### Denormalized (subnormal) Representation
> When the exponent of a number is all 0's and the fractional field is not all zeroes. The implied bit (mantissa) in this representation is 0

For subnormal numbers, the biased exponent value must be the same as the biased exponent value of the smallest normalized number

#### Properties
##### 1. Finite set - limited due to bit count
##### 2. non-uniform spacing between consecutive numbers
1. ==CONFIRM WHAT MAX/MIN SPACING IS -- REVIEW HW==
##### 3. Special numbers
###### a) Zero
0 or 1 in sign, all 0's in exponent, all 0's in fraction
e.g. 0 | 00 | 00 = 0,  1 | 00 | 00 = -0
###### b) Inf
0 or 1 in sign, all 1's in exponent, all 0's in fraction
e.g. 0 | 11 | 00 = $\infty$,  1 | 11 | 00 = -$\infty$
###### c) NaN (not a number)
0 or 1 in sign, all 1's in exponent, NOT all 0's in fraction
e.g. 0 | 11 | 10  1 | 11 | 01


# References
[[LEC 3 Floating Point Numbers.pdf]]