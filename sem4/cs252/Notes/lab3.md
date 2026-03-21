Opened 03-08-2026 13:30

Status:

Tags:

prev: next:
# lab3

## parts

system calls
- command execution (1A)
lex rules and yacc handling
- basic grammar parsing (1B.1-3)
- arg expansions --> group them into one (2.5, 2.8, 3.1)
- special commands (2.3, 2.6)
- special args (2.4)
shell io
- `isatty()` (1B.4)
process management
- signal handling (2.1, 2.2)
- 



## tips
use c++ features --> eases memory management difficulty
custom yyerror message in shell.y for more detailed debugging info

part 1A
- implement the code labeled in `command.cc` to execute commands using syscalls
part 1B
- step 1 add more tokens to `shell.l`
	- ">>", "|", "&"
	- step 2 add the token names to `shell.y`
- step 3 add more rules to `shell.y`


part 2.8
- code in shell.cc
- REDIRECT IO
	- look at diagram in slides, very helpful

# errors
part 1A
`execvp()` requires `char *` types
-- solution: const_cast
arguments not being executed
-- solution: NULL terminate argv
`waitpid()` placement
--solution: only wait in parent process
arguments not being read
--solution: pass ALL arguments including command to `execvp()`

part 1B
`$2` is not being read correctly --> improper definition of grammar parsing
--solution: use correct syntax
lex unrecognized rule
--solution: surround tokens in quotes for literal matching and remove comments in the rule def section
==spaces needed between io modifiers==
`perror()` prints status code
--solution: use `printf()`
memory management issues when outfile == errfile
--solution: check if they are the same in Command::clear();
==redirection ambiguity check stack overflow post==

==ask ta's about which to close before executing and stuff==

part 2

`exit()` causing syntax error in parsing
--solution: remove exit token from `shell.l` and compare directly as a word in `shell.y`
yacc grammar causing programs to not parse at all
--solution: rearrange rules to correct precedence
ctrl + c not printing prompt
--solution:
pipes also printing exit bc of SIGCHLD
--solution: use a static unordered set to keep track of background procs ==concurrency issues? ASK TAs==
yacc issues with 
```
shell.y: warning: 7 shift/reduce conflicts [-Wconflicts-sr]
shell.y: warning: 1 reduce/reduce conflict [-Wconflicts-rr]
shell.y: note: rerun with option '-Wcounterexamples' to generate conflict counterexamples
```
--solution: get rid of empty option io_modifier (summarize net link)
QUOTEWORD token reading previous token
--solution: needed to set the yytext to be a cpp string 
sefaulting on new word rule:
--solution: forgot to define \_currentcommand
const unordered_map uses .at() instead of \[  ] to access
builtin functions that are parent only causing shell processes to never exit
--solution: don't fork for these
source recursing infinitely
--solution: update handle_file to not use the name yyin
--solution: clear \_current_command before parsing
syntax error when passing a WORD
--solution: don't pass c_str() to string initialization in `shell.l`
i was confused on how to call the shell as parent
--subshells are only arguments T-T
syntax error
--i forgot the | when parsing grammar
subshell function hangs
--forgot to exclude closing characters for subshell grammar
fatal flex scanner internal error--end of buffer missed
--newline terminate the buffer string fixed it
issues with buffer
--use myuputc
syntax error when there's more than 1 specially expanded arg
--don't push newline push space instead
no new line at the end of file
--solution: updating grammar rules that weren't consistent and didn't cover behavior like ignoring spaces and stuff

## TODO
- [ ] fix background proc logic
- separate out command.cc
- https://edstem.org/us/courses/92707/discussion/7770321
- [ ] fix ctrl + c behavior
- multiple prompts being printed sometimes T-T
- [x] handle getenv when enviro doesn't exist
- [ ] myunputc needs a special character to breakup argument scanning

Questions
- 3.1 what if there is no last executed command or last process run in the background

# References
https://stackoverflow.com/questions/578719/yacc-only-applying-rule-once

https://stackoverflow.com/questions/10080828/adding-arguments-to-a-vector-yacc-bison

https://stackoverflow.com/questions/21555990/previous-token-on-yacc-lex

https://stackoverflow.com/questions/30474041/multiple-rules-same-action-in-yacc

https://stackoverflow.com/questions/9963648/type-error-for-rule-in-yacc#:~:text=last%20editor's%20name.-,Kaz,59.1k10%20114%20168

https://stackoverflow.com/questions/5418181/flex-lex-encoding-strings-with-escaped-characters