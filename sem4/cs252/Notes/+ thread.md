Opened 04-06-2026 08:37

Status:

Tags: [[+ process]]

# Thread
a path execution

default C/C++ has one thread called "main thread" that starts the main()


---
## Syntax

POSIX threads (standard)
```c
pthread_create( &thr_id, attr, func, arg)
```

`join()`
blocks thread until finishes

---
## Characteristics

Each thread has its own (labeled in the process table entry of the process running the thread(s))
- Stack
- PC - Program Counter
- Set of registers
- State
implies: own function calls, and local variables


---
## Synchronization

threads share global variables --> modification of same data causes issues

use [[Locks]] to make code ATOMIC

**Atomic Section**
(critical section)
a portion of code that only one thread should execute at a time


---
## Advantages and Disadvantages

Advantages
1. **Fast thread creation**
	1. creating a new path of execution faster than creating new process with new virtual memory address space and open file table
2. **Fast context switch**
3. **Fast communication across threads**


Disadvantages
1. **Threads less robust than processes**
2. **More synchronization problems**



---
## Applications

**Concurrent Server App**

**Taking Advantage of multiple CPUs**

**Interactive Applications**




---
# Active Recall

1 what does the following program output?
```c
#include <pthread.h>
void prstr( char *s ){
	while( 1 ){
		printf( "%s",s);
	}
}

int main(){
	// thread 2
	pthread_create( NULL, NULL, prstr, "b\n" );
	// thread 3
	pthread_create(NULL, NULL, prstr, “c\n" );
	// thread 1c
	prstr( "a\n" );
}
```
|| a, b, c interleaving at random in an infinite stream ||


2 explain why the threads are relevant to each of the applications mentioned above
|| see slides 401 - 403 ||

---
# References