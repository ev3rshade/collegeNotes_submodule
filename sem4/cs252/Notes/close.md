Opened 03-27-2026 13:33

Status:

Tags: [[unistd.h]]

# close

`void close(int fd)`
decrements the count of the open file object pointed by fd
if ref count reaches 0, open file object is reclaimed


---
# References