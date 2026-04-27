Opened 12-15-2025 12:55

Status:

Tags: [[+ parallelism]]

Topic: 

# Vector Processors

> A processor that applies a single instruction to an entire array (vector) of data elements in parallel.

Part of the [[+ parallelism]] family — specifically **data-level parallelism**.

---

## Core Concept

Instead of looping over individual elements, one vector instruction processes all elements at once:

```
# Scalar (must loop):
for i in range(n):
    C[i] = A[i] + B[i]

# Vector (one instruction):
VADD C, A, B    # adds entire vectors A and B
```

---

## Architecture

### Vector Registers
> Wide registers holding multiple data elements (e.g., 512-bit register = 8 × 64-bit doubles)

### Vector Functional Units
> Pipelined arithmetic units that operate on all elements in a vector register
- One per operation type (add, multiply, load, store)
- Deeply pipelined for throughput

### Vector Length Register
> Specifies how many elements the current vector operation processes
- Allows handling arrays shorter than the maximum vector length

### Stride
> Distance between consecutive elements accessed in memory
- Unit stride (contiguous) = most efficient
- Non-unit stride = gathers/scatters; less efficient

---

## Advantages

- **No explicit loop overhead** — the hardware iterates internally
- **Automatic parallelism** — each element is independent
- **Efficient memory bandwidth** — elements loaded in one wide burst
- **Simpler control flow** — one instruction replaces many

---

## Disadvantages

- **Data must be independent** — no dependencies between elements
- **Control flow is limited** — conditionals require masking (enable bits per element)
- **Requires aligned, stride-friendly data** — irregular access patterns reduce efficiency

---

## Examples in Real Hardware

| Architecture | SIMD Extension | Width |
|---|---|---|
| x86 | SSE2 | 128-bit (2 × double) |
| x86 | AVX-512 | 512-bit (8 × double) |
| ARM | NEON | 128-bit |
| ARM | SVE | scalable (hardware-defined) |
| RISC-V | V extension | scalable |
| GPU (NVIDIA) | CUDA | 32-wide warp |

---

## Relation to SIMD

Vector processors are the hardware implementation of SIMD data-level parallelism.

GPUs use SIMT (Single Instruction Multiple Thread) — similar to vector processing but with per-thread program counters for more flexible control flow.

---

# Active Recall

1. What is the key difference between vector processing and scalar loop processing?
||Vector: one instruction processes all elements simultaneously. Scalar: must loop over each element individually.||

2. What is a "stride" in vector memory access?
||The distance between consecutive elements accessed in memory. Unit stride (adjacent elements) is most efficient; non-unit stride requires gather/scatter operations.||

---

# References
[[SIMD]]
