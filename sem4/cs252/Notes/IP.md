Opened 05-02-2026 12:08

Status:

Tags: 

# IP
a **unique** numerical identifier representing a network interface -- a connection between a computer and network

- an abstraction to hide network internals
- independent from hardware addressing
- used for all computer communications
- a computer with multiple network connections (like a router) must be assigned one IP address for each connection



---
## Format

**IPv4**
32 bits

Prefix: identifies a network | Suffix: identifies host in network

assignment
- global authority assigns a unique prefix for network
- local admin assigns unique prefix to hosts
- number of bits assigned to prefix and suffix is variable depending on the size of the number of hosts in each network
- subnet mask is parameter in the interface the tells the number of bits used for the network number


---
## IP Packet
Subtag: [[Routing]]

- IP source and destination address of packet is same during transit
- hardware source and destination address will be different every time the packet is forwarded
- source host or some of the routers also may require [[ARP]] requests if the hardware destination address is not in the ARP cache

---
# References