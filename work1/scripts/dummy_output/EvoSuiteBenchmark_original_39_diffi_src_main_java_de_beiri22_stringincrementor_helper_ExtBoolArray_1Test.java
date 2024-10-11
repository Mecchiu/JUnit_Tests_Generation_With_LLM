package de.beiri22.stringincrementor.helper;
java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExtBoolArray_1Test {

    private ExtBoolArray extBoolArray;

    @BeforeEach
    void setUp() {
        extBoolArray = new ExtBoolArray(5);
    }

    @Test
    void testLeftWithAllFalse() {
        assertEquals(5, extBoolArray.left());
    }

    @Test
    void testLeftWithAllTrue() {
        extBoolArray.setTrue(0, 4);
        assertEquals(0, extBoolArray.left());
    }

    @Test
    void testLeftWithMixedValues() {
        extBoolArray.setTrue(1, 3);
        assertEquals(2, extBoolArray.left());
    }

    @Test
    void testLeftWithEmptyArray() {
        ExtBoolArray emptyArray = new ExtBoolArray(0);
        assertEquals(0, emptyArray.left());
    }

    @Test
    void testLeftAfterSettingValues() {
        extBoolArray.setTrue(1, 3);
        extBoolArray.setTrue(4, 4);
        assertEquals(3, extBoolArray.left());
    }

    @Test
    void testLeftAfterSettingAllTrue() {
        extBoolArray.setTrue(0, 4);
        assertEquals(0, extBoolArray.left());
    }

    @Test
    void testLeftAfterSettingAllFalse() {
        extBoolArray.setTrue(0, 4);
        extBoolArray.setTrue(0, 4);
        assertEquals(5, extBoolArray.left());
    }

    @Test
    void testLeftAfterSettingSingleValue() {
        extBoolArray.setTrue(2, 2);
        assertEquals(4, extBoolArray.left());
    }

    @Test
    void testLeftAfterSettingOutOfRange() {
        extBoolArray.setTrue(0, 6);
        assertEquals(5, extBoolArray.left());
    }
}
