Opened 01-14-2026 08:41

Status:

Tags: [[🔴 Assembly]]

Prev note: [Assembly](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20Assembly) Next Note:
# Registers
small, fast, temporary memory in CPU

used for:
- operands
- storing results of operation
- storing temporal values

**FETCH** from **MEMORY**
**STORE** in **MEMORY**

**PASS** values to **FUNCTIONS**
**RETURN** values from **FUNCTIONS**


## x86-64 Register View
| Register   | Usage                                                                                           | Preserved across calls |     |
| ---------- | ----------------------------------------------------------------------------------------------- | ---------------------- | --- |
| ==rax==    | Temporary register; return value; with variadic functions holds number of vector registers used | No                     |     |
| rbx        | Callee-saved register                                                                           | Yes                    |     |
| rcx        | 4th integer/pointer argument                                                                    | No                     |     |
| rdx        | 3rd integer/pointer argument; 2nd return register                                               | No                     |     |
| ==rsp==    | Stack pointer                                                                                   | Yes                    |     |
| rbp        | Callee-saved register; optional frame pointer                                                   | Yes                    |     |
| rsi        | 2nd integer/pointer argument                                                                    | No                     |     |
| rdi        | 1st integer/pointer argument                                                                    | No                     |     |
| r8         | 5th integer/pointer argument                                                                    | No                     |     |
| r9         | 6th integer/pointer argument                                                                    | No                     |     |
| r10        | Temporary register; used for passing a function’s static chain pointer                          | No                     |     |
| r11        | Temporary register                                                                              | No                     |     |
| r12        | Callee-saved register                                                                           | Yes                    |     |
| r13        | Callee-saved register                                                                           | Yes                    |     |
| r14        | Callee-saved register                                                                           | Yes                    |     |
| r15        | Callee-saved register; optionally used as GOT base pointer                                      | Yes                    |     |
| xmm0–xmm1  | Used to pass and return floating-point arguments                                                | No                     |     |
| xmm2–xmm7  | Used to pass floating-point arguments                                                           | No                     |     |
| xmm8–xmm15 | Temporary registers                                                                             | No                     |     |
| mmx0–mmx7  | Temporary registers                                                                             | No                     |     |
| st0–st1    | Temporary registers; used to return long double values                                          | No                     |     |
| st2–st7    | Temporary registers                                                                             | No                     |     |
| fs         | Reserved for system use (thread-local storage pointer)                                          | No                     |     |
| mxcsr      | SSE2 control and status register                                                                | Partial                |     |
| x87 SW     | x87 status word                                                                                 | No                     |     |
| x87 CW     | x87 control word                                                                                | Yes                    |     |

physical register       different widths        purpose
![[Screenshot 2026-01-14 084620.png]]

if you have more than 6 arguments
--> remainder values passed in stack (we are not covering this)




STACK NEEDS TO BE ALIGNED TO 16 BYTES


### Argument Registers

used by functions as temporal values

after calling a function like `printf` the register arguments may be modified

NEED A REGISTER AFTER A FUNCTION RETURNS?
--> save to stack!!!


### Callee-saved Registers

registers where the values need to be preserved when function returns
- saved to stack at beginning of fuction
- restored before returning


## Addressing Modes

**Immediate Value**
$text --> text is treated as an immediate value
`movq $0x501208,%rdi`

**Direct Register Reference**
%text --> data is treated as a register reference
`movq %rax,%rdi`

**Indirect through a Register**
(%text)
`movq %rsi,(%rdi) #*(%rdi) = %rsi`

**Direct Memory Reference**
`movq 0x501208,%rdi`

Example: Adding two numbers
```
.text
	sum: # long sum(long a, long b) {
	pushq %rbp # Save frame pointer
	movq %rsp, %rbp #
	movq %rdi, %rax # // a=%rdi b=%rsi ret=%rax
	addq %rsi, %rax # return a + b ;
	leave
	ret # }

str1:
	.string "5+3=%ld\n"
	.globl main
	
main: # main()
	pushq %rbp # Save frame pointer
	movq %rsp, %rbp #
	movq $3, %rsi # {
	movq $5, %rdi # // r = %rax
	call sum # long r = sum(5, 3)
	movq %rax, %rsi #
	movq $str1, %rdi #
	movq $0, %rax # // printf needs 0 in %rax
	call printf # printf("5+3=%ld\n", r);
	leave
	ret # }
```


# Active Recall
1. What is the register `rsi` used for?
	1. 

# References
[[CS252-Slides-Sprin2026.pdf]] slides 