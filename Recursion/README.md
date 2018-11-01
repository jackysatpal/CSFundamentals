## Recursion

Recursion is the method of solving problem that involes breaking of a problem into smaller subproblem untill you get to a small enough problem that it can be solved trivally. 

### Three laws of Recursion

1. A recursive algorithm must have a base case.
2. A recursive algorithm must change its state and move toward the base case. 
3. A recursive algorithm must call itself, recursively.

* There are some problems which can be solved using Recursion only. For example, Tower of Hanoi can be solved recursively only. Some problems are easy when solved using Recursion. For example, Tree algorithms are easy when done by Recursion. 

* One of the common mistakes in Recursion is forgetting about the base case and forget about calling function recursively. Thus we get the StackOverflow errors.

### Examples

1. Tower of Hanoi
2. Binary Search
3. Merge Sort and Quick Sort
4. Tree algorithms

### Disadvantages of Recursion

* It may take more memory because of the call stack. Building up a stack of recursive calls consumes more memory temporarily, and the stack is limited in size. Thus it can cause StackOverflow errors. Because of this, space complexity of Recursion algorithms is atleast O(n).

### Guide to solve a Recursion problem

1. Assume that you got the solution of your smaller subproblem. Now solve for the original problem. 
2. Try to think about what is changing. For example, in the case of arrays, array's length is changing. In String operations, String's length is changing. Once identified then call your recursive function using that "changing" element. 
3. What is your base case. Do you need more than one base case?
