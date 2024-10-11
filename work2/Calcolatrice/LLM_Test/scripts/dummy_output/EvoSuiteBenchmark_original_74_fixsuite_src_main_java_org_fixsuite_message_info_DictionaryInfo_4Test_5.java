// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {
		/**
		 * Tests {@link DictionaryInfo#getMessage(int)} method.
		*
		*/
    @org.junit.jupiter.api.Test (expected=NullPointerException.class)
    public void testGetMessage() {
       DictionaryInfo_4Test.getMessage(4);
    }

    /**
     * Tests an id set.
     *
     */
    @Test
    public void testIdSet() {

        List<Integer> ids = new ArrayList<>(10);
        DictionaryInfo dictionaryInfo = new DictionaryInfo();

        for (int i = 0; i < 10; i++) {
            List<FieldInfo> fields = new ArrayList<>(10);
            for (int j = 0; j < 10; j++) {
                FieldInfo fieldInfo = new FieldInfo();
                fieldInfo.setId(new Integer(i));
                fieldInfo.setName("field" + i + (j++));
                fieldInfo.setDesc("Field" + i + (j++));
                fieldInfo.setLength(new Integer(10));
                fieldInfo.setOffset(new Integer(10));
                fieldInfo.setUnsigned(new Integer(1));
                fieldInfo.setBitWidth(new Integer(8));
                fieldInfo.setBitOffset(new Integer(0));
                fields.add(fieldInfo);
            }

            for (int jj = 0; jj < 10; jj++) {
                String name = "field=" + jj + "";
                String desc = "Field" + jj + "";
                int length = 10;
                int offset = 0;
                int bitWidth = 8;
                int bitOffset = 0;

                FieldInfo fieldInfo = new FieldInfo(name, desc, length, offset, bitWidth, bitOffset);
                fieldInfo.setIdSid(ids);
                ids.add(new Integer(jj));
                dictionaryInfo.insertMessage(fieldInfo);
            }
        }

        assertEquals("A", dictionaryInfo.getAllFields().get(1).getName());
        assertEquals("B", dictionaryInfo.getAllFields().get(2).getName());
        assertTrue("A field fieldB", dictionaryInfo.getAllFields().get(2).getFieldByTagNumber().contains(new Integer(1)));
        assertTrue("A field fieldB 2", dictionaryInfo.getAllFields().get(2).getFieldByTagNumber().contains(new Integer(2)));
        assertEquals("A", dictionaryInfo.getAllMessage().get(0).getName());

    }



}