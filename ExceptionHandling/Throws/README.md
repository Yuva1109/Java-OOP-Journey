README.md (Throws)
# Throws in Java

## Definition

The `throws` keyword is used to declare exceptions that may occur in a method.

## Syntax

```java
returnType methodName() throws ExceptionType {
}
```

## Example

```java
static void readFile() throws IOException {
    FileReader fr = new FileReader("input.txt");
}
```

## Key Points

- Used in method declarations.
- Informs the caller that an exception may occur.
- Mainly used with checked exceptions.
- Does not handle the exception.
- Responsibility is transferred to the calling method.

### What is throws?

The `throws` keyword is used to declare exceptions that a method can generate and pass to the caller for handling.

### Difference Between throw and throws

| throw | throws |
|---------|---------|
| Used to explicitly throw an exception | Used to declare exceptions |
| Used inside a method | Used in method signature |
| Followed by an exception object | Followed by exception class names |

## Conclusion

`throws` is used to delegate exception handling responsibility to the calling method.
