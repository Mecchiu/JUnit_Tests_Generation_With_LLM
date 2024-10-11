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
		void getComponent(int tagNumber) {
			String message = new String("fixnum: " + tagNumber);
			check(tagNumber, message);
			for (int tag = 1; tag <= 9; tag++) {
				int fieldNumber = field(tag);
				check(tagNumber, fieldNumber, message);
			}
		}

		@Test
		void getMessages(int tagNumber) {
			for (int tag = tagNumber + 1; tag <= TagInfo.CALL_INFO_LIST.length-2; tag++) {
				int fieldNumber = field(tag);
				check(tagNumber, fieldNumber, fieldNumber, fieldNumber, fieldNumber);
			}
		}

		@Test
		void getMessageByName(int tag) {
			TreeMap<Integer, MessageInfo> messagesByName = new TreeMap<Integer, MessageInfo>();
}
}