dOpened 01-12-2026 07:12

Status:

Tags: [[6 Full Notes/College Notes/Sem 4/CS252/Notes/debugging|debugging]]

# gdb

## commands
### Basics

c/c++

`print VARNAME` (or p) - print variable
`next` (or n) - move to next line
`step` - step into next command
`break` - set breakpoint (can break on function header or specific line) (can add conditions)

assembly
`break _start` - breakpoint at start of program
`si` - step one instructions
`info registers` - display register info
`layout asm` - display machine code
`disassemble` - translates a portion of a program's machine code into human-readable assembly language (see surrounding instructions)
- example: `disassemble/r main,main-100`

`x/i $rip` - inspect crashing instruction
print value of a pointer by casting it
`(gdb) print *(int*)$REGISTER_NAME`

### TUI
Show code in terminal user interface
`^x` then `a`
or
`layout src`
`layout asm`
### Core File
```
gdb program-name core
gdb> where
```

### Logging
```
(gdb) set logging file my_data.txt
(gdb) set logging on
(gdb) print my_long_variable_name
(gdb) bt
(gdb) set logging off
```
The file `my_data.txt` will now contain the output from the `print` and `bt` commands.
## Strategies
**Making print functions**
allows you to print information using `p` to check values of interest

**Conditional breakpoints**

**Watchpoints**
pauses code when a variable changes value

`watch <variable>`
`watch <variable> = <value>` for conditional

**Runtime patching**

**Running make in gdb**

**Set environment variables from within GDB**
LD preload - lab1 extra credit



## dealing with multiple programs
load a new executable
`(gdb) file <new_executable_name>`



## Characters
https://sourceware.org/gdb/current/onlinedocs/gdb.html/Character-Sets.html#Character-Sets


# References
[[CS252-Slides-Sprin2026.pdf]] - Slide 16
[[Lab Zero_ Intro to GDB.pdf]]