Opened 17:54

Status:

Tags: [[+ data representation]]

# Computer Arithmetic
> Binary arithmetic operations performed by the ALU, operating on two's complement integers.

---

## Integer Representations

| Scheme | Used For |
|---|---|
| Two's complement | Modern CPUs — addition works identically for positive and negative |
| Sign-magnitude | Legacy; separate sign bit |
| One's complement | Legacy |
| Biased notation | IEEE 754 exponent field |

**Overflow** — result exceeds the representable range; hardware sets an overflow flag.

---

## Sign Extension
> Replicating the sign bit to fill a wider register, preserving the numeric value.

Used when loading narrow values into 64-bit registers:
- `LDURB` / `LDURH` — load byte/halfword and sign-extend
- `STURB` / `STURH` — store byte/halfword, preserve lower bits

---

## Addition

Carry propagates left:
```
carry:   1100
         1011
       + 0110
       ------
        10001
```

---

## Subtraction

Negate (two's complement) and add:
```
carry:   0100
         1011
       - 0110  →  + 1010
       ------
          0101
```

---

## Multiplication

Shift-and-add algorithm:
- Check Multiplier[0]; if 1, add Multiplicand to Product
- Shift Multiplicand left 1 bit
- Shift Multiplier right 1 bit
- Repeat for each bit

![[Screenshot 2025-12-09 122855.png]]

Result is 2n bits wide for two n-bit operands.

---

## Division

Repeated subtraction / shift algorithm; produces quotient and remainder.

![[Screenshot 2025-12-09 124711.png]]

**Prediction** — modern dividers predict multiple quotient bits per step for speed.

---

# Active Recall

1. Why does two's complement dominate in modern hardware?
||Addition hardware works identically for both positive and negative numbers — no special-case logic needed.||

2. What is sign extension used for?
||Loading a narrower value (byte, halfword) into a wider register while preserving its signed numeric value.||

---

# References
[[Arithmetic Logic Unit (ALU)]]
[[+ data representation]]
## Textbook
- Chapter 3
