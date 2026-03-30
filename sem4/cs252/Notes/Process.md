Opened 03-27-2026 10:32

Status:

Tags: [[6 Full Notes/College Notes/sem4/cs252/Notes/+ shell]] [[+ operating system]]

# Process

---
## Terminology

**Parent Process**
the original process that creates another process

**Child Process**
the process that the parent process created

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

2 What is the output of the following code?
```C
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int
main()
{
  int fdpipe[2];
  pipe(fdpipe);
  int ret = fork();
  if ( ret == 0 ) {
    const char *s = "Hello world";
    int len = strlen(s);
    write(fdpipe[1], s, len);
    exit(0);
  }
  char c;
  while (read(fdpipe[0],&c, 1)==1) {
    printf("%c",c);
  }
}

```
||It prints "Hello World" and the parent hangs, bc the parent never closes its write end fdpipe[1] waiting for data taht will never come. the fix is closing fdpipe[1] after the if statement, and closing fdpipe[0] after the while loop as the child only writes. then, read will get EOF and the loop will exit.||

# References