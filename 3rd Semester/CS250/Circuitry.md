10-30-2025 01:18

Status: #cs250 #fixFirst

Tags: [[Computer Hardware]]

# Circuitry

## Basics
#### Signals
###### States
Asserted
- The signal is logically high or true
Deasserted
- The signal is logically low or false

Rising 0 -> 1
Fallng 1-> 0

##### Signal Selection
###### Multiplexor
Control signal
> a signal used for multiplexor selection or for directing the operation of a functional unit (NOT the same as *data signal*)
- Different control signals are determined at different pipeline stages




## Logic design
#### Combinational elements
> A datapath element whose output values depend only on the present input values
- AND
- ORR
#### Arithmetic Logic Unit (ALU)
> fundamental digital circuit within a computer's Central Processing Unit (CPU) that performs arithmetic and logical operations on binary numbers

> Hardware that performs addition, subtraction, and usually logical operations such as AND and OR.
- Controlled with an ALU operation signal which is 4 bits wide

#### State elements
> A datapath element that has internal storage
- Register
- Memory
- Clock input




## Basic building blocks
#### Transistor
> an on/off switch controlled by an electric signal (made from silicon wafers)

**Very large-scale integrated (VLSI) circuit** -  A device containing hundreds of thousands to millions of transistors.
## Components

#### ALU
tags: Datapath element
#### Multiplexer - MUX
tags: Datapath element
- bottom input comes from ALU output. bottom input is passed to instruction performing ALU operation
- top input comes from the data memory. During a load, the data read from data memory gets loaded into a register in the register file.
#### Decoder

#### Gates
#### S'R' Latch

#### Clock

### Memory components
#### Instruction memory
#### Registers
##### Program counter (PC)

#### (forgot word) memory #revise

## [[Clock + Timing]]

## Terminology
Control signal
> A signal used for multiplexor selection or for directing the operation of a functional unit; contrasts with a _data signal_, which contains information that is operated on by a functional unit.
> - Asserted: The signal is logically high or true.
> - Deasserted: The signal is logically low or false.

Datapath element
> A unit used to operate on or hold data within a processor. In the LEGv8 implementation, the datapath elements include the instruction and data memories, the register file, the ALU, and adders.


# References