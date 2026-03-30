Opened 03-30-2026 14:23

Status:

Tags: [[I-node]]

# Block Index

**Direct Block**
(12 block size)
points directly to the block. there are 12 of them in the structure.

**Single Indirect**
(768 block size)
points to a block table that has 256 entries. there are 3 of them.

**Double Indirect**
(~64,000 block size)
--> page table of 256 entries --> page table of 256 entries

**Triple Indirect**
(~16,000,000 block size)
--> page table of 256 entries --> page table of 256 entries --> page table of 256 entries


most files in a system are small --> saves disk access time bc small files only need direct blocks

alternative to this multi-level block index is a linked list (slow for random access)

---
# Pictures

multi-level block index visual
![[Screenshot 2026-03-30 140623 1.png]]

---
# Active Recall

1 Assume we have a 2MB file. How many block read operations are needed to access the last byte of this file including the inode? Assume we have 16 direct blocks, 3 single indirect blocks, 1 double indirect and 1 triple indirect. Also the block size is 1024 and there are 256 block entries per block. 
||4||
###### Answer Explanation
First, figure out where the last byte lives. With 1024-byte blocks:

16 direct blocks = 16 × 1024 = 16 KB
3 single indirect blocks = 3 × 256 × 1024 = 768 KB
Running total so far: 784 KB
1 double indirect block = 256 × 256 × 1024 = 64 MB (way more than enough)

2MB = 2048 KB, and 2048 − 784 = 1264 KB into the double indirect region. So the last byte is reached via the double indirect pointer.
The reads needed are:

Read the inode
Read the double indirect block (the index block pointed to by the inode)
Read the single indirect block (one of the 256 entries in that double indirect block)
Read the actual data block

Total = 4 reads, which is answer D.

---
# References