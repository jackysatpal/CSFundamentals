## Queue

A queue is an abstract data type in which elements are inserted and deleted via FIFO (first in first out) order. It has 2 main operations.
Enqueue(x): elements are inserted into one end called as Rear 
Dequeue(): elements are deleted from other end known as Front. 

### Implementation

Queue can be implemented as an array and linked list.

### Application

* Often used in Job Scheduler where first job is processed first and removed once its job is completed. Then second job will start its process.

Operations | Complexity
--- | ---
Enqueue | O(1)
Dequeue | O(1)
Peek | O(1)
isEmpty | O(1)
size | O(1)

Space complexity of queue is O(n).