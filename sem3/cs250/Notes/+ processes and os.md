Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + processes and os
> How the operating system manages running programs

---
## Operating System

> A program that sits between hardware and user programs, managing resources and providing abstractions.

Responsibilities:
- Process management (scheduling, context switching)
- Memory management (virtual memory, page tables)
- I/O management (device drivers, interrupts)
- Protection and security

---
## Process

> A program in execution, together with its execution state and private virtual address space.

Each process has:
- **Private virtual address space** — isolated from other processes
- **Program Counter (PC)** — next instruction address
- **Registers** — current execution context
- **Stack Pointer**
- **Page table pointer**

**Swap space** — reserved disk area for paging out process memory when RAM is full.

---
## Execution Modes

**User Mode** — restricted; application processes run here; cannot directly access hardware

**Kernel Mode (Supervisor Mode)** — privileged; OS runs here; full hardware access
- Equivalent to `root` in Linux

**System Call** — controlled transfer from user mode to kernel mode
- Triggered by a special instruction (`syscall` / `svc`)
- Like a `sudo` command in Linux
- Uses the exception mechanism

---
## Process Address Space Layout

From low to high addresses:
```
Text (instructions)
Data (globals, static)
Heap (grows upward — malloc/new)
    ...
Stack (grows downward — local vars, frames)
```

Virtual addresses may be identical across processes but map to different physical memory — this enables **isolation**.

---
## Context Switching

> Saving the state of one process and restoring the state of another to allow CPU sharing.

Saved state includes:
- PC (program counter)
- All registers
- Memory management info (page table pointer)

Context switches introduce **overhead** — the CPU does no useful work during the switch.

---
## Process Creation

1. OS creates process structure and allocates PID
2. Virtual address space created; page tables initialized
3. Executable loaded (possibly lazily via demand paging)
4. Execution begins at entry point

### Task-Level Parallelism

> Running independent programs simultaneously on multiple processors/cores.

Managed by the **OS scheduler** — decides which process runs on which core and for how long.

---
# Active Recall

1. What is the difference between user mode and kernel mode?
||User mode is restricted — apps can't directly access hardware. Kernel mode is privileged — the OS has full hardware access.||

2. What does a context switch save and restore?
||PC, all registers, and memory management information (page table pointer).||

3. What is a system call?
||A controlled transfer from user mode to kernel mode using the exception mechanism, allowing user programs to request OS services.||

---
# References
