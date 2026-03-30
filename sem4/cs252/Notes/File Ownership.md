Opened 03-30-2026 14:26

Status:

Tags: [[I-node]]

# File Ownership
which users and groups have access to a file

permissions of a file in UNIX are stored in the i-node in the flag bits 
- grouped into three groups User, Group, and Others --> rwx, rwx, rwx
- use [[chmod]] to change the permissions of a file
- use bit representation in octal to change

| USER | GROUP | OTHERS |     |
| ---- | ----- | ------ | --- |
| RWX  | RWX   | RWX    |     |
| 110  | 110   | 100    |     |
| 6    | 6     | 4      |     |
`chmod 664 myfile`

**Directory Bit**
indicates that the file is in a directory
- +x flag determines if the directory can be used as a part of the path to access a file in directory
- +r flag is used to list the file
- if a file has it's directory with +x but not readable, then the file will be accessible, but invisible cause the directory can't be listed

---
## Examples

u can see the flags in `ls -a`
```
-rw-rw-r-- 1 grr 150 Aug 29 1995 calendar
-rw------- 1 grr 975 Mar 25 1999 cew.el
-rwxrwxr-x 1 grr 5924 Jul 9 10:48 chars
-rw-rw-r-- 1 grr 124 Jul 9 10:47 chars.c
drwxr-sr-x 10 grr 512 Oct 14 1998 contools
drwxr-sr-x 9 grr 512 Oct 8 1998 contools-new
```

---
# References