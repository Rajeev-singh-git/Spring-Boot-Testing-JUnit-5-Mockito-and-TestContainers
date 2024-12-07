# JUnit 5 Assertions

## Table of Contents

1. [assertTrue Method](#1-asserttrue-method)
2. [assertFalse Method](#2-assertfalse-method)
3. [assertNull Method](#3-assertnull-method)
4. [assertNotNull Method](#4-assertnotnull-method)
5. [assertEquals Method](#5-assertequals-method)
6. [assertNotEquals Method](#6-assertnotequals-method)
7. [assertArrayEquals Method](#7-assertarrayequals-method)
8. [assertIterableEquals Method](#8-assertiterableequals-method)
9. [Comparative Summary Table](#comparative-summary-table)

---

## 1. `assertTrue` Method

### Purpose

The `assertTrue` method verifies that a given condition evaluates to `true`.

### Behavior

- **Pass**: The condition is `true`.
- **Fail**: The condition is `false`.

### Syntax

```java
Assertions.assertTrue(condition, message);
```

- **`condition`**: The boolean expression to be tested.
- **`message`**: (Optional) Failure message displayed if the condition is `false`.

### Example

```java
@Test
void testAssertTrue() {
    boolean isValid = 5 > 2; // true
    Assertions.assertTrue(isValid, "The condition must be true.");
}
```

---

## 2. `assertFalse` Method

### Purpose

The `assertFalse` method verifies that a given condition evaluates to `false`.

### Behavior

- **Pass**: The condition is `false`.
- **Fail**: The condition is `true`.

### Syntax

```java
Assertions.assertFalse(condition, message);
```

- **`condition`**: The boolean expression to be tested.
- **`message`**: (Optional) Failure message displayed if the condition is `true`.

### Example

```java
@Test
void testAssertFalse() {
    boolean isValid = 5 < 2; // false
    Assertions.assertFalse(isValid, "The condition must be false.");
}
```

---

## 3. `assertNull` Method

### Purpose

The `assertNull` method verifies that a given object is `null`.

### Behavior

- **Pass**: The object is `null`.
- **Fail**: The object is not `null`.

### Syntax

```java

Assertions.assertNull(object, message);
```

- **`object`**: The object to be tested.
- **`message`**: (Optional) Failure message displayed if the object is not `null`.

### Example

```java

@Test
void testAssertNull() {
    String value = null; // null
    Assertions.assertNull(value, "The object must be null.");
}

```

---

## 4. `assertNotNull` Method

### Purpose

The `assertNotNull` method verifies that a given object is **not `null`**.

### Behavior

- **Pass**: The object is not `null`.
- **Fail**: The object is `null`.

### Syntax

```java

Assertions.assertNotNull(object, message);

```

- **`object`**: The object to be tested.
- **`message`**: (Optional) Failure message displayed if the object is `null`.

### Example

```java

@Test
void testAssertNotNull() {
    String value = "Hello, JUnit!"; // not null
    Assertions.assertNotNull(value, "The object must not be null.");
}

```

---

## 5. `assertEquals` Method

### Purpose

The `assertEquals` method verifies that two values are equal.

### Behavior

- **Pass**: The values are equal.
- **Fail**: The values are not equal.

### Syntax

```java

Assertions.assertEquals(expected, actual, message);
```

- **`expected`**: The expected value.
- **`actual`**: The value being tested.
- **`message`**: (Optional) Failure message displayed if the values are not equal.

### Example

```java

@Test
void testAssertEquals() {
    int expected = 10;
    int actual = 5 + 5; // 10
    Assertions.assertEquals(expected, actual, "The values must be equal.");
}
```

---

## 6. `assertNotEquals` Method

### Purpose

The `assertNotEquals` method verifies that two values are **not equal**.

### Behavior

- **Pass**: The values are not equal.
- **Fail**: The values are equal.

### Syntax

```java

Assertions.assertNotEquals(unexpected, actual, message);
```

- **`unexpected`**: The value that is not expected.
- **`actual`**: The value being tested.
- **`message`**: (Optional) Failure message displayed if the values are equal.

### Example

```java
@Test
void testAssertNotEquals() {
    int unexpected = 10;
    int actual = 5 + 3; // 8
    Assertions.assertNotEquals(unexpected, actual, "The values must not be equal.");
}

```

---

## 7. `assertArrayEquals` Method

### Purpose

The `assertArrayEquals` method verifies that two arrays are equal. Arrays are equal if they have the same length and elements in the same order.

### Syntax

```java
Assertions.assertArrayEquals(expectedArray, actualArray, message);
```

- **`expectedArray`**: The expected array.
- **`actualArray`**: The array being tested.
- **`message`**: (Optional) Failure message displayed if the arrays are not equal.

### Example

```java

@Test
void testAssertArrayEquals() {
    int[] expectedArray = {1, 2, 3};
    int[] actualArray = {1, 2, 3}; // equal
    Assertions.assertArrayEquals(expectedArray, actualArray, "The arrays must be equal.");
}
```

---

## 8. `assertIterableEquals` Method

### Purpose

The `assertIterableEquals` method verifies that two `Iterable` objects are equal.

### Syntax

```java

Assertions.assertIterableEquals(expectedIterable, actualIterable, message)
```

- **`expectedIterable`**: The expected iterable.
- **`actualIterable`**: The iterable being tested.
- **`message`**: (Optional) Failure message displayed if the iterables are not equal.

### Example

```java

@Test
void testAssertIterableEquals() {
    List<String> expectedList = Arrays.asList("Alice", "Bob", "Charlie");
    List<String> actualList = Arrays.asList("Alice", "Bob", "Charlie"); // equal
    Assertions.assertIterableEquals(expectedList, actualList, "The iterables must be equal.");
}
```

---

## Comparative Summary Table

| **Method** | **Pass Condition** | **Fail Condition** |
| --- | --- | --- |
| `assertTrue` | Condition is `true`. | Condition is `false`. |
| `assertFalse` | Condition is `false`. | Condition is `true`. |
| `assertNull` | Object is `null`. | Object is not `null`. |
| `assertNotNull` | Object is not `null`. | Object is `null`. |
| `assertEquals` | Values are equal. | Values are not equal. |
| `assertNotEquals` | Values are not equal. | Values are equal. |
| `assertArrayEquals` | Arrays are equal. | Arrays are not equal. |
| `assertIterableEquals` | Iterables are equal. | Iterables are not equal. |

---
