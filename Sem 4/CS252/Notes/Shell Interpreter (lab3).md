Opened 03-02-2026 08:36

Status:

Tags: [[Shell Interpreter]]

prev: next:
# Shell Interpreter

## Components

**Parser** - reads a command line and creates a command table. One entry corresponds to a component in the pipeline
ls        | -al          |
grep   | me         |
In:dflt | Out:file1 | Err:dflt

**Executor** - creates new process for each entry in the command table. creates pipes to communicate the output of one process to the input of the next one. also redirects the stdinput, stdoutput, and stderr.
*a | b | c | d > out < in*
\*all pipe entries shae the same stderr

**Environment variables** - set, print, expand env vars

**Wildcards** - arguments of the form $a * a$ are expanded to all files that match them

**Subshells** - arguments with \`\` or \$ are executed and the output is sent as input to the shell


# References