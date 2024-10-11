// Here's an example implementation of the FieldInfo_1Test class with ten unit test cases for the isValidValue method:

class FieldInfo_1Test {

    @Test
    void testIsValidValueWithValidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        validValues.put("B", "Valid value B");
        fieldInfo.validValues = validValues;

        assertTrue(fieldInfo.isValidValue("A"));
    }

    @Test
    void testIsValidValueWithInvalidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        validValues.put("B", "Valid value B");
        fieldInfo.validValues = validValues;

        assertFalse(fieldInfo.isValidValue("C"));
    }

    @Test
    void testIsValidValueWithNullValue() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        validValues.put("B", "Valid value B");
        fieldInfo.validValues = validValues;

        assertFalse(fieldInfo.isValidValue(null));
    }

    @Test
    void testIsValidValueWithEmptyValue() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        validValues.put("B", "Valid value B");
        fieldInfo.validValues = validValues;

        assertFalse(fieldInfo.isValidValue(""));
    }

    @Test
    void testIsValidValueWithSingleValidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        fieldInfo.validValues = validValues;

        assertTrue(fieldInfo.isValidValue("A"));
    }

    @Test
    void testIsValidValueWithSingleInvalidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        fieldInfo.validValues = validValues;

        assertFalse(fieldInfo.isValidValue("B"));
    }

    @Test
    void testIsValidValueWithMultipleValidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        validValues.put("B", "Valid value B");
        validValues.put("C", "Valid value C");
        fieldInfo.validValues = validValues;

        assertTrue(fieldInfo.isValidValue("B"));
    }

    @Test
    void testIsValidValueWithMultipleInvalidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        validValues.put("B", "Valid value B");
        validValues.put("C", "Valid value C");
        fieldInfo.validValues = validValues;

        assertFalse(fieldInfo.isValidValue("D"));
    }

    @Test
    void testIsValidValueWithDuplicateValues() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        validValues.put("A", "Valid value A");
        validValues.put("B", "Valid value B");
        validValues.put("C", "Valid value C");
        validValues.put("D", "Valid value D");
        validValues.put("E", "Valid value E");
        validValues.put("F", "Valid value F");
        validValues.put("G", "Valid value G");
        validValues.put("H", "Valid value H");
        validValues.put("I", "Valid value I");
        validValues.put("J", "Valid value J");
        validValues.put("K", "Valid value K");
        validValues.put("L", "Valid value L");
        validValues.put("M", "Valid value M");
        validValues.put("N", "Valid value N");
        validValues.put("O", "Valid value O");
        validValues.put("P", "Valid value P");
        validValues.put("Q", "Valid value Q");
        validValues.put("R", "Valid value R");
        validValues.put("S", "Valid value S");
        validValues.put("T", "Valid value T");
        validValues.put("U", "Valid value U");
        validValues.put("V", "Valid value V");
        validValues.put("W", "Valid value W");
        validValues.put("X", "Valid value X");
        validValues.put("Y", "Valid value Y");
        validValues.put("Z", "Valid value Z");
        fieldInfo.validValues = validValues;

        assertTrue(fieldInfo.isValidValue("A"));
    }

    @Test
    void testIsValidValueWithLargeNumberOfValues() {
        FieldInfo fieldInfo = new FieldInfo();
        TreeMap<String, String> validValues = new TreeMap<>();
        for (int i = 0; i < 100000; i++) {
            validValues.put(String.valueOf(i), "Valid value " + i);
        }
        fieldInfo.validValues = validValues;

        assertTrue(fieldInfo.isValidValue("99999"));
    }
}