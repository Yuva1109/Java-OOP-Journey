# Java Constructors

A quick reference guide on constructors in Java.

---

## What is a Constructor?

A constructor is a special method that initializes an object when it is created.

- Has the **same name** as the class
- Has **no return type**
- Called **automatically** when an object is created using `new`

---

## Syntax

```java
ClassName() {
    // initialization code
}
```

---

## Types of Constructors

### 1. Default Constructor
```java
class Demo {
    Demo() {
        System.out.println("Object Created");
    }
}
```

### 2. Parameterized Constructor
```java
class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}
```

---

## Example

```java
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Yuvarani", 5000);
        acc1.displayAccount();
    }
}
```

**Output:**
```
Account Holder: Yuvarani
Balance: ₹5000.0
```

---

## Key Points

| Concept | Detail |
|---|---|
| Name | Must match class name |
| Return type | None |
| Called | Automatically on object creation |
| Overloading | Supported |

---

## Constructor Overloading

```java
BankAccount()
BankAccount(String name)
BankAccount(String name, double balance)
```

---

## Why Use Constructors?

- Automatic initialization
- Cleaner, more readable code
- Ensures objects start with valid data
- Reduces repetitive assignment code
