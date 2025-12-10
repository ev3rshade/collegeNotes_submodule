- Basic runtime calculations
- BIG OMEGA vs BIG O
- Misreading a sequence of numbers
- Proof without using recursive definition
- substitute given values


The largest node on a left-leaning red black tree is one of the right children of a tree node with no right child. The node cannot be red as red nodes cannot exist on the right side of a left leaning tree.

Suppose a node is red. By the definition of a left leaning red black tree, by the definition of a left leaning rb tree it must be the left child of a node. However, by the definition of a llrbt the left child of a node is less than the parent contradicting our statement that the max key is a red node.