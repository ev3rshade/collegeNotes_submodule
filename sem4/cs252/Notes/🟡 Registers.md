Opened 01-14-2026 08:41

Status:

Tags: [[+ program (software)]] [[+ memory]]

Prev note: [x85-64 Assembly Language](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20x86-64%20Assembly%20Language) Next Note: [Program Flow](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20Program%20Flow)
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
	1. || 2nd argument ||
2. What is the number of bytes the stack needs to be aligned to?
	1. || 16 bytes ||
3. What is a callee saved register and how is it different from an argument register?
	1. || registers who's values are saved after the function that's being called returns. they are saved to the stack and restored when the function returns. ||


# References
[[CS252-Slides-Sprin2026.pdf]] slides 22 - 28, 46