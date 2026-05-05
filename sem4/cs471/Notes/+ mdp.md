Opened 05-03-2026 11:53

Status:

Tags:
''
# Markov Decision Process (MDP)
non-deterministic search problems
"Markov" means that given the present state the future and past are independent
$$
P(S_{t+1} = s'|S_t = s_t, A_t = a_t, S_{t-1} = s_{t-1}, A_{t-1},...S_0 =s_0) = P(S_{t+1} = s'|S_t = s_t, A_t = a_t)
$$



---
## Characteristics

**Set of states** $s \in S$
Set of actions $a \in A$
**Transition function** $T(s, a, s)$
(model or the dynamics)
- probability that $a$ from $s$ leads to $s'$ ( $P(s' | s, a)$
**Reward Function** $R(s)$ or $R(s')$
**Start state** $s_0$
\[maybe a terminal state\]

**Policy** $pi$
**Utility** $\sum$ (discounted) rewards



---
## Value Iteration vs Policy Iteration

Value Iteration
- updates both the values and (implicitly) the policy
- We don't track the policy, but taking the max over actions implicitly recomputes it

Policy Iteration
- We do several passes that update utilities with fixed policy
- After the policy is evaluated, a new policy is choseen (slow like a value iteration pass)
- the new policy will be better (or we're done)




---
## Summary: MDP Algorithms
- Computer optimal values: use value iteration or policy iteration
- Compute values for a particular policy: use policy evaluation
- Turn your values into a policy: use policy extraction


- They are all variations of Bellman updates
- They all use one-step lookahead expectimax fragments
- They differ only in whether we plug in a fixed policy or max over actions

POLICIES CONVERGE MUCH FASTER THAN THE VALUE OF STATES



---
## Policies ($\pi$)
optimal policy $\pi^*: S \rightarrow A$
- policy $pi$ gives an action for each state
- an optimal policy is one that maximizes expected utility if followed
- an explicit policy defines a reflex agent




---
## Utility

Additive Utility
$$
U([r_0, r_1, r_2,...]) = r_0 + r_1 + r_2 +...
$$
Discounted Utility
$$
U([r_0, r_1, r_2,...]) = r_0 + \gamma r_1 + \gamma^2 r_2
$$
- reasonable to maximize the sum of rewards
- reasonable to **prefer rewards now** to rewards later
- SOLUTION: value of rewards decays exponentially --> every time level descends multiply in the discount once


**Infinite Utility**
Solutions
- Finite Horizon: Terminate episodes after fixed T steps--gives non-stationary policies
- Discounting: smaller $\gamma$ means shorter term focus
- Absorbing State: guarantee that for every policy, a terminal state will eventually be reached (like "overheated" for racing)




---
## Optimal Quantities

$V^*(s)$ = expected utility starting in s and acting optimally

$Q^*(s,a)$ = expected utility starting out having taken action $a$ from state $s$ and acting optimally (thereafter)

$\pi^*(s)$ = optimal action from state $s$ (that is, the action $a$ from state $s$ that maximizes $Q^*(s,a)$)



---
## Search Tree

each MDP state projects an expectimax-like search tree


**Value of States**

Compute the (expectimax) value of a state
- expected utility under optimal action
- Average sum of (discounted) rewards

Recursive definitions
$V^*(s) = \max_a Q(^*(s,a)$
$Q^*(s,a) = \sum_{s'} P(s'|s,a)[R(s,a,s') + \gamma V^*(s')]$
$V^*(s) = \max_a \sum_{s'} P(s'|s,a)[R(s,a,s') + \gamma V^*(s')]$


Optimizations
- Only compute needed quantities once
- Do a depth-limited computation, but with increasing depths until change is small


![[Screenshot_20260504_120232.png]]



**Value Iteration**

$V_0(s) = 0$
no time steps left means an expected reward sum of zero

$V_{k + 1}(s) \leftarrow \max_{a} \sum_{s'} P(s'|s, a)[R(s,a,s') + \gamma V_k(s')]$
Given vector


---
## Terminology

**Noisy Movement**: actions do not always go as planned



---
# References