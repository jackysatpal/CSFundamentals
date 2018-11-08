## Linked List

Linked List is a collection of nodes where each node points to the next node. Unlike Arrays, we don't need a contigous block of memory to store the Linked List because a single node has the address of the next node so we can traverse all the nodes. So nodes are stored anywhere in the memory. Hence Linked List is a dynamic data structure. 

In its most basic form, each node contains data and a reference (in other words, a link) to the next node in the sequence. This structure allows for efficient insertion or removal of elements from any position in the sequence using iteration. 

### Types of Linked List

1. Singly Linked List
2. Singly Circular Linked List
3. Doubly Linked List
4. Doubly Circular Linked List

### Arrays vs Linked List

If you know that you need to insert or delete elements frequently then Linked List are best. But if you need to constantly search elements then Arrays are best, because of the random access. 

### Advantages 

1. It can grow and shrink at runtime. 
2. Insertion and deletion operations are faster as compared to Array. 
3. There is no memory wastage as the list can grow or shrink at runtime. So we don't need to mention the size of the list. 

### Disadvantages 

1. They use more memory than arrays because of the storage used by their references. 
2. There is no random access memory. We have to access elements sequentially starting from the first node. 

### Complexity

Operation | Time Complexity 
--- | --- 
Traversal | O(n) 
Search | O(n) 
Insert at the start | O(1) 
Insert at the end | O(1) 
Insert anywhere | O(n) 
Delete at the start | O(1) 
Delete at the end | O(1) 
Delete anywhere | O(n) 

Space Complexity of Linked List is O(n)
