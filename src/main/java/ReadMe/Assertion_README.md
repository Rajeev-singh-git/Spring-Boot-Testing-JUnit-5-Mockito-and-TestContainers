# Assertion

## 1. `assertTrue` Method

The `assertTrue` method is a static method provided by the `Assertions` class in JUnit 5.

### Purpose

This method is used to verify that a given condition evaluates to `true`.

### Behavior

- **If the condition is `true`**: The test passes.
- **If the condition is `false`**: The test fails.

### Syntax

```java
Assertions.assertTrue(condition, message);
```

- **`condition`**: The boolean expression to be tested.
- **`message`**: (Optional) The failure message to be displayed if the condition is `false`.

### Example

```java
 @Test
 void testAssertTrue() {
 boolean isValid = 5 > 2; // true
 Assertions.assertTrue(isValid, "The condition must be true.");
 }
```

## 2. `assertFalse` Method

The `assertFalse` method is a static method provided by the `Assertions` class in JUnit 5.

### Purpose

This method is used to verify that a given condition evaluates to `false`.

### Behavior

- **If the condition is `false`**: The test passes.
- **If the condition is `true`**: The test fails.

### Syntax

```java
Assertions.assertFalse(condition, message);
```

- **`condition`**: The boolean expression to be tested.
- **`message`**: (Optional) The failure message to be displayed if the condition is `true`.

### Example

```java
@Test
 void testAssertFalse() {
 boolean isValid = 5 < 2; // false
 Assertions.assertFalse(isValid, "The condition must be false.");
}
```

## 3. `assertNull` Method

The `assertNull` method is a static method provided by the `Assertions` class in JUnit 5.

### Purpose

This method is used to verify that a given object is `null`.

### Behavior

- **If the object is `null`**: The test passes.
- **If the object is not `null`**: The test fails.

### Syntax

```java
Assertions.assertNull(object, message);
```

`Assertions.assertNull(object, message);`

- **`object`**: The object to be tested.
- **`message`**: (Optional) The failure message to be displayed if the object is not `null`.

### Example

```java
@Test
void testAssertNull() {
String value = null; // null
Assertions.assertNull(value, "The object must be null.");
 }
```