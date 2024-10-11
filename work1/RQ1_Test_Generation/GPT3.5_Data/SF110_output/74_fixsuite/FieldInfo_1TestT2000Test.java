```java
class FieldInfo_1Test {

    @Test
    void testIsValidValue_ValidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        ValueInfo valueInfo = new ValueInfo();
        valueInfo.setValue("VALID");
        fieldInfo.addValidValue(valueInfo);

        assertTrue(fieldInfo.isValidValue("VALID"));
    }

    @Test
    void testIsValidValue_InvalidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        ValueInfo valueInfo = new ValueInfo();
        valueInfo.setValue("VALID");
        fieldInfo.addValidValue(valueInfo);

        assertFalse(fieldInfo.isValidValue("INVALID"));
    }

    @Test
    void testIsValidValue_NullValue() {
        FieldInfo fieldInfo = new FieldInfo();

        assertFalse(fieldInfo.isValidValue(null));
    }

    @Test
    void testIsValidValue_EmptyValue() {
        FieldInfo fieldInfo = new FieldInfo();

        assertFalse(fieldInfo.isValidValue(""));
    }

    @Test
    void testIsValidValue_MultipleValidValues() {
        FieldInfo fieldInfo = new FieldInfo();
        ValueInfo valueInfo1 = new ValueInfo();
        valueInfo1.setValue("VALID1");
        ValueInfo valueInfo2 = new ValueInfo();
        valueInfo2.setValue("VALID2");
        fieldInfo.addValidValue(valueInfo1);
        fieldInfo.addValidValue(valueInfo2);

        assertTrue(fieldInfo.isValidValue("VALID1"));
        assertTrue(fieldInfo.isValidValue("VALID2"));
    }

    @Test
    void testIsValidValue_MixedCaseValidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        ValueInfo valueInfo = new ValueInfo();
        valueInfo.setValue("valid");
        fieldInfo.addValidValue(valueInfo);

        assertTrue(fieldInfo.isValidValue("VALID"));
    }

    @Test
    void testIsValidValue_DuplicateValidValue() {
        FieldInfo fieldInfo = new FieldInfo();
        ValueInfo valueInfo1 = new ValueInfo();
        valueInfo1.setValue("DUPLICATE");
        ValueInfo valueInfo2 = new ValueInfo();
        valueInfo2.setValue("DUPLICATE");
        fieldInfo.addValidValue(valueInfo1);
        fieldInfo.addValidValue(valueInfo2);

        assertTrue(fieldInfo.isValidValue("DUPLICATE"));
    }

    @Test
    void testIsValidValue_NoValidValues() {
        FieldInfo fieldInfo = new FieldInfo();

        assertFalse(fieldInfo.isValidValue("VALID"));
    }

    @Test
    void testIsValidValue_ValidValueWithSpaces() {
        FieldInfo fieldInfo = new FieldInfo();
        ValueInfo valueInfo = new ValueInfo();
        valueInfo.setValue("VALID VALUE");
        fieldInfo.addValidValue(valueInfo);

        assertTrue(fieldInfo.isValidValue("VALID VALUE"));
    }

    @Test
    void testIsValidValue_ValidValueWithLeadingTrailingSpaces() {
        FieldInfo fieldInfo = new FieldInfo();
        ValueInfo valueInfo = new ValueInfo();
        valueInfo.setValue(" VALID ");
        fieldInfo.addValidValue(valueInfo);

        assertTrue(fieldInfo.isValidValue(" VALID "));
    }
}
```
```