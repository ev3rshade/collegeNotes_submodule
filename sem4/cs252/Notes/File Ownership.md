Opened 03-30-2026 14:26

Status:

Tags:

# File Ownership
which users and groups have access to a file

permissions of a file in UNIX are stored in the i-node in the flag bits 
- grouped into three groups User, Group, and Others --> rwx, rwx, rwx

e.g. `-rw-rw-r--`
```
-rw-rw-r-- 1 grr 150 Aug 29 1995 calendar
-rw------- 1 grr 975 Mar 25 1999 cew.el
-rwxrwxr-x 1 grr 5924 Jul 9 10:48 chars
-rw-rw-r-- 1 grr 124 Jul 9 10:47 chars.c
drwxr-sr-x 10 grr 512 Oct 14 1998 contools
drwxr-sr-x 9 grr 512 Oct 8 1998 contools-new
```

use [[chmod]] to change the permissions of a file

---
# References