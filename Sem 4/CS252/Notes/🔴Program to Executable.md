Opened 02-11-2026 08:46

Status:

Tags: [[+ program (software)]]

# Program to Executable
### Compilation

Steps
1. C-Preprocessor
2. Compilation/Optimization
3. Assembly
4. Linking

![[Screenshot 2026-01-13 160123.png]]

**C-Preprocessor**
- expands `#define` `#include` `#ifdef`
- generates a `hello.i` temp file
	- e.g. `#include<stdio.h>` reads file and includes in `hello.i`

stop file after preprocessing
```
bash$ gcc -E hello.c > hello.i
hash$ cat hello.i
```


**Compiler ([gcc](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20gcc))**
- complies `hello.i`, optimizes it
- generates assembly instruction
- `hello.s`

stop file after assembly
```
bash$ gcc -S hello.c
```


**Assembler**
- assembles `hello.s`
- generates `hello.o` (object file)


**Linker**
(static linker)
- puts tgt object files (\*.o) and static libraries (\*.a - archive)
- verifies symbols in program from static libraries
	- gives error if there is a symbol not defined


### Loading a program

**Loader** - a program that is used to run an executable file in a process
(runtime linker)

Executable File --> Loader --> Executable in memory

1. Allocates space for all the sections executable file (text, data, bss)
2. loads executable + shared libs into memory
3. writes (resolves) values in program to point to shared libs
4. jumps to `_start` entry  point that calls `init()` of all libraries and initializes static constructors
5. calls `main()` and program begins
6. `_start` also calls `exit()` when `main()` returns


![[Screenshot 2026-02-13 091309.png]]

#### Executable file formats
- **ELF** - Executable and Link format (UNIX e.g. Solaris, Linux)
- **PE/COFF** - Portable and Executable/Common Object File Format (Windows)
- a.out - now just the default name for complied files. very restrictive, not used anymore (BSD (Berkely Standard Distribution) and early UNIX)[^1]


[^1]: Note: BSD UNIX and AT&T UNIX are the predecessors of the modern UNIX flavors like Solaris and Linux.
# References
[[CS252-Slides-Sprin2026.pdf]] 47-59