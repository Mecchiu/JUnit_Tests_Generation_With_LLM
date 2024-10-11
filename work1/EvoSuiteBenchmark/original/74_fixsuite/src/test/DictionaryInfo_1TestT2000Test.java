```java
class DictionaryInfo_1Test {

    @Test
    void testGetField_WhenFieldsByNameIsNull_ThenReturnNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        assertNull(dictionaryInfo.getField("Field1"));
    }

    @Test
    void testGetField_WhenFieldExists_ThenReturnField() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        FieldInfo field = new FieldInfo(1, "Field1");
        dictionaryInfo.addField(field);
        assertEquals(field, dictionaryInfo.getField("Field1"));
    }

    @Test
    void testGetField_WhenFieldDoesNotExist_ThenReturnNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        FieldInfo field = new FieldInfo(1, "Field1");
        dictionaryInfo.addField(field);
        assertNull(dictionaryInfo.getField("Field2"));
    }

    @Test
    void testGetField_WhenFieldsByNameIsEmpty_ThenReturnNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        dictionaryInfo.fieldsByName = new TreeMap<>();
        assertNull(dictionaryInfo.getField("Field1"));
    }

    @Test
    void testGetField_WhenFieldsByNameContainsMultipleFields_ThenReturnCorrectField() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        FieldInfo field1 = new FieldInfo(1, "Field1");
        FieldInfo field2 = new FieldInfo(2, "Field2");
        dictionaryInfo.addField(field1);
        dictionaryInfo.addField(field2);
        assertEquals(field2, dictionaryInfo.getField("Field2"));
    }

    @Test
    void testGetField_WhenFieldsByNameContainsFieldWithSameName_ThenReturnFirstField() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        FieldInfo field1 = new FieldInfo(1, "Field1");
        FieldInfo field2 = new FieldInfo(2, "Field1");
        dictionaryInfo.addField(field1);
        dictionaryInfo.addField(field2);
        assertEquals(field1, dictionaryInfo.getField("Field1"));
    }

    @Test
    void testGetField_WhenFieldsByNameContainsFieldWithNullName_ThenReturnNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        FieldInfo field = new FieldInfo(1, null);
        dictionaryInfo.addField(field);
        assertNull(dictionaryInfo.getField(null));
    }

    @Test
    void testGetField_WhenFieldsByNameContainsFieldWithEmptyName_ThenReturnNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        FieldInfo field = new FieldInfo(1, "");
        dictionaryInfo.addField(field);
        assertNull(dictionaryInfo.getField(""));
    }

    @Test
    void testGetField_WhenFieldsByNameContainsFieldWithWhitespaceName_ThenReturnNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        FieldInfo field = new FieldInfo(1, " ");
        dictionaryInfo.addField(field);
        assertNull(dictionaryInfo.getField(" "));
    }

    @Test
    void testGetField_WhenFieldsByNameContainsFieldWithSpecialCharactersInName_ThenReturnCorrectField() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo("1.0");
        FieldInfo field1 = new FieldInfo(1, "Field1");
        FieldInfo field2 = new FieldInfo(2, "Field@2");
        dictionaryInfo.addField(field1);
        dictionaryInfo.addField(field2);
        assertEquals(field2, dictionaryInfo.getField("Field@2"));
    }
}
```