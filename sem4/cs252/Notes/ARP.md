Opened 05-02-2026 15:04

Status:

Tags: [[Addressing (internet)]]

# ARP
address resolution protocol
converts IP address to hardware addresss

IP address C of Computer in locally connected network N --> Ethernet address for C

example: ethernet LAN, target IP address in IP packet has to be translated to Ethernet address

**ARP Table** (ARP cache)
keeps bindings (IPAddr, EtherAddr)

ARP command example
```
C:\Users\owner>arp -a
Interface: 10.184.105.105 --- 0xd
  Internet Address   Physical            Address Type
  10.184.96.1        00-24-c4-c0-fe-c0   dynamic
  10.184.111.255     ff-ff-ff-ff-ff-ff   static
  224.0.0.22         01-00-5e-00-00-16   static
  224.0.0.251        01-00-5e-00-00-fb   static
  224.0.0.252        01-00-5e-00-00-fc   static
  239.255.255.250    01-00-5e-7f-ff-fa   static
  255.255.255.255    ff-ff-ff-ff-ff-ff   static
```

---
# References