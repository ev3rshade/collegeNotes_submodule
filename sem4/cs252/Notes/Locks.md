Opened 04-29-2026 15:38

Status:

Tags: [[+ thread]]

# Locks


## Test and Set Lock


## Mutex Locks
(mutual exclusion locks)
software mechanisms that enforce atomicity

Declaration
Initialization
Start atomic section
End atomic section


---
## `fork()` and Threads



---
# Active Recall

1 what makes a lock fair?
|| the order that threads acquire the lock matches the order they requested it (FIFO) ||


2 a multithreaded program with 3 threads calls fork(). How many threads does the child process have?
|| only one. fork() duplicates ONLY the calling thread into the child. The other threads disappear in the child process. ||

3 what danger arises when fork() is called while another thread holds a mutex?
|| child process may deadlock trying to acquire the mutex. The mutex-holding thread doesn't exist in the child. If the child tries to lock that mutex, it blocks forever — deadlock.||

4 `sema_post()` wakes which waiting thread?
|| The thread waiting longest (FIFO) ||


---
# References