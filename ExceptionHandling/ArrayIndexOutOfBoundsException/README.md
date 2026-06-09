# ArrayIndexOutOfBoundsException in Java

## Definition

ArrayIndexOutOfBoundsException is an unchecked exception that occurs when a program attempts to access an array element using an index that is outside the valid range of the array.

## Syntax

```java
try {
    // code that may throw ArrayIndexOutOfBoundsException
}
catch (ArrayIndexOutOfBoundsException e) {
    // exception handling code
}
```

## Example Program

```java
public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 88};

        try {
            System.out.println("Student Mark: " + marks[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Array contains only 4 elements.");
        }

        System.out.println("Program executed successfully.");
    }
}
```

## Output

```
Invalid index. Array contains only 4 elements.
Program executed successfully.
```

## Step-by-Step Explanation

1. An array named `marks` is created with 4 elements.
2. The valid indexes are 0, 1, 2, and 3.
3. The program tries to access `marks[5]`.
4. Index 5 does not exist in the array.
5. JVM throws an ArrayIndexOutOfBoundsException.
6. Control moves to the catch block.
7. The exception is handled and the program continues execution.

## Real-Time Example

Consider a student management system where marks are stored in an array.

```java
int[] marks = {85, 90, 78, 88};

System.out.println(marks[5]);
```

Since only 4 marks are available, accessing index 5 results in an exception.

## Common Causes

- Accessing an index greater than the array size.
- Accessing a negative index.
- Incorrect loop conditions.

Example:

```java
int[] arr = {1, 2, 3};

System.out.println(arr[-1]);
```

## Key Points

- ArrayIndexOutOfBoundsException belongs to the `java.lang` package.
- It is an unchecked exception.
- It occurs at runtime.
- It can be handled using try-catch blocks.
- Proper index validation helps prevent this exception.

### What is ArrayIndexOutOfBoundsException?

ArrayIndexOutOfBoundsException occurs when a program tries to access an array element using an invalid index.

### Why does ArrayIndexOutOfBoundsException occur?

It occurs because the specified index is outside the valid range of the array.

## Conclusion

ArrayIndexOutOfBoundsException is a runtime exception that occurs when an invalid index is used to access an array element. Using proper index checks can help avoid this exception.
