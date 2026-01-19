Opened 01-12-2026 07:12

Status:

Tags:

# gdb

## Commands
### Basics
`print VARNAME` (or p) - print variable
`next` (or n) - move to next line
`step` - step into next command
`break` - set breakpoint (can break on function header or specific line) (can add conditions)

### TUI
Show code in terminal user interface
`^x` then `a`
or
`layout src`

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
**Conditional breakpoints**

**Watchpoints**

**Runtime patching**



# References
[[CS252-Slides-Sprin2026.pdf]] - Slide 16
[[Lab Zero_ Intro to GDB.pdf]]