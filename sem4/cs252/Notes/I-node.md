Opened 03-27-2026 10:03

Status:

Tags:

# I-node

## Characteristics

**1 Flag/Mode**
read, write, execute. (owner, group, all) RWX RWX RWX

**2 Owners**
userid, groupid

**3 Time Stamps**
creation time, access time, modification time

**4 Size**
size of file in bytes

**5 Ref. Count**
the number of times the i-node appears in a directory (hard links)
increases every time file is added to a directory. the file the i-node will be removed when the reference count reaches 0

**6 Block Index**
with the data blocks that make the file
uses indices of different levels (to save space)

## Blocks

**Direct Block**
points directly to the block. there are 12 of them in the structure.

**Single Indirect**
points to a block table that has 256 entry's. there are 3 of them

**Double Indirect**
points 

---
# Active Recall
What are the 6 parts of an I-node?
||Enumerate and describe the contents of an I-node||

How do I-Nodes save space with block indices?
||The block index uses indices of different levels, small files only use the direct and single-indirect blocks, therefore saving space spent used for block indices||

---
# References