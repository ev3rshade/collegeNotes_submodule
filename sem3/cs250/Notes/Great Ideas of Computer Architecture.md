Opened 12-14-2025 02:18

Status:

Tags: [[+ cpu architecture]]

# 8 Great Ideas of Computer Architecture

> Fundamental principles from Patterson & Hennessy that have driven computer architecture for decades.

---

## 1. Design for Moore's Law
> Anticipate that transistor density doubles roughly every 18-24 months.

- Computer designs take years; the hardware available when shipped will be far more powerful than at design start
- Architect for future capability, not just current constraints

## 2. Use Abstraction to Simplify Design
> Hide complexity behind well-defined interfaces.

- Layers: transistors → gates → ALU → datapath → ISA → OS → application
- Each layer uses the layer below without needing to know its internals

## 3. Make the Common Case Fast
> Optimize the frequent case even if it makes rare cases slower.

- Amdahl's Law shows improving the common case gives the greatest overall speedup
- Example: **XZR (X31)** — hardwired zero register, because zero is the most commonly needed constant

## 4. Performance via Parallelism
> Do multiple things simultaneously.

- Instruction-level: pipeline, superscalar, out-of-order execution
- Data-level: SIMD, vector processing
- Task-level: multicore, multiprocessor

## 5. Performance via Pipelining
> Overlap stages of multiple instructions to increase throughput.

- Classic 5-stage pipeline: IF → ID → EX → MEM → WB
- Throughput approaches 1 instruction per cycle (ideally)
- See [[Instruction Pipelining]]

## 6. Performance via Prediction
> Guess the outcome and recover if wrong — if correct most of the time, net gain.

- **Branch prediction** — predict branch taken/not-taken; flush and restart on miss
- Speculation lets the pipeline continue rather than stall

## 7. Hierarchy of Memories
> Use multiple levels of storage with different speed/cost/size tradeoffs.

- Registers → L1 Cache → L2/L3 Cache → Main Memory (DRAM) → Disk
- Exploits temporal and spatial locality
- See [[Memory]]

## 8. Dependability via Redundancy
> Duplicate hardware to detect and correct errors.

- **Error detection:** parity bits, checksums
- **Error correction:** ECC in DRAM
- **Fault tolerance:** RAID disk arrays, redundant power supplies

---

# References
## Textbook
- Chapter 1
  - 1.1
