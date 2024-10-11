// Here's an example implementation of the FieldInfo_1Test class:

package org.fixsuite.message.info;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FieldInfo_1Test {

    @Test
    void testIsValidValue() {
        FieldInfo field = new FieldInfo();
        field.addValidValue(new ValueInfo("Y", "Yes"));
        field.addValidValue(new ValueInfo("N", "No"));
        field.addValidValue(new ValueInfo("U", "Unknown"));

        assertTrue(field.isValidValue("Y"));
        assertTrue(field.isValidValue("N"));
        assertTrue(field.isValidValue("U"));
        assertFalse(field.isValidValue("X"));
    }

    @Test
    void testIsValidValueWithEmptyValidValues() {
        FieldInfo field = new FieldInfo();

        assertFalse(field.isValidValue("Y"));
    }

    @Test
    void testIsValidValueWithNullValidValues() {
        FieldInfo field = new FieldInfo();
        field.setValidValues(null);

        assertFalse(field.isValidValue("Y"));
    }

    @Test
    void testIsValidValueWithEmptyValue() {
        FieldInfo field = new FieldInfo();
        field.addValidValue(new ValueInfo("", "Empty"));

        assertTrue(field.isValidValue(""));
        assertFalse(field.isValidValue(" "));
    }

    @Test
    void testIsValidValueWithNullValue() {
        FieldInfo field = new FieldInfo();
        field.addValidValue(new ValueInfo(null, "Null"));

        assertTrue(field.isValidValue(null));
        assertFalse(field.isValidValue(""));
    }

    @Test
    void testIsValidValueWithCaseSensitiveValue() {
        FieldInfo field = new FieldInfo();
        field.addValidValue(new ValueInfo("Y", "Yes"));

        assertTrue(field.isValidValue("Y"));
        assertFalse(field.isValidValue("y"));
    }

    @Test
    void testIsValidValueWithLeadingAndTrailingSpaces() {
        FieldInfo field = new FieldInfo();
        field.addValidValue(new ValueInfo("Y", "Yes"));

        assertTrue(field.isValidValue(" Y "));
        assertFalse(field.isValidValue("Y "));
        assertFalse(field.isValidValue(" Y"));
    }

    @Test
    void testIsValidValueWithSpecialCharacters() {
        FieldInfo field = new FieldInfo();
        field.addValidValue(new ValueInfo("Y", "Yes"));

        assertTrue(field.isValidValue("Y&"));
        assertFalse(field.isValidValue("Y<"));
    }

    @Test
    void testIsValidValueWithMultipleValidValues() {
        FieldInfo field = new FieldInfo();
        field.addValidValue(new ValueInfo("Y", "Yes"));
        field.addValidValue(new ValueInfo("N", "No"));

        assertTrue(field.isValidValue("Y"));
        assertTrue(field.isValidValue("N"));
        assertFalse(field.isValidValue("U"));
    }
}