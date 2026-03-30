Opened 03-30-2026 14:22

Status:

Tags: [[I-node]]

# Directory
a file that contains a list of hard links and sometimes soft-links
- an i-node may appear in multiple directories
- the ref count in the i-node keeps track of the number of directories where the i-node appears

**Hard Links**
(file name, I-node number) pairs
- in some OS the ref count is incremented when the file is opened --> prevent file from being removed when in use
- cannot cross partitions. directories cannot list an i-node of a different partition
- [[6 Full Notes/College Notes/sem4/cs252/Notes/bash|bash]]:`ln target-file name-link`

**Soft-Links**
(file name, i-node number with file storing path) paris
- path may be absolute or relative
- soft links can point to files in different partitions
- a soft link does not keep a reference count to track of the target file
- if the target file is removed, the symbolic link becomes invalid
- [[6 Full Notes/College Notes/sem4/cs252/Notes/bash|bash]]: `ln -s target-file name-link`




---
# References