# JUnit Exception Testing: `assertThrows` and `assertThrowsExactly`

This guide explains how to use `assertThrows` and `assertThrowsExactly` in JUnit for validating exception handling in Java code.

---

## Table of Contents

1. [Introduction]()
2. [JUnit `assertThrows` Method]
3. [JUnit `assertThrowsExactly` Method]
4. [Difference Between `assertThrows` and `assertThrowsExactly`]

---

## Introduction

Exception testing in JUnit is essential for ensuring your code correctly handles edge cases and unexpected scenarios.

- **`assertThrows`**: Validates if a block of code throws a specific type of exception or its subclass.
- **`assertThrowsExactly`**: Validates if a block of code throws **exactly** the specified type of exception, without allowing subclass or superclass matches.

---

## JUnit `assertThrows` Method

The `assertThrows` method in JUnit is used to verify that a block of code throws a specific type of exception.

### Key Points:

- **Pass Condition**: The test passes if the block throws the expected exception or a subclass.
- **Fail Conditions**: The test fails if no exception or a different exception is thrown.
- **Inheritance Compatibility**: The method allows the expected exception type to be a superclass of the actual exception.

### Example:

```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionTest {

    @Test
    void testAssertThrows() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid argument");
        });

        Assertions.assertEquals("Invalid argument", exception.getMessage());
    }
}
```

---

## JUnit `assertThrowsExactly` Method

The `assertThrowsExactly` method ensures strict type matching for exception validation. It only passes if the thrown exception is **exactly** the expected type.

### Key Points:

- **Pass Condition**: The test passes only if the block throws the exact specified exception.
- **Fail Conditions**: The test fails if no exception, a different exception, or a subclass/superclass exception is thrown.
- **Strict Type Matching**: Subclasses or superclasses of the expected exception are not accepted.

### Example:

```java
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionTest {

    @Test
    void testAssertThrowsExactly() {
        Exception exception = Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid argument");
        });

        Assertions.assertEquals("Invalid argument", exception.getMessage());
    }
}
```

---

## Difference Between `assertThrows` and `assertThrowsExactly`

| Feature | `assertThrows` | `assertThrowsExactly` |
| --- | --- | --- |
| **Subclass Matching** | Passes if the exception is a subclass | Fails if the exception is a subclass |
| **Superclass Matching** | Passes if the exception is a superclass | Fails if the exception is a superclass |
| **Strict Type Match** | No | Yes |