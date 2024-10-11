// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
// DictionaryInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class DictionaryInfo {

    public FieldInfo getField(int tagNumber) {
        if (fieldsByTagNumber!= null) {
            return fieldsByTagNumber.get(tagNumber);
        }
        return null;
    }
}

// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
		private final static String EXPECTED_TEST_VAL = "a-s-0-s-s-0";
		private final static String EXPECTED_FIELD = "field";
        private final static String EXPECTED_FIELD_VALUE = ".0";
		private final static String[] expectedTest = {"", "{0}", "{0.0}", "{0.0.0}",
				"a-v-d-v-v'", "(a-b-c-d)e-f-i-k"};
	@Test
		void getField() throws Exception {

			final DictionaryInfo info = new DictionaryInfo();
			info.setField(0);
			assertTrue("Field must be 0", info.getField() == 0);

			info.setField(1);
			assertTrue("Field must be 2", info.getField() == 2);

			info.setField(7);
			assertEquals("Unmarshal value for 7", 0, info.getField());

			info.setField(255);
			assertEquals("Unmarshal value for 255", EXPECTED_FIELD_VALUE, info.getField());

			List<byte[]> bytes = new ArrayList<>();
			bytes.add("".getBytes());
			bytes.add(new byte[]{'b', 'e', 'i', (byte)0x0, (byte)0xd, (byte)0, (byte)0x0});
			bytes.add(new byte[]{'b', 'e', 'i', (byte)0x0, (byte)0xd, (byte)0, (byte)0x0});
			bytes.add(new byte[]{'b', 'e', 'i', (byte)0x0, (byte)0xd, (byte)0, (byte)0x0});
			ArrayList<byte[]> list = new ArrayList<>(bytes);
			assertEquals("Marshalling for null", 0, list.size());

			TreeMap<String, DictionaryInfo.FieldInfo> fieldList = new TreeMap<>();
			fieldList.put("type", new DictionaryInfo.FieldInfo());
			fieldList.get("type").setTagNumber(7);
			byte[] fieldBytes =
				"type".getBytes(DictionaryInfo.getCharsetName(DictionaryInfo.getDefaultCharset())).clone();
			fieldList.get("type").getValue().setValue(fieldBytes);
			TreeMap<String, DictionaryInfo.DictionaryInfo> dictionaryInfo = info.getDictionaryInfo(fieldList, true);
			assertTrue("Error not found field", dictionaryInfo!= null && dictionaryInfo.size() == 1);
			assertEquals("Error found field", new String(expectedTest, 0, expectedTest.length),
					dictionaryInfo.get("type").getValue().getValue());

		}
}

// DictionaryInfo_1Test.java
