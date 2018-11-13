## Binary Tree

A binary tree is a tree data structure in which each node can have at most two children, which are referred to as the left child and the right child. 

### Example:

![Binary Tree Example](./images/BinaryTreeExample.PNG)

### Types of Binary Tree

1. Strict/Proper/full Binary Tree

In this tree, every nodes other than leaves, can have either 2 or 0 children.

2. Complete Binary Tree

A complete binary tree is a binary tree in which every level, except possibly the last is, completely filled, and all nodes are as far left as possible.

3. Perfect Binary Tree

A perfect binary tree is a binary tree in which all interior nodes have two children and all leaves have the same depth.

4. Balanced Binary Tree

A balanced binary tree is a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

### Tree Traversal

Tree traversal refers to the process of visiting each node exactly once. Such traversal are classified by the order in which the nodes are visited. Traversing a tree involves iterating over all nodes in some manner. Because from a given node there is more than one possible next node, some nodes must be deferred - stored in some way for later visiting. This is often done via a stack (LIFO) or queue (FIFO).

1. Pre-order Traversal

* Dispaly the data part of the root/current node.
* Traverse the left subtree by recursiverly calling the preorder function.
* Traverse the right subtree by recursiverly calling the postorder function.

2. In-order Traversal

* Traverse the left subtree by recursiverly calling the preorder function.
* Dispaly the data part of the root/current node.
* Traverse the right subtree by recursiverly calling the postorder function.

3. Post-order Traversal

* Traverse the left subtree by recursiverly calling the preorder function.
* Traverse the right subtree by recursiverly calling the postorder function.
* Dispaly the data part of the root/current node.

4. Level-order Traversal

Trees can also be traversed by using level-order, where we visit each node on a leve before going to a lower level. This search is referred to as Breadth-First-Search (BFS), as the search tree is broadened as much as possible on each depth before going to the next depth.