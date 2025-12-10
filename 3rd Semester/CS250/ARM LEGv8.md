10-28-2025 23:17

Status: #cs250

Tags: [[Assembly]]

Chapters: All of chapter 2

# LEGv8
> an assembly language. a simplified subset of the [ARMv8 assembly language](https://www.google.com/search?q=ARMv8+assembly+language&rlz=1C1CHBF_enUS1120US1120&oq=is+legv8+assembly&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTINCAEQABiGAxiABBiKBTIKCAIQABiABBiiBDIKCAMQABiABBiiBDIKCAQQABiABBiiBDIKCAUQABiABBiiBNIBCDM3ODdqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8&mstk=AUtExfCB6IV_hxiwdvMW7FgfFbmmxEVevUbBM3cWDZ6gc-W6kITHyky3OARkNtGsP1kDBwek-Vgi9cvwckerUrpa39AKXi4LVDVMP5PdUWF0AzIG_9EXIFmG8wCTPbWM8ArvW6cN1TP15SqkWrWcTbsxCCSlbAuSeDusIrVqk8pSgVFcyMs&csui=3&ved=2ahUKEwillLGdoJuRAxWwmokEHVZeLFEQgK4QegQIARAC) used for educational purposes

### Syntax
- One operation, three parameters
==see table in chapter 2 for full list==
### Memory access
Registers
- 32 Registers
- X0 - X30 and XZR (XZR is an example of [[Common Case Fast]])

Memory words
- $2^{62}$
- Only accessed by data transfer instructions
#### Datapath
- has a 64-bit data path in the processor circuitry

## Implementation (datapath)
Instructions that form a basic implementation
1. Memory reference instructions (LDUR, STUR)
2. Arithmetic-logical instructions (ADD, SUB, AND, ORR)
3. Instructions *compare and branch on zero* (CBZ) and *branch* (b)

Steps to execute the implementation
4. Send the program counter to the mem that contains the code and fetch the instruction from that memory
5. Read one or two registers, using fields of the instruction to select the registers to read. 
	1. For LDUR and CBZ 1 register
	2. For other instructions 2 registers

## Terminology
Basic block
> a sequence of instructions without branches
# References