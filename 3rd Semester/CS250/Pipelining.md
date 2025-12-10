10-30-2025 12:40

Status: #cs250

Tags: [[Data Dependency]] [[Parallelism]]

Chapters: 1.2
# Pipelining
> overlapping parts of a processes, executing them simultaneously to increase efficiency

### Stages of an Instruction
1. Instruction Fetch (IF) 
	1. Source: Instruction memory (IM)
2. Instruction Decode/register file read (ID)
3. Execution (EX)
	1. ALU
4. Memory access (MEM)
	1. Source: Data Memory (DM)
5. Write back (WB)

## Timing
Equation for time it takes to execute $n$ instructions in a $k$ stage pipeline assuming no stalls
$$
\text{Number of Clock Cycles } = n + k - 1
$$

## Hazards
Caused by Data Dependency (see Tags)

### 1. Types of Hazards
##### Structural Hazard
>when a planned instruction cannot execute in the proper clock cycle because the hardware does not support the combination of instructions that are set to execute
#### Data Hazard
> when a planned instruction cannot execute in the proper clock cycle because data that is needed to execute the instruction are not yet available
##### Load-use data hazard
> a specific form of data hazard in which the data being loaded by a load instruction has not yet become available when it is needed by another instruction
##### Control Hazard (branch hazard)
> When the proper instruction cannot execute in the proper pipeline clock cycle because the instruction that was fetched is not the one that is needed; that is, the flow of instruction addresses is not what the pipeline expected.
### 2. Methods to resolve Hazards
##### Instruction reordering
- changing the order of instruction to resolve data dependency issues
##### Forwarding (bypassing)
- a method of resolving a data hazard by retrieving the missing data element from internal buffers rather than waiting for it to arrive form programmer-visible registers of memory
##### Pipeline stall (bubble)
- a stall initiated to resolve a hazard
NOP
> an instruction that does no operation to change state
##### Branch Prediction
- A method of resolving a branch hazard that assumes a given outcome for the conditional branch and proceeds from that assumption rather than waiting to ascertain the actual outcome
### 3. Hazard notations
1a. EX/MEM.RegisterRd = ID/EX.RegisterRn1
1b. EX/MEM.RegisterRd = ID/EX.RegisterRm2
2a. MEM/WB.RegisterRd = ID/EX.RegisterRn1
2b. MEM/WB.RegisterRd = ID/EX.RegisterRm2

Rn1 = first source operand
Rm2 = second source operand

## Terminology
###### Latency (Pipeline)
> The number of stages in a pipeline or the number of stages between two instructions during execution
# References