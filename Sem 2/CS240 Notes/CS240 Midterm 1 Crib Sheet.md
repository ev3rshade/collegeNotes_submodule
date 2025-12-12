[[CS240 Class Outline]]
## Common C Libraries
### <stdio.h>
	| standard input output library
	| format below in "variables"
		| format control (- left adj, a number for field width, . precision, number after . is precision)

| Category   | Function       | Syntax                                                               | What does it do                                                                                                               | Return value                                                                                       | Notes                                                                                                                                                                                          |     |
| ---------- | -------------- | -------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --- |
| std in out | ``printf()``   | ``printf(char *format, arg1, arg2, ...)``                            | prints values in specified format to stdin                                                                                    | Number of characters printed<br><br>Error - negative value (EOF)                                   |                                                                                                                                                                                                |     |
|            | ``scanf()``    | ``scanf(char *format, addr1, addr2, ...)``                           |                                                                                                                               | Number of fields that were successfully converted and assigned<br><br>Error - negative value (EOF) |                                                                                                                                                                                                |     |
|            | ``sprintf()``  | ``sprintf(char *string, char * format, arg1, addr2, ...)``           |                                                                                                                               |                                                                                                    |                                                                                                                                                                                                |     |
|            | ``snprintf()`` | ``snprintf(char *string, char * format, arg1, addr2, ...)``          |                                                                                                                               |                                                                                                    |                                                                                                                                                                                                |     |
|            | ``sscanf()``   | ``sscanf(char *string, char * format, addr1, addr2, ...)``           |                                                                                                                               |                                                                                                    |                                                                                                                                                                                                |     |
| file io    | ``fopen()``    | ``fopen(const char *filename, const char *mode)``                    |                                                                                                                               |                                                                                                    | Modes:<br>- "r" read<br>- "w" write<br>- "a" append<br>- "r+" read and write<br>- "w+" create for read and write<br>- "a+" append for read and write<br>- adding "b" specifies for binary file |     |
|            | ``fclose()``   | ``fclose(FILE *stream)                                               |                                                                                                                               |                                                                                                    | ==set file pointer to NULL after per Turkstra coding standards==                                                                                                                               |     |
|            | ``fflush()``   |                                                                      |                                                                                                                               |                                                                                                    |                                                                                                                                                                                                |     |
|            | ``fseek()``    | ``fseek(FILE *stream, long offset, int origin)``                     |                                                                                                                               |                                                                                                    | Origins <br>- SEEK_SET (beginning)<br>- SEEK_CUR (current position)<br>- SEEK_END (end)                                                                                                        |     |
|            | ``ftell()``    | ``ftell(FILE *stream)``                                              |                                                                                                                               | current file position                                                                              |                                                                                                                                                                                                |     |
|            |                |                                                                      |                                                                                                                               |                                                                                                    |                                                                                                                                                                                                |     |
| Line IO    | ``fgets()      | ``fgets(char *line, int maxline, FILE *stream)``                     | reads at most ``maxline -1`` characters from ``stream`` into ``line`` including a `\n` if present, and null-terminates result | returns ``line`` on success, NULL on error                                                         |                                                                                                                                                                                                |     |
|            | ``fputs()``    | ``fputs(const char *line, FILE *stream)``<br>                        | writes string ``line`` to ``stream``                                                                                          |                                                                                                    |                                                                                                                                                                                                |     |
|            |                |                                                                      |                                                                                                                               |                                                                                                    |                                                                                                                                                                                                |     |
| Direct IO  | ``fread()``    | ``fread(void *ptr, size_t size, size_t n_obj, FILE *stream)``        | Reads at most nobj objects of size bytes from stream                                                                          | number of objects read                                                                             |                                                                                                                                                                                                |     |
|            | ``fwrite()``   | ``fwrite(const void *ptr, size_t size, size_t n_obj, FILE *stream)`` | Writes n_obj objects of size bytes from the array pointed to by ptr to stream                                                 | number of objects written                                                                          |                                                                                                                                                                                                |     |
### <math.h>
### <stdarg.h>
- for varargs (not relevant)

### <stdlib.h>
- #### rand()
	- number from 0 to RAND_MAX (the largest signed integer)

