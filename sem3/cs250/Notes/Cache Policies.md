Opened 04-22-2026

Status:

Tags: [[+ memory system]] [[Cache]]

# Cache Policies
> The rules governing which cache block to evict on a miss (replacement), how writes are handled (write policy), and whether blocks are fetched before being requested (prefetching).

---

## Replacement Policies

### Least Recently Used (LRU)
> Replaces the block that has been unused for the longest time.

- Approximates optimal (OPT) replacement
- Costly to implement beyond 2–4 way associativity (requires tracking order of use)

### Random
> Randomly selects a block to replace.

- Simple to implement in hardware
- Surprisingly competitive with LRU in practice

---

## Write Policies

### Write-through
> On a write hit, update both the cache and the next lower memory level simultaneously.

- Memory always has an up-to-date copy
- Higher bus traffic

**Write buffer** — a queue that holds data waiting to be written to memory, decoupling the CPU from slow memory writes.

### Write-back
> On a write hit, update only the cache; write to memory only when the block is evicted.

- Uses a **dirty bit** to track whether the block has been modified
- Lower bus traffic; preferred in modern systems
- More complex eviction logic

---

## Prefetching
> Bringing blocks into cache before they are explicitly requested.

**Goal:** reduce miss penalty and hide memory latency.

**Hardware prefetching** — the hardware detects sequential or strided access patterns and automatically fetches ahead.

**Software prefetching** — explicit prefetch instructions inserted by the compiler or programmer.

**Tradeoff:** incorrect prefetches waste memory bandwidth and can evict useful data.

---

# Active Recall

1. What is the difference between write-through and write-back?
||Write-through updates both cache and memory on every write. Write-back updates only the cache and writes to memory only when the dirty block is evicted.||

2. What is the purpose of a write buffer?
||It queues pending writes to memory so the CPU does not stall waiting for slow memory to accept each write.||

3. What is the tradeoff with prefetching?
||It can reduce miss penalty by fetching data early, but incorrect prefetches waste bandwidth and may evict useful data from cache.||

---

# References
[[Cache]]
