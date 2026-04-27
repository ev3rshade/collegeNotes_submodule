Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + instruction execution
> How the CPU runs instructions over time — timing, pipelining, and hazard resolution

---
## Clocking

> A hardware timing signal that coordinates when state elements update.

**Edge-triggered clocking** — all state changes occur on the clock edge (rising edge); prevents race conditions; allows read and write in the same cycle.

**Clock cycle time (period)** — determined by the slowest stage in the datapath. Shorter → faster CPU but simpler stages required.

**Clock rate** = 1 / clock cycle time (measured in Hz)
- Example: 1 GHz clock → 1 ns period

**Propagation delay** — time for a signal change to produce a stable output; limits how fast the clock can run.

See [[Clocking and Timing]]

---
## Classic 5-Stage Pipeline

> Overlapping the execution of multiple instructions by dividing execution into stages.

| Stage | Name | Work Done |
|---|---|---|
| IF | Instruction Fetch | Read instruction from memory; update PC |
| ID | Instruction Decode | Read registers; decode opcode |
| EX | Execute | ALU computation or address calculation |
| MEM | Memory Access | Read/write data memory |
| WB | Write Back | Write result to register file |

**Pipeline registers** (IF/ID, ID/EX, EX/MEM, MEM/WB) carry values between stages.

### Pipeline Performance

Ideal clock cycles for n instructions in a k-stage pipeline (no stalls):
$$\text{Clock Cycles} = n + k - 1$$

- **Latency** — time for one instruction to complete (k cycles)
- **Throughput** — instructions completed per cycle (approaches 1 IPC with full pipeline)

---
## Pipeline Hazards

> Situations that prevent the next instruction from executing in the next cycle.

### Structural Hazard
> Hardware resource conflict — two instructions need the same hardware in the same cycle.

Example: single memory shared for instruction fetch and data access.

### Data Hazard (Data Race)
> An instruction depends on the result of a previous instruction still in the pipeline.

**RAW (Read After Write)** — true dependency; most common
**WAR (Write After Read)** — name dependency; rare in simple pipelines
**WAW (Write After Write)** — name dependency

**Load-use hazard** — special RAW where data from memory is not available for the immediately following instruction.

### Control Hazard
> The processor doesn't know which instruction to fetch next (branch outcome unknown).

---
## Hazard Resolution

### Forwarding (Bypassing)
> Send result directly from a pipeline register to a dependent stage without waiting for WB.

Common paths:
- EX/MEM → EX (result ready one cycle early)
- MEM/WB → EX (result ready two cycles early)

Forwarding cannot resolve load-use hazards (data not yet from memory).

### Pipeline Stall (Bubble)
> Insert a NOP (no-operation) to delay dependent instruction.

Used when forwarding is insufficient (e.g., load-use hazard requires 1 stall cycle).

### Instruction Reordering
> Compiler rearranges instructions to move independent instructions between a load and its user, avoiding stalls.

---
## Branch Prediction

### 1-Bit Predictor
- Predicts taken (1) or not-taken (0)
- On misprediction: flip bit, flush pipeline

### 2-Bit Predictor (Most Common)
> Uses a 4-state saturating counter; only changes prediction after two consecutive mispredictions.

**Branch History Table (BHT)** — table of 2-bit counters indexed by lower bits of the branch PC.

### Advanced Predictors
- **Branch Target Buffer (BTB)** — caches destination PC for predicted-taken branches
- **Correlating Predictor** — uses global execution history in addition to local branch behavior
- **Tournament Predictor** — combines multiple predictors and picks the best dynamically

---
## Exceptions in Pipelines

Pipelined processors treat exceptions as a **control hazard**:
1. Instructions after the faulting instruction must not complete
2. Processor state must be saved precisely

**Precise exception** — all earlier instructions committed; no later instructions modify state; required by most modern ISAs

**Imprecise exception** — older or aggressively pipelined architectures; harder to handle

**Out-of-order execution** complicates this; resolved with:
- Reorder buffers (ROB)
- In-order commit stage
- Register renaming

---
# Active Recall

1. What are the three types of pipeline hazards?
||Structural, Data, Control||

2. Why can't forwarding resolve a load-use hazard alone?
||The data from memory isn't available until the end of the MEM stage, which is too late for the immediately following instruction's EX stage — one stall cycle is always required.||

3. Why is 2-bit branch prediction better than 1-bit?
||A 2-bit predictor only changes its prediction after two consecutive mispredictions, so a single wrong branch doesn't immediately flip the prediction — it handles loops better.||

---
# References
[[Clocking and Timing]]
[[Instruction Pipelining]]
[[Datapath]]
