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

## 4. `assertNotNull` Method

The `assertNotNull` method is a static method provided by the `Assertions` class in JUnit 5.

### Purpose

This method is used to verify that a given object is **not `null`**.

### Behavior

- **If the object is not `null`**: The test passes.
- **If the object is `null`**: The test fails.

### Syntax

```java

Assertions.assertNotNull(object, message);
```

- **`object`**: The object to be tested.
- **`message`**: (Optional) The failure message to be displayed if the object is `null`.

### Example

```java
@Test
void testAssertNotNull() {
    String value = "Hello, JUnit!"; // not null
    Assertions.assertNotNull(value, "The object must not be null.");
}
```


## 5. `assertEquals` Method

The `assertEquals` method is a static method provided by the `Assertions` class in JUnit 5.

### Purpose

This method is used to verify that two values are equal.

### Behavior

- **If the values are equal**: The test passes.
- **If the values are not equal**: The test fails.

### Syntax

```java

Assertions.assertEquals(expected, actual, message);
```

- **`expected`**: The value you expect.
- **`actual`**: The value being tested.
- **`message`**: (Optional) The failure message to be displayed if the values are not equal.

### Example

```java

@Test
void testAssertEquals() {
    int expected = 10;
    int actual = 5 + 5; // 10
    Assertions.assertEquals(expected, actual, "The values must be equal.");
}

```

## 6. `assertNotEquals` Method

The `assertNotEquals` method is a static method provided by the `Assertions` class in JUnit 5.

### Purpose

This method is used to verify that two values are **not equal**.

### Behavior

- **If the values are not equal**: The test passes.
- **If the values are equal**: The test fails.

### Syntax

```java

Assertions.assertNotEquals(unexpected, actual, message);
```

- **`unexpected`**: The value that is not expected.
- **`actual`**: The value being tested.
- **`message`**: (Optional) The failure message to be displayed if the values are equal.

### Example

```java
@Test
void testAssertNotEquals() {
    int unexpected = 10;
    int actual = 5 + 3; // 8
    Assertions.assertNotEquals(unexpected, actual, "The values must not be equal.");
}

```

## 6. `assertArrayEquals` Method

The `assertArrayEquals` method is a static method provided by the `Assertions` class in JUnit 5.

### Purpose

This method is used to verify that two arrays are equal. Two arrays are considered equal if they have the same length and contain the same elements in the same order.

### Behavior

- **If the arrays are equal**: The test passes.
- **If the arrays are not equal**: The test fails.

### Syntax

```java

Assertions.assertArrayEquals(expectedArray, actualArray, message);
```

- **`expectedArray`**: The array you expect.
- **`actualArray`**: The array being tested.
- **`message`**: (Optional) The failure message to be displayed if the arrays are not equal.

### Example

### 

```java
@Test
void testAssertArrayEquals() {
    int[] expectedArray = {1, 2, 3};
    int[] actualArray = {1, 2, 3}; // equal
    Assertions.assertArrayEquals(expectedArray, actualArray, "The arrays must be equal.");
}
```

## 7. `assertIterableEquals` Method

The `assertIterableEquals` method is a static method provided by the `Assertions` class in JUnit 5.

### Purpose

This method is used to verify that two `Iterable` objects are equal. Two `Iterable` objects are considered equal if they contain the same elements in the same order.

### Behavior

- **If the iterables are equal**: The test passes.
- **If the iterables are not equal**: The test fails.

### Syntax

```java

Assertions.assertIterableEquals(expectedIterable, actualIterable, message);
```

- **`expectedIterable`**: The iterable you expect.
- **`actualIterable`**: The iterable being tested.
- **`message`**: (Optional) The failure message to be displayed if the iterables are not equal.

### Example

```java

@Test
void testAssertIterableEquals() {
    List<String> expectedList = Arrays.asList("Alice", "Bob", "Charlie");
    List<String> actualList = Arrays.asList("Alice", "Bob", "Charlie"); // equal
    Assertions.assertIterableEquals(expectedList, actualList, "The iterables must be equal.");
}
```

### Key Points

- Works for any class implementing the `Iterable` interface (e.g., `List`, `Set`).
- The order of elements is important; even if the same elements are present but in a different order, the test will fail.

### Lazy Failure Message Example

```java

@Test
void testAssertIterableEqualsWithLazyMessage() {
    List<String> expectedList = Arrays.asList("Alice", "Bob", "Charlie");
    List<String> actualList = Arrays.asList("Alice", "Charlie", "Bob"); // not equal
    Assertions.assertIterableEquals(expectedList, actualList,
        () -> "Expected: " + expectedList + ", but got: " + actualList);
}
```