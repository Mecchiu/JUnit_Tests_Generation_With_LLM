// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
@Test
		void test1() {
			int messageCount = 10;
			String name = "name";
			int loadCount = 10000;
			DictionaryInfo info = new DictionaryInfo(name, messageCount, loadCount,
					messageCount, messageCount, loadCount);

			checkMapping(1, messageCount, "name", new MessageInfo("test"),
					messageCount);
			checkMapping(100, messageCount, "name", new MessageInfo("test"),
					messageCount);
			checkMapping(1000000, messageCount, "name", new MessageInfo("test"),
					messageCount);
			checkMapping(2000000000, messageCount, "name", new MessageInfo("test"),
					messageCount);
		}
		private static void checkMapping(int count, int messageCount, String expectedName,
			MessageInfo expectedMessage, int expectedLoadCount) {

			List<FieldInfo> fieldList = new ArrayList<>();
			fieldList.add(expectedMessage.getFields().iterator().next());

			MessageInfo messageInfo = new MessageInfo(expectedName, messageCount, expectedLoadCount,
					fieldList, messageCount,
					messageCount);

			TreeMap<Integer, ComponentInfo> components = new TreeMap<>();

			components.put(expectedMessage.getComponents().iterator().next(),
				expectedMessage.getComponents().iterator().next());

			ComponentInfo info = expectedMessage.getComponent(expectedMessage.getComponentTag(0).getNumber());
			int componentTag = 0;

			FieldInfo field = expectedMessage.getFields().iterator().next();

			// getField
			List<FieldInfo> fieldList2 = new ArrayList<FieldInfo>();

			fieldList2.add(field);

			// getField
			FieldInfo field2 = expectedMessage.getField(fieldList2.iterator().next().getNumber());

			// fieldsByTag
			int[] tagNumber = new int[fieldList.size()];

			fieldList.forEach(f -> field2.getTagNumber(f.getName()));

			field2.getFieldsByTag(tagNumber);

			assertArrayEquals(fieldsByTagNumber.entrySet().toArray(),
					new TreeMap<>(field2.getValuesByTag(tagNumber)).entrySet().toArray());

			int[] tagNumber2 = new int[fieldList2.size()];

			fieldList2.forEach(f -> tagNumber2[f.getNumber()] = 0);

			field2.getTagNumber(expectedName);

			// fieldsByTag
			field2.getFieldsByTag(tagNumber2);

			assertArrayEquals(fieldsByTagNumber
					.entries().toArray(),
					new TreeMap<>(field2.getValuesByTag(tagNumber2)).entries().toArray());
		}
}
