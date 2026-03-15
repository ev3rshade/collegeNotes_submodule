Opened 02-23-2026 09:55

Status:

Tags: [[🔴 bash]]

prev: next:
# lab2

## Password checker

| ✔   | #   | Condition / Rule                                                  | Action / Points                                                                               |
| --- | --- | ----------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| [ ] | 1   | Password length < 6 or > 32                                       | **Error:** `Password length invalid.`                                                         |
| [ ] | 2   | For any valid password                                            | +1 point for each character                                                                   |
| [ ] | 3   | No special character from `#$+%@^*-/`                             | **Error:** `Password should include at least one of "#$+%@^*-/"`                              |
| [ ] | 4   | Each special character in `#$+%@^*-/`                             | +2 points per character                                                                       |
| [ ] | 5   | No numeric character from `0-9`                                   | **Error:** `Password should include at least one number "0-9"`                                |
| [ ] | 6   | Each numeric character `0-9`                                      | +2 points per character                                                                       |
| [ ] | 7   | Each alphabetic character `A–Z` or `a–z`                          | +1 point per character                                                                        |
| [ ] | 8   | No uppercase **or** no lowercase character                        | **Error:** `Passwords should have at least one Uppercase and lowercase alphabetic character.` |
| [ ] | 9   | Repeated alphanumeric character (e.g., `aa`, `bbb`, `55555`)      | −10 points                                                                                    |
| [ ] | 10  | 3+ consecutive lowercase characters (e.g., `bbb`, `abe`, `this`)  | −3 points                                                                                     |
| [ ] | 11  | 3+ consecutive uppercase characters (e.g., `BBB`, `XQR`, `APPLE`) | −3 points                                                                                     |
| [ ] | 12  | 3+ consecutive digits (e.g., `55555`, `1747`, `123`, `321`)       | −3 points                                                                                     |

### Errors
password checker

infinite loop in score_passwd
```
score_passwd() {
  local passwd=$1
  score=0

  declare -A seen # hashmap in bash!!!!
  prev_char=""
  prev_type=""
  run=0

  for (( i=0; i,${#passwd}; i++ )); do
    echo "${passwd}:$i:1}"
  done
}
```
loop condition is WRONG
incorrect substring expansion

`#$+%@^*-/`
`*-/` in regex means range --> move dash to end

## Backup script
### Implementation
1. Scan arguments
2. Check for invalid args
	1. invalid characters
	2. 3rd arg not a number
	3. directory doesn't exist
3. backup directory
	1. scan files for modified ones `ls -laR`
		1. if modified
			1. backup
		2. if not
			1. print the backup not needed
4. backup
	1. remove oldest directory if exceeds max directories
	2. copy

### Errors
str vars with spaces will get spilt up into multiple args

don't echo `ls` output

wrap a string output in () to turn into an array

$ needed to access variable values in bash

\[\[   ]] vs \[   ]

==ask TAs==
- preservation of metadata
- crontab
- is cpu time just utime + stime
- round up or down KB --> MB
- if doesn't exist, ignore?
# References
https://www.baeldung.com/linux/total-process-cpu-usage