Opened 03-22-2026 02:59

Status:

Tags: [[+ logic]]

# First Order Logic
Assumes world contains Facts, Objects, Relations, Functions

---
## Consists of

**Predicates**

**Functions**

**Variables**

**Connectives**

**Equality**

**Quantifiers**
Common Mistakes
- Using $\land$ as the main connective with $\forall$
- Using $\rightarrow$ as the main connective with $\exists$

---
## Propositionalization
FOL problems can be turned into prepositional logic

**Universal Instantiation (UI)** - substituting any variable with any ground term (a term that contains no variables)

**Existential Instantiation (EI)** - substituting a variable with a single new constant symbol (**Skolem Constant**) which does not appear elsewhere in the $KB$

This process can lead to an infinite number of terms if functions are present and often generates many irrelevant sentences

---
## Inference

**Lifted Inference**
working directly with variables to be more efficient
- **Unification** - a process of finding a substitution ($\theta$) that makes two different logical expressions identical. FOr any unifiable pair, there exits a unique **Most General Unifier (MGU)**
- **Generalized Modus Ponens** - a lifted version of Modus Ponens that uses unification to draw conclusions directly from FOL sentences

**Resolution**, **Forward Chaining**, **Backward Chaining** apply here too

# References