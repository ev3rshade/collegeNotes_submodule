Opened 02-23-2026 08:35

Status:

Tags: [[+ shell]]

# Shell Scripts

standard is file ends in `.sh`
- when a command runs the OS first checks if the file is ELF
- if not, OS checks for `#!interpreter-program` and if it is there, runs the interpreter program
- must have execute perms to be able to run

scripts should have the executable bit set to be able to execute
e.g. `chmod +x myscript.sh` in bash

---
## common shell programs

/bin/sh - standard UNIX shell
/bin/ksh - Korn shell (more powerful)
/bin/bash - GNU shell (standard linux shell)
/bin/tcsh

---
# References