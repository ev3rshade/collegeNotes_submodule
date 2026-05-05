Opened 05-02-2026 14:57

Status:

Tags: [[+ computer network]]

# Routing
routing table gives the next router necessary info to reach the destination network

Manual
- By hand
- Small network
- OK if routes are static

Automatic
- Software creates/updates the routing table using information from neighboring routers
- Needed for lager nets
- Changes routes if there is a failure


---
## Diagrams

Routing example
```
A: Routing Table

Target Net     Net/Subnet       Mask Next Hop
40.0.0.0       255.0.0.0        Directly
128.10.3.0     255.255.255.0    40.0.0.11 (R1)
128.10.5.0     255.255.255.0    40.0.0.11 (R1)
128.10.4.0     255.255.255.0    40.0.0.11 (R1)
216.109.112.0  255.255.255.0    40.0.0.11 (R1)
Default:       255.255.255.255  40.0.0.1  (R3)
```

![[Screenshot_20260502_150129.png]]


---
# References