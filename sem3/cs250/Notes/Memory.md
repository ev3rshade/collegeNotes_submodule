10-30-2025 01:14

Status:

Tags: [[+ memory system]]

Topic: 4

# Memory
> a place to store values to represent information in the machine

---

## 1 Characteristics of a memory system

### 1.1 Volatility

#### Volatile Memory
> memory that loses data when power is removed

Examples: registers, cache, DRAM

#### Non-volatile Memory
> retains data without power

Examples: flash, SSD, HDD, ROM



### 1.2 Access Time / Latency
> How long it takes to retrieve a single piece of data

Fast memory (registers, cache) --> close to CPU

Slow memory (disk) --> furthest away

As we move down the memory hierarchy, access time increases.



### 1.3 Bandwidth
> How much data can be transferred per second (Bytes / Second)

High bandwidth does not necessarily mean low latency.



### 1.4 Capacity
> How much data can be stored (Bytes)

###### Unit - byte

kilo | mega | giga | tera | peta | exa | zetta | yotta
kibi | mebi | gibi | tebi | pebi | exbi | zebi | yobi

Typically, lower levels of the hierarchy have higher capacity.



### 1.5 Organization and Addressability (how data is organized and accessed)

#### Word Size
> (see 2. Representing Data) (8-bit, 16-bit, 32-bit, 64-bit, etc.)

#### Block (or line)
> The minimum unit of information transferred between memory levels.

Caches move data in blocks (cache lines), not individual bytes.

#### Addressable Units
> what unit is being used to address data (e.g. byte addressing)

Most modern systems use byte addressing.




### 1.6 Physical Structure / Technology
> What is the hardware being used

e.g.
Registers
SRAM
DRAM
Flash
Magnetic Disk

(see 3. below for more detail)




### 1.7 Access Method

#### Random Access
- RAM, caches, ROM

#### Sequential access
(not relevant to this course)

#### Read-only vs. Read Write
- memory that can be only read or memory that is both read and write

#### Block vs. Byte access
- Reading by large, fixed size chunks or byte by byte



### 1.8 Cost per Bit

Higher-performance memory costs more, driving design by MEMORY HIERARCHY

Registers --> extremely expensive
Cache --> expensive
DRAM --> cheap
SSD --> cheaper
HDD --> cheapest

### 1.9 Power Consumption (not relevant in cs250)
> different memory types have different power needs



---
## 2 Memory Access

### 2.1 Measures of Memory Access

#### Hit Rate
> The fraction of memory accesses found in a level of the memory hierarchy.

#### Miss Rate
> The fraction of memory accesses not found in a level of the memory hierarchy.

Miss rate = 1 - hit rate

#### Hit Time
> The time required to access a level of the memory hierarchy, including the time needed to determine whether the access is a hit or a miss.

#### Miss penalty
> The time required to fetch a block into a level of the memory hierarchy from the lower level.

Includes time to:
- access the block
- transmit the block from one level to the other
- insert the block into the level that experienced the miss
- pass the block to the requestor



---
## 3 Memory Hierarchy
> A structure that uses multiple levels of memories; as the distance from the processor increases, the size of the memories and the access time both increase.

### 3.1 Design of Memory Hierarchy

Temporal Locality
> The locality principle stating that if a data location is referenced then it will tend to be referenced again soon.

Spatial Locality
> The locality principle stating that if a data location is referenced, data locations with nearby addresses will tend to be referenced soon.

The memory hierarchy is built with these two principles in mind.

### 3.2 Levels of Memory Hierarchy

-Fastest access-

### Processor

(hardware: registers)
⬆️⬇️⬆️⬇️⬆️⬇️⬆️⬇️

### Cache (L1, L2, L3)

(hardware: SRAM)
⬆️⬇️⬆️⬇️⬆️⬇️⬆️⬇️

### Main memory

(hardware: DRAM)
⬆️⬇️⬆️⬇️⬆️⬇️⬆️⬇️

### Disk

(hardware: SSD / Magnetic Disk)

-slowest access-

### 3.3 Diagram of Memory Hierarchy

![[Screenshot 2025-12-11 221557.png]]



---
## 4 [[Cache]] and [[Main memory]] and [[6 Full Notes/collegeNotes_submodule/sem3/cs250/Notes/Disk|Disk]]

---

## 5 Performance

### Average Memory Access Time (AMAT)

AMAT = Hit time + (Miss rate × Miss penalty)

Used to evaluate memory hierarchy performance for in-order processors.

---

## 6 Error Handling

### Error detection code
> A code that enables the detection of an error in data, but not the precise location and, hence, correction of the error.

Examples:
- Parity bits
- Checksums

### Error correction code (ECC)
> Codes that detect and correct errors in memory.

Used in:
- Main memory (DRAM)
- Servers and safety-critical systems

Example of dependability via redundancy

---

# References

## Labs
[[CS250 Lab03 S'R' Latch.pdf]]
[[CS250 Lab11 Memory.pdf]]
[[CS250 Lab12 Cache and Memory.pdf]]

## Textbook
- Chapters 1
    - 1.2
    - 1.4
- Chapter 2
    - 2.3
- Chapter 5
    - 5.1-5.4
    - 5.7 - 5.8
    - 5.10
    - 5.16-5.17
- Chapter 7
    - 7.7 - 7.9
