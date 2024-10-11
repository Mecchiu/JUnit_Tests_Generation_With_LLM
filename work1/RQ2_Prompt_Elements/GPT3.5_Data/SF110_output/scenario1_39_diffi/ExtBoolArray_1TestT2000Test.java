// Here's an example of how you can write unit tests for the ExtBoolArray class

@Test
void testLeftMethodWithAllTrueValues() {
    // Arrange
    boolean[] values = {true, true, true, true};
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(0, result);
}

@Test
void testLeftMethodWithAllFalseValues() {
    // Arrange
    boolean[] values = {false, false, false, false};
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(4, result);
}

@Test
void testLeftMethodWithMixedValues() {
    // Arrange
    boolean[] values = {true, false, true, false};
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(2, result);
}

@Test
void testLeftMethodWithEmptyArray() {
    // Arrange
    boolean[] values = {};
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(0, result);
}

@Test
void testLeftMethodWithNullArray() {
    // Arrange
    boolean[] values = null;
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(0, result);
}

@Test
void testLeftMethodWithLargeArray() {
    // Arrange
    boolean[] values = new boolean[1000000];
    for (int i = 0; i < values.length; i++) {
        values[i] = i % 2 == 0;
    }
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(500000, result);
}

@Test
void testLeftMethodWithSingleValue() {
    // Arrange
    boolean[] values = {false};
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(1, result);
}

@Test
void testLeftMethodWithTwoValues() {
    // Arrange
    boolean[] values = {false, true};
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(1, result);
}

@Test
void testLeftMethodWithThreeValues() {
    // Arrange
    boolean[] values = {false, true, false};
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(1, result);
}

@Test
void testLeftMethodWithFourValues() {
    // Arrange
    boolean[] values = {false, true, false, true};
    ExtBoolArray extBoolArray = new ExtBoolArray(values);

    // Act
    int result = extBoolArray.left();

    // Assert
    assertEquals(2, result);
}
}