Opened 05-02-2026 12:55

Status:

Tags: [[Addressing (internet)]]

# NAT
Network Address Translation
used when you want to connect multiple computers to the Internet using a single IP address

NAT software can run on a computer or (NAT box/firewall) that has two network intefaces:
- once connected to private network
- other connected to internet



---
## Address Translation

1. Machines in private network use the NAT box as default router
2. TCP packet with header `<IPsrc, PORTsrc, IPdest, PORTdest>` goes from private network --> internet the NAT box will change header to `<IPnat, PORTrand, IPdest, PORTdest>` where `IPnat` is the shared IP address and `PORTrand` is a random unused port in the NAT box
3. The NAT box will also add the NAT mapping `(PORTrand, IPsrc, PORTsrc` to the NAT table
4. When a packet `<IPdest, PORTdest, IPnat, PORTrand>` arrives from Internet to NAT box, it will lookup `PORTrand` in table and change header to `<IPsrc, PORTsrc, IPdest, PORTdest>` and forward to `IPsrc`
5. A similar translation is done for UDP packets

---
## What NAT solves

provides network protection
--packets are only allowed into the private network only if they belong to a connection that started by a machine in the private network

mitigates problem of running out of Assigned Network Numbers


**Firewall functionality**


---
## Example ==revise==


---
# References