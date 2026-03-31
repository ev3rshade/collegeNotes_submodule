Opened 03-27-2026 10:03

Status:

Tags: [[UNIX Filesystem]]

# I-node (file)

---
## Characteristics

**0 Device where i-node resides**
each i-node resides in a filesystem that is hosted on a device identified by a major/minor id

**0.1 I-node Number**
each file in a filesystem has an i-node number unique within the filesystem it resides in

**0.2 Device Represented**
if this i-node represents a device, then the i-node records the major + minor id of that device

**1 File Type and Flag/Mode**
read, write, execute. (owner, group, all) RWX RWX RWX

**2 Owners**
user id, group id
(see [[File Ownership]])

**3 Time Stamps**
creation time, access time, modification time
stored as seconds after the epoch (0:00, January 1st, 1970)

**4 Size**
size of file in bytes

**5 Ref. Count**
the number of times the i-node appears in a directory (hard links) (see [[Directory and Links]])
increases every time file is added to a directory. the file the i-node will be removed when the reference count reaches 0

**6 Index with Data Blocks**
[[Block Index]] that is a list of blocks that make the file
uses indices of different levels (to save space)
has "preferred" block size for efficient filesystem I/O

---
# Active Recall
What are the 6 parts of an I-node?
||see above||

How do I-Nodes save space with block indices?
||The block index uses indices of different levels, small files only use the direct and single-indirect blocks, therefore saving space spent used for block indices||

What is an alternative to a multi-level block index? What is its disadvantage?
||a linked list where each block contains a pointer that points to the next block and so on. slow for random access||

---
# References

1 [linux man page](https://man7.org/linux/man-pages/man7/inode.7.html)