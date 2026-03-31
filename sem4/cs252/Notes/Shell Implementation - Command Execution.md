Opened 03-31-2026 12:19

Status:

Tags: [[lab3]]

# Shell Implementation - Command Execution

## Steps
1. Error handling - argument count
2. Save stdin/stdout/stderr
3. If not last command
	1. make a pipe --> if pipe() == -1 exit with error
4. Redirect input/output as necessary --> close the file descriptors used to redirect input
	1. if file descriptors open with error --> exit with error
5. Fork
6. If pid == 0
	1. close all file descriptors
	2. exec --> if return exit with error
7. restore stdin/stdout/stderr
8. wait for last command to stop executing
9. exit


---
# References