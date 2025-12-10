11-04-2025 01:38

Status: #cs250

Tags:

Chapters: 1.2 | 5 

# Hierarchy
(of memories)
> fastest, smallest, most expensive memory at top, slowest largest and cheapest memory at the bottom

## Locality
#### Temporal Locality
> The locality principle stating that if a data location is referenced then it will tend to be referenced again soon

#### Spatial Locality
> The locality principle stating that if a data location is referenced, data locations with nearby addresses will tend to be referenced soon

###### Instructions may exhibit both temporal and spatial locality
Instructions are accessed sequentially in the absence of a jump, thus showing spatial locality. Instructions within a loop are executed repeatedly, thus showing temporal locality.

###### Data may exhibit both spatial and temporal locality
Sequential access to arrays or strings show spatial locality. Data within a loop are accessed repeatedly, thus showing temporal locality.



# References