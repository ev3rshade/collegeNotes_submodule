Opened 03-08-2026 13:02

Status:

Tags: [[Shell Interpreter]] [[Pattern Matching]]

prev: next:
# lexical analyzer generator

## flex
- uses longest match. order from longest to shortest for readability
- if multiple match longest, then the rule that comes first is chosen

use start conditions
`%x TAG` - exclusive state
`%s TAG` - inclusive state

## state switching
# References
geeks for geeks lex https://www.geeksforgeeks.org/compiler-design/input-buffering-in-compiler-design/