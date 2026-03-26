Opened 02-20-2026 11:01

Status:

Tags: [[Shell Scripts]]

# bash
a shell scripting language

## Syntax

## shebang
`#!/bin/bash`
first line of script that tells shell to execute script via bash shell

tells system that it is an ELF file

### variables
`$` to get variable value
`""` to turn variable into string
### parentheses and brackets

`(( ))` - arithmetic
--for comparing or manipulating integers
`[[ ]]` - strings, patterns, safer tests
--for string comp, pattern matching (globs), regex matching, safter conditional logic
`[]` - legacy / POSIX test
--old test command (only need for POSIX sh compatibility)

### arrays
`my_array=(1 2 3 4)`
- no commas
- use parentheses

### passing arguments
`${parameter number}` for arguments
`getopts` for flags

STR VARS WITH SPACES WILL GET SPLIT UP INTO MULTIPLE ARGUMENTS

### io
`0` - stdin
`1` - stdout
`2` - stderr

### loops
`for (( i=0; i<$NUM; i++ )); do <your code> done`

### functions
use functions to improve readability

### cleanup code
an idiom for tasks that need to be done before the script ends



# References
[Bash crash course](https://zach-gollwitzer.medium.com/the-ultimate-bash-crash-course-cb598141ad03)
[Bash scripting for Beginners - freecodecamp](https://www.freecodecamp.org/news/shell-scripting-crash-course-how-to-write-bash-scripts-in-linux/)
[Bash best practices](https://bertvv.github.io/cheat-sheets/Bash.html)
[Bash handling operations](https://medium.com/@wujido20/handling-flags-in-bash-scripts-4b06b4d0ed04)
[Debugging bash tips](https://tldp.org/LDP/Bash-Beginners-Guide/html/sect_02_03.html)