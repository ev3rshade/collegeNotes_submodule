Opened 02-06-2026 09:52

Status:

Tags:

Tags: cs252 [[🔴 x86-64 Assembly Language]]

Prev Note: [x86-64 Assembly Language](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20x86-64%20Assembly%20Language)
# x86-64 ex Max of Two Numbers
```
.text
.globl max

max:                    
	pushq %rbp          # Save frame pointer
	movq %rsp, %rbp     #
	
	cmpq %rsi, %rdi     # if (a > b) a: %rdi  b: %rsi (a - b)
	jge else            #
	
	movq %rsi, %rax     #    result = a
	jmp end_max         #
	
else:                   # else
	movq %rsi, %rax     #    result = b
	
end_max:
	leave               #
	ret                 # return result
```



# References