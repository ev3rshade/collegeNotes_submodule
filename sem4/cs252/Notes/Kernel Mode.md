Opened 03-25-2026 08:57

Status:

Tags: [[6 Full Notes/College Notes/sem4/cs252/Notes/+ computer architecture|+ computer architecture]]

# Kernel Mode
when CPU runs in this mode
- it can run any instruction in the cpu
- it can modify any location in memory
- it can access and modify any register in the CPU
- there is full control of the computer

Programs switch to kernel mode to request OS services (system calls)

[[Interrupt]] vector can be modified only in kernel mode.

---
# Active Recall

1 what programs run in kernel mode?
||OS services, interrupts, modifying ||
2 when the computer first boots up, what things does the kernel set up?
||interrupt vectors and device initialization. then it starts the first process||

---
# References