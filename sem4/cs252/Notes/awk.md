Opened 03-27-2026 14:06

Status:

Tags: [[6 Full Notes/College Notes/sem4/cs252/Notes/bash|bash]] [[6 Full Notes/College Notes/sem4/cs252/Notes/Regex|Regex]]

# awk
pattern scanning an processing language

program file sequence of rules
```
pattern {action}
...
default {action}
```
pattern - regex
action - seq of statements that run when pattern is matched with the text

---
## Examples

**Print specific columns** — print the 1st, a combination, or the last field
```bash
awk '{ print $1 }' file.txt
awk '{ print $2, $4 }' file.txt
awk '{ print $NF }' file.txt
```

**Filter by pattern** — match or negate lines containing a word
```bash
awk '/error/ { print }' file.txt
awk '!/error/ { print }' file.txt
```

**Custom field separator** — parse CSVs, `/etc/passwd`, TSVs, etc.
```bash
awk -F',' '{ print $2 }' data.csv
awk -F: '{ print $1 }' /etc/passwd
```

**Sum and average a column**
```bash
awk '{ sum += $3 } END { print sum }' file.txt
awk '{ sum += $2 } END { print sum / NR }' file.txt
```

**Count matching lines**
```bash
awk '/error/ { count++ } END { print count }' file.txt
```

**Count occurrences of values in a column**
```bash
awk '{ count[$1]++ } END { for (k in count) print k, count[k] }' file.txt
```

**Deduplicate lines (preserve order)**
```bash
awk '!seen[$0]++' file.txt
```

**Find and replace across entire file**
```bash
awk '{ gsub(/foo/, "bar"); print }' file.txt
```

**Filter by numeric value in a field**
```bash
awk '$5 > 100 { print }' file.txt
awk '$1 == "sales" { sum += $2 } END { print sum }' file.txt
```

**Skip header, print every other line, limit to a range**
```bash
awk 'NR > 1' file.txt
awk 'NR % 2 == 0' file.txt
awk 'NR>=5 && NR<=10' file.txt
```


---
# References
1 [linux man page](https://man7.org/linux/man-pages/man1/awk.1p.html)