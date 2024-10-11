// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
		
    @Test
    public void testGetField_0()
        throws Exception {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        assertEquals(dictionaryInfo.getField("0"), null);
    }

	@Test
	public void testGetField_1()
		throws Exception {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        List<FieldInfo> fields = new ArrayList<>(1);
        fields.add(new FieldInfo_1("0:FIELD_NAME", "field_name", Integer.class, "value", "0"));
        dictionaryInfo.addField(fields);
        assertEquals(dictionaryInfo.getField("FIELDS_IN_NAME"), fields);
	}

	@Test
	public void testGetField_2()
		throws Exception {
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        List<FieldInfo> fields = new ArrayList<>(1);
        fields.add(new FieldInfo_1("0:FIELD_TYPE", "type", Integer.class, "number", "0"));
        dictionaryInfo.addField(fields);
        List<MessageInfo> messages = new ArrayList<>(1000);
        for (int i = 0; i < 100; i++) {
            FieldInfo fieldInfo = new FieldInfo_1("0:MESSAGES_IN_NAME", "messages_in_name", Integer.class, "number", Integer.toString(i));
            messages.add(new MessageInfo_1("messages_" + i, 0, "0", "message " + i, "text", fieldInfo));
        }
        dictionaryInfo.addMessages(messages);
        assertEquals(dictionaryInfo.getField("MESSAGES"), messages);
        assertEquals(dictionaryInfo.getField("MESSAGES_IN_NAME"), messages.get(0).getFields());
        List<List<MessageInfo>> messagesArray = new ArrayList<>(1);
		messagesArray.add(new List<MessageInfo>());
		Messages messagesArray_1 = new Messages(messagesArray);
        assertNotNull(messagesArray_1);
		assertNotNull(messagesArray_1.get("messages_0"));
		assertNotNull(messagesArray_1.get("messages_100"));
	}

		@Test
		public void testReplaceNull_1()
			throws Exception {
			DictionaryInfo dictionaryInfo = new DictionaryInfo();
			List<FieldInfo> replaced = dictionaryInfo.replaceAsGroup(null, new GroupInfo_1("0:GROUP_NAME", "GROUP_NAME", Integer.class, "0"));
			assertNotNull(replaced);
			assertEquals(replaced.size(), 1);
			List<FieldInfo> matched = dictionaryInfo.splitAsGroup(replaced.get(0));
			assertEquals(matched.size(), 0);
		}
		
		class GroupInfo_1 extends GroupInfo {

			private List<FieldInfo> fields = new ArrayList<>(1);

			public GroupInfo_1(int id) {
				super("GROUP_" + id, "GROUP_NAME", Integer.class, "0");
				fields.add(new FieldInfo_1("0:FIELD_VALUE", "value", Integer.class, "value"));
			}
		}
}