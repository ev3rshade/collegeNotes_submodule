Opened 03-13-2026 16:22

Status:

Tags: [[+ program translation]] [[Von Neumann Architecture]]

# Stored Program Concept

> The idea that **both instructions (program) and data** are stored together in the same main memory, allowing programs to be modified and treated as data.

---

## Why It Matters

Before stored-program computers (e.g., early electromechanical machines), programs were "wired in" — changing the program meant rewiring the machine.

The stored-program concept enables:
- **Flexibility** — programs can be loaded, modified, and replaced at runtime
- **Self-modifying code** — a program can write new instructions into memory
- **General-purpose computing** — the same hardware runs any program

---

## Implementation

**Program Counter (PC)** — a register that holds the address of the next instruction to execute.

Instruction cycle:
1. **Fetch** — read instruction from memory at address in PC
2. **Decode** — interpret the opcode and operands
3. **Execute** — perform the operation
4. **PC update** — PC ← PC + 4 (for LEGv8 32-bit instructions)

---

## Relation to Von Neumann Architecture

The stored-program concept is the defining feature of the **Von Neumann architecture**:
- One shared memory for instructions and data
- One bus connecting CPU and memory
- CPU alternates between fetching instructions and fetching/storing data

**Von Neumann bottleneck** — sharing the memory bus for both instructions and data limits performance.

---

## Modern Relevance

Modern CPUs split instruction fetch and data access into separate caches (Harvard-style cache) while maintaining a unified main memory (Von Neumann semantics) — getting the best of both worlds.

---

# References
[[Von Neumann Architecture]]
