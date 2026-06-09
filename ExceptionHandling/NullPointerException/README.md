# NullPointerException in Java

## Definition

NullPointerException is an unchecked exception that occurs when a program attempts to access a method, variable, or object member using a null reference.

## Syntax

```java
try {
    // code that may throw NullPointerException
}
catch (NullPointerException e) {
    // exception handling code
}
```

## Example Program

```java
public class NullPointerExceptionDemo {
    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("Object reference is null");
        }
    }
}
```

## Output

```
Object reference is null
```

## Step-by-Step Explanation

1. A String reference variable is assigned null.
2. The program attempts to call the length() method.
3. Since the reference does not point to any object, JVM cannot execute the method.
4. JVM throws NullPointerException.
5. Control transfers to the catch block.
6. The exception is handled successfully.

## Real-Time Example

```java
Student s = null;
s.display();
```

If the object is not created and we call a method using that reference, NullPointerException occurs.

## Common Causes

- Calling a method on a null object.
- Accessing instance variables using a null reference.
- Auto-unboxing a null wrapper object.

## Key Points

- NullPointerException belongs to the java.lang package.
- It is an unchecked exception.
- It occurs at runtime.
- It can be handled using try-catch blocks.

### What is NullPointerException?

NullPointerException occurs when we try to access methods or variables using a reference variable that points to null.

### Why does NullPointerException occur?

Because the reference variable does not point to any object in memory.

## Conclusion

NullPointerException occurs when a null reference is used to access object members. Proper object initialization can prevent this exception.
