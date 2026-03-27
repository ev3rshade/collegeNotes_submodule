Opened 03-27-2026 13:33

Status:

Tags: [[unistd.h]]

# open

`int open(filename, mode, [permissions])`
opens the file in **filename** using the mod in mode

returns the file descriptor indicating the file opened

**Modes** 
`O_RDONLY`
`O_WRONLY`
`O_RDWR`
`O_CREAT` - if the file doesn't exist, it is created. use permissions argument for initial permissions (e.g. 0555)
`O_APPEND` - append at the end of the file
`O_TRUNC` - truncate file to length 0

combine modes example `O_CREAT | O_WRONLY`

---
# Active Recall

1 write the line to open a file `hello.txt` that is already in the current directory as write only without overwriting the current file contents.
||`open("./hello.txt", O_WRONLY | O_APPEND)`||

---
# References
1 [linux manual page](https://man7.org/linux/man-pages/man2/open.2.html)
