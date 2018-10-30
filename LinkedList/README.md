## LinkedList

LinkedList is a linear collection of data elements, whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisiting of nodes which together represents a sequence. They are not stored sequentially in the memory. 

In its most basic form, each node contains data and a reference (in other words, a link) to the next node in the sequence. This structure allows for efficient insertion or removal of elements from any position in the sequence using iteration. 

Linked list can be singly, doubly or circular. 

### Advantages 

1. It can grow or shrink at runtime. 
2. Insertion and deletion operations are faster as compared to Array. 
3. There is no memory wastage as the list can grow or shrink at runtime. So we don't need to mention the size of the list. 

### Disadvantages 

1. They use more memory than arrays because of the storage used by their references. 
2. There is no random access memory. We have to access elements sequentially starting from the first node. 

### Complexity

Operation | Time Complexity 
--- | --- 
Access | O(n) 
Search | O(n) 
Insertion | O(1) 
Deletion | O(1) 

Space Complexity of Linked List is O(n)
