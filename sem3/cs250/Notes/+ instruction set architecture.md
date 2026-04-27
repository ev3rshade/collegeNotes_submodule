Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + instruction set architecture
> The contract between hardware and software — the set of commands a processor understands

---
## What is an ISA?

An **Instruction Set Architecture (ISA)** defines:
- The instructions the processor can execute
- Their encoding (format and bit fields)
- The registers available
- Memory addressing modes
- Exception behavior

The ISA used in this course is [[ARM LEGv8]].

---
## Instruction Types

| Type | Purpose | Examples |
|---|---|---|
| Arithmetic | Math operations | ADD, SUB, MUL |
| Data Transfer | Move data memory↔register | LDUR, STUR |
| Logical | Bitwise operations | AND, ORR, EOR, LSL, LSR |
| Conditional Branch | Test and jump | CBZ, CBNZ, B.cond |
| Unconditional Jump | Always jump | B, BR, BL |

---
## LEGv8 Instruction Formats

All instructions are **32 bits** fixed-length.

**R-type** (register): `opcode(11) | Rm(5) | shamt(6) | Rn(5) | Rd(5)`
- Used for arithmetic-logic (ADD, SUB, AND, ORR)

**I-type** (immediate): `opcode(10) | immediate(12) | Rn(5) | Rd(5)`
- Used for operations with a constant (ADDI, SUBI)

**D-type** (data transfer): `opcode(11) | address(9) | op2(2) | Rn(5) | Rd(5)`
- Used for LDUR, STUR; 9-bit offset from base register

**B-type** (branch): `opcode(6) | offset(26)`
- Used for B (unconditional); ±2^27 byte range

**CB-type** (conditional branch): `opcode(8) | offset(19) | Rt(5)`
- Used for CBZ, CBNZ, B.cond; ±2^20 byte range

---
## LEGv8 Registers

32 general-purpose 64-bit registers (X0–X31):

| Registers | Name | Purpose |
|---|---|---|
| X0–X7 | Args/Results | Function parameters and return values |
| X9–X15 | Temporaries | Scratch; not preserved |
| X19–X27 | Saved | Long-lived values; callee must preserve |
| X28 | SP | Stack pointer |
| X29 | FP | Frame pointer |
| X30 | LR | Link register (return address) |
| X31 | XZR | Hardwired zero |

---
## Addressing Modes

**Immediate** — operand is a constant embedded in the instruction (`ADDI X1, X2, #5`)
**Register** — operand is in a register (`ADD X1, X2, X3`)
**Base + offset** — address = register + constant (`LDUR X1, [X2, #40]`)
**PC-relative** — address = PC + offset (branches, `CBZ X1, #25`)

---
## RISC vs CISC

See [[RISC and CISC Design]] for full comparison.

| | RISC | CISC |
|---|---|---|
| Instruction set | Small, simple | Large, complex |
| Instruction length | Fixed (32-bit) | Variable |
| Memory access | Load/store only | Instructions can access memory |
| Pipelining | Easy | Harder |
| Examples | ARM, RISC-V, MIPS | x86, VAX |

Modern CPUs blur the line: x86 internally translates to RISC-like micro-ops.

---
## Assembly Language

**Assembly** — symbolic representation of machine instructions; one-to-one mapping with machine code.

**Assembler** — translates assembly mnemonics into binary machine code.

**Pseudoinstruction** — assembler convenience shorthand with no direct hardware equivalent.

**Symbol table** — maps labels to their instruction addresses.

See [[Assembly]] and [[ARM LEGv8]].

---
## Portability

If two computers share the same ISA, assembly code is portable between them.

Real-world ISAs: MIPS, ARMv7 (32-bit), ARMv8 (64-bit), x86

---
# Active Recall

1. How many bits is each LEGv8 instruction?
||32 bits||

2. What register holds the return address in LEGv8?
||X30 (LR — Link Register)||

3. What is the key difference between RISC and CISC memory access?
||RISC uses load/store only (only these instructions touch memory); CISC instructions can operate directly on memory.||

---
# References
[[ARM LEGv8]]
[[Assembly]]
[[RISC and CISC Design]]
