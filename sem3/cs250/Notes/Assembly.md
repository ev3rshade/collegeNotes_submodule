Opened 10-30-2025 21:04

Status:

Tags: [[+ instruction set architecture]] [[+ program translation]]

# Assembly
> A symbolic, human-readable representation of machine instructions; one-to-one mapping to binary machine code.

Unlike high-level languages, assembly is architecture-specific and not portable between different ISAs.

---

## Assembler
> A program that translates assembly mnemonics and labels into binary machine code.

The assembler produces an **object file** containing:
- Machine instructions (text segment)
- Data
- A **symbol table** mapping label names to addresses
- Relocation information for the linker

**Pseudoinstruction** — an assembler shorthand with no direct hardware equivalent; the assembler translates it into one or more real instructions.

Example: `MOV X1, X2` → `ORR X1, XZR, X2` in LEGv8

---

## Assembly → Machine Code

Each assembly instruction maps to a fixed-size binary encoding:

```
ADD X1, X4, X3
→ opcode(11) | Rm(5) | shamt(6) | Rn(5) | Rd(5)
→ 10001011000 | 00011 | 000000 | 00100 | 00001
```

---

## Labels and Branches

**Labels** — named addresses in code; used as branch targets and data references.

```
loop:
    ADDI X0, X0, #1
    CBZ  X0, loop     // branch to label
```

The assembler resolves label addresses and inserts them into branch instruction immediate fields.

---

## Relation to the Translation Pipeline

```
Source (.c) → Compiler → Assembly (.s) → Assembler → Object (.o) → Linker → Executable
```

See [[+ program translation]], [[Compilation]], [[Linker]]

---

# Active Recall

1. What is the difference between assembly and machine code?
||Assembly is the human-readable symbolic form; machine code is the binary encoding. The assembler translates one to the other.||

2. What does a symbol table contain?
||Mappings from label names to their memory addresses.||

3. What is a pseudoinstruction?
||An assembler convenience shorthand with no direct hardware equivalent; the assembler translates it into one or more real instructions.||

---

# References
[[ARM LEGv8]]
[[Compilation]]
[[Linker]]
[[+ program translation]]
## Textbook
- Chapter 2 (2.6, 2.12)
