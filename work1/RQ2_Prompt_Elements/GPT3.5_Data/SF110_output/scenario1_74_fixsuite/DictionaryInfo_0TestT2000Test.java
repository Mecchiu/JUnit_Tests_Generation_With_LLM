// Here's an example implementation of the DictionaryInfo_0Test class:

package org.fixsuite.message.info;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DictionaryInfo_0Test {

    @Test
    void testGetFieldReturnsNullWhenFieldsByTagNumberIsNull() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        assertNull(dictionaryInfo.getField(1));
    }

    @Test
    void testGetFieldReturnsNullWhenTagNumberIsNotPresent() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.fieldsByTagNumber = new TreeMap<>();
        assertNull(dictionaryInfo.getField(1));
    }

    @Test
    void testGetFieldReturnsFieldInfoWhenTagNumberIsPresent() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.fieldsByTagNumber = new TreeMap<>();
        FieldInfo fieldInfo = new FieldInfo();
        dictionaryInfo.fieldsByTagNumber.put(1, fieldInfo);
        assertEquals(fieldInfo, dictionaryInfo.getField(1));
    }

    @Test
    void testGetFieldReturnsCorrectFieldInfoWhenMultipleFieldsArePresent() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.fieldsByTagNumber = new TreeMap<>();
        FieldInfo fieldInfo1 = new FieldInfo();
        FieldInfo fieldInfo2 = new FieldInfo();
        dictionaryInfo.fieldsByTagNumber.put(1, fieldInfo1);
        dictionaryInfo.fieldsByTagNumber.put(2, fieldInfo2);
        assertEquals(fieldInfo1, dictionaryInfo.getField(1));
        assertEquals(fieldInfo2, dictionaryInfo.getField(2));
    }

    @Test
    void testGetFieldReturnsCorrectFieldInfoWhenFieldsAreAddedOutOfOrder() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.fieldsByTagNumber = new TreeMap<>();
        FieldInfo fieldInfo1 = new FieldInfo();
        FieldInfo fieldInfo2 = new FieldInfo();
        dictionaryInfo.fieldsByTagNumber.put(2, fieldInfo2);
        dictionaryInfo.fieldsByTagNumber.put(1, fieldInfo1);
        assertEquals(fieldInfo1, dictionaryInfo.getField(1));
        assertEquals(fieldInfo2, dictionaryInfo.getField(2));
    }

    @Test
    void testGetFieldReturnsCorrectFieldInfoWhenFieldsAreAddedInReverseOrder() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.fieldsByTagNumber = new TreeMap<>();
        FieldInfo fieldInfo1 = new FieldInfo();
        FieldInfo fieldInfo2 = new FieldInfo();
        dictionaryInfo.fieldsByTagNumber.put(1, fieldInfo1);
        dictionaryInfo.fieldsByTagNumber.put(2, fieldInfo2);
        assertEquals(fieldInfo1, dictionaryInfo.getField(1));
        assertEquals(fieldInfo2, dictionaryInfo.getField(2));
    }

    @Test
    void testGetFieldReturnsCorrectFieldInfoWhenFieldsAreAddedInRandomOrder() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.fieldsByTagNumber = new TreeMap<>();
        FieldInfo fieldInfo1 = new FieldInfo();
        FieldInfo fieldInfo2 = new FieldInfo();
        FieldInfo fieldInfo3 = new FieldInfo();
        dictionaryInfo.fieldsByTagNumber.put(2, fieldInfo2);
        dictionaryInfo.fieldsByTagNumber.put(1, fieldInfo1);
        dictionaryInfo.fieldsByTagNumber.put(3, fieldInfo3);
        assertEquals(fieldInfo1, dictionaryInfo.getField(1));
        assertEquals(fieldInfo2, dictionaryInfo.getField(2));
        assertEquals(fieldInfo3, dictionaryInfo.getField(3));
    }

    @Test
    void testGetFieldReturnsCorrectFieldInfoWhenFieldsAreAddedWithGaps() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.fieldsByTagNumber = new TreeMap<>();
        FieldInfo fieldInfo1 = new FieldInfo();
        FieldInfo fieldInfo2 = new FieldInfo();
        FieldInfo fieldInfo3 = new FieldInfo();
        dictionaryInfo.fieldsByTagNumber.put(1, fieldInfo1);
        dictionaryInfo.fieldsByTagNumber.put(3, fieldInfo3);
        dictionaryInfo.fieldsByTagNumber.put(2, fieldInfo2);
        assertEquals(fieldInfo1, dictionaryInfo.getField(1));
        assertEquals(fieldInfo2, dictionaryInfo.getField(2));
        assertEquals(fieldInfo3, dictionaryInfo.getField(3));
    }

    @Test
    void testGetFieldReturnsCorrectFieldInfoWhenFieldsAreAddedWithDuplicates() {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        dictionaryInfo.fieldsByTagNumber = new TreeMap<>();
        FieldInfo fieldInfo1 = new FieldInfo();
        FieldInfo fieldInfo2 = new FieldInfo();
        FieldInfo fieldInfo3 = new FieldInfo();
        dictionaryInfo.fieldsByTagNumber.put(1, fieldInfo1);
        dictionaryInfo.fieldsByTagNumber.put(2, fieldInfo2);
        dictionaryInfo.fieldsByTagNumber.put(2, fieldInfo3);
        assertEquals(fieldInfo1, dictionaryInfo.getField(1));
        assertEquals(fieldInfo3, dictionaryInfo.getField(2));
    }
}