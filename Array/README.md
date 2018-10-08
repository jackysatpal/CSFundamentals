# Array

Array is a data structure consisting of collection of same elements, each array element is identified by its index. 
To access array length we use, ```array.length``` property.
It can cause ```IndexOutOfBoundsException()``` if we try to add a value if an array if full. 

### Advantages

1. We can get value of an element if we know it's index.
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