# Throw in Java

## Definition

The `throw` keyword is used to explicitly throw an exception from a program.

## Syntax

```java
throw new ExceptionType("Message");
```

## Example

```java
if(age < 18){
    throw new ArithmeticException("Not eligible to vote");
}
```

## Output

```
Not eligible to vote
```

## Key Points

- Used to explicitly create and throw an exception.
- Followed by an exception object.
- Control immediately transfers to the nearest catch block.
- Used for custom validations.
### What is throw?

The `throw` keyword is used to manually throw an exception during program execution.

## Conclusion

`throw` helps developers validate conditions and generate exceptions when business rules are violated.
