Opened 03-27-2026 13:22

Status:

Tags:

# dup2

`int dup2(int oldfd, int newfd)`
allocates a new file descriptor that refers to the same open file description as the descriptor *oldfd*

example usage: redirecting standard output to a different file descriptor

---
# References

1 [linux manual page](https://man7.org/linux/man-pages/man2/dup.2.html)
