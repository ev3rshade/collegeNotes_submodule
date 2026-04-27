Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + cpu architecture
> The hardware organization of the processor — how components work together to execute instructions

---
## Von Neumann Architecture

> A design where both programs and data share the same memory, accessed over a common bus.

Components:
- **CPU** — executes instructions (contains ALU + Control Unit)
- **Memory** — stores both instructions and data
- **I/O** — communicates with the outside world
- **Bus** — connects all components

**Von Neumann Bottleneck** — memory bandwidth limits performance because instructions and data share one bus.

See [[Von Neumann Architecture]]

---
## The 8 Great Ideas of Computer Architecture

1. **Design for Moore's Law** — anticipate rapid transistor growth
2. **Use Abstraction to Simplify Design** — hide complexity behind interfaces
3. **Make the Common Case Fast** — optimize for frequent operations (XZR register is an example)
4. **Performance via Parallelism** — do multiple things at once
5. **Performance via Pipelining** — overlap stages of instruction execution
6. **Performance via Prediction** — guess outcomes and recover if wrong (branch prediction)
7. **Hierarchy of Memories** — multiple levels from fast+small to slow+large
8. **Dependability via Redundancy** — duplicate hardware to detect and correct errors

See [[Great Ideas of Computer Architecture]]

---
## Registers

> Small, fast storage inside the CPU — the fastest memory in the system.

- **Technology:** SRAM-like flip-flops
- **Access time:** single clock cycle or sub-cycle
- **Capacity:** 32 registers × 64 bits = 256 bytes in LEGv8
- **Volatile:** loses data on power loss

**Register File** — the complete set of general-purpose registers plus access logic (read/write ports)

**Program Counter (PC)** — special register holding the address of the next instruction

See [[Registers]]

---
## ALU (Arithmetic Logic Unit)

> The computational heart of the CPU — performs arithmetic (add, subtract) and logical (AND, OR, XOR, shift) operations.

- Controlled by a **4-bit ALU operation signal**
- Outputs: **Result**, **Zero flag**, **Overflow flag**
- Part of the EX stage in the pipeline

See [[Arithmetic Logic Unit (ALU)]]

---
## Datapath

> The collection of hardware units that store, move, and operate on data.

**State elements (clocked):**
- PC — tracks current instruction
- Register file — holds computation values
- Instruction memory — stores program
- Data memory — stores program data

**Combinational elements:**
- ALU — computes results and addresses
- Adders — PC increment, branch target
- Multiplexers — select data sources
- Wires / buses — route signals

### Datapath Implementations

**Single-cycle** — each instruction in one clock cycle; simple but slow (clock period = slowest instruction)

**Multi-cycle** — instructions span multiple cycles; reuses hardware; shorter clock period

**Pipelined** — overlaps multiple instructions; highest throughput; requires hazard handling

See [[Datapath]]

---
## Control Unit

> Generates control signals that tell datapath components what to do each cycle.

**Main Control Unit** — reads the opcode and produces:
- `RegWrite`, `MemRead`, `MemWrite`, `MemToReg`, `Branch`, `ALUSrc`, `ALUOp`

**ALU Control Unit** — combines `ALUOp` (2 bits from main control) + function field → 4-bit ALU operation

| ALUOp | Meaning |
|---|---|
| 00 | Add (for load/store address) |
| 01 | Subtract (for branches) |
| 10 | Determined by function field (R-type) |

See [[Control Unit]]

---
## Instruction Execution Cycle

1. **IF** — Instruction Fetch: read instruction at PC; PC ← PC + 4
2. **ID** — Instruction Decode: read registers, decode opcode
3. **EX** — Execute: ALU computes result or address
4. **MEM** — Memory: read/write data memory (load/store only)
5. **WB** — Write Back: write result to register file

---
# Active Recall

1. What are the 5 stages of the classic instruction execution cycle?
||IF (Fetch), ID (Decode), EX (Execute), MEM (Memory), WB (Write Back)||

2. What is the Von Neumann bottleneck?
||Memory bandwidth limits performance because instructions and data share the same bus.||

3. What is the difference between the Main Control Unit and the ALU Control Unit?
||Main control reads the opcode and generates high-level signals including ALUOp. ALU control combines ALUOp with the function field to produce the specific 4-bit ALU operation.||

---
# References
[[Von Neumann Architecture]]
[[Great Ideas of Computer Architecture]]
[[Datapath]]
[[Control Unit]]
[[Arithmetic Logic Unit (ALU)]]
[[Registers]]
