Opened 02-06-2026 10:05

Status:

Tags: [[🔴 c programming]]

# c Standard Library
(libc)
the standard library for the C programming language


## Standard IO (stdio)
`printf()`
prints formatted output to the console

`scanf()`
reads formatted input from the console
- format string is passed to first argument register (%rdi)
- subsequent arguments are passed into other designated registers
- calls can override reg values so store values you still need
- float point arguments use separate registers



# References

https://en.wikipedia.org/wiki/C_standard_library