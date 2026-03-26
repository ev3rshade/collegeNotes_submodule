Opened 03-25-2026 08:59

Status:

Tags: [[6 Full Notes/College Notes/sem4/cs252/Notes/+ computer architecture|+ computer architecture]]

# User Mode
when the CPU runs in this mode
- it can use a limited set of instructions
- it can only modify only the sections of memory assigned to the process running the program
- it can access only a subset of registers in the CPU and it cannot access registers in devices
- there is limited access to the resources of the computer

switches to [[Kernel Mode]] when an [[Interrupt]] arrives

---
# Active Recall

1 what programs run in user mode?
||user programs such as background system processes (daemons or services), the user shell, the windows manager||
2 when does user mode switch into kernel mode?
||when an interrupt arrives||

---
# References