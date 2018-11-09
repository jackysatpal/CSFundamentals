## Array

Array is a static data structure consisting of collection of same elements, each array element is identified by its index. Array is also known for its random access property. In Java, Array is an object. To access array length we use, ```array.length``` property. It can cause ```IndexOutOfBoundsException()``` if we try to add a value if the array if full. 

The problem with array is that if we want to add a new value to a particular index then we might have to shift all it's index to the right. Similarly if we want to remove a value then we might have to shift all it's index to the left. Due to this, insertion and deletion is difficult on Array. 

### Best used for

Excessive read (because of random access) as time complexity of read operation is always O(1);

### Advantages

1. We can get value of an element in constant time if we know it's index.
2. We can represent multiple values by using single variable.

### Disadvantages

1. Arrays are fixed in length. That means, once we create an array then we can not increase or decrease array's length. 
2. Array can hold only homogeneous datatype.
3. No built-in methods are available.

### Initialization and Declaration of Array

```java
datatype[] array = new datatype[length];
datatype[] array = {1, 3, 4, 5};
int length = array.length;

Student[] s = new Student[5];
s[0] = new Student();
```

### Complexity

 Operations | Time Complexity
 --- | ---
Access | O(1)
Insert | O(n)
Delete | O(n)
Search | O(n)

If you create an array with size n then it's space complexity would be O(n).