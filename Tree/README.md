## Tree

A tree is a collection of nodes linked together to simulate hierarchical data. A tree is a recursive data structure. 

### Example:

![Tree Example](./treeExample.JPG)

In the above example, following observations can be made:

1. 1 is the root node of the tree.
2. 2 and 3 are child of the 1.
3. 4, 5 and 6 are child of 2. 
4. 7 and 8 are child of 3. 
5. 9 and 10 are child of 5. 
6. 11 is the child of 7.
7. 4, 9, 10, 6, 11 and 8 are leaf node.

### Vocabulary of the tree data structure

1. The topmost node in the tree is called root of the tree. 
2. Each node can contain some data and reference to the other node that can be called its children.
3. Nodes having same parent can be called as sibilings.
4. If a node has a direct link to other node, then we have a parent child relationship between the nodes.
5. Any node that does not have a child is called a leaf node. 
6. Each arrow is called link/edge.
7. If there are N nodes then there can be exactly N-1 links.

### Depth

Depth of some node X can be defined as length of the path from root to node X. Each edge will contribute one unit to the length. So we can say number of edges in path from root to X.

### Height

Height of a tree is defined as number of edges in longest path from root node to the leaf node. 
In the above example, height of the tree is 3.

### Types of Trees

1. Binary Tree
2. Binary Search Tree
3. AVL Tree
4. Trie
5. Red Black Tree

### Applications of Trees

1. To store naturally hierarchical data. Example: file system in computers.
2. To quickly search, insert and delete data.
3. Spell checking. 