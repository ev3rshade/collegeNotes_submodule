10-23-2025 13:30

Tags: 
[[Textbook - Numerical-Method-Design-Analysis-and-Computer-Implementation-of-Algorithms.pdf]]
**Chapter 7, Section 7.2: Gaussian Elimination**

# 📚Lecture 17 Linear Systems of Equations

**Problem:** Solve an $n \times n$ system of linear equations, $A\mathbf{x}=\mathbf{b}$[cite: 6]. [cite_start]$A$ and $\mathbf{b}$ are known, and we need to compute the vector $\mathbf{x}$[cite: 8].

---

## 📐 Solving Triangular Systems

### Diagonal Matrix
[cite_start]If matrix $A$ is **diagonal**, the system of equations can be solved by simple division[cite: 15].

$$
[cite_start]A = \begin{pmatrix} 2 & 0 & 0 \\ 0 & 3 & 0 \\ 0 & 0 & 4 \end{pmatrix} \tag{Example Diagonal A} [cite: 9, 12, 13, 14]
$$

### Lower Triangular Matrix: Forward Substitution

For a system with a **lower triangular matrix** $A$:

$$
[cite_start]A = \begin{pmatrix} 2 & 0 & 0 \\ 1 & 3 & 0 \\ 2 & 1 & 5 \end{pmatrix} [cite: 16, 19, 20, 21] [cite_start]\quad \text{and} \quad \mathbf{b} = \begin{pmatrix} 2 \\ 4 \\ 8 \end{pmatrix} [cite: 22, 25, 26, 27]
$$

[cite_start]The solution $\mathbf{x}$ is found using **Forward Substitution**[cite: 33]:
* [cite_start]$2x_1 = 2 \implies \mathbf{x_1 = 1}$ [cite: 29]
* [cite_start]$x_1 + 3x_2 = 4 \implies 3x_2 = 4 - x_1 = 3 \implies \mathbf{x_2 = 1}$ [cite: 30]
* [cite_start]$2x_1 + x_2 + 5x_3 = 8 \implies 2(1) + 1 + 5x_3 = 8 \implies 5x_3 = 5 \implies \mathbf{x_3 = 1}$ [cite: 31, 32]

### Upper Triangular Matrix: Backward Substitution

[cite_start]A system with an **upper triangular matrix** is solved using **Backward Substitution**[cite: 39].

$$
[cite_start]A^{\prime} = \begin{pmatrix} 2 & 1 & 2 \\ 0 & 3 & 1 \\ 0 & 0 & 5 \end{pmatrix} [cite: 35, 36, 37, 38]
$$

---

## 🧱 LU Factorization ($A=LU$)

[cite_start]The goal is to factor $A$ into the product of a **lower triangular matrix** $L$ and an **upper triangular matrix** $U$[cite: 53, 60].

### Solving $A\mathbf{x}=\mathbf{b}$ via $LU$

1.  [cite_start]Set $U\mathbf{x}=\mathbf{y}$[cite: 56].
2.  [cite_start]Solve the lower triangular system $L\mathbf{y}=\mathbf{b}$ for $\mathbf{y}$ using **Forward Substitution**[cite: 57].
3.  [cite_start]Solve the upper triangular system $U\mathbf{x}=\mathbf{y}$ for $\mathbf{x}$ using **Backward Substitution**[cite: 58, 59].

### Example Factorization (Without Pivoting)

Given matrix $A$:
$$
[cite_start]A = \begin{pmatrix} 4 & 4 & 8 \\ 2 & 8 & 7 \\ 1 & 3 & 6 \end{pmatrix} [cite: 40, 43, 44, 45, 63, 64, 65, 66]
$$

[cite_start]The factorization uses **Elementary Lower Triangular (ELT) matrices**, $L_i$[cite: 61, 62].

1.  **Eliminate Column 1** using $L_1$:
    $$
    [cite_start]L_1 = \begin{pmatrix} 1 & 0 & 0 \\ -1/2 & 1 & 0 \\ -1/4 & 0 & 1 \end{pmatrix} [cite: 70, 72, 73, 74] [cite_start]\quad \implies \quad A_1 = L_1A = \begin{pmatrix} 4 & 4 & 8 \\ 0 & 6 & 3 \\ 0 & 2 & 4 \end{pmatrix} [cite: 78, 79, 80, 81, 82]
    $$

2.  **Eliminate Column 2** using $L_2$:
    $$
    [cite_start]L_2 = \begin{pmatrix} 1 & 0 & 0 \\ 0 & 1 & 0 \\ 0 & -1/3 & 1 \end{pmatrix} [cite: 84, 86, 87, 88] [cite_start]\quad \implies \quad U = A_2 = L_2A_1 = \begin{pmatrix} 4 & 4 & 8 \\ 0 & 6 & 3 \\ 0 & 0 & 3 \end{pmatrix} [cite: 90, 91, 92, 93, 94]
    $$
    [cite_start]Thus, $U = L_2 L_1 A$[cite: 97, 103].

### Finding $L$

[cite_start]The inverse of an ELT matrix is obtained by changing the sign of the subdiagonal elements in its non-trivial column[cite: 115, 126].

* [cite_start]$L_1^{-1} = \begin{pmatrix} 1 & 0 & 0 \\ 1/2 & 1 & 0 \\ 1/4 & 0 & 1 \end{pmatrix} [cite: 110, 112, 113, 114]$
* [cite_start]$L_2^{-1} = \begin{pmatrix} 1 & 0 & 0 \\ 0 & 1 & 0 \\ 0 & 1/3 & 1 \end{pmatrix} [cite: 121, 123, 124, 125]$

