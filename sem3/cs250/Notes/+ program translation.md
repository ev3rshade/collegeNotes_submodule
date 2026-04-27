Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + program translation
> The pipeline from human-readable source code to running program in memory

---
## Translation Pipeline

```
High-Level Language (.c)
        ↓  [[🟡 Compilation]] (compiler)
Assembly Language (.s)
        ↓  Assembler
Object File (.o)  +  Library Routines
        ↓  [[Linker]]
Executable File (a.out)
        ↓  [[Loader]]
Program in Memory
```

---
## Languages

**Machine Language** — raw binary; directly executable by hardware

**Assembly Language** — symbolic, architecture-specific; one-to-one with machine instructions

**High-Level Languages** — portable, human-readable
- **C/C++** — compiled directly to native machine code
- **Java** — compiled to bytecode, interpreted by JVM; JIT compiler translates hotspots to native code at runtime

---
## Compilation

> Translates high-level source code into assembly language.

Key compiler optimizations:
- **Instruction scheduling** — reorder instructions to reduce pipeline stalls
- **Loop unrolling** — replicate loop body to expose instruction-level parallelism
- **Register renaming** — eliminate false dependencies (antidependences)

See [[Compilation]]

---
## Assembly → Object File

The **assembler** converts assembly mnemonics to binary machine code.

The **object file** contains:
- Machine instructions (text segment)
- Data
- Symbol table (labels → addresses)
- Relocation information (references to fix up)

**Pseudoinstructions** are assembler-level shorthands with no direct hardware equivalent.

---
## Linker

> Combines object files and library routines into a single executable.

Steps:
1. Place code and data modules in memory symbolically
2. Determine final addresses of all labels
3. Patch internal and external references

**Dynamically Linked Libraries (DLLs)** — linked at runtime rather than compile time; saves disk space and allows library updates without relinking.

See [[Linker]]

---
## Loader

> Part of the OS; places the executable into main memory and starts execution.

Steps:
1. Read executable header — determine sizes of text and data segments
2. Create address space large enough for text + data
3. Copy instructions and data into memory
4. Copy parameters to the stack
5. Initialize PC and SP
6. Jump to program entry point

See [[Loader]]

---
## Stored Program Concept

> Instructions and data reside in the same memory, enabling programs to be treated as data and easily modified.

- Fundamental to Von Neumann architecture
- The **Program Counter (PC)** holds the address of the current instruction
- In LEGv8, PC increments by 4 after each instruction (instructions are 4 bytes)

See [[Stored Program Concept]], [[Von Neumann Architecture]]

---
## Procedures (Functions)

**Caller** — invokes a procedure; supplies arguments
**Callee** — the procedure being called; must save/restore registers it uses

**Branch-and-Link (BL)** — saves PC+4 into X30 (LR) and branches to procedure
**Return (BR LR)** — branches back to the saved return address

### Stack
> Region of memory growing downward; supports procedure calls and local storage.

- **SP (X28)** — stack pointer; points to top of stack
- Push: decrement SP, then store; Pop: load, then increment SP
- **Procedure Frame (Activation Record)** — section of stack for one call: saved registers, locals, return address

**FP (X29)** — frame pointer; fixed reference within the current frame
**GP** — global pointer; points to the static/global data area
**Heap** — grows upward; used for dynamic allocation (`malloc`)

---
# Active Recall

1. What are the four stages of program translation in order?
||Compilation → Assembly → Linking → Loading||

2. What is stored in an object file's symbol table?
||Mapping from label names to memory addresses||

3. What does the BL instruction do in LEGv8?
||Saves PC+4 into X30 (LR) and branches to the target — used for procedure calls||

---
# References
[[Compilation]]
[[Assembly]]
[[Linker]]
[[Loader]]
[[Stored Program Concept]]
[[Von Neumann Architecture]]
