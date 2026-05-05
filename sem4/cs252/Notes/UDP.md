Opened 05-02-2026 12:18

Status:

Tags: 

# UDP
user datagram protocol

---
## Characteristics

**Unreliable Transfer**
apps will need to implement their own reliability if necessary

**Minimal Overhead**
in both computation and communication

**Connection-less**
no initial connection necessary -- no state in both ends

**Message Oriented**
each message encapsulated in an IP datagram
size of message restricted by size of Maximum Transfer Unit (MTU) of the directly connected network
header has ports that identify source app (source port) and destination app (destination port)


---
## When to use

**Real Time Applications**
applications where packets arriving on time with minimum delay is more important than reliability (e.g. voice over IP, teleconferencing)

**LAN Applications / Broadcasting**
a computer needs to reach all of part of the computers in the local network (e.g. finding a server, e.g. DHCP or finding a printer), multicast data, or discover resources

---
# Active Recall

1 when should UDP be used over TCP?
|| LAN, real time apps ||


---
# References