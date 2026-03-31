Opened 03-27-2026 13:02

Status:

Tags: [[UNIX Filesystem]]

# Open File

both **Open File Table** and **Open File Objects** are stored in the [[Kernel]]

---
## Open File Table
list of all files that are opened in the [[Process]] table

each open file descriptor entry contains a pointer to an open file object

**File descriptor (fd)** - an index into the table
- starting number of file descriptors for any program is 3. stdin = 0     stdout = 1    stderr = 2
- Max num of file descriptors per process is 1024 by default but can be changed with ulimit

---
## Open File Object

### Characteristics

**1 [[I-node]]**

**2 Open Mode**
how the file was opened (read only, read write, append)

**3 Offset**
the next read or write operation starts at the offset
each operation increases offset

**4 Reference Count**
number of file descriptors that point to this Open File Object
when ref count reaches 0 is removed
initially 1 and increased after `fork()` or calls like `dup()` and `dup2()`

---
## Default Open Files

**0 - Default Standard Input**
**1 - Default Standard Output**
**2 - Default Standard Error**

stdin, stdout, and stderr are inherited from the parent process

****
## Relevant Header Files

`<unistd.h>`0
macros - `STDIN_FILENO`, `STDOUT_FILENO`, `STDERR_FILENO`

system calls
[[fork]]
[[dup]] [[dup2]]
[[open]] [[close]]

---
# Pictures
![[Screenshot 2026-03-27 133122.png]]

---
# Active Recall

1 T/F both open file table and open file objects are stored in the kernel
||True||
2 what value do syscalls like write/read use as reference to open files?
||File descriptors||
3 list and explain the attributes of an open file object
||see above||

---
# References