Opened 12-14-2025

Status:

Tags: [[+ io and device management]] [[Main memory]]

# DMA (Direct Memory Access)

> A hardware mechanism that transfers data directly between an I/O device and main memory, without the CPU executing each individual transfer.

---

## Motivation

Without DMA, a large data transfer (e.g., reading a disk block) requires the CPU to:
- Read each byte/word from the device register
- Write each byte/word to memory

This is **programmed I/O** — the CPU is fully occupied and can do nothing else.

DMA offloads this to dedicated hardware, **freeing the CPU**.

---

## DMA Controller

A specialized hardware unit (usually on the system bus or integrated into the device controller) that can:
- Drive the address bus
- Drive the data bus
- Assert read/write control signals

It acts like a secondary bus master, temporarily "stealing" bus cycles from the CPU (**cycle stealing**).

---

## DMA Transfer Process

1. **CPU programs the DMA controller:**
   - Source address (device register or memory)
   - Destination address (memory)
   - Transfer count (number of bytes/words)
   - Transfer direction (device → memory or memory → device)

2. **DMA controller runs the transfer independently:**
   - Reads from source, writes to destination, one bus cycle at a time
   - CPU continues executing (from cache) during bus-busy cycles

3. **DMA controller interrupts CPU when done:**
   - CPU services the interrupt and processes the transferred data

---

## Benefits

| Without DMA | With DMA |
|---|---|
| CPU executes every memory write | DMA controller handles all memory writes |
| CPU fully occupied during transfer | CPU free to compute during transfer |
| Low throughput for large transfers | High throughput (hardware-speed transfer) |

---

## Usage Examples

- **Disk I/O** — reading a 4KB page from disk into memory
- **Network** — receiving/sending network packets
- **GPU** — copying data between CPU RAM and GPU VRAM
- **Audio** — streaming audio buffers to the sound card

---

## Relation to Cache Coherence

DMA writes to physical memory directly, bypassing the CPU's cache.
- CPU may have a stale cached copy of the memory the DMA just wrote
- OS must **flush or invalidate** the relevant cache lines before/after DMA transfers
- Some systems use hardware cache coherence for DMA (snooping)

---

# Active Recall

1. What problem does DMA solve?
||Without DMA, the CPU must execute every individual memory-to-device and device-to-memory transfer, wasting CPU time. DMA offloads this to hardware, freeing the CPU.||

2. How does the CPU know when a DMA transfer is done?
||The DMA controller generates an interrupt when the transfer completes.||

---

# References
[[Main memory]]
[[Device Programming]]
