Opened 03-31-2026 12:30

Status:

Tags:

# Users
users in the system

"root" user has special priviledges
- can modify files anywhere
- can add users or reset passwords

---
## User Database

/etc/passwd - contains the database of users
`login:userid:grouid:Name,,,:homedir:shell`
- "USER ID" uniquely identifies each user in the system

/etc/shadow - stores encrypted passwords

---
## Commands [[bash]]
- `adduser`
- `passwd`
- `su`
- `ypcat`

---
# References