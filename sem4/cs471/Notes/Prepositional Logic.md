Opened 03-14-2026 12:38

Status:

Tags: [[+ logic]]

# Prepositional Logic

---
## Terminology

**Logics**
formal lang for representing info --> conclusions drawn

**Literals** 
any symbol or its negation
**Clauses**
literal $\lor$ literal $\lor$ ... $\lor$ literal

**Conjunctive Normal Form**
everything is $\land$ on the outside and $\lor$ on the inside, $\neg$ on the inside too (conjunction of **clauses**)

**Knowledge Base**
a set of logical **sentences** (true or false assertion that is atomic or complex)
--**Entailment** one thing follows another $KB |= \alpha$
--**Implication** the final conclusion reached after tracing the entailments

**Model**
mathematical abstraction of a possible state

**Inference**
procedure/algo to derive conclusions (uses entailment)
--**Soundness** - only entailed sentences are derived
--**Completeness** - any entailed sentence can be derived

---
# Characteristics of Sentences

**Syntax** - legal sentences
**Semantics** - meaning of sentences

**Atomic** - Proposition symbols (either true or false)
**Complex** - Proposition symbols with connecting symbols or a negation

---
## Satisfiability

**Valid** - true in all models
**Satisfiable** - true in some models
**Unsatisfiable** - false in all models

---
## Proofs

**Proof by Inference** - apply inference rule to reach implication (rules below are horn form)
1. **RULE 1** Modus Ponens $\dfrac{\alpha \rightarrow \beta, \alpha}{\beta}$
2. **RULE 2** And-Elimination $\dfrac{\alpha \land \beta}{\alpha}$
3. **RULE 3** All logical equivalences can be used as inference rules

- **Monotonicity** - $KB \models \alpha$ then $KB \land \beta \models \alpha$


**Proof by Resolution** - show that $KB \land \neg \alpha$ is unsatisfiable
- Negate conclusion $\alpha$ and add to $KB$
- Convert sentences in $KB$ to CNF
- Repeatedly apply resolution inference rule

**Forward Chaining**
consider each rule whose premises are satisfied in $KB$ add conclusion to $KB$ until query is found
**Backwards Chaining**
Assume an implication and resolve clauses from there

---
# Active Recall

f24 midterm problem 6

What is the difference between Propositional Logic and First order Logic?
||Propositional Logic only assumes the world contains Facts only||

---
# References