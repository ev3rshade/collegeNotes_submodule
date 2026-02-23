Opened 01-19-2026 14:24

Status:

Tags: [[🟡 Assembly]]

Prev Note:  [Assembly](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2F%F0%9F%94%B4%20Assembly) Next Note: [x86-64 Register View](obsidian://open?vault=Ken%201.0&file=6%20Full%20Notes%2FCollege%20Notes%2FSem%204%2FCS252%2FNotes%2Fx86-64%20Register%20View)
# x86-64 Assembly Language

made by AMD to extend the x86 architecture to use 64 bits (migration to x86-64 bits)

#### Data Movement Instructions

| Instruction    | Effect                                  | Description                    |
| -------------- | --------------------------------------- | ------------------------------ |
| `movq S, D`    | `D ← S`                                 | Move quad word                 |
| `movabsq I, R` | `R ← I`                                 | Move quad word                 |
| `movslq S, R`  | `R ← SignExtend(S)`                     | Move sign-extended double word |
| `movsbq S, R`  | `R ← SignExtend(S)`                     | Move sign-extended byte        |
| `movzbq S, R`  | `R ← ZeroExtend(S)`                     | Move zero-extended byte        |
| `pushq S`      | `R[%rsp] ← R[%rsp] − 8; M[R[%rsp]] ← S` | Push                           |
| `popq D`       | `D ← M[R[%rsp]]; R[%rsp] ← R[%rsp] + 8` | Pop                            |
#### Arithmetic and Logical Instructions

|Instruction|Effect|Description|
|---|---|---|
|`leaq S, D`|`D ← &S`|Load effective address|
|`incq D`|`D ← D + 1`|Increment|
|`decq D`|`D ← D − 1`|Decrement|
|`negq D`|`D ← −D`|Negate|
|`notq D`|`D ← ~D`|Complement|
|`addq S, D`|`D ← D + S`|Add|
|`subq S, D`|`D ← D − S`|Subtract|
|`imulq S, D`|`D ← D × S`|Multiply|
|`xorq S, D`|`D ← D ^ S`|Exclusive-or|
|`orq S, D`|`D ← D \| S`|Or|
|`andq S, D`|`D ← D & S`|And|
|`salq k, D`|`D ← D << k`|Left shift|
|`shlq k, D`|`D ← D << k`|Left shift (same as `salq`)|
|`sarq k, D`|`D ← D >> k`|Arithmetic right shift|
|`shrq k, D`|`D ← D >>> k`|Logical right shift|
#### Multiply and Divide Instructions
| Instruction | Effect                                                               | Description                 |
| ----------- | -------------------------------------------------------------------- | --------------------------- |
| `imulq S`   | `R[%rdx]:R[%rax] ← S × R[%rax]`                                      | Signed full multiply        |
| `mulq S`    | `R[%rdx]:R[%rax] ← S × R[%rax]`                                      | Unsigned full multiply      |
| `cltq`      | `R[%rax] ← SignExtend(R[%eax])`                                      | Convert `%eax` to quad word |
| `cqto`      | `R[%rdx]:R[%rax] ← SignExtend(R[%rax])`                              | Convert to oct word         |
| `idivq S`   | `R[%rdx] ← R[%rdx]:R[%rax] mod S`<br>`R[%rax] ← R[%rdx]:R[%rax] ÷ S` | Signed divide               |
| `divq S`    | `R[%rdx] ← R[%rdx]:R[%rax] mod S``R[%rax] ← R[%rdx]:R[%rax] ÷ S`     | Unsigned divide             |
#### Comparison and Test Instructions
|Instruction|Based on|Description|
|---|---|---|
|`cmpq S2, S1`|`S1 − S2`|Compare quad words|
|`testq S2, S1`|`S1 & S2`|Test quad word|
#### Conditional Move Instructions
| Instruction   | Synonym   | Move Condition     | Description                 |
| ------------- | --------- | ------------------ | --------------------------- |
| `cmove S, D`  | `cmovz`   | `ZF`               | Equal / zero                |
| `cmovne S, D` | `cmovnz`  | `~ZF`              | Not equal / not zero        |
| `cmovs S, D`  | —         | `SF`               | Negative                    |
| `cmovns S, D` | —         | `~SF`              | Nonnegative                 |
| `cmovg S, D`  | `cmovnle` | `~(SF ^ OF) & ~ZF` | Greater (signed >)          |
| `cmovge S, D` | `cmovnl`  | `~(SF ^ OF)`       | Greater or equal (signed ≥) |
| `cmovl S, D`  | `cmovnge` | `SF ^ OF`          | Less (signed <)             |
| `cmovle S, D` | `cmovng`  | `(SF ^ OF) \| ZF`  | Less or equal (signed ≤)    |
| `cmova S, D`  | `cmovnbe` | `~CF & ~ZF`        | Above (unsigned >)          |
| `cmovae S, D` | `cmovnb`  | `~CF`              | Above or equal (unsigned ≥) |
| `cmovb S, D`  | `cmovnae` | `CF`               | Below (unsigned <)          |
| `cmovbe S, D` | `cmovna`  | `CF \| ZF`         | Below or equal (unsigned ≤) |
#### Conditional Jump Instructions
| Mnemonic      | Required Flag State  | Description              |
| ------------- | -------------------- | ------------------------ |
| `JGE` / `JNL` | `SF = OF`            | Jump if greater or equal |
| `JNG`         | `ZF = 1 or SF ≠ OF`  | Jump if not greater      |
| `JLE`         | `ZF = 1 or SF ≠ OF`  | Jump if less or equal    |
| `JG` / `JNLE` | `ZF = 0 and SF = OF` | Jump if greater          |
#### Stack Position Mapping
| Stack Position | Register / Memory       |
| -------------- | ----------------------- |
| 0              | `rbx`                   |
| 1              | `r10`                   |
| 2              | `r13`                   |
| 3              | `r14`                   |
| 4              | `r15`                   |
| ≥ 5            | Use the execution stack |


#### C Types
| C declaration        | Intel data type       | GAS suffix | x86-64 Size (Bytes) |
|----------------------|----------------------|------------|---------------------|
| char                 | Byte                 | b          | 1                   |
| short                | Word                 | w          | 2                   |
| int                  | Double word          | l          | 4                   |
| unsigned             | Double word          | l          | 4                   |
| long int             | Quad word            | q          | 8                   |
| unsigned long        | Quad word            | q          | 8                   |
| char *               | Quad word            | q          | 8                   |
| float                | Single precision     | s          | 4                   |
| double               | Double precision     | d          | 8                   |
| long double          | Extended precision   | t          | 16                  |


# References
[[CS252-Slides-Sprin2026.pdf]] - Slides 17-21
[[CS250 WWW Main Page.docx.pdf]]
[[x86-64 Machine-Level Programming -handout.pdf]]