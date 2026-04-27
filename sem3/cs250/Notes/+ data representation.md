Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + data representation
> How computers represent numbers, text, and other information in binary

---
## Units of Data

**Bit** — the fundamental unit; a single 0 or 1
**Byte** — 8 bits
**Word** — 32 bits (natural unit of access); **Doubleword** — 64 bits

- **LSB (Least Significant Bit)** — rightmost bit
- **MSB (Most Significant Bit)** — leftmost bit

---
## Binary Representations of Integers

Three schemes for representing signed integers:

| Scheme | +13 | -13 |
|---|---|---|
| Sign-magnitude | 01101 | 11101 |
| One's complement | 01101 | 10010 |
| Two's complement | 01101 | 10011 |

**Two's complement** is used in virtually all modern computers because it simplifies arithmetic hardware (addition works identically for positive and negative numbers).

**Converting to two's complement negative:** invert all bits, then add 1.

#### Overflow
> When the result of an arithmetic operation cannot be represented with the available number of bits.

---
## Hexadecimal

Base-16 system using 0–9 and A–F. Each hex digit represents exactly 4 bits.

Example: `1111 0001 1010 0100` → `0xF1A4`

---
## Endianness

How multi-byte values are stored in memory:

**Big Endian** — most significant byte at lowest address (human-readable order)
- `0x12345678` stored as `12 34 56 78`

**Little Endian** — least significant byte at lowest address (used by x86, ARM)
- `0x12345678` stored as `78 56 34 12`

---
## Text Encoding

**ASCII** — 7/8-bit encoding for printable characters and control codes
- Digits 0–9: hex `0x30`–`0x39`
- Uppercase A–Z: hex `0x41`–`0x5A`

---
## Floating Point (IEEE 754)

Three fields: **sign**, **exponent** (biased), **mantissa (fraction)**

| Format | Sign | Exponent | Mantissa | Total |
|---|---|---|---|---|
| Single precision | 1 | 8 | 23 | 32 bits |
| Double precision | 1 | 11 | 52 | 64 bits |

Value = (-1)^sign × 1.mantissa × 2^(exponent - bias)

Bias: 127 for single, 1023 for double.

Special values: ±0, ±∞, NaN (exponent all 1s)

IEEE 754 exceptions: overflow, underflow, divide-by-zero, invalid operation, inexact

---
## Computer Arithmetic

### Sign Extension
> Copying the sign bit to fill a wider register, preserving the numeric value.
- Used when loading smaller values into 64-bit registers (`LDURB`, `LDURH`)

### Operations

**Addition** — binary carry propagation
**Subtraction** — negate (two's complement) and add
**Multiplication** — shift-and-add algorithm; 2n-bit result from two n-bit operands
**Division** — repeated subtraction / shift algorithm; produces quotient and remainder

Hardware: [[Arithmetic Logic Unit (ALU)]]

---
# Active Recall

1. What are the three signed integer representation schemes? Which does modern hardware use?
||Sign-magnitude, one's complement, two's complement. Modern hardware uses two's complement.||

2. How do you negate a two's complement number?
||Invert all bits, then add 1.||

3. In IEEE 754 single precision, how many bits are in each field?
||1 sign, 8 exponent, 23 mantissa (total 32 bits)||

---
# References
[[Computer Arithmetic]]
