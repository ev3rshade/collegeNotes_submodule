Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + digital logic
> The foundation of computer hardware — how electrical signals encode information and how circuits compute

---
## Signals

**Asserted** — signal is logically high (true)
**Deasserted** — signal is logically low (false)

**Active High logic** — logic 1 = higher voltage
**Active Low logic** — logic 1 = lower voltage

**Rising edge** — 0→1 transition; **Falling edge** — 1→0 transition

**Control signals** — direct what a component does (e.g., select lines, enable)
**Data signals** — carry values being processed

---
## Types of Logic

**Combinational logic** — output depends only on current inputs; no memory
**Sequential logic** — output depends on current inputs AND stored state; has memory

### Finite-State Machines (FSMs)
> A sequential function with: a set of states, inputs, outputs, a next-state function, and an output function.

Systems with state: registers, memories, latches, flip-flops

---
## Fundamental Components

### Transistor
> An on/off switch controlled by an electrical signal — the basic building block of all digital circuits.

### Basic Gates
| Gate | Function |
|---|---|
| AND | output = 1 only if all inputs = 1 |
| OR | output = 1 if any input = 1 |
| NOT | inverts input |
| NAND | inverted AND |
| NOR | inverted OR |
| XOR | output = 1 if inputs differ |

### Latches and Flip-Flops

**S'R' Latch** — basic 1-bit storage from two cross-coupled NOR gates
- S=1 sets Q=1; R=1 resets Q=0; both=0 holds state; both=1 is invalid

**D Latch** — stores input D while Enable is asserted; holds when deasserted

**D Flip-Flop** — state changes only on clock edge; the standard sequential element

---
## Boolean Algebra

**Sum of Products** — OR of AND terms: e.g., `(A·B) + (C·D)`

**DeMorgan's Laws:**
- ¬(P ∧ Q) ≡ ¬P ∨ ¬Q
- ¬(P ∨ Q) ≡ ¬P ∧ ¬Q

**Truth Tables** — k variables → 2^k rows; "don't cares" mark irrelevant inputs

---
## Bus Architecture

**Bus** — a group of N parallel wires carrying N bits simultaneously

- **Data bus** — carries values (instructions, data)
- **Address bus** — carries memory addresses
- **Control bus** — carries read/write, enable signals

Only one device may drive a shared bus at a time. Enforced by:
- **Tri-state buffers** — output can be 0, 1, or Z (disconnected)
- **Multiplexers** — explicitly select one source

---
## Structured Components

**Multiplexer (MUX)** — selects one of 2^N inputs based on N select lines
**Demultiplexer (DEMUX)** — routes one input to one of 2^N outputs

**Decoder** — n inputs → 2^n outputs; exactly one output asserted
**Encoder** — 2^n inputs → n outputs

### Programmable Logic
- **PLA** — programmable AND and OR planes
- **PAL** — programmable AND, fixed OR
- **ROM** — treats inputs as addresses, outputs as stored words
- **FPGA** — configurable logic blocks using LUTs (lookup tables) and flip-flops

---
## Timing

**Setup time** — input must be valid this long *before* the clock edge
**Hold time** — input must remain valid this long *after* the clock edge

Violation → **metastability** (unpredictable output)

**Propagation delay** — time for a signal change to produce a stable output; limits clock speed

See [[Clocking and Timing]]

---
## Key Example Circuits

**Half Adder** — adds 2 bits: Sum = A⊕B, Carry = A·B
**Full Adder** — adds 3 bits (A, B, Cin): built from two half adders + OR gate
**2-to-1 MUX** — Y = (¬S·D0) + (S·D1); 2 AND, 1 NOT, 1 OR
**3-to-8 Decoder** — 3 NOT + 8 AND gates; one output per input combination
**SR Latch** — 2 cross-coupled NOR gates; hold/set/reset
**D Latch** — SR latch + gating; transparent when Enable=1

---
# Active Recall

1. How many rows does a truth table with 4 input variables have?
||2^4 = 16 rows||

2. What is the difference between a latch and a flip-flop?
||A latch is level-sensitive (changes while enable is asserted); a flip-flop changes only on a clock edge.||

3. What is the width of a 64-wire bus?
||64 bits||

---
# References
[[Clocking and Timing]]
[[Arithmetic Logic Unit (ALU)]]
[[Circuitry]]
