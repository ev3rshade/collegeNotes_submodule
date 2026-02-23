Opened 01-21-2026 09:40

Status:

Tags: cs252 [[🔴 x86-64 Assembly Language]]

Prev Note: [x86-64 Assembly Language](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20x86-64%20Assembly%20Language)
# x86-64 ex Pointer Arithmetic vs Array Dereferencing

Which of the codes below is faster and why?
||code 2 - addition operations are faster than multiplication operations (1 clock cycle cs 3)||

1. While loop with pointer arithmetic
```
// Finds the max value in an array
long maxarray(long n, long *a) {
	long i=0;
	long max = a[0];
	while (i<n) {
		if (max < *a) {
			max = *a;
		}
		i++ ;
		a++ ;
	}
	return max;
}
```

Finding the maximum array of numbers asm (pointers)
```
maxarray.s
.text
.globl maxarray                         # long maxarray(long n, long *a) {
		                                # // n = %rdi a = %rsi
maxarray:                               # // i = %rdx max = %rax

	pushq %rbp                          # Save frame pointer
	movq %rsp, %rbp                     #
                                        #
	movq $0,%rdx                        # i=0 ;
	movq (%rsi),%rax # max = a[0];      #

while: cmpq %rdx,%rdi                   # while (i<n) { // (n-i>0)
	jle afterw                          #
                                        #
	cmpq (%rsi),%rax                    #     if (max < *a) { // (max-*a<0) {
	jge afterif                         #
	movq (%rsi),%rax                    #         max = *a
                                        #     }
afterif:
	addq $1,%rdx                        #     i++ ;
	addq $8,%rsi                        #     a++ ;
	jmp while                           # }
afterw: leave                           #
	ret                                 # return max; }
```

2. While loop with array dereferencing
```
// Finds the max value in an array
long maxarray(long n, long *a) {
	long i=0;
	long max = a[0];
	while (i<n) {
		if (max < a[i]) {
			max = a[i];
		}
		i++ ;
	}
	return max;
}
```

Finding max in an array (array dereferencing) asm
```
.globl maxarray                         # // Finds the max value in an array
                                        #
                                        #
                                        # long maxarray(long n, long *a)
                                        # // n = %rdi a = %rsi
maxarray:                               # // i = %rdx max = %rax
                                        #
pushq %rbp                              # Save frame pointer
movq %rsp, %rbp                         #
movq $0,%rdx                            # i=0 ;
movq (%rsi),%rax                        # max = a[0]

while_1:                                #
	cmpq %rdx,%rdi                      # while (i<n) { // (n-i>0)
	jle afterw                          #
                                        #     //*(long*)((8*i+(char*)a)
	movq %rdx,%rcx                      #     long *tmp = &a[i]; // tmp: %rcx
	imulq $8,%rcx                       #
	addq %rsi,%rcx                      #
                                        #
	cmpq (%rcx),%rax                    #     if (max < *tmp) { // (max-*tmp<0)
	jge afterif                         #
	movq (%rcx),%rax                    #         max = *tmp
                                        #     }
afterif:
	addq $1,%rdx                        #     i++ ;
	jmp while_1                         #
										# }
afterw: leave
	ret                                 # }
```



# References
[[CS252-Slides-Sprin2026.pdf]] slides 36-42