// Test case 1: Test if left() returns correct value for empty array
@Test
void testLeftEmptyArray() {
    ExtBoolArray arr = new ExtBoolArray();
    assertEquals(0, arr.left());
}

// Test case 2: Test if left() returns correct value for array with only true values
@Test
void testLeftAllTrue() {
    ExtBoolArray arr = new ExtBoolArray(true, true, true);
    assertEquals(0, arr.left());
}

// Test case 3: Test if left() returns correct value for array with only false values
@Test
void testLeftAllFalse() {
    ExtBoolArray arr = new ExtBoolArray(false, false, false);
    assertEquals(3, arr.left());
}

// Test case 4: Test if left() returns correct value for array with mixed true and false values
@Test
void testLeftMixedValues() {
    ExtBoolArray arr = new ExtBoolArray(true, false, true, false, false);
    assertEquals(3, arr.left());
}

// Test case 5: Test if left() returns correct value for array with only one element
@Test
void testLeftSingleElement() {
    ExtBoolArray arr = new ExtBoolArray(true);
    assertEquals(0, arr.left());
}

// Test case 6: Test if left() returns correct value for array with large number of elements
@Test
void testLeftLargeArray() {
    boolean[] values = new boolean[1000000];
    for (int i = 0; i < values.length; i++) {
        values[i] = i % 2 == 0;
    }
    ExtBoolArray arr = new ExtBoolArray(values);
    assertEquals(500000, arr.left());
}

// Test case 7: Test if left() returns correct value for array with all elements set to true except the last one
@Test
void testLeftAllTrueExceptLast() {
    boolean[] values = new boolean[100];
    for (int i = 0; i < values.length - 1; i++) {
        values[i] = true;
    }
    values[values.length - 1] = false;
    ExtBoolArray arr = new ExtBoolArray(values);
    assertEquals(1, arr.left());
}

// Test case 8: Test if left() returns correct value for array with all elements set to false except the last one
@Test
void testLeftAllFalseExceptLast() {
    boolean[] values = new boolean[100];
    for (int i = 0; i < values.length - 1; i++) {
        values[i] = false;
    }
    values[values.length - 1] = true;
    ExtBoolArray arr = new ExtBoolArray(values);
    assertEquals(99, arr.left());
}

// Test case 9: Test if left() returns correct value for array with alternating true and false values
@Test
void testLeftAlternatingValues() {
    boolean[] values = new boolean[10];
    for (int i = 0; i < values.length; i++) {
        values[i] = i % 2 == 0;
    }
    ExtBoolArray arr = new ExtBoolArray(values);
    assertEquals(5, arr.left());
}

// Test case 10: Test if left() returns correct value for array with all elements set to true except the first one
@Test
void testLeftAllTrueExceptFirst() {
    boolean[] values = new boolean[100];
    values[0] = false;
    for (int i = 1; i < values.length; i++) {
        values[i] = true;
    }
    ExtBoolArray arr = new ExtBoolArray(values);
    assertEquals(99, arr.left());
}
}