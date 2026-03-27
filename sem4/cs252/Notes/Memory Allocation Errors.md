Opened 03-27-2026 11:03

Status:

Tags:

# Memory Allocation Errors

**1 Memory Leaks**
obj in memory that are no longer used, but are not freed

issues: excessive heap use --> app starts to swap --> system runs out of swap space

slow, but persistent problem

**2 Premature Frees**
obj still used by program is freed

issues: obj is added to freelist --> modification causes next and prev pointers may be overwritten --> malloc/free to crash

hard to debug, crash can be far from source of error. also makes program susceptible to security vulnerabilities

prevention: set pointers to `NULL` after free

**3 Double Free**
freeing an obj that is alr free

issues: adds obj to be added to freelist twice --> corrupts list --> future malloc/frees may crash

prevention: same fix as premature free

**4 Wild Frees**
"free of non-heap objects"
program attempts to free a pointer in memory not returned by malloc

issues: no header --> free may crash --> if free succeeds, freelist is corrupted --> future malloc/frees may crash

prevention: memory allocated with `malloc()` should only be deallocated with `free()` and memory allocated with `new()` should be deallocated with `delete()`

**5 Memory Smashing**
"heap buffer overflow" "buffer overflow"
less memory is allocated than the memory that will be used

issues: overwriting of the header of the obj that is next in block order --> corrupts freelist --> future malloc/frees may crash

---
## Debugging

**Tools**
- Valgrind
- Dr. Memory
- Clang/GCC Address Sanitizer
- UndefinedBehaviorSanitizer

---
# Active Recall

1 Enumerate the 5 memory allocation errors and describe them.
||see above||

---
# References
1 [Valgrind](https://valgrind.org/)