# ArrayList

ArrayList is an object which can increase or decrease its size dynamically. Underneath we are using a static array only. When the arrayList reaches its max capacity then a new array is created with a new size and content of the old array is copied into new array. Once this is done then we add one value to the new array. This process is repeated if the size is full and we have to add more elements. Hence it is known as Dynamically Array or Resizeable Array. 

### Best use for

Excessive read, as time complexity of read is always O(1);

### How the length is calculated

Formula: newLength = ((oldLength * 3) / 2) + 1


### Constructors

1. ArrayList():
```java
ArrayList<String> = new ArrayList<String>();
```
It creates an empty arraylist object with default initial capacity 10.  

2. ArrayList(int initialCapacity):
```java
ArrayList<String> = new ArrayList<String>(100);
```
It creates an empty arrayList object with specified capacity. 

### Methods

Following are few methods:  

1. add(E element)
2. add(int index, E element)
3. clear()
4. contains(Object o)
5. ensureCapacity(int minCapacity) --> This increases the capacity of the ArrayList
6. size() --> return the number of elements in the ArrayList
7. get(int index) --> returns the element at the specified position