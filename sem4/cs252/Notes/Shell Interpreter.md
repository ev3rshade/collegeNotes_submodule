Opened 03-02-2026 09:51

Status:

Tags: [[6 Full Notes/College Notes/sem4/cs252/Notes/+ shell]]

prev: next:
# Shell Interpreter

## Lex and Yacc

**Lexical Analyzer** - separates input into tokens 

**Parser** - parses tokens according to a grammar

`shell.l` file describes tokens using regex
- processed by a program called **lex** that generates a lexical analyzer
`shell.y` file describes grammar using syntax expressions
- processed with a program called **yacc** that generates a parser program

![[Screenshot 2026-03-02 095524.png]]

## grammar

the following is the grammar being implemented in `shell.l` and `shell.y`
```
cmd [arg]* [ | cmd [arg]* ]* [ [> filename] [< filename] [
>& filename] [>> filename] [>>& filename]
[2>filename]]* [&] NEWLINE
```
- this grammar implements the command loop in the grammar itself
- ***error*** token is a special token used for error recovery. ***error*** will parse all tokens until a token that is known like `<NEWLINE>` yyerrok tells parser that the error was recovered
- checking for multiple io redirection is checked programmatically inside an action

Parser tree for `ls a b | sort > out` - in-order traversal
![[Screenshot 2026-03-02 100559.png]]
# References