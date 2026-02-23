Opened 01-23-2026 09:47

Status:

Tags: cs252

Prev Note: [Registers](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20Registers) Next Note: [x86-64 Assembly Language](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20x86-64%20Assembly%20Language)

# x86-64 Register View
| Register   | Usage                                                                                           | Preserved across calls |
| ---------- | ----------------------------------------------------------------------------------------------- | ---------------------- |
| ==rax==    | Temporary register; return value; with variadic functions holds number of vector registers used | No                     |
| rbx        | Callee-saved register                                                                           | Yes                    |
| rcx        | 4th integer/pointer argument                                                                    | No                     |
| rdx        | 3rd integer/pointer argument; 2nd return register                                               | No                     |
| ==rsp==    | Stack pointer                                                                                   | Yes                    |
| ==rbp==    | Callee-saved register; optional frame pointer                                                   | Yes                    |
| ==rsi==    | 2nd integer/pointer argument                                                                    | No                     |
| ==rdi==    | 1st integer/pointer argument                                                                    | No                     |
| r8         | 5th integer/pointer argument                                                                    | No                     |
| r9         | 6th integer/pointer argument                                                                    | No                     |
| r10        | Temporary register; used for passing a function’s static chain pointer                          | No                     |
| r11        | Temporary register                                                                              | No                     |
| r12        | Callee-saved register                                                                           | Yes                    |
| r13        | Callee-saved register                                                                           | Yes                    |
| r14        | Callee-saved register                                                                           | Yes                    |
| r15        | Callee-saved register; optionally used as GOT base pointer                                      | Yes                    |
| xmm0–xmm1  | Used to pass and return floating-point arguments                                                | No                     |
| xmm2–xmm7  | Used to pass floating-point arguments                                                           | No                     |
| xmm8–xmm15 | Temporary registers                                                                             | No                     |
| mmx0–mmx7  | Temporary registers                                                                             | No                     |
| st0–st1    | Temporary registers; used to return long double values                                          | No                     |
| st2–st7    | Temporary registers                                                                             | No                     |
| fs         | Reserved for system use (thread-local storage pointer)                                          | No                     |
| mxcsr      | SSE2 control and status register                                                                | Partial                |
| x87 SW     | x87 status word                                                                                 | No                     |
| x87 CW     | x87 control word                                                                                | Yes                    |

**rsp**
---STACK NEEDS TO BE ALIGNED TO 16 BYTES

###### **RFLAGS** (x86-64 FLAGS register)
a special purpose CPU register holding single-bit status and control flags reflecting the result of the last arithmetic/logical operation
![[Screenshot 2026-01-28 084758.png]]


### Variables vs Register Assignment

In C variable types must be specified, however in assembly you only have to specify the size of a value.

Additionally, data in assembly is handled through registers in this specific order in x86_64

**%rdi** - 1st argument (n)
**%rsi** - 2nd argument (a)
**%rdx** - 3rd argument
**%rcx** - 4th argument
**%r8** - 5th argument
**%r9** - 6th argument

if you have more than 6 arguments
--> remainder values passed in stack (we are not covering this)


### Using Byte Registers
physical register       different widths        purpose
![[Screenshot 2026-01-14 084620.png]]
The size of the registers in x86-64 is 8 bytes long, but sometimes we need to do byte manipulation

The table above shows registers of different width --> use them by changing "q" in instructions to "b"

# Active Recall

# References

questions to TA's
- if i am dealing with function parameters and printf and scanf calls how do i choose my registers? do i have to store the parameters in local variables?