[cite_start]Since $A = (L_2 L_1)^{-1} U$, the lower triangular matrix is $L = L_1^{-1} L_2^{-1}$[cite: 128, 129]:

$$
[cite_start]L = \begin{pmatrix} 1 & 0 & 0 \\ 1/2 & 1 & 0 \\ 1/4 & 1/3 & 1 \end{pmatrix} [cite: 130, 131, 132, 133]
$$

### Solution Check

Given $\mathbf{b} = [4; 5; [cite_start]5]$[cite: 46]:
1.  Solve $L\mathbf{y}=\mathbf{b}$ (Forward Substitution):
    $$
    [cite_start]\mathbf{y} = \begin{pmatrix} 4 \\ 3 \\ 3 \end{pmatrix} [cite: 150, 151, 152, 153, 154]
    $$
2.  Solve $U\mathbf{x}=\mathbf{y}$ (Backward Substitution):
    $$
    [cite_start]\mathbf{x} = \begin{pmatrix} -1 \\ 0 \\ 1 \end{pmatrix} [cite: 155, 156, 157, 158, 159, 160]
    $$

---

## 🔄 Pivoting for Numerical Stability

[cite_start]**Pivoting** (exchanging rows or columns) is needed because Gaussian Elimination (GE) fails if a diagonal element is zero (e.g., $B = [0\ 1; 1\ 2]$)[cite: 140, 142, 144, 145, 146]. [cite_start]More generally, if the diagonal element is close to zero, $LU$ factorization will be **numerically unstable**[cite: 147].

[cite_start]The idea of **Partial Pivoting** (Row Pivoting) is to move the largest element in the current column's diagonal and subdiagonal positions to the diagonal element using a **Permutation Matrix** ($P$)[cite: 161, 169, 170].

Given matrix $A$:
$$
[cite_start]A = \begin{pmatrix} 1 & 3 & 6 \\ 4 & 4 & 8 \\ 2 & 8 & 7 \end{pmatrix} [cite: 163, 166, 167, 168]
$$

1.  **Pivoting on Column 1:** Exchange rows 1 and 2 using $P_1$:
    $$
    [cite_start]P_1 = \begin{pmatrix} 0 & 1 & 0 \\ 1 & 0 & 0 \\ 0 & 0 & 1 \end{pmatrix} [cite: 172, 174, 175, 176] [cite_start]\quad \implies \quad A_1 = P_1A = \begin{pmatrix} 4 & 4 & 8 \\ 1 & 3 & 6 \\ 2 & 8 & 7 \end{pmatrix} [cite: 177, 178, 179, 180, 181]
    $$

2.  **Elimination on Column 1** using $L_1$:
    $$
    [cite_start]L_1 = \begin{pmatrix} 1 & 0 & 0 \\ -1/4 & 1 & 0 \\ -1/2 & 0 & 1 \end{pmatrix} [cite: 187, 189, 190, 191, 192, 193] [cite_start]\quad \implies \quad A_2 = L_1A_1 = \begin{pmatrix} 4 & 4 & 8 \\ 0 & 2 & 4 \\ 0 & 6 & 3 \end{pmatrix} [cite: 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204]
    $$

3.  **Pivoting on Column 2:** Exchange rows 2 and 3 of $A_2$ using $P_2$:
    $$
    [cite_start]P_2 = \begin{pmatrix} 1 & 0 & 0 \\ 0 & 0 & 1 \\ 0 & 1 & 0 \end{pmatrix} [cite: 205, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216] [cite_start]\quad \implies \quad A_3 = P_2A_2 = \begin{pmatrix} 4 & 4 & 8 \\ 0 & 6 & 3 \\ 0 & 2 & 4 \end{pmatrix} [cite: 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227]
    $$

4.  **Elimination on Column 2** using $L_2$:
    $$
    [cite_start]L_2 = \begin{pmatrix} 1 & 0 & 0 \\ 0 & 1 & 0 \\ 0 & -1/3 & 1 \end{pmatrix} [cite: 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238] [cite_start]\quad \implies \quad U = A_4 = L_2A_3 = \begin{pmatrix} 4 & 4 & 8 \\ 0 & 6 & 3 \\ 0 & 0 & 3 \end{pmatrix} [cite: 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250]
    $$

### Resulting $L$ Matrix

[cite_start]The final upper triangular matrix is $U = L_2 P_2 L_1 P_1 A$[cite: 251].

[cite_start]The permuted lower triangular matrix $L$ is calculated as $L=\text{inv}(P_1)\cdot\text{inv}(L_1)\cdot\text{inv}(P_2)\cdot\text{inv}(L_2)$[cite: 253]:

$$
[cite_start]L = \begin{pmatrix} 1/4 & 1/3 & 1 \\ 1 & 0 & 0 \\ 1/2 & 1 & 0 \end{pmatrix} [cite: 254, 255, 256, 257, 258, 259, 260, 261, 262, 263]
$$

$L$ is considered a **permuted lower triangular matrix** (psychologically triangular). [cite_start]Moving the first row to the bottom of the matrix would yield a standard lower triangular matrix[cite: 264, 265].

[cite_start]The solution of the system $A\mathbf{x}=\mathbf{b}$ with pivoting will be covered in HW 6[cite: 267].