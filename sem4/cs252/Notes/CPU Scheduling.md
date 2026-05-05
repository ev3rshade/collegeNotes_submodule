Opened 04-29-2026 15:04

Status:

Tags: [[+ process]]

# CPU Scheduling

## Types of Scheduling

### Non-preemptive
context switch only happens when the running process goes to a waiting state or when process gives up CPU
- primitive
- misbehaved process holds CPU

### Preemptive
a context switch happens periodically
- uses interrupts

**Round Robin**
(one ready-queue)
- uses queues to schedule processes and switch when interrupts arrive
- quantum -- predefined process runtime
	- shorter the quantum, the shorter that average completion time
	- BUT context switch overhead prevents super short quantum from optimizing process execution



**Multilevel Feedback-Queue Scheduling**
instead of having a single queue of ready processes, there are multiple queues of different priorities
- scheduler will schedule the ready processes with highest priority first
- same priority round robin per queue
- uses **process aging**
	- processes in the queue longer have higher priority
	- processes that finish before the quantum expires have higher priority
	- processes with lower CPU burst estimates have higher priority

![[Screenshot_20260429_152312.png]]

---
# Active Recall

1 what is the main problem  of non-preemptive scheduling?
|| misbehaved program causes CPU to be on hold ||


2 why can't a super short quantum maximize the efficiency of process scheduling?
|| the shorter the quantum, the shorter the average completion time, but there is overhead to a context switch ||

3 what is the standard quantum time?
|| 1/100 sec -- compromise between response time and context switch overhead ||

4 what are the components of process aging?
|| how long a process is in a queue, whether a process finishes before a quantum expires, whether a process's burst finishes before the quantum expires, CPU burst estimate ||

5 what is the correlation between CPU burst estimate and process priority?
|| larger CPU burst estimate == lower priority ||

---
# References