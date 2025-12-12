# C as a programming Language
>function oriented  |  recompilation

Things written in C
- Linux kernel
- Windows' kernel and Mac's kernel (mostly)
### Compiling (gcc)
flags | error messages
- standard compiler for most UNIX-like operating systems (03/22/1987)
- common flags 
	- ==what do each of them represent==?
	- -c
	- -g
	- -Wall
	- -Werror
	- -O
	- -o file
	- -ansi
	- -std=X
	- library flags
#### \#include
pulls files labeled by the \#include into one stream (the file the include is in)

### Object files and executables
incomplete executable | binary code | symbol table | .o or .obj
- can be linked
- one of the files needs a main function to be an executable

why object files? - incremental compilation for larger applications to reduce compilation time

###### Example 1 - compiling and linking programs to make an executable
- ``gcc -Wall -Werror -std=c17 -o hello.c hello_main.c

- ```gcc -Wall -Werror -g -c file1.c 
  gcc -Wall -Werror -g -c file2.c 
  gcc -o my_progr file1.o file2.o```

### C standards
- ANSI C or ISO C  (C89 or C90)
- C94 or C95
- C99
- C11 (C11X)
- C18
- C23

# Functions
### Prototypes
prevent mismatch | bookkeeping with types
- Forward declaration of functions

# Variables
naming convention - ``my_variable
## Types in C
data type for generic item void **

| name   | memory (bytes) | max | min | notes |
| ------ | -------------- | --- | --- | ----- |
| short  |                |     |     |       |
| int    |                |     |     |       |
| long   |                |     |     |       |
| float  |                |     |     |       |
| double |                |     |     |       |
| char   |                |     |     |       |

## Modifiers
##### Final Variables
- ``const float PI = 3.14;
- ``#define PI (3.14)

## Strings
>an array of chars
- <string.h>
- 

# IO / File IO

## IO
### printf()
- uses stdout

### scanf()
- uses stdin

files are referred to by file pointers
### fopen()
- ``FILE *fopen(char *file_name, char *mode);
- mode - "r" and/or "w" "a"


# Debugging

## Lecture 5  01/29
## Lecture 6  02/03
- ### struct
	- ```struct my_struct {
			 int x
			 float y
			};```
	- can make an array of structs
- ### typedef
		- Declaration vs definition
			- declaration - creating a struct
			 ```
		 example 
			typedef struct my_struct {
			 int x
			 float y
			};
			```
``
		- definition - creating a typedef
		
		example
			new_struct_type var = { 1, 3.2};
			and
			typedef struct my_struct {
				int x
				float y
			} new_struct_type;
- ### Union
	- Variables that are stored in overlapping places in memory
	- Different from structs because all variables are overlapping
	- Used for saving space and system hacking
		- Not used often tho
- ### DEFINITION VS DECLARATIONS
	- #### ==Definition==
		- Allocates storage for a variable or a function
		- Creation of a function
	- #### ==Declaration==
		- outlines the properties of a variable (or function)
		- DON'T PUT DECLARATION IN FUNCTIONS
		- #### Function prototype
			`` example double my_funtion(char *hello, int hi);
		- #### extern
			- tells what var looks like, doesn't allocate space
			- `` extern char g_my_global_var[MAX_LEN];
## Lecture 7  02/05
- ### Arrays
	- Can partially initialize, rest of values are set to default
		- only for arrays within functions
	- Array items are guaranteed to be packed together
- ## Data layout in memory
	- ==ANYTHING CONTAINING A VALUE USES MEMORY== >= 1 byte
	- Long stream of bytes
	- Variables that are defined near each other are usually near each other in memory
- ## Pointers
	- std libraries of basic types that allow you to make sure that the pointer size of a pointer is the same even in different architechtures
	- intptr etc.


# Coding standard
- Why no global variable
	- harder to read source code
	- concurrent programs
	- persistent - memory taken up
	- testing - makes it more difficult
- File I/O
	- After fclose() set file pointer to NULL
	- 

# C Libraries
## <stdio.h>
- scanners
	-make sure to format using decimals (MAX_LEN - 1)
	- scanf()
	- sscanf()
	- fscanf()
## <string.h>
- Checking to see if the first character of a string is NUL
	- `` if (string[0] == '\0') {}
- strncpy() 
	- WARNING - doesn't terminate the string copied
	- DONT  USE IT
```
	fscanf(fp, "%29[^\n]%*c", n[i]);
```
## <stdbool.h>
- makes type ``bool`` a thing
- "true" or "false"
# UNIX Commands
- ssh - remote server connection
- X - graphics program


# Tip and Tricks
- Homework
	- make sure to remove or disable all printf() in your code (for grader file size limit)
- Integrate the linter in your vim so you can style-check as you go
- Type cast for ``malloc()``

# All chapters to read - process with LM
The C Programming Language (2nd ed); Kernighan and Ritchie; Prentice Hall, March 1988 ISBN-13: 978-0131103627
https://docs.google.com/document/d/1W-fuNQcxoBp9BdlWG_r7xXubd0koZkwTpQ1tKPmKG6k/edit?tab=t.0
Beej’s Guide to C Programming; Brian “Beej” Hall; 2007
https://beej.us/guide/bgc/