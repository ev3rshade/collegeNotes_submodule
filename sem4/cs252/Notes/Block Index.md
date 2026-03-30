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
![[Screenshot 2026-03-30 140623.png]]




---
# References