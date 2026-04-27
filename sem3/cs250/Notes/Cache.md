Opened 03:27

Status:

Tags: cs250 [[+ memory system]]

Topic: [[Memory]]

Chapters: 5.3, 5.4

# Cache
> memory from which high-speed retrieval is possible

---

## Technology | SRAM (Static RAM) (5.2)
> Integrated-circuit memory using **6–8 transistors per bit**.

- One access port per array is common (though multi-ported SRAM exists)
- Faster but far more expensive than DRAM

### Characteristics
- **Volatility:** volatile
- **Access time:** very fast
- **Bandwidth:** high
- **Capacity:** small to moderate
- **Technology:** stable bistable flip-flops; no refresh needed
- **Access granularity:** word-level (defined by ISA)
- **Cost per bit:** high
- Exploits **temporal locality** and **spatial locality**

### Usage

#### L1 Cache
> (a cache for a cache)
> L1 cache, known as the primary cache, can be used as a cache for the L2 cache.

#### L2 Cache
> (a cache for main memory)
> The L2 cache is faster than main memory, but tends to be larger and slower than the L1 cache.

#### Split Cache
> A scheme in which a cache level is divided into two independent caches.
- Instruction cache (I-cache)
- Data cache (D-cache)

Allows parallel access to instructions and data.

#### TLB

see [[Address Spaces]]

---

## Cache Line
> entry in a cache

### Structure

#### Cache index
> a portion of a memory address that selects a cache line or set
#### Tag
> A field that identifies which memory block is stored in the cache line.
#### Valid bit
> Indicates whether the cache line contains valid data.

#### Dirty Bit
(only for write-back policies)
> Indicates the cache block has been modified since being loaded.

#### Data Block
> a fixed-size chunk of memory brought into cache on a cache miss

#### Diagram of Cache Line Structure
![[Screenshot 2025-12-12 001730.png]]

### Accessing a Cache Line
##### Tag and valid bit access example (5.3.3)

--> request to address 00110₂

|Index|V|Tag|Data|
|---|---|---|---|
|000|N|||
|001|Y|00|Memory(00001)|
|010|N|||
|011|N|||
|100|Y|11|Memory(11100)|
|101|N|||
|110|N|||
|111|Y|10|Memory(10111)|

The request results in a **cache miss**, so the word at address 00110₂ is brought into cache block 110₂.
- Lower bits (110) → cache index
- Upper bits (00) → tag

---

## Cache Organizations

### Direct-mapped cache
> A cache structure in which each memory block maps to exactly one cache location.

#### Addressing
mapping from memory block → cache block:

$$
(\text{Block address}) \bmod (\text{Number of cache blocks})
$$

block number:
$$
\frac{\text{Byte address}}{\text{Bytes per block}}
$$

#### Diagram of Direct-Mapped Cache Addressing

![[Screenshot 2025-12-10 030156.png]]

#### Size of a Direct-Mapped Cache

##### Tag Field Sizes
- $m$ = block offset bits
- $n$ = index bits = $\log_2$(number of cache blocks)
- byte offset bits = 2

##### Total number of bits

$$
2^n \times (\text{block size} + \text{tag size} + 1)
$$

- tag size = address size − (n + m + 2)

### Set-associative cache

> A cache where each set contains multiple blocks
- Reduces conflict misses compared to direct-mapped caches

mapping:
$$
(\text{Block address}) \bmod (\text{Number of sets})
$$

### Fully associative cache

> A cache where a block can be placed anywhere.
- Eliminates conflict misses
- Requires associative search hardware

### Comparison of Cache Organizations

|Lower Latency|Direct mapped|Set associative|Fully associative|Higher Latency|
|---|---|---|---|---|
|More misses||||Fewer misses|

#### Cache Organization Visual

![[Screenshot 2025-12-10 033003.png]]

---

## Hit and Miss Behavior

### Cache hit
> Requested data is found in the cache.

### Cache miss
> Requested data is not found in the cache.

Steps on a miss:
1. Send address to memory
2. Read block from lower level
3. Update cache (data, tag, valid bit)
4. Restart instruction

#### Three C's Model
> Classifies cache misses.
##### Compulsory miss
> First access to a block.
##### Capacity miss
> Cache too small to hold working set.
##### Conflict miss
> Multiple blocks compete for same set.

#### Multilevel Caches

Global miss rate
> Fraction of references that miss in all cache levels.

Local miss rate
> Fraction of references that miss at a given level.

---

## Addressing in Caches

#### Physically addressed cache
> Cache indexed by physical addresses.

#### Virtually addressed cache
> Cache indexed by virtual addresses.

---

## Cache Performance

### Measuring performance
Average Memory Access Time (AMAT)
> Hit time + (Miss rate × Miss penalty)

### Improving performance

#### Multilevel caches
- Upper levels optimized for hit time
- Lower levels optimized for miss rate

#### Software blocking
> Reusing data in cache to exploit locality.

### Changing Cache Design Parameters
![[Screenshot 2025-12-12 212907.png]]

---

# Active Recall

1. What are the three C's of cache misses?
||Compulsory (first access), Capacity (working set too large), Conflict (multiple blocks map to the same set).||

2. What is the AMAT formula?
||AMAT = Hit time + (Miss rate × Miss penalty)||

3. What is the difference between direct-mapped, set-associative, and fully associative caches?
||Direct-mapped: each block maps to exactly one cache line. Set-associative: each block maps to one set but can go in any way within that set. Fully associative: a block can go anywhere — no conflict misses but requires associative search hardware.||

---

# References

## Textbook
- problems 5.3.5
- problems 5.4.3
- problems 5.4.5 – 5.4.7

## Labs
[[CS250 Lab12 Cache and Memory.pdf]]

## Textbook

Chapter 5
- 5.1–5.4
- 5.7–5.8

See also: [[Cache Policies]], [[Cache Coherence]]
