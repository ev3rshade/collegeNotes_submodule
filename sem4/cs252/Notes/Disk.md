Opened 03-29-2026 16:10

Status:

Tags: [[UNIX Filesystem]]

# Disk
electromagnetic and mechanical device or Solid State Drive
used to store information permanently

divided into sectors, tracks, blocks
logically divided into partitions

---
## Partitions
 a group of blocks
--each partition is a different filesystem

Each partition has: 

**1 Boot Block**
has a piece of jumps to the OS

**2 Superblock** 
contains information about:
- number of data blocks in the partition
- number of [[I-node]]
- bitmap for used/free i-nodes
- bitmap for used/free blocks
- i-node for the root directory
- other partition info

**3 I-node List**
a list of i-nodes
there is one i-node for each file in the disk

**4 Data Blocks**
stores the file data

---
## lsblk

example output
```
cs252@data:~$ lsblk
NAME MAJ:MIN RM SIZE RO TYPE MOUNTPOINTS
sda 8:0 0 894.3G 0 disk
├─sda1 8:1 0 976M 0 part /boot
├─sda2 8:2 0 1K 0 part
└─sda5 8:5 0 893.3G 0 part
	├─data_vg00-lv_root 253:0 0 30.5G 0 lvm /
	├─data_vg00-lv_var 253:1 0 75G 0 lvm /var
	├─data_vg00-lv_swap 253:2 0 366.2G 0 lvm [SWAP]
	└─data_vg00-lv_scratch 253:3 0 382G 0 lvm /scratch
sdb 8:16 0 931.5G 0 disk
└─sdb1 8:17 0 931.5G 0 part
```

---
# Pictures
![[Screenshot 2026-03-31 123913.png]]
![[Screenshot 2026-03-31 124032.png]]

---
# References