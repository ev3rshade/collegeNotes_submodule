Opened 05-03-2026 11:24

Status:

Tags: [[! cs471 Intro to Machine Learning]]

# + bayesian networks
a technique for describing complex join distributions (models) using simple local distributions (conditional probabilities)
- graphical model
- model of local interactions of variables
- local interactions chain to create global interactions


---
## Characteristics

**Topology** (Graph)
network is represented by directed acyclic graph (DAG)
- **Nodes**: random variables with domains
- **Edges**: interactions
	- Indicates: "direct influence" between variables
	- Formally: encode conditional independence


**Local Conditional Probabilities**
each node in graph has an associated Conditional Probability Table (CPT) that specifies that probability of that variable given all possible combinations of its parents' values

$$
P(x_1, x_2, ..., x_3) = \prod_{i=1}^{n} P(x_i | parents(X_i))
$$


---
## D-separation

**Active**
nodes allow influence

**Inactive**
nodes blocking influence


**Casual chain** $(A \rightarrow B \rightarrow C)$
active if $B$ is unobserved; inactive if $B$ is observed
--**Markov Assumption**: the future and past are independent given the present

**Common Cause** $(A \leftarrow B \rightarrow C)$
active if $B$ is unobserved; inactive if $B$ is observed

**Common Effect/V-Structure** $(A \rightarrow B \leftarrow C)$
active if $B$ or a descendant is observed; inactive if neither $B$ nor any of its descendants are observed

**Markov Blanket**
a statistical boundary that separates a set of nodes using a node's parents, children, and children's other parents--internal state is the only thing that matters




---
## Inference
calculating some useful quantity from a joint probability distribution


### Exact Inference

**Inference by Enumeration**

General case:
- Evidence variables:  $E_1...E_k=e_1...e_k$
- Query* variable:      $Q$
- Hidden Variables:    $H_1...H_r$

- Goal: $P(Q|e_1...e_k)$

The idea:
1. Select the entries consistent with evidence
2. Sum out H to get join query and evidence
3. Normalize $\times \dfrac{1}{\mathbb{Z}}$
	1. $\mathbb{Z} = \sum_q P(Q, e_1...e_k)$
	2. $P(Q|e_1..e_k) = \dfrac{1}{\mathbb{Z}} P(Q, e_1...e_k)$



**Variable Elimination (VE)**
interleaves **joining** factors and **marginalizing** (summing out) hidden variables
--eliminates one-by-one, avoids making full joint table


Procedural outline:
1. Start with initial factors
2. Pick hidden variable H
3. Join factors -- combine factors over the joining variable (see step 2), building a new factor over the union of the variables involved
4. Marginalize -- take a factor and sum out a variable (shrink factor to smaller one)
5. Above two can apply to multiple variables as well
6. Join remaining factors and normalize $\dfrac{1}{\mathbb{Z}}$


**Evidence**
if evidence is presented, start with factors that select evidence


### Approximate Inference (stochastic simulation/sampling)

sample generation is linear (efficient) tho general probabilistic inference isn't

> **why approximate inference?**
> inference in singly connected networks is linear. but many networks are not singly connected. instead its exponential, and so ppl trade error for more manageable inference


**Simple Sampling**
variables are instantiated sequentially according to their CPTs, beginning with nodes that have no parents

steps
0. you are given a network with no evidence
1. begin with nodes w/out parents
2. sample from conditional probability distributions sequentially to instantiate all nodes
	1. produces one sample
3. do this many times to produce empirical distribution that approximates full distribution

benefits: works well for empty network | simple | num samples -> inf, estimated distribution approaches the true posterior

problems: we almost always have evidence --> opportunity to optimize

**Rejection Sampling**
follows simple sampling but discards any sample that does not match the observed evidence. This is inefficient if the evidence is rare ($P(e)$) is small)

**Likelyhood Weighting**
weights each sample based on evidence. more efficient than rejection sampling, but performance can degrade as num of evidence vars increase




---
# References