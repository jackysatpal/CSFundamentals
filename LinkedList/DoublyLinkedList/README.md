## Doubly Linked List

A linked list in which we can go to next as well as previous directions is called Doubly Linked List. 
The first node is used to traverse the list and called as HEAD and last node points to the null.

Node can contain data, next reference which points to the next node and previous reference which point to the previous node. 

### Advantages 

1. We can travese the list in both the direction i.e. forward and backward.
2. If we are at a node then we can go to any node. In the case of Singly Linked List, it was not possible.
3. Delete operation is efficient as we can go to the previous node easily.

### Disadvantages

1. It requires more memory because now we are storing 2 references. 
2. All operations requires more pointers maintained/changed. 