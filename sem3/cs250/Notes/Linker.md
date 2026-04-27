Opened 21:03

Status:

Tags: [[+ program translation]]

# Linker
(also: link editor)
> A system program that combines independently assembled object files and library routines, resolving all undefined references, to produce a single executable file.

---

## Why a Linker is Needed

Each source file is compiled and assembled independently into an **object file**. Object files contain unresolved references (calls to functions defined in other files or libraries). The linker patches all these references.

---

## Linker Steps

1. **Place modules in memory** — assign final memory addresses to each code and data segment
2. **Determine addresses of all labels** — resolve symbol definitions across all object files
3. **Patch references** — fill in branch targets and data addresses (internal and external)

---

## Inputs and Output

**Inputs:**
- Object files (`.o`) from the assembler
- Static library archives (`.a`) — pre-compiled object files

**Output:**
- Executable file — fully linked, no unresolved references; ready for the loader

---

## Static vs Dynamic Linking

**Static linking** — library code copied into the executable at link time
- Larger executable; no runtime dependency
- Library updates require relinking

**Dynamic linking (DLL / shared library)** — library linked at runtime by the OS loader
- Smaller executable; multiple programs share one copy in memory
- Library updates apply without relinking

See [[Loader]]

---

# Active Recall

1. What are the three steps a linker performs?
||Place modules in memory, determine addresses of all labels, patch all internal and external references.||

2. What is the difference between static and dynamic linking?
||Static: library code is copied into the executable at build time. Dynamic: library is loaded and linked at runtime by the OS.||

---

# References
[[Assembly]]
[[Loader]]
[[+ program translation]]
## Textbook
- Chapter 2 (2.12)
