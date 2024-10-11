// Here's an example of how you can write unit tests for the ExtBoolArray class

@Test
void testIsFalse() {
    ExtBoolArray extBoolArray = new ExtBoolArray();
    boolean[] werte = {true, false, false, true, false, true, false, false, true, true};

    // Test case 1: Check if all values from index 0 to 2 are false
    assertTrue(extBoolArray.isFalse(0, 2), "All values from index 0 to 2 should be false");

    // Test case 2: Check if all values from index 3 to 5 are false
    assertFalse(extBoolArray.isFalse(3, 5), "All values from index 3 to 5 should not be false");

    // Test case 3: Check if all values from index 6 to 9 are false
    assertFalse(extBoolArray.isFalse(6, 9), "All values from index 6 to 9 should not be false");

    // Test case 4: Check if all values from index 0 to 9 are false
    assertFalse(extBoolArray.isFalse(0, 9), "All values from index 0 to 9 should not be false");

    // Test case 5: Check if all values from index 1 to 3 are false
    assertFalse(extBoolArray.isFalse(1, 3), "All values from index 1 to 3 should not be false");

    // Test case 6: Check if all values from index 4 to 6 are false
    assertFalse(extBoolArray.isFalse(4, 6), "All values from index 4 to 6 should not be false");

    // Test case 7: Check if all values from index 7 to 9 are false
    assertFalse(extBoolArray.isFalse(7, 9), "All values from index 7 to 9 should not be false");

    // Test case 8: Check if all values from index 0 to 0 are false
    assertFalse(extBoolArray.isFalse(0, 0), "All values from index 0 to 0 should not be false");

    // Test case 9: Check if all values from index 9 to 9 are false
    assertFalse(extBoolArray.isFalse(9, 9), "All values from index 9 to 9 should not be false");

    // Test case 10: Check if all values from index 2 to 7 are false
    assertFalse(extBoolArray.isFalse(2, 7), "All values from index 2 to 7 should not be false");
}
}