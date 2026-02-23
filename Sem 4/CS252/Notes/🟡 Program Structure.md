Opened 01-12-2026 06:45

Status:

Tags:  cs252 [[+ program (software)]] [[+ memory]] 

Prev Note: [Course Intro](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2FCourse%20Intro) Next Note: [Layers in a Computer](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%9F%A1%20Layers%20in%20a%20Computer) [Assembly](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20Assembly)

# 🔴 Program Structure
## Representing Data (smallest to largest)

0s 1s = 0 volts, 5 volts (traditionally)

bits, bytes = one 0 or 1, 8 bits

two's complement, ascii, unicode


## Memory
To a computer Program = array of memory 
- In C/C++ directly access these using pointers
- Von Neumann Architecture - Program and Data in the same memory

address space
> the range of addresses that can be represented in a given computer

Memory sections
⬇️ **0xff**
- stack
- shared libs
- heap
- bss (block started by symbol)
- data
- text
⬆️ **0x00**

hello.c program that prints out the address of variables at each memory section
```
#include   
int a = 5; // Stored in data section  
int b[20]; // Stored in bss  
const char * hello = “Hello world”;  
int main() { // Stored in text  
	int x; // Stored in stack  
	int *p = (int*) malloc(sizeof(int)); //Stored in heap  
	printf(“(Data) &a=0x%lx\n”, &a)  
	printf(“(Bss) &b[0]=0x%lx\n”, &b[0]);  
	printf(“(Stack) &x=0x%lx\n”, &x);  
	printf(“(Heap) p=0x%lx\n”, p);
	printf(“(ROData) “Hello”=0x%lx\n”, hello);
	printf(“(TEXT) main=0x%lx\n”, main);
}
```

### characteristics of each program (memory) section
Memory is either read/write/execute (chmod)

**Stack** - local variables and return addresses; grows down
**Heap** - memory returned when called malloc/new; grows up
**Bss** - uninitialized globals, statics (zeroes)
**Data** - initialized global variables
**Text** - instructions that the program runs

**Static Libraries** - a libraries loaded 
- linked at compile time
- code is copied into the executable
- each program has a copy of a static library (\#include)

**Dynamic Libraries** - libraries (prewritten, reusable code) shared with other processes
- linked at run/load time
- executable only contains references
- has own text, data, bss
- address space
- process only modifies their own address space


**Memory Gaps**
> gaps between each memory section without memory mappings
- program tries to access memory gap --> SEGV signal that kills program
- core file contains values of variables global and local at the time of SEGV
- core file can be used for "post mortem" debugging (see gdb)

## Programs
a program is a file in a special format containing the information necessary to load an application into memory and make it run 

[Program to executable](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4Program%20to%20Executable)
an executable is a machine readable format of a program. 
### program sections
- machine instructions - code that makes TEXT section in program
- initialized data - list of initialized variables and string constants defined in program; DATA and RODATA sections
- list of shared libraries needed for execution
- list of zero initialized memory (BSS, STACK, HEAP) that needs to me allocated before
- defined/undefined symbols - vars, function names that the program will know when OS loads program in memory and links it with libraries





# References
[[CS252-Slides-Sprin2026.pdf]] - Slides 9-16
[[Chapter1-ProgramStructure.pdf]]