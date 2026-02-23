Opened 01-28-2026 09:03

Status:

Tags: cs252

# Memory and Pointers

## Pointer
a variable that contains an address in memory
-- size is 8 bytes

How to get pointer values:
1. assign a numerical value into a pointer
2. get memory address from another variable (`&` in C)
3. allocate memory from the heap
4. pass a pointer as a parameter to a function (to modify the content of the parameter)

you can store variables of any type in memory by using casts --> definitions of memory sections (structs) allow us to interpret the memory values

### Printing pointers
useful to print pointers for debugging
```
char*i;
char buff[10];
printf("ptr=%ld\n", (long)&buff[5])
```

Pointers are always 8 bytes in size

### Using pointers to optimize execution
use pointer incrementation instead of indexing the array
- removes need for multiplication
- don't need to size of array
- can define ragged arrays

### Pointers to functions
Polymorphism in C

### Common problems
- pointer is pointing to invalid memory location
- string functions do not allocation memory for you
	- except `strdup`
# References
[[CS252-Slides-Sprin2026.pdf]] 62-82