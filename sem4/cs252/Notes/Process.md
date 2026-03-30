Opened 03-27-2026 10:32

Status:

Tags: [[+ shell]] [[+ operating system]]

# Process

---
## Properties

**1 PID**
index in a process table --> unique identification
- OS assigns in ascending order --> numbers wrap when they reach max, and reused if there is no live process with same id
- init process has PID 0/PID 1, depends on OS. HAS NO PARENT!!!
- [[c programming]] `getpid();`

**2 Command and Arguments**
command that is executing and its args
- passed to main `int main(int argc, char **argv);`
- `argc` is num of arguments including cmd name (`argv[0]`)

**3 Environment Variables**
array of strings of the form A=B inherited from the parent process

can add env var settings in `.login` or `.bashrc`
`export A=B` --> global
`A = B` --> local

important examples
- PATH=/bin:/usr/bin:. Stores the list of directories that contain commands to execute
- USER=\<login\> Contains the name of the user
- HOME=/homes/grr Contains the home directory.

**4 Current Dir**

file operations such as `open()` and `fopen()` will use the current directory to resolve relative paths. if path doesn't start with "/" then it is relative to the curr directory

`chdir()` for changing inside program

**5 Owner**
user id
- process always runs in behalf of a user --> inherited from parent
	- only root can change UID of process
- happens at login time

**6 Stdin/Stdout/Stderr**
inherited from parent
usually keyboard and the terminal, but can be redirected

---
# Active Recall

1 do all processes have a parent? why?
||no, PID 1 (systemd) doesn't||

# References