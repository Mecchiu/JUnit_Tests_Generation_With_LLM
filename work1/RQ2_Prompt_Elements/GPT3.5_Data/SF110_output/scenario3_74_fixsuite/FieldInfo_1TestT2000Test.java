// Here's an example implementation of the FieldInfo class and its corresponding unit test class:

// FieldInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a Field as defined by the FIX specification.
 *
 * @author jramoyo
 */
public class FieldInfo implements FixInfo {

    private TreeMap<String, String> validValues;

    public FieldInfo() {
        validValues = new TreeMap<>();
    }

    /**
     * Returns whether a given value is valid
     *
     * @param value - a value
     * @return whether a given value is valid
     */
    public boolean isValidValue(String value) {
        return validValues.containsKey(value);
    }

    /**
     * Adds a valid value to the field
     *
     * @param value - a valid value
     */
    public void addValidValue(String value) {
        validValues.put(value, value);
    }

    /**
     * Returns the list of valid values for the field
     *
     * @return the list of valid values for the field
     */
    public List<String> getValidValues() {
        return new ArrayList<>(validValues.values());
    }
}

// FieldInfo_1Test.java
package org.fixsuite.message.info;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FieldInfo}.
 * It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
 */
class FieldInfo_1Test {

    @Test
    void testIsValidValueWithValidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("ABC");
        assertTrue(fieldInfo.isValidValue("ABC"));
    }

    @Test
    void testIsValidValueWithInvalidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("ABC");
        assertFalse(fieldInfo.isValidValue("XYZ"));
    }

    @Test
    void testIsValidValueWithEmptyValue() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("");
        assertTrue(fieldInfo.isValidValue(""));
    }

    @Test
    void testIsValidValueWithNullValue() {
        FieldInfo fieldInfo = new FieldInfo();
        assertFalse(fieldInfo.isValidValue(null));
    }

    @Test
    void testIsValidValueWithMultipleValidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("ABC");
        fieldInfo.addValidValue("DEF");
        fieldInfo.addValidValue("GHI");
        assertTrue(fieldInfo.isValidValue("DEF"));
    }

    @Test
    void testIsValidValueWithMultipleInvalidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("ABC");
        fieldInfo.addValidValue("DEF");
        fieldInfo.addValidValue("GHI");
        assertFalse(fieldInfo.isValidValue("JKL"));
    }

    @Test
    void testIsValidValueWithMixedValidAndInvalidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("ABC");
        fieldInfo.addValidValue("DEF");
        fieldInfo.addValidValue("GHI");
        assertFalse(fieldInfo.isValidValue("JKL"));
        assertTrue(fieldInfo.isValidValue("DEF"));
    }

    @Test
    void testIsValidValueWithDuplicateValidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("ABC");
        fieldInfo.addValidValue("DEF");
        fieldInfo.addValidValue("DEF");
        assertTrue(fieldInfo.isValidValue("DEF"));
    }

    @Test
    void testIsValidValueWithDuplicateInvalidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("ABC");
        fieldInfo.addValidValue("DEF");
        fieldInfo.addValidValue("DEF");
        assertFalse(fieldInfo.isValidValue("XYZ"));
    }

    @Test
    void testGetValidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        fieldInfo.addValidValue("ABC");
        fieldInfo.addValidValue("DEF");
        fieldInfo.addValidValue("GHI");
        assertEquals(3, fieldInfo.getValidValues().size());
        assertTrue(fieldInfo.getValidValues().contains("ABC"));
        assertTrue(fieldInfo.getValidValues().contains("DEF"));
        assertTrue(fieldInfo.getValidValues().contains("GHI"));
    }
}