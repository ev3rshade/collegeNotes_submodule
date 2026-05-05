Opened 05-02-2026 12:18

Status:

Tags: 

# TCP
Transmission Control Protocol
major transport protocol used in the Internet

**ALWAYS USE TCP OVER UDP IF YOU NEED A RELIABLE CONNECTION**

---
## Characteristics

**Reliable**
uses acknowledgement and re-transmission to accomplish reliability

**Connection-Oriented**
an initial connection is required. Both end points keep state about the connection

**Full-Duplex**
communication can happen in both ways simultaneously

**Stream Interface**
transfer of bytes look like writing/reading to a file



---
## Reliability

based on two indicators

**Acknowledgements** (ACK)
receiver sends acknowledgement when data arrives

**Re-transmissions**
sender starts timer whenever message is transmitted
if timer expires before ACK, the sender re-transmits the messages


---
## Optimizations

1 **Adaptive Re-transmission**
re-transmission timer is set to (`RTT` = round trip time) `RTT + 4 + RTTSTDDEV` where `RTT` is estimated
this allows TCP to work in slow and fast networks

2 **Cumulative Acknowledgements**
an acknowledgement is for all the bytes received so far without holes and not for every packet received

3 **Fast Re-transmission**
a heuristic where duplicated acknowledgement for the same sequence is signal of a packet lost
data is re-transmitted before the timer expires

4 **Flow Control**
slows down sender if receiver is running our of buffer space
the window (receiver's buffer size) is sent in every ACK

5 **Congestion Control**
for TCP a lost packet is a signal of congestion
TCP will slow down the re-transmission
uses "slow start" and then a "congestion avoidance" where window of re-transmitted data is reduced in size

6 **Reliable Connection and Shutdown**
TCP uses a Three-way Handshake to open and close connections
Three packets are enough to makes ure lost packets/host crashes will not affect future connections



---
## Diagrams

Example TCP Exchanges

![[Screenshot_20260502_123815.png]]![[Screenshot_20260502_123838.png]]

---
# References