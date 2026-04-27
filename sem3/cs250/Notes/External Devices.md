Opened 12-14-2025 17:21

Status:

Tags: [[+ io and device management]]

Topic:

# External Devices

> Hardware outside the CPU and main memory that a computer uses to communicate with the world or store data persistently.

Managed via [[Device Programming]] (polling and interrupts) and [[DMA (Direct Memory Access)]].

---

## GPU (Graphics Processing Unit)

> Originally designed for rendering graphics; now widely used for general-purpose parallel computing (GPGPU).

### Architecture
- **Thousands of simpler cores** organized into streaming multiprocessors (SMs)
- Each SM executes many threads in lockstep (**SIMT — Single Instruction Multiple Thread**)
- Very high **memory bandwidth** (high-bandwidth memory, GDDR)
- Separate device memory from CPU RAM (data must be transferred via DMA or PCIe)

### Execution Model
- **Warp** (NVIDIA) — group of 32 threads that execute the same instruction simultaneously
- **Divergence** — if threads in a warp take different branches, both paths execute serially (reduced efficiency)

### Use Cases
- Deep learning / neural networks
- Scientific simulation (fluid dynamics, molecular dynamics)
- Image/video processing
- Cryptocurrency mining

### Programming
- **CUDA** (NVIDIA) — C/C++ extension for GPU programming
- **OpenCL** — open standard, cross-platform
- **SYCL** — modern C++ based GPU programming

---

## Network Interface

> Connects the computer to local and wide-area networks.

- Data arrives/departs via **DMA** to avoid saturating the CPU
- Handled by the OS network stack via interrupts (each received packet triggers an interrupt)

See [[Network]]

---

## Other I/O Devices

- **Keyboard / Mouse** — interrupt-driven; generates interrupt on each keypress/click
- **Display** — frame buffer in memory; GPU writes to it; display controller reads it
- **USB Controllers** — bridge to USB peripherals (keyboard, mouse, flash drives)
- **Audio** — DMA transfers audio buffers to/from audio controller

---

# References
[[Device Programming]]
[[DMA (Direct Memory Access)]]
[[Network]]
