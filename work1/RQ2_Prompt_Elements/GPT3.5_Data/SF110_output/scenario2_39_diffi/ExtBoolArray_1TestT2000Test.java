// Here is an example of how you can write unit tests for the ExtBoolArray class.

@Test
void testLeftWithEmptyArray() {
    ExtBoolArray array = new ExtBoolArray();
    assertEquals(0, array.left());
}

@Test
void testLeftWithAllTrueValues() {
    ExtBoolArray array = new ExtBoolArray(new boolean[]{true, true, true});
    assertEquals(0, array.left());
}

@Test
void testLeftWithAllFalseValues() {
    ExtBoolArray array = new ExtBoolArray(new boolean[]{false, false, false});
    assertEquals(3, array.left());
}

@Test
void testLeftWithMixedValues() {
    ExtBoolArray array = new ExtBoolArray(new boolean[]{true, false, true, false, false});
    assertEquals(3, array.left());
}

@Test
void testLeftWithNullArray() {
    ExtBoolArray array = new ExtBoolArray(null);
    assertEquals(0, array.left());
}

@Test
void testLeftWithLargeArray() {
    boolean[] values = new boolean[1000000];
    for (int i = 0; i < values.length; i++) {
        values[i] = i % 2 == 0;
    }
    ExtBoolArray array = new ExtBoolArray(values);
    assertEquals(500000, array.left());
}

@Test
void testLeftWithOneValue() {
    ExtBoolArray array = new ExtBoolArray(new boolean[]{false});
    assertEquals(1, array.left());
}

@Test
void testLeftWithTwoValues() {
    ExtBoolArray array = new ExtBoolArray(new boolean[]{false, true});
    assertEquals(1, array.left());
}

@Test
void testLeftWithThreeValues() {
    ExtBoolArray array = new ExtBoolArray(new boolean[]{false, true, false});
    assertEquals(2, array.left());
}

@Test
void testLeftWithFourValues() {
    ExtBoolArray array = new ExtBoolArray(new boolean[]{false, true, false, true});
    assertEquals(2, array.left());
}

@Test
void testLeftWithFiveValues() {
    ExtBoolArray array = new ExtBoolArray(new boolean[]{false, true, false, true, false});
    assertEquals(3, array.left());
}