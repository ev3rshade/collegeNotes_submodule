🟢 Probability Fundamentals

- **Basic Concepts:** Sample space ($\Omega$), events, random variables, and probability measures ($P$).
- **Expectations:** Calculating the expected value of a random variable as a weighted average.
- **Joint and Marginal Distributions:**
    - **Joint Distribution:** Probabilities for all combinations of variable assignments.
    - **Marginalization:** Eliminating variables by "summing out" collapsed rows in a distribution table.
- **Conditional Probabilities:** The relationship between joint and marginal probabilities.
- **Probability Rules:**
    - **Product Rule:** $P(x, y) = P(x|y)P(y)$.
    - **Chain Rule:** Decomposing any joint distribution into a product of conditional distributions.
    - **Independence:** Defining absolute and conditional independence to simplify models.

🟡 Bayesian Networks (BNs)

- **Representation and Semantics:**
    - Using Directed Acyclic Graphs (DAGs) to encode conditional independence assumptions.
    - **Topology:** Nodes represent variables; edges represent "noisy causal" processes.
    - **CPTs:** Conditional Probability Tables for each node given its parents.
- **Independence in BNs:**
    - **D-Separation:** An algorithm to determine if nodes are independent given evidence by checking active/inactive triples.
    - **Member Triples:** Causal chains ($A \rightarrow B \rightarrow C$), common causes ($A \leftarrow B \rightarrow C$), and common effects/v-structures ($A \rightarrow B \leftarrow C$).
    - **Markov Blanket:** A node is independent of the rest of the graph given its parents, children, and children's other parents.
- **Inference:**
    - **Exact Inference:** Inference by enumeration (slow) and **Variable Elimination** (interleaving joining and marginalizing).
    - **Approximate Inference (Sampling):** Simple sampling, **Rejection Sampling** (discarding samples inconsistent with evidence), and **Likelihood Weighting**.

🔴 Markov Decision Processes (MDPs)

- **Problem Formulation:** Defined by states ($S$), actions ($A$), transition function ($T$), reward function ($R$), and discount factor ($\gamma$).
- **Optimal Quantities:**
    - __$V^*(s)$: Optimal value (expected utility) of a state.
    - __$Q^*(s, a)$: Optimal value of a state-action pair (q-state).
    - __$\pi^*(s)$: Optimal policy (action that maximizes expected utility).
- **The Bellman Equation:** Recursive definition characterizing optimal values.
- **Algorithms:**
    - **Value Iteration:** Iteratively updating state values until convergence.
    - **Policy Evaluation:** Calculating values for a fixed, non-optimal policy.
    - **Policy Iteration:** Alternating between policy evaluation and policy improvement.

🔴 Reinforcement Learning (RL)

- **Context:** Learning to act when the transition model ($T$) or reward function ($R$) is unknown.
- **Learning Paradigms:**
    - **Model-Based:** Estimating $T$ and $R$ from experience first, then solving the MDP.
    - **Model-Free:** Learning values or Q-values directly without estimating the model.
- **Passive RL:** Learning state values while following a fixed policy (e.g., **Temporal Difference (TD) Learning**).
- **Active RL:**
    - **Q-Learning:** Sample-based Q-value iteration that allows for model-free action selection.
    - **Exploration vs. Exploitation:** The tradeoff between trying new actions and using known good actions, often managed by **exploration functions**.
- **Approximate Q-Learning:** Using **feature-based representations** to generalize learning across large state spaces by updating feature weights.

🔴 Supervised and Deep Learning

- **Supervised Learning Overview:** Learning a mapping from inputs (features) to outputs (targets/labels).
    - **Classification:** Categorical outputs.
    - **Regression:** Real-valued outputs.
- **K-Nearest Neighbors (KNN):** Classification based on the majority label of the $K$ closest training examples.
- **Deep Learning:** Models composed of layers of differentiable functions.
- **Optimization:** Using loss functions (Quadratic, log, or 0/1 loss) to evaluate and improve model parameters.