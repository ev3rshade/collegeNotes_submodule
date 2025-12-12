[[CS240 Class Outline]]
# gdb
-g with gcc to add debugging information
- ### Flags
	- r - run
	- b - breakpoint
		- b - N     @line N
		- b fn       @beginning of function
	- d N - deletes breakpoint at number N
	- info break - list breakpoints
	- bt - backtrace
		- prints a call stack until the current stopping point of a function
		- That stopping point can be seg fault, a breakpoint, etc.
	- q - quit
	- -------more flags in anki
# Memory

## Layout
### Endianness
#### Little Endian
- 
#### Big Endian
- d
### Macroscopic layout
>memory
  **| Functions   | Globals   | "The Heap" --> <-- Locals**                    |
  **0 --> -->**
  pointers

##### Stack
- local memory usage

##### Heap
- dynamic memory allocation

## Allocation

### Malloc
- ``#include <malloc.h>``
- ###### ``malloc(size_t size);
	- returns a pointer to the heap or NULL if there is an error
	- ALWAYS ASSERT AFTER ALLOCATING MEMORY

- ###### ``calloc(int n, int s)``
	- reserves n chunks of memory of size s
	- sets all of the bytes to 0

==WARNINGS:  NEVER RETURN A POINTER TO SOMTHING THAT IS STACK ALLOCATED==
### Free
- ``free(void *ptr);
- frees memory at ptr
- return type void

## Pointers
`` int *p = NULL;
`` int **pp = NULL;

###### Strings
- ``char *str = "Hello";
	- Allocates pointer on stack
	- Points to array in the read-only "code/text segment"
	- immutable
- ``char str[] = "Hello";
	- Allocates an array on the stack and initializes it by copying values *from* the array in the read-only "code/text segment"
	- mutable
### Address
`` p = &x;
`` pp = &p;
----p points to x
----pp points to p
### Dereferencing
`` *p == x (true)
`` p->x`` for struct fields
##### C is a pass by value language

Are arrays equal to pointers?
- yes, ptr = array is allowed, but not 
- if p = array 
- ``p[x]`` accesses the xth element of an array

#### Function pointers
``int (*ptr_to_funct) (int x, int y);
return type - pointer to function - func args

example
```
int main() {
	int (*ptr_to_func) (int, int) = NULL;

	ptr_to_func = sum; // a function
	result = (*ptr_to_func)(3, 5);
}
```
You can pass pointers to functions as args to functions
==TRY EXAMPLE IN LEC 15==
### Debugging
#### Valgrind
#### gdb (see above)

# Data Structures
## Linked Lists
> head
> tail
> next

basic linked list example
```
typedef struct n {
	int value;
	struct n *next;
} node;
```
#### Operations (4 step processes)
- #### Prepend (push)
	- Add to front of list
- #### Insert
	- Add to given indice of list
- #### Append
	- Add to tail of list
- #### Pop
	- Remove head of list
- #### Delete (remove)
	- Remove specific indice of list

#### Singly Linked Lists
> head
> tail (sometimes)
> next

#### Doubly Linked Lists
> head
> tail (sometimes)
> prev
> next


# Zero
> int - 0
> float/double - 0.0
> hex - 0x0
> char - '\0' / NUL
> void \* - NULL

All result in the same when defining vars

# Recursion
| base case | self-invocation | the stack |
> a function calling itself 

usually more convenient to write
==DON'T RECURSE TOO DEEPLY==