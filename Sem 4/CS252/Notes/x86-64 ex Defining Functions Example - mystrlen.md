Opened 01-23-2026 09:12

Status:

Tags: cs252 [[🔴 x86-64 Assembly Language]]

Prev Note: [x86-64 Assembly Language](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20x86-64%20Assembly%20Language)
# x86-64 Defining Functions Example
```
.text
.globl mystrlen

mystrlen:		    # long mystrlen(char * s) {  s = %rdi  char * p = %rsi  i = %rdx
	push %rbp       #
	movq %rsp, %rbp #
	
	movq %rdi, %rsi #     long len = 0;
	
while_1:			#     while (*s != '\0) {
	movb %rdi, %rsi	#
				    #         len++;
					#         s++;
					#     }
	leave			#     return len;
	ret				#
```




# References