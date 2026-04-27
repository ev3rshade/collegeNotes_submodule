Opened 04-22-2026

Status:

Tags: [[+ memory system]] [[Cache]]

# Cache Coherence
> The guarantee that all processors in a multiprocessor system observe a consistent view of a single memory location, regardless of which cache holds a copy.

---

## Cache Coherence and Data Invalidation

> Ensures all caches see a consistent value for a single memory location.

Defines **what** value can be returned by a read.

### Data Invalidation
> The process of marking or removing outdated data from a cache to ensure all processors use fresh, accurate data from the authoritative source.

When one processor writes to a location, other cached copies must be either invalidated or updated.

---

## Cache Consistency

> Defines the ordering of memory operations across different locations.

Defines **when** a written value becomes visible to other processors.

- Coherence answers: "what value do I get for address X?"
- Consistency answers: "after I write X, when must Y be visible too?"

---

## Qualities of a Coherent Cache

1. **Program order preservation** — a processor always reads the most recent value it wrote to any address
2. **Write propagation** — writes by one processor eventually become visible to all other processors
3. **Write serialization** — all processors observe the same global order of writes to a single address

**Migration** — data is moved closer to the processor that is currently accessing it, reducing latency.

**Replication** — multiple caches hold read-only copies of the same block simultaneously, allowing parallel reads.

---

## False Sharing
> When two or more unrelated variables happen to reside in the same cache block, causing unnecessary invalidations when one processor writes to one variable and another processor's copy of the block is invalidated.

- Performance penalty without any logical data sharing
- Avoided by padding data structures so independent variables occupy separate cache lines

---

## Cache Protocols

> Rules that all caches follow to enforce coherence.

### Snooping
> Each cache monitors (snoops) the shared memory bus to observe all transactions.

- Most common protocol in shared-bus multiprocessors
- When a cache sees a write to an address it holds, it invalidates its copy

### Write-Invalidate Protocol
> When a processor writes to a block, all other cached copies of that block are invalidated.

- Only one writer at a time holds a valid copy
- Subsequent reads by other processors cause a miss and fetch the updated block

---

# Active Recall

1. What is the difference between cache coherence and cache consistency?
||Coherence defines what value is returned for a single memory location across caches. Consistency defines the ordering of all memory operations (across different locations) as seen by different processors.||

2. What is false sharing and why is it a problem?
||False sharing occurs when unrelated variables share the same cache block; a write by one processor invalidates another processor's copy even though the other processor's variable was not touched, causing unnecessary cache misses.||

3. How does the write-invalidate snooping protocol work?
||Each cache monitors the shared bus. When a write to an address is observed, any cache holding a copy of that block marks it invalid. The next read of that address fetches the updated value.||

---

# References
[[Cache]]
