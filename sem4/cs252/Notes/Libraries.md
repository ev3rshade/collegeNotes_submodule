Opened 02-13-2026 08:51

Status:

Tags: [[+ program (software)]]

prev: next:
# Libraries

==what is a  library
## Types of Libraries

### Static vs Shared Libraries

shared libraries are shared across different processes
- only one instance of each for entire system
- Shared libraries (.so files) are not added to the executable file

static libraries are not shared
- one instance of one for each process
- Static libraries are added to the executable (.a files)


### Static vs Dynamic Libraries

Static - events that happen during program building
- e.g. static linker
- static type checking (compilation time, C/C++)

**Static Libraries** - a libraries loaded 
- linked at compile time
- code is copied into the executable
- each program has a copy of a static library (\#include)

Dynamic - events that happen while program is running (runtime)
- dynamic linker
- dynamic type checking (at runtime like Python)

**Dynamic Libraries** - libraries (prewritten, reusable code) shared with other processes
- linked at run/load time
- executable only contains references
- has own text, data, bss
- address space
- process only modifies their own address space


# References
[[CS252-Slides-Sprin2026.pdf]] 50, 60-61