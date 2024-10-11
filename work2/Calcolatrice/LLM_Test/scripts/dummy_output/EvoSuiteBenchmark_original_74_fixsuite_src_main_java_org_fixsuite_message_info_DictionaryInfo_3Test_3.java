// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
		private static final String COMPONENT = "comp";
		private static final String COMP_INFO = "comp info";
		private static final String FIELD = "field";
		private static final String FIELD_INFO = "field info";
		private static final String TEXT = "text";
	
		/**
		 * Unit test method of {@link DictionaryInfo_3Test}.
		 * @param args - the parameters for the test
		 */
		@junit.Test
		void testGetComponent(String[] args) {
			assertEquals(CompComponentTest.class, args[1]);
			assertEquals(1, count1(this.getVersion(), args[2]));
		}

		/**
		 * Unit test method of {@link DictionaryInfo_3Test}.
		 * @param args - the parameters for the test
		 */
		@junit.Test
		void testGetCompByName(String[] args) {
			assertEquals(CompComponentTest.class, args[1]);
			assertEquals(1, count1(this.getVersion(), args[2]));
			assertEquals(1, count1(this.getVersion(), args[2]));
		}

		/**
		 * Unit test method of {@link DictionaryInfo_3Test}.
		 * @param args - the parameters for the test
		 */
		@junit.Test
		void testGetComp(String[] args) {
			assertEquals(COMP_INFO, args[1]);
			assertEquals(0, count1(this.getVersion(), args[2]));
		}

		/**
		 * Unit test method of {@link DictionaryInfo_3Test}.
		 * @param args - the parameters for the test
		 */
		@junit.Test
		void testAddCompInfo(String[] args) {
			assertEquals(COMP_INFO, args[1]);
			assertEquals(1, count1(this.getVersion(), args[2]));
			this.getComponents().add(new GroupInfo("test", null, null));
			TreeMap<String, MessageInfo> list = new TreeMap<>();
			list.put(COMP_INFO, this.getMessage(args[2]));
			FieldInfo field = new FieldInfo(COMP_INFO, "field", false);
			List<MessageInfo> list1 = new ArrayList<>(1);
			list1.add(this.getMessage(args[2]));
			this.addMessageInformation(list, list1);
			assertEquals(1, count1(this.getVersion(), args[2]));
		}

		/**
		 * Unit test method of {@link DictionaryInfo_3Test}.
		 * @param args - the parameters for the test
		 */
		@junit.Test
		void testAddFieldInfo(String[] args) {
			assertEquals(1, count1(this.getVersion(), args[2]));
			this.getComponents().add(new GroupInfo("test", null, null));
			assertEquals(0, count1(this.getVersion(), args[2]));
			FieldInfo field = new FieldInfo(FIELD, "test", true);
			List<MessageInfo> list = new ArrayList<>();
			list.add(this.getMessage(args[2]));
			this.addMessageInformation(list, list);
			assertEquals(0, count1(this.getVersion(), args[2]));
		}

		/**
		 * Unit test method of {@link DictionaryInfo_3Test}.
		 */
		@junit.Test
		void testAddComponentInfo(String[] args) {
			assertEquals(1, count1(this.getVersion(), args[2]));
			assertEquals(1, count1(this.getVersion(), args[2]));
			this.getComponents().add(new GroupInfo("test", null, null));
			comp1(args[2]);
			assertEquals(1, count1(this.getVersion(), args[2]));
			assertEquals(1, count1(this.getVersion(), args[2]));
			assertEquals(1, count1(this.getVersion(), args[2]));
}
}