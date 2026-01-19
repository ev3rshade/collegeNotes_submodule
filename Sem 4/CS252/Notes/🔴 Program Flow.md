Opened 01-16-2026 08:43

Status:

Tags:

# Program Flow

## \_start
where all program executions start on your computer

basics

pair
```
cmpq S2, S1  # S1 - S2 compare quad words

testq S2, S1 # S1 & S2: test quad word
```
with

Jump conditions

| Mnemonic      | Required Flag State  | Description              |
| ------------- | -------------------- | ------------------------ |
| `JGE` / `JNL` | `SF = OF`            | Jump if greater or equal |
| `JNG`         | `ZF = 1 or SF ≠ OF`  | Jump if not greater      |
| `JLE`         | `ZF = 1 or SF ≠ OF`  | Jump if less or equal    |
| `JG` / `JNLE` | `ZF = 0 and SF = OF` | Jump if greater          |


# References