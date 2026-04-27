Opened 23:12

Status:

Tags: [[+ cpu architecture]]

# Von Neumann Architecture
> A computer design where both programs and data share the same memory, accessed via a common bus by a CPU containing an ALU and Control Unit.

![[Screenshot 2025-12-11 231207.png]]

---

## Components

**CPU** — executes instructions; contains the [[Arithmetic Logic Unit (ALU)]] and [[Control Unit]]
**Memory** — stores both instructions and data; see [[Memory]]
**I/O** — input: receives signals from outside; output: sends signals to outside
**Datapath** — the bus connections that move data between components; see [[Datapath]]

---

## Stored-Program Concept
> Both instructions and data reside in the same memory, allowing programs to be easily modified and treated as data.

This is what makes general-purpose computers possible — the same hardware runs any program.

---

## Von Neumann Bottleneck
> Instructions and data share one memory bus, so only one can be transferred at a time, limiting throughput.

Modern CPUs mitigate this with separate L1 instruction and data caches (Harvard-style cache) while keeping unified main memory semantics.

---

# Active Recall

1. What is the Von Neumann bottleneck?
||Instructions and data share the same memory bus, so the CPU must take turns fetching instructions and accessing data — limiting throughput.||

2. What four main components does Von Neumann architecture define?
||CPU (ALU + Control Unit), Memory, I/O, and the connecting bus/datapath.||

---

# References
[[Stored Program Concept]]
[[Datapath]]
[[Control Unit]]
[[Arithmetic Logic Unit (ALU)]]
[[Memory]]
