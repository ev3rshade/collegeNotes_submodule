10-30-2025 01:14

Status: #cs250

Tags: [[Hierarchy]] 

Chapters: 1.2 1.4 2.3
# Memory
> a place to store values to represent information in the machine

## Characteristics of memory
1. Alignment restriction
2. Volatile/nonvolatile

### Physical / virtual
#revise

## Memory Hierarchy
> A structure that uses multiple levels of memories; as the distance from the processor increases, the size of the memories and the access time both increase.

### Processor
### Cache

### Main memory
### Disk

## Units / terminology
##### Block (or line)
- the minimum unit of information that can be either present or not present in a cache

##### Hit Rate
- The fraction of memory accesses found in a level of the memory hierarchy
##### Miss rate
- The fraction of memory accesses not found in a level of the memory hierarchy
##### Hit time
- The time required to access a level of the memory hierarchy, including the time needed to determine whether the access is a hit or a miss
##### Miss penalty
- The time required to fetch a block into a level of the memory hierarchy from the lower level, including the time to access the block, transmit it from one level to the other, insert it in the level that experienced the miss, and then pass the block to the requestor


# References
![[Screenshot 2025-11-04 021254.png]]