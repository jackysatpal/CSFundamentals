## Circular Linked List

A linked list in which all nodes are connected and last node points to the first node (head) to form a circle and we can only go in one direction is called Circular Singly Linked List.

The first node is used to traverse the list and called as HEAD and last node points to the first node.
Node can contain only data and next field which point to the next node. 

### Advantages

1. If we are at a node then we can go to any node. But in Singly Linked List, it was not possible. 
2. It saves time when we have to go to the first node from the last node. It can be done in single step because there is no need to travese between the nodes. 

### Disadvantages

1. Problem of infinite loop can occur if proper implementation is not done. 