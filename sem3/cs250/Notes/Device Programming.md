Opened 12-14-2025

Status:

Tags: [[+ io and device management]]

# Device Programming

> How the CPU communicates with and controls I/O devices.

---

## I/O Address Space

### Memory-Mapped I/O (MMIO)
> Device registers are mapped into the normal virtual address space.

- CPU accesses device registers with standard LDUR/STUR instructions
- Simpler — no special I/O instructions required
- Common in RISC architectures (ARM, RISC-V, MIPS)
- OS must mark these memory regions as non-cacheable

### Port-Mapped I/O
> Separate address space for I/O devices; requires special instructions.

- x86 uses `IN`/`OUT` instructions
- Provides hardware protection (user programs can't issue I/O instructions directly)

---

## I/O Interaction Models

### Polling (Busy Waiting)
> CPU continuously reads a status register until the device is ready.

```
while (device_status_register != READY) {}  // spin
device_data_register = data;
```

Advantages:
- Simple to implement
- Low latency when device responds quickly

Disadvantages:
- Wastes CPU cycles if device is slow
- Prevents CPU from doing other useful work

Best for: fast devices where wait time is short (e.g., high-speed UART)

### Interrupt-Driven I/O
> Device signals the CPU (via an interrupt line) when it is ready; CPU runs a handler.

Flow:
1. CPU writes command to device registers
2. CPU continues running other work
3. Device asserts interrupt line when done
4. CPU finishes current instruction, saves state (PC, registers)
5. CPU vectors to interrupt handler (determined by interrupt number)
6. Handler reads/writes device data, clears interrupt
7. CPU restores state and resumes interrupted task

Advantages:
- CPU does useful work while device operates
- Efficient for slow devices

Disadvantages:
- Interrupt overhead (save/restore state)
- Complex software (interrupt handlers)

Best for: slow or infrequent devices (keyboard, disk, network)

---

## Interrupt Vectors

**Vectored interrupt** — interrupt number indexes into an interrupt vector table; each entry is the address of the corresponding handler.

On ARMv8:
- **ESR (Exception Syndrome Register)** — identifies the cause of the exception
- **ELR (Exception Link Register)** — holds the address to return to after handling

---

## Device Registers

Typical I/O device exposes:
- **Status register** — device ready? error? busy?
- **Control register** — start operation, set mode
- **Data register(s)** — read input or write output

---

# References
[[DMA (Direct Memory Access)]]
[[External Devices]]
