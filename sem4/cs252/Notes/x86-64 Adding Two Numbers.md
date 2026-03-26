Opened 02-06-2026 10:27

Status:

Tags: [[x86-64 Assembly Language]]

# x86-64 Adding Two Numbers
```
.data
.text
sum:
					# %rdi = a  %rcx = b  ret=%rax
	pushq %rbp
	movq %rsp, %rbp
	movq %rdi, %rax
	addq %rsi, %rax
	leave
	ret

str1:
	.string "5+3=%ld\n"
	
	.globl main
main:
	pushq %rbp
	movq %rsp, %rbp
	
	call sum        # r = rax
	movq %rax, %rsi
	movq $str1, %rdi
	movq $0, %rax
	call printf
	
	leave
	ret
```

original C code
```
long sum(long a, long b) {
	return a + b;
}

int main(void) {
	long r = sum(5,3);
	
	printf("5+3=%ld\n", r);
	
	return 0;	
}
```


# References
[[CS252-Slides-Sprin2026.pdf]] slide 29