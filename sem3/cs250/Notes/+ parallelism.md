Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + parallelism
> Running computations simultaneously to increase performance

---
## Why Parallelism

**Critical path** — the longest chain of dependent operations; no program can run faster than this.

Most programs contain independent work that can run in parallel.

### Granularity
- **Fine-grained** — frequent communication; high synchronization overhead (e.g., instruction-level)
- **Coarse-grained** — infrequent communication; common in multiprocessor programs
- **Embarrassingly parallel** — little or no communication; ideal for massive parallelism

---
## Levels of Parallelism

### Instruction-Level Parallelism (ILP)
> Running multiple instructions simultaneously within one processor.

Techniques:
- **Pipelining** — overlap instruction stages (see [[+ instruction execution]])
- **Multiple issue / Superscalar** — launch more than one instruction per cycle
  - *Static multiple issue* — compiler decides which instructions to pair
  - *Dynamic multiple issue* — hardware decides at runtime
- **Out-of-order execution** — reorder independent instructions to avoid stalls
- **Speculation** — execute instructions before knowing if they're needed (e.g., after a branch)

**Issue slots** — positions from which instructions may issue in a single cycle.

### Data-Level Parallelism (DLP)
> The same operation applied to many independent data elements simultaneously.

Exploited by SIMD and vector processors.

### Task-Level Parallelism
> Running independent programs or threads simultaneously on multiple processors.

---
## Flynn Taxonomy

| Class | Instruction Streams | Data Streams | Example |
|---|---|---|---|
| SISD | 1 | 1 | Classic sequential CPU |
| SIMD | 1 | Multiple | GPU, vector units |
| MISD | Multiple | 1 | Data pipelines (rare) |
| MIMD | Multiple | Multiple | Multicore CPUs, clusters |

Many real systems are hybrids.

---
## SIMD

> Single instruction broadcast to multiple processing elements, each operating on its own data.

Structure:
- **Control Unit (CU)** — fetches, decodes, and broadcasts instructions
- **Processing Elements (PEs)** — each executes EX/MEM/WB on its own local data

**PE enable stack** — 1-bit mask per PE controlling whether it executes non-control instructions; enables conditional execution (if/else divergence).

Advantages: single program copy, no explicit sync, high throughput for data-parallel code
Disadvantages: inefficient for divergent control flow

See [[SIMD]]

---
## Vector Processors

> Processors that operate on entire arrays (vectors) of data with a single instruction.

- **Vector registers** hold multiple data elements (e.g., 8 × 64-bit floats)
- A single instruction operates on all elements in parallel
- No explicit loop needed — the hardware loops internally
- **Vector functional units** — pipelined arithmetic units for vectors
- Examples: Intel SSE/AVX, ARM SVE, RISC-V V extension

Advantages: eliminates loop overhead, automatic exploitation of data parallelism, efficient memory bandwidth use
Disadvantages: requires data to be truly independent; control flow is limited

See [[Vector Processors]]

---
## MIMD

> Multiple processors independently executing different instructions on different data.

- Most common parallel architecture
- Each processor has its own program counter and register state
- Parallelism is explicit to the programmer

### Synchronization

**Barrier** — all threads must arrive before any proceed; used for phase synchronization
- **Sense-reversing barrier** — prevents deadlock when barriers are reused

**Lock / Mutex** — ensures mutual exclusion to shared data; prevents race conditions

### Cache Coherence
> Ensuring all caches see a consistent value for a shared memory location.

**Write-invalidate protocol** — when one cache writes, other copies are invalidated
**Snooping** — caches monitor the shared bus for writes to addresses they hold

**False sharing** — unrelated variables on the same cache line cause unnecessary invalidations.

See [[MIMD]]

---
## Multithreading

**Thread** — PC + registers + stack; shares address space with other threads in the same process

**Process** — one or more threads with their own address space and OS state

### Hardware Multithreading
> Switch between threads when one stalls, keeping the pipeline busy.

- **Fine-grained multithreading** — switch threads every cycle
- **SMT (Simultaneous Multithreading)** — issue instructions from multiple threads in one cycle (Intel Hyper-Threading)

---
## Parallel Memory Architectures

**UMA (Uniform Memory Access)** — all processors have equal memory latency (shared bus / on-chip)
**NUMA (Non-Uniform Memory Access)** — memory latency depends on which processor owns the memory bank

### Shared Memory Model
> All processors share one address space; use synchronization (locks, barriers) to coordinate.

### Message Passing Model
> Processors communicate by explicitly sending/receiving messages; no shared address space.

---
## Processor System Types

**Uniprocessor** — single processor; concurrency via interleaving/context switching
**SMP (Symmetric Multiprocessor)** — identical processors sharing memory (multicore CPUs)
**Asymmetric Multiprocessor** — different processors with specialized roles (CPU + GPU)

### Grid Computing
> Harnessing idle resources of many distributed computers for large problems.
Examples: BOINC, Folding@home, Einstein@Home

### Special Architectures
**Redundant parallel** — multiple units compute the same result for fault detection/tolerance

---
## Scalability

**Bisection bandwidth** — bandwidth between two equal halves of a multiprocessor system; limits communication-heavy workloads.

**Strong scaling** — performance improves without increasing problem size as processors increase
**Weak scaling** — problem size grows proportionally with processor count; performance stays constant

---
# Active Recall

1. What are the four classes in Flynn's taxonomy?
||SISD, SIMD, MISD, MIMD||

2. What is the difference between SIMD and MIMD?
||SIMD: one instruction stream on multiple data (all PEs get same instruction). MIMD: each processor runs its own independent instruction stream.||

3. What is false sharing?
||When unrelated variables happen to share the same cache line, causing unnecessary cache invalidations when one processor writes to its variable.||

---
# References
[[SIMD]]
[[MIMD]]
[[Vector Processors]]
[[Execution Models and Coordination Parallel Systems]]
[[Special Parallel Architectures- Grid, MISD, and Reliability]]
[[Processor Architecture]]
