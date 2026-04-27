Opened 02-25-2026 11:57

Status:

Tags: [[+ digital logic]]

prev: next:

# Circuitry

> The physical implementation of digital logic — how gates and memory elements are assembled into functional units.

For detailed coverage of circuit types, see the sections below.

---

## Levels of Abstraction

```
Transistors (switches)
    ↓
Logic Gates (AND, OR, NOT, NAND, NOR, XOR)
    ↓
Combinational Circuits (adders, MUXes, decoders, ALU)
    ↓
Sequential Circuits (latches, flip-flops, registers)
    ↓
Functional Units (register file, ALU, memory)
    ↓
Datapath + Control
```

---

## Combinational Circuits

> Output depends only on current inputs — no memory, no state.

Key examples:
- **Half adder** — Sum = A⊕B, Carry = A·B
- **Full adder** — adds A, B, Carry-in; produces Sum and Carry-out
- **Ripple carry adder** — chain of full adders; simple but slow (carry propagates bit by bit)
- **Carry lookahead adder** — computes carry bits in parallel; faster
- **Multiplexer (MUX)** — selects one of N inputs
- **Decoder** — n input bits → 2^n one-hot outputs
- **ALU** — performs arithmetic and logic operations

---

## Sequential Circuits

> Output depends on current inputs AND stored state — has memory.

Key elements:
- **S'R' Latch** — basic 1-bit storage from two NOR gates
- **D Latch** — stores input D while Enable=1; transparent/opaque
- **D Flip-Flop** — edge-triggered; state changes only on clock edge
- **Register** — N flip-flops in parallel; stores N-bit value
- **Register file** — array of registers with read/write ports

---

## SRAM Cell

> 6 transistors per bit: cross-coupled inverters (stores state) + 2 access transistors.

- No refresh needed (unlike DRAM)
- Much faster than DRAM
- Used for: registers, cache (L1, L2, L3)

---

## DRAM Cell

> 1 transistor + 1 capacitor per bit; charge on capacitor = stored bit.

- **Requires refresh** — capacitor leaks; must be read and rewritten thousands of times per second
- Much denser and cheaper than SRAM
- Used for: main memory (RAM)

---

## Programmable Logic

- **PLA** — two-level logic (AND plane + OR plane); both programmable
- **PAL** — programmable AND plane + fixed OR plane; simpler
- **FPGA** — uses LUTs (lookup tables) and flip-flops; fully reconfigurable; used for prototyping

---

# References
[[Arithmetic Logic Unit (ALU)]]
[[Registers]]
[[Memory]]
