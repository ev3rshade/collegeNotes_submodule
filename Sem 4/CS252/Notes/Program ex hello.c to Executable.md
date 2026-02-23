Opened 02-13-2026 08:54

Status:

Tags: [[🔴Program to Executable]]

Prev Note: [Program to Executable](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4Program%20to%20Executable) Next Note: 
# Program ex hello.c to Executable

`hello.c`
```
#include <stdio.h>
#define PI 3.14
int
main()
{
	int i = 5;
	printf("Hello %d\n“,i);
	printf(“PI=%lf\n”, PI);
}
```

`gcc -E hello.c > hello.i`
(-E stops compiler after running preprocessor)

`hello.i`
```
hello.i:
	/* Expanded /usr/include/stdio.h */
	typedef void *__va_list;
	typedef struct __FILE __FILE;
	typedef int ssize_t;
	struct FILE {...};
	extern int fprintf(FILE *, const char *, ...);
	extern int fscanf(FILE *, const char *, ...);
	extern int printf(const char *, ...);
	/* and more */
	main()
	{
		int i = 5;
		printf("Hello %d\n“,i);
		printf(“PI=%lf\n”, 3.14);
	}
```

`gcc -S hello.c` 
(-S stops compiler after assembling)

`hello.s`
```
hello.s:
	.align 8

.LLC0: .asciz "Hello\n"
.section ".text"
	.align 4
	.global main
	.type main,#function
	.proc 04
main: save %sp, -112, %sp
	sethi %hi(.LLC0), %o1
	or %o1, %lo(.LLC0), %o0
	call printf, 0
	nop
.LL2: ret
```

`gcc -c hello.c`

`sh> nm -v hello.o`
```
hello.o:
[Index] Value Size Type Bind Other Shndx Name
[1] |0x00000000|0x00000000|FILE |LOCL |0 |ABS   |hello.c
[2] |0x00000000|0x00000000|NOTY |LOCL |0 |2     |gcc2_compiled
[3] |0x00000000|0x00000000|SECT |LOCL |0 |2     |
[4] |0x00000000|0x00000000|SECT |LOCL |0 |3     |
[5] |0x00000000|0x00000000|NOTY |GLOB |0 |UNDEF |printf
[6] |0x00000000|0x0000001c|FUNC |GLOB |0 |2     |main
```
- `hello.o` has undefined symbols, like the `printf` function call that we don’t know where it is placed.
- The main function already has a value relative to the object file `hello.o`

`gcc –o hello hello.c`
generates hello executable

`sh> nm hello`
```
[Index] Value Size Type Bind Other Shndx Name
[29] |0x00010000|0x00000000|OBJT |LOCL |0 |1     |_START_
[65] |0x0001042c|0x00000074|FUNC |GLOB |0 |9     |_start
[43] |0x00010564|0x00000000|FUNC |LOCL |0 |9     |fini_dummy
[60] |0x000105c4|0x0000001c|FUNC |GLOB |0 |9     |main
[71] |0x000206d8|0x00000000|FUNC |GLOB |0 |UNDEF |atexit
[72] |0x000206f0|0x00000000|FUNC |GLOB |0 |UNDEF |_exit
[67] |0x00020714|0x00000000|FUNC |GLOB |0 |UNDEF |printf
```


# References
[[CS252-Slides-Sprin2026.pdf]] 52-56