### <string.h>
| Function        | syntax                                  | What it does                                                                           | Return value                                                                             | Notes                         |
| --------------- | --------------------------------------- | -------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ----------------------------- |
| ``strcpy()``    | ``strcpy(char *s, char *ct)``           | copies string ``ct``                                                                   | returns s                                                                                |                               |
| `strncpy()<br>` | ``strncpy(char *s,char *ct, size_t n)`` | Copies at most n characters of string ct to s                                          | returns s                                                                                |                               |
| ``strcat()``    | ``strcat(char *s, char *ct)``           | Concatenates at most n characters of string ct to string s, and terminates s with '\0' | returns s                                                                                |                               |
|                 | ``strcmp(char *cs,char *ct)``           | Compares string cs to string ct                                                        | returns:<br>- less than 0 if cs < ct, <br>- 0 if cs == ct <br>-greater than 0 if cs > ct |                               |
| ``strlen()``    | ``strlen(char *cs)``                    |                                                                                        | returns the length of cs                                                                 | RELIES ON the NULL TERMINATOR |

## Parts of a C Program
### main()
- where the execution of a program begins
- ==MUST BE DEFINED IN A PROGRAM FOR IT TO BE "EXECUTABLE"==

### other functions
- encapsulation
- "call by value" - doesn't modify the original value of a parameter

### variables
- Scope
	- local
		- "automatic" - exist when function is called an disappear when the function is exited
	- ``extern``
			- keyword to declare an external variable so functions outside of the scope can access it from a different file
	- global
		- accessible across the scope of the entire program
- Naming
	- letters + digits
	- Don't start name with _
- #### ==DECLARATION VS DEFINITION==
	- Declaration - specifying a variable's type --> making the existence of a variable known to a complier
	- Definition - allocating memory for a variable
### \#define
- Constants



## C Types
### Basic Types

| Type                           | Size (byte)     | Format Specifier | Example | Default | Notes                                                    |
| ------------------------------ | --------------- | ---------------- | ------- | ------- | -------------------------------------------------------- |
| char                           | 1               | %c               | 'a'     | '\0'    |                                                          |
| int / unsigned int             | 4               | %d / %u          | 123     | 0       | %10d reserves 10 spaces for an int                       |
| short int / unsigned short int | 2               | %h / %hu         | 123     | 0       |                                                          |
| long int / unsigned long int   | 32- 4<br>64 - 8 | %l / %lu         | 123     | 0       |                                                          |
| float                          | 4               | %f or %.2f       |         |         | The number coming before the f can be changed for places |
| double                         | 8               | %lf              |         |         |                                                          |
| long double                    | 16              | %Lf              |         |         |                                                          |
| char\[len]                     | len             | %s               |         |         | scans til \n or ' '                                      |
| hex                            | 4               | %x               |         |         |                                                          |
| pointer                        | 8               | %p               |         |         |                                                          |


### Operators
| Type       | Operators                     |
| ---------- | ----------------------------- |
| Arithmetic | + -  /  %                     |
| Logical    | ==  <  >  >=  <=  \|\|  &&  ! |
| Bitwise    | &  \|  ^  <<  >>              |

### structures
| ``struct`` keyword

#### Declaration
```
struct my_struct {
	int i;
	float f;
	char str[10];
};
```
#### Anonymous
https://www.tutorialspoint.com/cprogramming/c_anonymous_structures_and_unions.htm
#### Definition
```
struct my_struct struct1 = { 1, 1.0, "hello"};
```
#### Reference
```
struct my_struct struct1 = { 1, 1.0, "hello"};
struct my_struct *my_ptr = &struct1;

// these statements are equivalent
struct1.x;
my_ptr->x;
```
you can add pointers in structures to create a tree structure
#### typedef
#### Definition
```
typedef struct my_struct {
	int i;
	float f;
	char str[10];
} my_type;
```

#### unions

#### enum
```
enum level {
	LOW,
	MEDIUM,
	HIGH
};
```

### Pointers
#### Pointer Arithmetic
| Operation             | Pointer                                  | \*p Before | \*p<br>After |
| --------------------- | ---------------------------------------- | ---------- | ------------ |
| ptr = ptr + 1         | int arr\[3] = { 1, 2, 3 };<br>ptr = arr; | 1          | 2            |
| printf("%s", str + 5) | char * str = "hello";                    | 'h'        | 'h'          |
|                       |                                          |            |              |

## Memory
### Overflow causes
1. 

### Tools
#### malloc_debug.h
#### valgrind



## Examples to Practice
### Basic Examples
- hello world

## C Libraries and their functions
### <stdio.h>
- A program is outlined to read a set of text lines and print the longest line (hint: dividing the problem into manageable pieces)


# Resources
https://notebooklm.google.com/notebook/667a1894-a244-48d6-9c14-3a83500f4eec
https://padlet.com/cs240SI/cs240-exam-review-t78pz0a3rsrafn6o
