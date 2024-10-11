// Here's an example implementation of the test class for ExtBoolArray

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExtBoolArray_0Test {

    @Test
    void testIsFalse() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        boolean[] boolArray = {false, false, false, false, false, false, false, false, false, false};

        // Test case 1: Check if all values in the range are false
        assertTrue(extBoolArray.isFalse(0, 9));

        // Test case 2: Check if all values in the range are true
        assertFalse(extBoolArray.isFalse(0, 9));

        // Test case 3: Check if only the first value in the range is true
        boolArray[0] = true;
        assertFalse(extBoolArray.isFalse(0, 9));

        // Test case 4: Check if only the last value in the range is true
        boolArray[9] = true;
        assertFalse(extBoolArray.isFalse(0, 9));

        // Test case 5: Check if only the middle value in the range is true
        boolArray[4] = true;
        assertFalse(extBoolArray.isFalse(0, 9));

        // Test case 6: Check if the range is empty
        assertTrue(extBoolArray.isFalse(0, 0));

        // Test case 7: Check if the range is out of bounds (lower)
        assertThrows(IndexOutOfBoundsException.class, () -> extBoolArray.isFalse(-1, 9));

        // Test case 8: Check if the range is out of bounds (upper)
        assertThrows(IndexOutOfBoundsException.class, () -> extBoolArray.isFalse(0, 10));

        // Test case 9: Check if the range is out of bounds (both)
        assertThrows(IndexOutOfBoundsException.class, () -> extBoolArray.isFalse(-1, 10));

        // Test case 10: Check if the range is partially out of bounds (lower)
        assertThrows(IndexOutOfBoundsException.class, () -> extBoolArray.isFalse(-1, 5));
    }
}