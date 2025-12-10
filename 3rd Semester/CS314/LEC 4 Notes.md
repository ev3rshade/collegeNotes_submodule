#### Rounding
- Occurs when you can't store enough digits to represent a number in binary
- e.g. numbers like 0.4 are infinitely repeating binary digits
##### Round-to-nearest with Ties-to-Even
> Rounding a binary number to the next nearest binary number within the digits of the floating point number system
> If exactly at half between two closest numbers, round to the one with the even least significant digit (the number ending in a 0)
> Helps reduce bias

##### Round-towards-0 (truncation)
> Truncates the fractional part of the number, rounding it to be closer to 0 in the process

##### Round-towards-positive-infinity, Round-towards-negative-infinity

##### Unit Roundoff
> the maximum relative error in representing a number by a floating point system normalized numbers
> $\frac{|f\ell(x) - x|}{|x|} = |\delta| \leq u$



### IEEE Floating Point Standard
> the universal standard for binary floating-point arithmetic that defines how computers represent and process fractional numbers

#### Single Precision
>1 Sign bit
>8 exponent bits
>23 fractional bits
#### Double Precision
> 1 Sign bit
> 11 exponent bits
> 52 fractional bits

##### Normal numbers
###### realmin
$(1.0....0) \times 2^{-2^{10} + 2}$

###### realmax
$(1.1....1) \times 2^{2^{10} - 1}$

##### Distance between two successive numbers
$x_1 = 1.0....00 \times 2^{1023}$
$x_2 = 1.0....01 \times 2^{1023}$
###### Absolute error
$|x_2 - x_1| = 2^{971}$

###### Relative error
$\frac{|x_2 - x_1|}{|x_1|} = \frac{2^{971}}{2^{1023}} = 2^{-16}$

##### Subnormal numbers