Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + performance
> Metrics and methods for evaluating and improving computer system efficiency

---
## What is Performance?

Performance always depends on:
- **The task / workload**
- **The metric being measured** (time, throughput, energy, etc.)

**Performance = 1 / Execution Time** — lower execution time = better performance

---
## Time-Based Metrics

**Response time (Execution time)** — total time from start to finish of a task
- Includes disk access, memory access, I/O, OS overhead, CPU time

**CPU time** — time the CPU spends computing (no I/O wait)
- **User CPU time** — time executing the user's program
- **System CPU time** — time in OS on behalf of the program

> System performance = elapsed wall-clock time
> CPU performance = user CPU time

**Throughput (Bandwidth)** — number of tasks completed per unit time; important for servers

---
## The Classic CPU Performance Equation

$$\text{CPU Time} = \text{Instruction Count} \times \text{CPI} \times \text{Clock Cycle Time}$$

or equivalently:

$$\text{CPU Time} = \frac{\text{Instruction Count} \times \text{CPI}}{\text{Clock Rate}}$$

**Clock rate** = cycles per second (Hz)
**CPI** = Cycles Per Instruction (average)
**IPC** = Instructions Per Cycle = 1/CPI

Improving performance requires improving **at least one** of: instruction count, CPI, or clock rate.
Changing one factor may hurt another.

---
## Relative Performance

If computer X is n times as fast as computer Y:

$$\frac{\text{Execution Time}_Y}{\text{Execution Time}_X} = n$$

---
## Amdahl's Law

> The maximum speedup from improving only part of a system is limited by the unimproved fraction.

$$\text{Speedup} = \frac{1}{(1-f) + \frac{f}{s}}$$

- *f* = fraction of execution time that is improved
- *s* = speedup of that improved portion

**Implication**: serial portions dominate at scale; making 90% of code 10× faster gives at most 5.3× overall speedup.

---
## Benchmarks

**Workload** — a set of programs with defined frequencies used to evaluate performance

**Benchmarks** — carefully chosen programs to compare systems fairly

**SPEC (Standard Performance Evaluation Corporation)**
- **SPEC CPU** — measures processor performance with integer (CINT) and floating-point (CFP) workloads
- **SPECratio** = Reference time / Measured time; higher = better
- Results summarized using **geometric mean** (to avoid bias from any single benchmark)
- **SPECpower** — performance per watt (ssj_ops per watt)

> **Time is the most reliable measure of performance.** (SPEC benchmarks measure time.)

---
## The Power Wall

- Clock rates increased rapidly until ~2004
- Power dissipation became unsustainable: **P ∝ C × V² × f**
- Result: flattened clock rates; shift to **multicore processors**; emphasis on **energy efficiency**

**Power (Watts)** = rate of energy consumption
**Energy (Joules)** = total energy consumed (often more important for mobile/data centers)

---
## Scaling

**Strong scaling** — fix problem size, add processors; speedup = Amdahl's Law bound
**Weak scaling** — increase problem size proportionally with processors; goal = constant execution time

---
# Active Recall

1. Write out the CPU performance equation.
||CPU Time = Instruction Count × CPI × Clock Cycle Time||

2. If 50% of a program can be parallelized and runs 4× faster, what is the overall speedup?
||Speedup = 1 / ((1 - 0.5) + 0.5/4) = 1 / (0.5 + 0.125) = 1.6×||

3. Why did clock rates stop increasing around 2004?
||Power dissipation (heat) became unsustainable as frequencies increased — the "power wall".||

---
# References