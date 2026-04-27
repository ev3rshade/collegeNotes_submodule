Opened 04-22-2026

Status:

Tags: cs250 [[! cs250 Computer Architecture]]

# + memory system
> How computers store and retrieve data — the hierarchy from fastest to slowest

---
## Memory Characteristics

| Property | Description |
|---|---|
| Volatility | Does it lose data without power? |
| Access time | How long to retrieve one item |
| Bandwidth | Data transferred per second |
| Capacity | Total data that can be stored |
| Cost per bit | Price relative to other levels |

---
## Memory Hierarchy

> Multiple levels of memory; faster levels are smaller and closer to the CPU.

Built on two principles:
- **Temporal locality** — recently accessed data will be accessed again soon
- **Spatial locality** — data near a recently accessed address will be accessed soon

```
Fastest / Smallest / Most expensive
    Registers (flip-flops, <1 ns)
    L1 Cache (SRAM, ~1 ns)
    L2 Cache (SRAM, ~5 ns)
    L3 Cache (SRAM, ~20 ns)
    Main Memory / RAM (DRAM, ~60-100 ns)
    SSD (~0.1 ms)
    Hard Disk (HDD, ~5-10 ms)
Slowest / Largest / Cheapest
```

---
## Cache

> High-speed SRAM used to reduce the average time to access main memory.

Technology: **SRAM** — 6–8 transistors per bit; no refresh needed; very fast but expensive

### Cache Line Structure
Each cache entry (line) contains:
- **Tag** — which memory block is stored here
- **Valid bit** — is this data valid?
- **Dirty bit** — (write-back only) has this been modified?
- **Data block** — the actual data (typically 64 bytes)

### Cache Organizations

**Direct-mapped** — each block maps to exactly one cache location
$$\text{cache index} = \text{block address} \bmod \text{number of cache blocks}$$

**Set-associative** — each block maps to one set; can go in any way within the set
$$\text{set index} = \text{block address} \bmod \text{number of sets}$$

**Fully associative** — block can go anywhere; eliminates conflict misses; expensive

| | Lower Latency | Direct-mapped | Set-associative | Fully associative | Lower Miss Rate |

### Three Types of Cache Misses (3 C's)
- **Compulsory** — first-ever access to a block
- **Capacity** — working set is larger than the cache
- **Conflict** — multiple blocks compete for the same set

### Replacement Policies
- **LRU (Least Recently Used)** — replace the block unused longest; costly for high associativity
- **Random** — randomly select a victim block

### Write Policies
- **Write-through** — write to cache AND memory simultaneously; simpler; uses a write buffer
- **Write-back** — write to cache only; write to memory on eviction (dirty bit required); more efficient

### Cache Performance
$$\text{AMAT} = \text{Hit time} + (\text{Miss rate} \times \text{Miss penalty})$$

Multilevel caches: L1 optimized for hit time; L2/L3 optimized for miss rate.

See [[Cache]]

---
## Main Memory (DRAM)

> Dynamic RAM — 1 transistor + capacitor per bit; requires periodic refresh.

- **Capacity:** large (GBs in typical systems)
- **Access time:** ~60-100 ns; much slower than SRAM
- **Organization:** banks of rows; row activation dominates latency; data transferred in bursts

**Virtual Memory** uses main memory as a cache for disk.

See [[Main memory]]

---
## Virtual Memory and Address Spaces

> A technique that gives each process its own private address space, backed by physical memory + disk.

**Physical address** — actual location in RAM
**Virtual address** — process's view of memory (may differ from physical)

### Paging
- Memory divided into fixed-size **pages** (typically 4KB–4MB)
- **Page table** — OS data structure mapping virtual page numbers → physical page numbers
- **Page fault** — accessed page is not in physical memory; OS loads it from disk (swap space)

### TLB (Translation Lookaside Buffer)
> A cache for page table entries — avoids full page table lookup on every memory access.

TLB miss handling:
1. Page in memory → load TLB entry
2. Page not in memory → raise page fault → OS handles

### Address Translation Flow
```
Virtual Address
    → TLB lookup
        → Hit: get physical address
        → Miss: page table walk → (possibly page fault) → update TLB
    → Physical Address
    → Cache lookup → Memory
```

Page table size = (Virtual Address Space / Page Size) × Entry Size

Multi-level page tables reduce memory for sparse address spaces.

**Aliasing** — two virtual addresses mapping to the same physical page.

See [[Address Spaces]]

---
## Disk Storage

> Magnetic spinning platters — non-volatile, very high capacity, very slow.

- **Track** — concentric ring on a platter
- **Sector** — smallest read/write unit
- **Seek time** — time to move head to correct track (~3-10 ms)
- **Rotational latency** — time waiting for correct sector (~0-5 ms)
- **Transfer time** — time to read/write bits once aligned

Mechanical nature → primary bottleneck.

See [[Disk]]

---
## Error Handling

**Error detection code** — detects errors but cannot locate them (e.g., parity bits, checksums)
**Error correction code (ECC)** — detects and corrects errors (used in server DRAM)

---
# Active Recall

1. What are the two locality principles that the memory hierarchy is built on?
||Temporal locality (recently used items will be used again) and spatial locality (nearby items will be used soon)||

2. What are the 3 C's of cache misses?
||Compulsory, Capacity, Conflict||

3. What is AMAT and what does it measure?
||Average Memory Access Time = Hit time + (Miss rate × Miss penalty). It measures how long memory accesses take on average accounting for misses.||

4. What is a TLB?
||A cache for page table entries that speeds up virtual-to-physical address translation.||

---
# References
[[Memory]]
[[Cache]]
[[Main memory]]
[[Address Spaces]]
[[Disk]]
[[Registers]]
