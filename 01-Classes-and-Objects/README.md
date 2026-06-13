# Classes and Objects in Java

## Introduction

Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects and classes. Java is a fully object-oriented programming language that uses classes and objects as its core building blocks.

This project demonstrates the fundamental concepts of **Classes** and **Objects** in Java.

---

## What is a Class?

A **Class** is a blueprint or template used to create objects. It defines the properties (variables) and behaviors (methods) that objects of that class will have.

### Real-Life Example

Consider a **Student**.

Every student has:

* Name
* Age
* Roll Number

These properties can be defined inside a class called `Student`.

A class itself does not occupy memory until an object is created.

### Syntax

```java
class Student {

}
```

---

## What is an Object?

An **Object** is an instance of a class.

Objects are created using the `new` keyword and occupy memory.

### Syntax

```java
Student s1 = new Student();
```

Here:

* `Student` → Class
* `s1` → Object

---

## Example Program

```java
class Student {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Yuvarani";
        s1.age = 21;

        s1.display();
    }
}
```

---

## Output

```text
Name: Yuvarani
Age: 21
```

---
## Code Explanation

### Step 1: Create a Class

```java
class Student
```

A class named `Student` is created.

### Step 2: Declare Variables

```java
String name;
int age;
```

These are called instance variables.

### Step 3: Create a Method

```java
void display()
```

This method prints student information.

### Step 4: Create an Object

```java
Student s1 = new Student();
```

An object named `s1` is created.

### Step 5: Assign Values

```java
s1.name = "Yuvarani";
s1.age = 21;
```

Values are assigned to the object's variables.

### Step 6: Call Method

```java
s1.display();
```

The display method is executed.

---

## Key Concepts Learned

* Class is a blueprint for creating objects.
* Object is an instance of a class.
* Objects store data and perform actions.
* Multiple objects can be created from a single class.
* Memory is allocated when an object is created using the `new` keyword.

---

## Advantages of Classes and Objects

* Better code organization
* Code reusability
* Easier maintenance
* Real-world modeling
* Foundation for advanced OOP concepts

---
### What is a Class?

A class is a blueprint used to create objects.

### What is an Object?

An object is an instance of a class.

### Can a class exist without an object?

Yes.

### Can an object exist without a class?

No.

### Which keyword is used to create an object?

The `new` keyword.

---

## Conclusion

Classes and Objects are the foundation of Object-Oriented Programming in Java. Understanding these concepts is essential before learning constructors, inheritance, polymorphism, abstraction, and encapsulation.
