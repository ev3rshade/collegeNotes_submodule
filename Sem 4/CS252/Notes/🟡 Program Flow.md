Opened 01-16-2026 08:43

Status:

Tags: cs252 [[🟡 Assembly]]

Prev Note: [Registers](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20Registers) Next Note: [Assembly Example - Pointer Arithmetic vs Array Dereferencing](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%9F%A2%20Assembly%20Example%20-%20Pointer%20Arithmetic%20vs%20Array%20Dereferencing)
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

## Labels

mark the beginning of different blocks of code
e.g. function names, loops, if statements

# References