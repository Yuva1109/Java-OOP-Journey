# ArithmeticException in Java

## Definition

ArithmeticException is an unchecked exception that occurs when an illegal arithmetic operation is performed during program execution.

The most common cause of ArithmeticException is dividing a number by zero.

## Syntax

```java
try {
    // code that may throw ArithmeticException
}
catch (ArithmeticException e) {
    // exception handling code
}
```

## Example Program

```java
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
```

## Output

```
Cannot divide by zero
```

## Step-by-Step Explanation

1. The program enters the try block.
2. The statement `10 / 0` is executed.
3. Division by zero is not allowed in Java.
4. JVM throws an ArithmeticException.
5. Control transfers to the catch block.
6. The catch block handles the exception and prints the message.

## Real-Time Example

Consider a calculator application:

```java
int a = 100;
int b = 0;
int result = a / b;
```

If the user enters 0 as the denominator, Java throws an ArithmeticException.

## Common Causes

- Division by zero
- Modulus (%) operation with zero

Example:

```java
int x = 10 % 0;
```

This also throws ArithmeticException.

## Key Points

- ArithmeticException belongs to the java.lang package.
- It is an unchecked exception.
- The compiler does not force us to handle it.
- It occurs at runtime.
- It can be handled using try-catch blocks.

### What is ArithmeticException?

ArithmeticException is a runtime exception that occurs when an illegal arithmetic operation is performed, such as dividing a number by zero.

### Why does ArithmeticException occur?

It occurs because mathematical operations like division or modulus by zero are not allowed in Java.

## Conclusion

ArithmeticException occurs when an invalid arithmetic operation is performed. It can be handled using try-catch blocks to prevent abnormal program termination.
