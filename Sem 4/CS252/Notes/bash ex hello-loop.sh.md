Opened 02-23-2026 08:44

Status:

Tags: [[🔴 bash|🔴 bash]]

prev:  [[🔴 bash|🔴 bash]]
# bash ex hello.sh
```
#!/bin/bash
#
# This shell script prints hello to all the friends you
# pass as parameter
#
if [ $# -lt 1 ]
then
  echo
  echo "$0 needs at least one argument"
  echo " Eg."
  echo " $0 Mickey Donald Daisy”
  exit 1
fi
for friend in $*
do
  echo "Hello $friend"
done
```



# References