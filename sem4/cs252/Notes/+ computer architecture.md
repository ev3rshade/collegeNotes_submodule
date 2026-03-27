Opened 03-25-2026 08:37

Status:

Tags: [[! Systems Programming]]

# + computer architecture

**Von Newman Architecture** -  both programs and data are stored in RAM


---
## Computer Components

**Address bus** + **Data bus** that are used to transfer data from/to CPU, RAM, ROM, and the devices

**CPU, Ram, ROM** + all devices attached to this bus


![[Screenshot 2026-03-25 085425.png]]


---
## Modes
[[User Mode]]
[[Kernel Mode]]

Separation is used for:
- **Security** - os calls in kernel to check user priviledges
- **Robustness** - if process tries to write to invalid memory location, OS will kill program --> prevents OS from crashing when user program crashes
- **Fairness** - enforcing fair access

---
# Active Recall

1 which mode does the CPU spend most of it's time?
||user mode||
2 when the computer first boots up, what mode is it in?
||kernel mode||

---
# References